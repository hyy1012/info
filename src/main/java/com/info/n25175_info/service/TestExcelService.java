package com.info.n25175_info.service;

import com.info.n25175_info.entity.N25175User;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

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
public interface TestExcelService {

    XSSFWorkbook createExcel(List<Integer> ids) throws IOException;

    void parseExcel(Sheet sheet);

}
