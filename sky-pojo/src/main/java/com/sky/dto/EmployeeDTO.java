package com.sky.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Diamond
 */
@Data
public class EmployeeDTO implements Serializable {

    private String username;

    private String name;

    private String phone;

    private String sex;

    private String idNumber;

}
