package com.info.n25175_info.service.impl;

import com.info.n25175_info.entity.N25175Admin;
import com.info.n25175_info.entity.N25175User;
import com.info.n25175_info.service.AdminService;
import com.info.n25175_info.service.ExcelService;
import com.info.n25175_info.service.PostService;
import com.info.n25175_info.service.UserService;
import com.info.n25175_info.utils.Mobile;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Class Name: com.info.n25175_info.service.impl.ExcelServiceImlp
 * ==================================
 * Author c25175 黄凯
 * Date 2019/12/2115:21
 * Description: ExcelServiceImlp
 * ==================================
 */
@Service
@Slf4j
//@Transactional
public class ExcelServiceImlp implements ExcelService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private AdminService adminService;

    @Autowired
    private UserService userService;

    @Autowired
    private PostService postService;

    private SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MMM-yyyy");
    private SimpleDateFormat sdfuborn = new SimpleDateFormat("yyyy-MM");

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/M/d");

    @Override
    @Transactional
    public XSSFWorkbook createExcel(N25175User n25175User, Integer id) throws IOException {
        // 利用POI API 创建工作簿(Workbook)
        XSSFWorkbook workbook = new XSSFWorkbook();
        // 在工作簿中创建工作表, 参数为工作表名
        XSSFSheet sheet1 = workbook.createSheet("1."+n25175User.getuName());
//        XSSFSheet sheet2 = workbook.createSheet("2."+n25175User.getuName());
        int rowIndex = 0;
        List<String> head1 = this.getXlsHead1();
        List<Map<String, Object>> head2 = this.getXlsHead2(id);

        rowIndex = createXlsHeadRow1(workbook, rowIndex, head1);
        rowIndex = createXlsHeadRow2(workbook, rowIndex, head2);
//        createXlsHeadRow3(workbook, head1, head2);

        return workbook;
    }

    @Override
    public XSSFWorkbook createExcel(List<Integer> ids) throws IOException {
        // 利用POI API 创建工作簿(Workbook)
        XSSFWorkbook workbook = new XSSFWorkbook();
        // 在工作簿中创建工作表, 参数为工作表名
        XSSFSheet sheet1 = workbook.createSheet("档案信息");
        int rowIndex = 0;
        List<String> head1 = this.getXlsHead1();
        rowIndex = createXlsHeadRow1(workbook, rowIndex, head1);

        for (Integer id : ids) {
            List<Map<String, Object>> head2 = this.getXlsHead2(id);
            rowIndex = createXlsHeadRow2(workbook, rowIndex, head2);
        }

        return workbook;
    }

    private void createXlsHeadRow3(XSSFWorkbook wb, List<String> head1, List<Map<String, Object>> head2) {
        XSSFSheet sheet = wb.getSheetAt(1);
        sheet.setColumnWidth(0, 1*256); // 以字符宽度的1/256为单位
        sheet.setColumnWidth(1, 15*256);
        sheet.setColumnWidth(2, 80*256);
        XSSFRow row = null;
        XSSFCell cell = null;

        XSSFCellStyle text_cell_style = wb.createCellStyle();
        text_cell_style.setWrapText(true);
        text_cell_style.setAlignment(HorizontalAlignment.LEFT);

        for (int i = 0; i < head1.size(); i++) {
            String name = head1.get(i);
            row = sheet.createRow(i);
            cell = row.createCell(1);
            cell.setCellType((CellType.STRING));
            cell.setCellValue(name);
        }
        for (int i = 0; i < head2.size(); i++) {
            Map<String, Object> map = head2.get(i);
            int j = 0;
            for (Object obj : map.values()){
                row = sheet.createRow(j);
                cell = row.createCell(2);
                cell.setCellStyle(text_cell_style);
                cell.setCellType((CellType.STRING));
                if(obj==null){
                    cell.setCellValue("");
                }else{
                    if (obj instanceof Date) {
                        cell.setCellValue(sdf.format(obj));
                        j++;
                        continue;
                    }
                    cell.setCellValue(obj.toString());
                }
                j++;
            }
        }
    }

    private int createXlsHeadRow2(XSSFWorkbook wb, int rowIndex, List<Map<String, Object>> head) {
        XSSFSheet sheet = wb.getSheetAt(0);
        XSSFRow row = sheet.createRow(rowIndex);
        XSSFCell cell = null;

        XSSFCellStyle text_cell_style = wb.createCellStyle();
        text_cell_style.setAlignment(HorizontalAlignment.LEFT);

        int colIndex = 0;
        for (int i = 0; i < head.size(); i++) {
            Map<String, Object> map = head.get(i);
            int j = 0;
            for (String key : map.keySet()){
                cell = row.createCell(j);
                cell.setCellStyle(text_cell_style);
                if(map.get(key)==null) {
                    cell.setCellValue("");
                }else if ("u_sex".equals(key)){
                    if (Integer.valueOf(map.get(key).toString())==1) {
                        cell.setCellValue("男");
                    }else {
                        cell.setCellValue("女");
                    }
                }else if ("u_married".equals(key)){
                    if (Integer.valueOf(map.get(key).toString())==1) {
                        cell.setCellValue("是");
                    }else {
                        cell.setCellValue("否");
                    }
                }else if ("u_post".equals(key)){
                    cell.setCellValue(getPost(Integer.valueOf(map.get(key).toString())));
                }else if ("u_ethnic".equals(key)){
                    switch (Integer.valueOf(map.get(key).toString())){
                        case 1:
                            cell.setCellValue("汉");
                            break;
                        case 2:
                            cell.setCellValue("少数名族");
                            break;
                        case 3:
                            cell.setCellValue("其他");
                            break;
                        default:
                            cell.setCellValue("");
                            break;
                    }
                }else if ("u_polity".equals(key)){
                    switch (Integer.valueOf(map.get(key).toString())){
                        case 1:
                            cell.setCellValue("中共党员");
                            break;
                        case 2:
                            cell.setCellValue("中共预备党员");
                            break;
                        case 3:
                            cell.setCellValue("共青团员");
                            break;
                        case 4:
                            cell.setCellValue("群众");
                            break;
                        case 5:
                            cell.setCellValue("其他");
                            break;
                        default:
                            cell.setCellValue("");
                            break;
                    }
                }else if ("u_first".equals(key)){
                    switch (Integer.valueOf(map.get(key).toString())){
                        case 1:
                            cell.setCellValue("专科");
                            break;
                        case 2:
                            cell.setCellValue("本科");
                            break;
                        case 3:
                            cell.setCellValue("硕士");
                            break;
                        case 4:
                            cell.setCellValue("博士");
                            break;
                        case 5:
                            cell.setCellValue("其他");
                            break;
                        default:
                            cell.setCellValue("");
                            break;
                    }
                }else{
                    cell.setCellValue(map.get(key).toString());
                }
                j++;
            }
        }
        rowIndex++;
        return rowIndex;
    }

    private List<Map<String, Object>> getXlsHead2(Integer id) {
        String sql = "select u_name,u_post,u_sex,u_age,u_height,u_subscript,u_married,u_born,u_identity,u_ethnic,u_polity," +
                "u_address,u_wx,u_qq,u_city,u_work,u_become,u_out,u_first,u_first_school,u_first_major,u_peak,u_peak_school," +
                "u_peak_major,u_treatment,u_phone,u_old_address,u_work_year,u_email,u_tel,u_postcode,u_subsidy,u_prize," +
                "u_expect_place,u_expect_job,u_expect_trade,u_cometime,u_job_type,u_self_appraisal,u_work_experience," +
                "u_project_experience,u_school_experience,u_school_honor,u_school_duty,u_skill,u_language,u_credential," +
                "u_train_experience from n25175_user WHERE u_aid ="+id;
        return this.jdbcTemplate.queryForList(sql);
    }

    private String getPost(Integer id) {
        String sql = "select np_name from n25175_post WHERE np_id ="+id;
        return jdbcTemplate.queryForObject(sql, String.class);
    }

    private List<String> getXlsHead1() {
        List<String> heads = new ArrayList<>();
        String[] sheads = ("姓名,职位,性别,年龄,身高,脚码,婚否,出生日期,身份证,民族,政治面貌,联系地址,微信,QQ,籍贯,入职日期,转正日期,离职日期," +
                "第一学历,第一学历毕业院校,第一学历专业,最高学历,最高学历毕业院校,最高学历专业,期望薪资,手机号,家庭地址,工作年限,邮箱,家庭电话," +
                "邮编,补贴,奖金,期望地点,期望职位,期望行业,到岗时间,工作类型,自我评价,工作经验,项目经验,教育经历,校内荣誉,校内职务,技能,语言," +
                "证书,培训经历").split(",");
        for (String name : sheads) {
            heads.add(name);
        }
        return heads;
    }

    private int createXlsHeadRow1(XSSFWorkbook wb, int rowIndex, List<String> head) {
        XSSFSheet sheet = wb.getSheetAt(0);
        XSSFRow row = sheet.createRow(rowIndex);
        XSSFCell cell = null;
        for (int i = 0; i < head.size(); i++) {
            String name = head.get(i);
            cell = row.createCell(i);
            cell.setCellType(XSSFCell.CELL_TYPE_STRING);
            cell.setCellValue(name);
        }
        rowIndex++;
        return rowIndex;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public void parseXLS(MultipartFile file, List<String> phones) {
        try (InputStream input = file.getInputStream()) {
            readXLS(input, phones);
        } catch (Exception e) {
            //log.error(e.getMessage(), e);
            throw new RuntimeException("文件提取错误");
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public void parseXLSX(MultipartFile file, List<String> phones) {
        try (InputStream input = file.getInputStream()) {
            readXLSX(input, phones);
        } catch (IOException e) {
           // log.error(e.getMessage(), e);
            throw new RuntimeException("文件提取错误");
        }
    }

    @Transactional
    public void readXLS(InputStream input, List<String> phones) {
        try {
            POIFSFileSystem fs = new POIFSFileSystem(input);
            HSSFWorkbook wb = new HSSFWorkbook(fs, true);
            HSSFSheet sheet = wb.getSheetAt(0);
            HSSFRow row1 = sheet.getRow(0);
            Integer rowNum = sheet.getLastRowNum();
            for(int i=1; i<=rowNum; i++){
                N25175User n25175User = new N25175User();
                N25175Admin n25175Admin = new N25175Admin();
                HSSFRow row2 = sheet.getRow(i);
                intoUser(n25175Admin, n25175User, row1, row2, i, phones);
            }
        } catch (IOException | ParseException e) {
          //  log.error(e.getMessage(), e);
            throw new RuntimeException("文件解析错误");
        }
    }

    @Transactional
    public void readXLSX(InputStream input, List<String> phones) {
        try {
            OPCPackage op = OPCPackage.open(input);
            XSSFWorkbook wb = new XSSFWorkbook(op);
//            Workbook wb = WorkbookFactory.create(input);
            XSSFSheet sheet = wb.getSheetAt(0);
            XSSFRow row1 = sheet.getRow(0);
            Integer rowNum = sheet.getLastRowNum();
            for(int i=1; i<=rowNum; i++){
                N25175User n25175User = new N25175User();
                N25175Admin n25175Admin = new N25175Admin();
                XSSFRow row2 = sheet.getRow(i);
                intoUser(n25175Admin, n25175User, row1, row2, i, phones);
            }
        } catch (InvalidFormatException | IOException | ParseException e) {
           // log.error(e.getMessage(), e);
            throw new RuntimeException("文件解析错误");
        }
    }

    public void intoUser(N25175Admin n25175Admin, N25175User n25175User, Row row1, Row row2, Integer i, List<String> phones) throws ParseException {
        boolean isInsert = true;
        for (int j=0; j<row1.getLastCellNum(); j++) {
            String headname = row1.getCell(j).toString().trim();
            String value = "";
            if (row2.getCell(j) != null) {
                row2.getCell(j).setCellType(CellType.STRING);
                value = row2.getCell(j).toString();
            }
            if ("手机".equals(headname) || "联系电话".equals(headname)) {
                if (Mobile.isMobile(value)) {
                    if (userService.existByphone(value) || adminService.existByphone(value)) {
                        phones.add("  第"+ ++i +"行,手机号" + value + "已存在\n");
                        isInsert = false;
                        break;
                    } else {
                        n25175Admin.setaUsername(value);
                        n25175User.setuPhone(value);
                    }
                } else {
                    isInsert = false;
                    phones.add("  第"+ ++i +"行,手机号"+value+"为空或不正确\n");
                    break;
                }
            } else if ("".equals(value)) {
            } else if ("职位".equals(headname) || "应聘职位".equals(headname)) {
                Integer id = postService.getIdByNpName(value);
                if (id != 0) {
                    n25175User.setuPost(id);
                }
            } else if ("姓名".equals(headname)) {
                n25175User.setuName(value);
            } else if ("性别".equals(headname)) {
                if ("男".equals(value)) {
                    n25175User.setuSex(1);
                } else {
                    n25175User.setuSex(2);
                }
            } else if ("出生日期".equals(headname)) {
                Date uborn = sdfuborn.parse(value);
                n25175User.setuBorn(uborn);
            } else if ("居住地".equals(headname)) {
                n25175User.setuAddress(value);
            } else if ("籍贯".equals(headname) || "户口/国籍".equals(headname)) {
                String[] addr = value.split("/");
                n25175User.setuProvince(addr[0]);
                n25175User.setuCity(addr[1]);
            } else if ("学历".equals(headname) || "学历/学位".equals(headname)) {
                if ("专科".equals(value)) {
                    n25175User.setuFirst(1);
                } else if ("本科".equals(value)) {
                    n25175User.setuFirst(2);
                } else if ("硕士".equals(value)) {
                    n25175User.setuFirst(3);
                } else if ("博士".equals(value)) {
                    n25175User.setuFirst(4);
                } else {
                    n25175User.setuFirst(5);
                }
            } else if ("毕业学校".equals(headname)) {
                n25175User.setuFirstSchool(value);
            } else if ("专业".equals(headname)) {
                n25175User.setuFirstMajor(value);
            } else if ("地址".equals(headname) || "家庭地址".equals(headname)) {
                n25175User.setuOldAddress(value);
            } else if ("邮箱".equals(headname) || "电子邮件".equals(headname)) {
                n25175User.setuEmail(value);
            } else if ("身份证".equals(headname)) {
                n25175User.setuIdentity(value);
            } else if ("工作年限".equals(headname)) {
                n25175User.setuWorkYear(value);
            } else if ("婚姻状态".equals(headname)) {
                if ("是".equals(value)) {
                    n25175User.setuMarried(1);
                } else {
                    n25175User.setuMarried(2);
                }
            } else if ("政治面貌".equals(headname)) {
                if ("中共党员".equals(value)) {
                    n25175User.setuPolity(1);
                } else if ("中共预备党员".equals(value)) {
                    n25175User.setuPolity(2);
                } else if ("共青团员".equals(value)) {
                    n25175User.setuPolity(3);
                } else if ("群众".equals(value)) {
                    n25175User.setuPolity(4);
                } else {
                    n25175User.setuPolity(5);
                }
            } else if ("家庭电话".equals(headname)) {
                n25175User.setuTel(value);
            } else if ("身高".equals(headname)) {
                n25175User.setuHeight(Integer.valueOf(value));
            } else if ("邮编".equals(headname)) {
                n25175User.setuPostcode(value);
            } else if ("补贴/津贴".equals(headname)) {
                n25175User.setuSubsidy(value);
            } else if ("奖金/佣金".equals(headname)) {
                n25175User.setuPrize(value);
            } else if ("期望薪资".equals(headname)) {
                n25175User.setuPrize(value);
            } else if ("期望地点".equals(headname)) {
                n25175User.setuExpectPlace(value);
            } else if ("期望职位".equals(headname)) {
                n25175User.setuExpectJob(value);
            } else if ("期望行业".equals(headname)) {
                n25175User.setuExpectTrade(value);
            } else if ("到岗时间".equals(headname)) {
                n25175User.setuCometime(value);
            } else if ("工作类型".equals(headname)) {
                n25175User.setuJobType(value);
            } else if ("工作经验".equals(headname)) {
                n25175User.setuWorkExperience(value);
            } else if ("项目经验".equals(headname)) {
                n25175User.setuProjectExperience(value);
            } else if ("教育经历".equals(headname)) {
                n25175User.setuSchoolExperience(value);
            } else if ("校内荣誉".equals(headname)) {
                n25175User.setuSchoolHonor(value);
            } else if ("校内职务".equals(headname)) {
                n25175User.setuSchoolDuty(value);
            } else if ("技能".equals(headname)) {
                n25175User.setuSkill(value);
            } else if ("语言".equals(headname)) {
                n25175User.setuLanguage(value);
            } else if ("证书".equals(headname)) {
                n25175User.setuCredential(value);
            } else if ("培训经历".equals(headname)) {
                n25175User.setuTrainExperience(value);
            } else if ("自我评价".equals(headname)) {
                n25175User.setuSelfAppraisal(value);
            } else if ("备注".equals(headname)) {
                n25175User.setuContent(value);
            }
        }
        if (isInsert){
            n25175Admin.setaPassword("123456");
            n25175Admin.setaDate(new Date());
            n25175Admin.setaRole(2);
            n25175Admin.setaStatus(2);
            n25175Admin.setaEdit(1);
            boolean success = adminService.addAdmin(n25175Admin, n25175User);
            if (!success){
                throw new RuntimeException("导入失败,账号已存在");
            }
        }
    }

    private void parseExcels(MultipartFile file) throws IOException {
        InputStream inputStream = file.getInputStream();
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = xssfWorkbook.getSheetAt(0);

        //获取行数
        int lastRowNum = sheet.getLastRowNum();
        for (int i = 1; i <= lastRowNum; i++) {
            XSSFRow row = sheet.getRow(i);
            System.out.println(row);
        }
    }

}
