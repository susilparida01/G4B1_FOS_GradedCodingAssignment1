package com.gl.main;

import com.gl.departments.AdminDepartment;
import com.gl.departments.HRDepartment;
import com.gl.departments.TechDepartment;

public class Driver {

    public static void main(String[] args) {
        HRDepartment hrDepartment = new HRDepartment();
        TechDepartment techDepartment = new TechDepartment();
        AdminDepartment adminDepartment = new AdminDepartment();

        System.out.println("Welcome to "+ adminDepartment.departmentName());
        System.out.println(adminDepartment.getTodaysWork());
        System.out.println(adminDepartment.getWorkDeadline());
        System.out.println(adminDepartment.isTodayAHoliday());
        System.out.println();

        System.out.println("Welcome to "+hrDepartment.departmentName());
        System.out.println(hrDepartment.doActivity());
        System.out.println(hrDepartment.getTodaysWork());
        System.out.println(hrDepartment.getWorkDeadline());
        System.out.println(hrDepartment.isTodayAHoliday());
        System.out.println();

        System.out.println("Welcome to "+ techDepartment.departmentName());
        System.out.println(techDepartment.getTodaysWork());
        System.out.println(techDepartment.getWorkDeadline());
        System.out.println(techDepartment.getTechStackInformation());
        System.out.println(techDepartment.isTodayAHoliday());
    }
}
