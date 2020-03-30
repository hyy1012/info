package com.info.n25175_info.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Class Name: com.info.n25175_info.dto.OrganDto
 * ==================================
 * Author c25175 黄凯
 * Date 2020/1/13 10:02
 * Description: OrganDto
 * ==================================
 */
@Setter
@Getter
public class OrganDto {

    private Integer id;
    private String title;
    private List<OrganDto> children;

}
