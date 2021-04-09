package com.qa.testcases;
import java.io.IOException;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.qa.excelreader.ExcelReader;
import com.qa.excelreader.ExcelReaderbycolumnname;
import com.qa.pages.AuthPage;
import com.qa.pages.Subscriptionfunctions;
import com.qa.util.TestBase;
import com.qa.util.TestUtil;

//https://tstdrv939179-rp.app.netsuite.com/app/common/search/search.nl?cu=T&e=T&id=162
public class SubscriptionManagement extends TestBase {
	TestUtil testUtil;
	ExtentSparkReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;
	ExcelReaderbycolumnname reader;
	String filepath="C:\\Users\\Sindhuja\\Desktop\\subscriptionmanagement_testdata.xlsx";

	@BeforeTest
	public void setExtent() {
		// specify location of the report
		htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/SubscriptionReport/SubscriptionManagementReport.html");

		htmlReporter.config().setDocumentTitle("Subscription Management Test Report"); // Tile of report
		htmlReporter.config().setReportName("Subscription Management Test Report"); // Name of the report
		htmlReporter.config().setTheme(Theme.STANDARD);
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		// Passing General information
		extent.setSystemInfo("Environemnt", "QA");
		extent.setSystemInfo("user", "Sindhuja");
	}
	public void send_email() throws EmailException
	{
		EmailAttachment attachment = new EmailAttachment();
		  attachment.setPath("./SubscriptionReport/SubscriptionManagementReport.html");
		  attachment.setDisposition(EmailAttachment.ATTACHMENT);
		  MultiPartEmail email = new MultiPartEmail();
		  email.setHostName("smtp.gmail.com");
		  email.setSmtpPort(465);
		  email.setAuthenticator(new DefaultAuthenticator("sindhuja.b@tvarana.com", "Sindhu@123"));
		  email.setSSLOnConnect(true);
		  email.addTo("sindhuja.b@tvarana.com", "Sindhu");
		  email.setFrom("sindhuja.b@tvarana.com", "Sindhuja");
		  email.setSubject("Subscription Management Test Report");
		  email.setMsg("Here is the report please find the attachment");
		  email.attach(attachment);
		  email.send();
	}
	@AfterTest
	public void endReport() throws EmailException {
		extent.flush();
		send_email();
	}

	@AfterMethod
	public void tearDown(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			//test.log(Status.FAIL, "TEST CASE FAILED IS " + result.getName()); // to add name in extent report
			test.log(Status.FAIL, "TEST CASE FAILED IS " + result.getThrowable()); // to add error/exception in extent
																					// report
		} else if (result.getStatus() == ITestResult.SKIP) {
			test.log(Status.SKIP, "Test Case SKIPPED IS " + result.getName());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			//test.log(Status.PASS, "Test Case PASSED IS " + result.getName());
		}
		driver.quit(); 
	}
	@BeforeMethod
	public void setUp() throws InterruptedException {
		testUtil = new TestUtil();
		testUtil.setUp();
	}
	
	@Test(priority = 1)
	public void Billing() throws Exception
	{
		AuthPage auth=new AuthPage();
		//auth.required_account("Administrator", "Tvarana Dev Production - RP", "RELEASE PREVIEW");
		reader=new ExcelReaderbycolumnname();
		String[] customername=reader.excelReader(filepath, 0, "customername");
		String[] itemname=reader.excelReader(filepath, 0, "itemname");
		String[] testcase=reader.excelReader(filepath, 0, "testcase");
		String[] subscription=reader.excelReader(filepath, 0, "subscription");
		String[] free_trail_days=reader.excelReader(filepath, 0, "free_trail_days");
		String[] customer_type=reader.excelReader(filepath, 0, "customer_type");
		String[] end_date=reader.excelReader(filepath, 0, "end_date");
		
		for(int i=0;i<customername.length;i++)
		{
			
			if(!testcase[i].trim().equals(""))
			{
				test=extent.createTest("Testcase is "+testcase[i]);
			}
			Subscriptionfunctions cust=new Subscriptionfunctions();
			if(!customer_type[i].trim().equals("Existing")&&!customername[i].trim().equals(""))
			{
			cust.create_customer(customername[i]);
			}
			if(!customername[i].trim().equals(""))
			{
			cust.create_so(customername[i], itemname[i],testcase[i],subscription[i],free_trail_days[i],test);	
			}
			cust.billing(customername[i],itemname[i],subscription[i],free_trail_days[i],testcase[i],test);
			
		}
	}

	
	@Test(priority = 2)
	public void Subscription() throws Exception
	{	
		AuthPage auth=new AuthPage();
		//auth.required_account("Administrator", "Tvarana Dev Production - RP", "RELEASE PREVIEW");
		reader=new ExcelReaderbycolumnname();
		String[] customername=reader.excelReader(filepath, 1, "customername");
		String[] itemname=reader.excelReader(filepath, 1, "itemname");
		String[] testcase=reader.excelReader(filepath, 1, "testcase");
		String[] subscription=reader.excelReader(filepath, 1, "subscription");
		String[] free_trail_days=reader.excelReader(filepath, 1, "free_trail_days");
		String[] customer_type=reader.excelReader(filepath, 1, "customer_type");
		String[] end_date=reader.excelReader(filepath, 1, "end_date");
		
		for(int i=0;i<customername.length;i++)
		{
		if(!testcase[i].trim().equals(""))
		{
		test=extent.createTest("Testcase is "+testcase[i]);
		}
		Subscriptionfunctions cust=new Subscriptionfunctions();
		if(!customer_type[i].trim().equals("Existing"))
		{
		cust.create_customer(customername[i]);
		}
		if(!customername[i].trim().equals(""))
		{
		cust.create_so(customername[i], itemname[i],testcase[i],subscription[i],free_trail_days[i],test);	
		}
		if(!testcase[i].trim().equals("")&&!end_date[i].trim().equals(""))
		{
		cust.sub_record(customername[i], itemname[i],testcase[i],free_trail_days[i],end_date[i],test);
		}
		}
	}
	@Test(priority = 3)
	public void cancel() throws Exception
	{
		AuthPage auth=new AuthPage();
		//auth.required_account("Administrator", "Tvarana Dev Production - RP", "RELEASE PREVIEW");
		reader=new ExcelReaderbycolumnname();
		String[] customername=reader.excelReader(filepath, 2, "customername");
		String[] itemname=reader.excelReader(filepath, 2, "itemname");
		String[] testcase=reader.excelReader(filepath, 2, "testcase");
		String[] subscription=reader.excelReader(filepath, 2, "subscription");
		String[] free_trail_days=reader.excelReader(filepath, 2, "free_trail_days");
		String[] customer_type=reader.excelReader(filepath, 2, "customer_type");
		String[] end_date=reader.excelReader(filepath, 2, "end_date");
		
		for(int i=0;i<customername.length;i++)
		{
		if(!testcase[i].trim().equals(""))
		{
		test=extent.createTest("Testcase is "+testcase[i]);
		}
		Subscriptionfunctions cust=new Subscriptionfunctions();
		if(!customer_type[i].trim().equals("Existing"))
		{
		cust.create_customer(customername[i]);
		}
		if(!customername[i].trim().equals(""))
		{
		cust.create_so(customername[i], itemname[i],testcase[i],subscription[i],free_trail_days[i],test);	
		}
		if(!testcase[i].trim().equals("")&&!end_date[i].trim().equals(""))
		{
		cust.sub_record(customername[i], itemname[i],testcase[i],free_trail_days[i],end_date[i],test);
		}
		}
		
	}
	
}