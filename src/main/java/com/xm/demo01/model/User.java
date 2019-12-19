package com.xm.demo01.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class User implements Serializable {

    private static final long serialVersionUID = 4359709211352400087L;

    private Integer id;
    private String name;
    private int age;
}
