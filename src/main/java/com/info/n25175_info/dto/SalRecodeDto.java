package com.info.n25175_info.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Class Name: com.info.n25175_info.dto.SalRecodeDto
 * ==================================
 * Author c25175 黄凯
 * Date 2020/1/9 17:14
 * Description: SalRecodeDto
 * ==================================
 */
@Getter
@Setter
public class SalRecodeDto {

    private Integer aId;
    private String name;
    private String department;
    private List<Integer> price;

}
