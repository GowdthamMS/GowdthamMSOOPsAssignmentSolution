package com.greatlearning.Main;

import com.greatlearning.Department.AdminDepartment;
import com.greatlearning.Department.HrDepartment;
import com.greatlearning.Department.TechDepartment;

public class DriverClass {
	public static void main(String[] args) {
		AdminDepartment adminDepartment = new AdminDepartment();
		HrDepartment hrDepartment = new HrDepartment();
		TechDepartment techDepartment = new TechDepartment();

		System.out.println("Welcome to " + adminDepartment.departmentName());
		System.out.println(adminDepartment.getTodayWork());
		System.out.println(adminDepartment.getWorkDeadline());
		System.out.println(adminDepartment.isTodayHoliday());
		System.out.println();
		System.out.println("Welcome to " + hrDepartment.departmentName());
		System.out.println(hrDepartment.doActivity());
		System.out.println(hrDepartment.getTodayWork());
		System.out.println(hrDepartment.getWorkDeadline());
		System.out.println(hrDepartment.isTodayHoliday());
		System.out.println();
		System.out.println("Welcome to " + techDepartment.departmentName());
		System.out.println(techDepartment.getTodayWork());
		System.out.println(techDepartment.getWorkDeadline());
		System.out.println(techDepartment.getTechStackInformation());
		System.out.println(techDepartment.isTodayHoliday());
	}
}
