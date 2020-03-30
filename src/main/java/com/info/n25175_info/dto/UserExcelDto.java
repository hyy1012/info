package com.info.n25175_info.dto;

import com.info.n25175_info.entity.N25175Admin;
import com.info.n25175_info.entity.N25175User;
import lombok.Getter;
import lombok.Setter;

/**
 * Class Name: com.info.n25175_info.dto.UserExcelDto
 * ==================================
 * Author c25175 黄凯
 * Date 2019/12/2117:38
 * Description: UserExcelDto
 * ==================================
 */
@Getter
@Setter
public class UserExcelDto {

    private N25175User n25175User;
    private N25175Admin n25175Admin;

    public UserExcelDto(){
        n25175User = new N25175User();
        n25175Admin = new N25175Admin();
    }

}
