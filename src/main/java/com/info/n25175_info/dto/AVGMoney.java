package com.info.n25175_info.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Class Name: com.info.n25175_info.dto.AVGMoney
 * ==================================
 * Author c25175 黄凯
 * Date 2020/1/21 14:46
 * Description: AVGMoney
 * ==================================
 */
@Getter
@Setter
@ToString
public class AVGMoney {

    private Integer tmoney;
    private Integer smoney;
//    @DateTimeFormat(pattern = "yyyy年MM月")
//    @JsonFormat(pattern = "yyyy年MM月" ,timezone = "GMT+8")
    private String month;

}
