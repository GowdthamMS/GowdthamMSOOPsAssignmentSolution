package com.greatlearning.Department;

import com.greatlearning.Model.SuperDepartment;

public class TechDepartment extends SuperDepartment {
	public String departmentName() {
		return "Tech Department";
	}

	public String getTodayWork() {
		return "Comlete coding of Module 1";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	public String getTechStackInformation() {
		return "Core Java";
	}
}
