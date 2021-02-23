package com.org.ibm.employ.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "employyy")
@Getter
@Setter
public class EmployModel {
    private int empId;
    private String empName;

}
