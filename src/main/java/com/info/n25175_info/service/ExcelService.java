package com.info.n25175_info.service;

import com.info.n25175_info.entity.N25175User;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

/**
 * Class Name: com.info.n25175_info.service.ExcelService
 * ==================================
 * Author c25175 黄凯
 * Date 2019/12/2115:21
 * Description: ExcelService
 * ==================================
 */
public interface ExcelService {

    XSSFWorkbook createExcel(N25175User n25175User, Integer id) throws IOException;

    XSSFWorkbook createExcel(List<Integer> ids) throws IOException;

    void parseXLS(MultipartFile file, List<String> phones) throws Exception;

    void parseXLSX(MultipartFile file, List<String> phones);

}
