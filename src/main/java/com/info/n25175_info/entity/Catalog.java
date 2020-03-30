package com.info.n25175_info.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Catalog {
    private Integer id;
    private String title;
    private List<Catalog> children;

    private String href;

}
