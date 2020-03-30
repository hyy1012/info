package com.info.n25175_info.utils;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import freemarker.core.ParseException;
import freemarker.log.Logger;
import freemarker.template.Configuration;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;
import freemarker.template.TemplateNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import sun.misc.BASE64Encoder;

import javax.servlet.ServletContext;
import javax.xml.ws.spi.http.HttpContext;

/**
 * Class Name: com.info.n25175_info.utils.ExportMyWord
 * ==================================
 * Author c25175 黄凯
 * Date 2019/12/2313:09
 * Description: ExportMyWord
 * ==================================
 */
@Service
public class ExportWord {

    @Autowired
    JdbcTemplate jdbcTemplate;

    SimpleDateFormat sdfborn = new SimpleDateFormat("yyyy年MM月");
    SimpleDateFormat sdfnor = new SimpleDateFormat("yyyy/MM/dd");

    private static final String BASE_PATH = System.getProperty("java.io.tmpdir") + "Resource" + File.separator;
    private Logger log = Logger.getLogger(ExportWord.class.toString());
    private Configuration config = null;

    public ExportWord() {
        config = new Configuration(Configuration.VERSION_2_3_28);
        config.setDefaultEncoding("utf-8");
    }
    /**
     * FreeMarker生成Word
     * @param dataMap 数据
     * @param templateName 目标名
     * @Author Huang Xiaocong 2018年12月15日 下午10:19:03
     */
    public void createWord(Map<String, Object> dataMap, String templateName, ByteArrayOutputStream out, ServletContext context) {
        Template template = getTemplate(templateName, context);
        Writer writer = null;
        //将模板中的预先的代码替换为数据
        try {
            writer = new BufferedWriter(new OutputStreamWriter(out, "UTF-8"));
            template.process(dataMap, writer);
        } catch (TemplateException e) {
            log.error("填充模板时异常", e);
            e.printStackTrace();
        } catch (IOException e) {
            log.error("IO读取时异常", e);
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
        log.info("由模板文件：" + templateName + ".ftl" + " 生成文件 ：" + " 成功！！");
    }
    /**
     * 获得图片的Base64编码
     * @param imgFile
     * @return
     * @Author Huang Xiaocong 2018年12月15日 下午10:15:10
     */
    public String getImageStr(String imgFile) {
        InputStream in = null;
        byte[] data = null;
        try {
            in = new FileInputStream(imgFile);
        } catch (FileNotFoundException e) {
            log.error("加载图片未找到", e);
            e.printStackTrace();
        }
        try {
            data = new byte[in.available()];
            //注：FileInputStream.available()方法可以从输入流中阻断由下一个方法调用这个输入流中读取的剩余字节数
            in.read(data);
            in.close();
        } catch (IOException e) {
            log.error("IO操作图片错误", e);
            e.printStackTrace();
        }
        BASE64Encoder encoder = new BASE64Encoder();
        return encoder.encode(data);
    }

    public void createWordMain(Integer id, ByteArrayOutputStream out, ServletContext context){
        Map<String, Object> dataMap = null;
        List<Map<String, Object>> list = this.getDocContain(id);
        if (list.size() == 1){
            dataMap = list.get(0);
        }
        resolveMap(dataMap);
        createWord(dataMap, "model1", out, context);
    }

    /**
     * create mock data
     *
     * */
    public void createAllWorkbooks(String tip, List<Integer> ids, ServletContext context) {
        Writer out = null;
        Template template = getTemplate("model1", context);
        StringBuffer sb = new StringBuffer();
        for (Integer id : ids) {
            sb.append(id); sb.append(",");
        }
        sb.deleteCharAt(sb.length()-1);
        List<Map<String, Object>> dataMaps = getDocContains(sb.toString());
        try {
            for (Map<String, Object> dataMap : dataMaps) {
                File tempFile = new File(BASE_PATH + tip + dataMap.get("u_name") + ".docx");
                tempFile.getParentFile().mkdirs();
                tempFile.createNewFile();
                FileOutputStream fos = null;
                fos = new FileOutputStream(tempFile);
                out = new BufferedWriter(new OutputStreamWriter(fos));
                resolveMap(dataMap);
                template.process(dataMap, out);
                out.flush();
                log.info("由模板文件： .ftl" + " 生成文件 ：  成功！！");
            }
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (out!= null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private List<Map<String, Object>> getDocContain(Integer id) {
        String sql = " select * from n25175_user WHERE u_aid ="+id;
        return this.jdbcTemplate.queryForList(sql);
    }

    private List<Map<String, Object>> getDocContains(String ids) {
        String sql = " select * from n25175_user WHERE u_aid in (" + ids +")";
        return this.jdbcTemplate.queryForList(sql);
    }

    private Template getTemplate(String templateName, ServletContext context){
        config.setServletContextForTemplateLoading(context, "template");
        //设置异常处理器 这样的话 即使没有属性也不会出错 如：${list.name}...不会报错
        config.setTemplateExceptionHandler(TemplateExceptionHandler.IGNORE_HANDLER);
        Template template = null;
        try {
            template = config.getTemplate(templateName + ".ftl");
        } catch (TemplateNotFoundException e) {
            log.error("模板文件未找到", e);
            e.printStackTrace();
        } catch (MalformedTemplateNameException e) {
            log.error("模板类型不正确", e);
            e.printStackTrace();
        } catch (ParseException e) {
            log.error("解析模板出错，请检查模板格式", e);
            e.printStackTrace();
        } catch (IOException e) {
            log.error("IO读取失败", e);
            e.printStackTrace();
        }
        return template;
    }

    private Map<String, Object> resolveMap(Map<String, Object> dataMap){
        if (dataMap.get("u_born")!=null)
            dataMap.put("u_born",sdfborn.format(dataMap.get("u_born")));
        if (dataMap.get("u_first_start")!=null)
            dataMap.put("u_first_start",sdfnor.format(dataMap.get("u_first_start")));
        if (dataMap.get("u_first_end")!=null)
            dataMap.put("u_first_end",sdfnor.format(dataMap.get("u_first_end")));
        if (dataMap.get("u_peak_start")!=null)
            dataMap.put("u_peak_start",sdfnor.format(dataMap.get("u_peak_start")));
        if (dataMap.get("u_peak_end")!=null)
            dataMap.put("u_peak_end",sdfnor.format(dataMap.get("u_peak_end")));
        if (dataMap.get("u_ethnic")!=null) //民族
            dataMap.put("u_ethnic", IntegerUtil.getEthnic(Integer.parseInt(dataMap.get("u_ethnic").toString())));
        if (dataMap.get("u_province")!=null && dataMap.get("u_city")!=null) //籍贯
            dataMap.put("u_birthplace", dataMap.get("u_province").toString().replace("省","")+dataMap.get("u_city").toString().replace("市",""));
        if (dataMap.get("u_polity")!=null) //政治面貌
            dataMap.put("u_polity", IntegerUtil.getPolity(Integer.parseInt(dataMap.get("u_polity").toString())));
        dataMap.put("u_sex", Integer.parseInt(dataMap.get("u_sex").toString())==1?"男":"女");
        dataMap.put("u_married", Integer.parseInt(dataMap.get("u_married").toString())==1?"是":"否");
        return dataMap;
    }

}
