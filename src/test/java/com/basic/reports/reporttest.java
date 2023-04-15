package com.basic.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class reporttest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExtentReports extentReports= new ExtentReports();
		ExtentSparkReporter sparkReporter= new ExtentSparkReporter("C:\\Users\\Nayanika\\eclipse-workspace\\PetStoreAutomation\\reports\\report.html");
		extentReports.attachReporter(sparkReporter);
		extentReports.flush();
	}

}
