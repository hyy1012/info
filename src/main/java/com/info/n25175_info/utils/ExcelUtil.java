package com.info.n25175_info.utils;

import lombok.extern.slf4j.Slf4j;
//import org.apache.commons.lang3.time.DateUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.*;

@Slf4j
public class ExcelUtil {

    /** 时间格式数组（年月日 时分秒） */
    //public static final String DATE_FULL_STR = "yyyy-MM-dd HH:mm:ss";
    public static final String DATE_FULL_STR = "yyyy-MM-dd";
    private static final String OFFICE_EXCEL_XLS = ".xls";
    private static final String OFFICE_EXCEL_XLSX = ".xlsx";
    static final String NUMBER_REG = "^\\d*(\\.\\d*|)$";

    public static  Map<Integer,List<Map<String,Object>>> getExcelDataFormFile(MultipartFile file, HashMap<Integer,HashMap<Integer,String>> columnIdxMap) throws Exception {

        if (file == null || file.isEmpty()){
            throw new Exception("file is null");
        }
        if (file.getOriginalFilename().endsWith(OFFICE_EXCEL_XLS)){
            return readXLS(file,columnIdxMap);
        }  else if (file.getOriginalFilename().endsWith(OFFICE_EXCEL_XLSX)){
            return readXLSX(file,columnIdxMap);
        }  else {
            throw new Exception("file does not support:" + file.getOriginalFilename());
        }
    }

    private static  Map<Integer,List<Map<String,Object>>> readXLS(MultipartFile file,HashMap<Integer,HashMap<Integer,String>> colIdxMap) throws Exception {
        try (InputStream input = file.getInputStream()) {
            return readXLS(input,colIdxMap);
        } catch (IOException e) {
            log.error(e.getMessage(), e);
            throw new Exception("文件提取错误");
        }
    }

    private static  Map<Integer,List<Map<String,Object>>> readXLSX(MultipartFile file,HashMap<Integer,HashMap<Integer,String>> colIdxMap) throws Exception {
        try (InputStream input = file.getInputStream()) {
            return readXLSX(input,colIdxMap);
        } catch (IOException e) {
            log.error(e.getMessage(), e);
            throw new Exception("文件提取错误");
        }
    }

    private static Map<Integer,List<Map<String,Object>>> readXLSX(InputStream input,HashMap<Integer,HashMap<Integer,String>> colIdxMap) throws Exception  {
        try {
            OPCPackage op = OPCPackage.open(input);
            XSSFWorkbook wb = new XSSFWorkbook(op);
            return resolve(wb,colIdxMap);
        } catch (InvalidFormatException | IOException e) {
            log.error(e.getMessage(), e);
            throw new Exception("文件解析错误");
        }
    }

    private static   Map<Integer,List<Map<String,Object>>> readXLS(InputStream input,HashMap<Integer,HashMap<Integer,String>> colIdxMap) throws Exception {
        try {
            POIFSFileSystem fs = new POIFSFileSystem(input);
            HSSFWorkbook wb = new HSSFWorkbook(fs, true);
            return resolve(wb,colIdxMap);
        } catch (IOException e) {
            log.error(e.getMessage(), e);
            throw new Exception("文件解析错误");
        }
    }

    private static  Map<Integer,List<Map<String,Object>>> resolve(Workbook wb,HashMap<Integer,HashMap<Integer,String>> colIdxMaps) throws Exception {
        int sheets = wb.getNumberOfSheets();
        Map<Integer,List<Map<String,Object>>> bookMap = new HashMap<Integer,List<Map<String,Object>>>();

        int curSheets;
        int curRows;
        Sheet sheet;
        for (int i = 0; i < sheets; i++) {
            curSheets = i;
            sheet = wb.getSheetAt(i);
            if (sheet == null) {
                continue;
            }
            if(!colIdxMaps.containsKey(i)){
                continue;
            }

            List<Map<String,Object>> list = new ArrayList<>();
            HashMap<Integer,String> colIdxMap = colIdxMaps.get(i);

            for (Row row : sheet) {
                Map<String,Object> rowMap = new  HashMap<String,Object>();
//                if (OptionalUtils.isPersent(row)) {
//                    curRows = row.getRowNum();
//                    Cell zero = row.getCell(0);
//                    if ((curSheets == 0 && curRows == 0)) {
//                        continue;
//                    } else if (OptionalUtils.notPersent(zero)){
//                        break;
//                    }
//                    for (Cell cell : row) {
//                        if (OptionalUtils.isPersent(cell)){
//                            Map<String,Object> cellMap = cell(cell, curSheets, curRows,colIdxMap);
//                            rowMap.putAll(cellMap);
//                        } else{
//                            continue;
//                        }
//                    }
//                    list.add(rowMap);
//                } else {
//                    continue;
//                }

            }
            bookMap.put(i,list);
        }
        return bookMap;
    }

    private static Map<String,Object>  cell(Cell cell, int curSheets, int curRows,HashMap<Integer,String> colIdxMap) throws Exception {
        int curCal = cell.getColumnIndex();
        Map<String,Object> map = null;
        try {
            String str = getCellValue(cell);
            map = checkAndSetValue(curCal, str,colIdxMap);
            return map;
            //            log.info("类型不支持进行解析,");
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            if (e instanceof IllegalArgumentException || e instanceof Exception) {
                throw new Exception( "消息错误：" + e.getMessage() + ";" + (curSheets + 1)
                        + "页，" + (curRows + 1) + "行，" + (curCal + 1) + "列");
            } else {
                throw new Exception("消息错误：" + (curSheets + 1) + "页，" + (curRows + 1) + "行，" + (curCal + 1) + "列");
            }
        }
    }

    static String getCellValue(Cell cell) {
        Object obj = "";
        switch (cell.getCellType()) {
            case Cell.CELL_TYPE_STRING:
                obj = cell.getStringCellValue();
                break;
            case Cell.CELL_TYPE_NUMERIC:
                obj = cell.getNumericCellValue();
                break;
            case Cell.CELL_TYPE_FORMULA:
                obj = cell.getCellFormula();
                break;
            case Cell.CELL_TYPE_ERROR:
                obj = cell.getErrorCellValue();
                break;
            case Cell.CELL_TYPE_BOOLEAN:
                obj = cell.getBooleanCellValue();
                break;
            case Cell.CELL_TYPE_BLANK:
                break;
        }
        return String.valueOf(obj).trim();
    }


    private static Map<String,Object>  checkAndSetValue(int index, String value,HashMap<Integer,String> colIdxMap) {
        Map<String,Object> map = new HashMap<String,Object>();
        if(colIdxMap.containsKey(index)){
            String field = colIdxMap.get(index);
            map.put(field,value);
        }
        //TODO: do some check ?


        return map;
    }

//    private static Date getDateValue(String str) throws Exception {
//        try { //DATE_FORMAT_FULL ="yyyy-MM-dd HH:mm:ss";
//            return DateUtils.parseDateStrictly(str, DATE_FULL_STR);
//        } catch (ParseException e) {
//            log.error("时间格式不支持：" + str, e);
//            throw new Exception("时间格式不支持 ：" + str + "，支持格式： " + Arrays.asList(DATE_FULL_STR));
//        }
//    }

    private static int getIntValue(String str, String mage) {
        if (str.contains(".")) {
            str = str.substring(0, str.indexOf("."));
        }
        return Integer.valueOf(str);
    }
}
