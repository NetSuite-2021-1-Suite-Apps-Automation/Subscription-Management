package com.qa.pages;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.formula.functions.Today;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.junit.IJUnitTestRunner;

import com.aventstack.extentreports.ExtentTest;
import com.qa.util.TestBase;

public class Subscriptionfunctions extends TestBase {
	
	@FindBy(xpath = "//table[@id='item_splits']//tr[contains(@class,'uir-machine-row-focused')]//td[8]")
	List<WebElement> Amount_click;
	
	@FindBy(xpath="//input[@id='amount_formattedValue']")
	WebElement Amount;
	
	@FindBy(xpath = "//input[@name='inpt_customform']")
	WebElement form_arrow;
	
	@FindBy(xpath = "//div[@class='dropdownDiv']//div")
	List<WebElement> form_types;
	
	@FindBy(xpath = "//li[@data-title='Lists']")
	WebElement Lists;
	@FindBy(xpath = "//li[@data-title='Relationships']")
	WebElement Relationships;
	@FindBy(xpath = "//li[@data-title='Customers']")
	WebElement Customers;
	@FindBy(xpath = "//li[@data-title='New']")
	WebElement New;
	@FindBy(xpath = "//input[@id='companyname']")
	WebElement company_name;
	@FindBy(xpath = "//td[@id='spn_multibutton_submitter']")
	WebElement customer_save;
	@FindBy(xpath = "//li[@data-title='Transactions']")
	WebElement Transcations;
	@FindBy(xpath = "//li[@data-title='Sales']")
	WebElement Sales;
	@FindBy(xpath = "//li[@data-title='Enter Sales Orders']")
	WebElement Enter_Sales_orders;
	@FindBy(xpath = "//span[@id='parent_actionbuttons_entity_fs']")
	WebElement customer_arrow;
	@FindBy(xpath = "//a[@id='entity_popup_list']")
	WebElement customer_list;
	@FindBy(xpath = "//input[@id='st']")
	WebElement customer_input;
	@FindBy(xpath = "//input[@id='Search']")
	WebElement search_button;
	@FindBy(xpath = "//div[@id='inner_popup_div']//table//tbody//tr//td//following-sibling::td//a")
	List<WebElement> customer_lists;
	@FindBy(xpath = "//input[@name='inpt_orderstatus']")
	WebElement So_status;
	@FindBy(xpath = "//span[@id='parent_actionbuttons_item_item_fs']")
	WebElement Item_arrow;
	@FindBy(xpath = "//a[@id='item_popup_list']")
	WebElement item_search_button;
	@FindBy(xpath = "//input[@id='Search']")
	WebElement search;
	@FindBy(xpath = "//input[@id='st']")
	WebElement search_input;
	@FindBy(xpath = "//table//tr//td[@class='popupheadernosort']//following::tr//td[count(//table//tr//td[text()='Item'])+1]//a")
	List<WebElement> item_list;
	@FindBy(xpath = "//td[@id='tdbody_Search']")
	WebElement item_searching;
	@FindBy(xpath = "//div[@class='uir-machine-table-container']//table[@id='item_splits']//tbody//tr[@class='uir-machine-row uir-machine-row-odd listtextnonedit uir-machine-row-focused']//td[count(//td[@data-label='Quantity']//preceding-sibling::td)]")
	WebElement Item_click;
	@FindBy(xpath = "//a[@id='item_popup_link']")
	WebElement open_item;
	@FindBy(xpath = "//td[@id='tdbody_edit']")
	WebElement item_edit;
	@FindBy(xpath = "//td[@id='custom48lnk']")
	WebElement subscription_tab;
	@FindBy(xpath = "//input[@id='custitem_tss_free_trail_days_formattedValue']")
	WebElement free_trail_days;
	@FindBy(xpath = "//td[@id='spn_secondarymultibutton_submitter']")
	WebElement save_item;
	@FindBy(xpath = "//div[@class='uir-machine-table-container']//table[@id='item_splits']//tbody//tr[@class='uir-machine-row uir-machine-row-odd listtextnonedit uir-machine-row-focused']//td[count(//td[@data-label='Units']//preceding-sibling::td)]")
	WebElement quantity_click;
	@FindBy(xpath = "//table[@id='item_splits']//tbody//tr[@class='uir-machine-headerrow']//following-sibling::tr//td[count(//td[@data-label='Initial Charge Translation']//preceding-sibling::td)]")
	WebElement sub_id_in_sales_order;
	@FindBy(xpath = "//div[@class='uir-machine-table-container']//table[@id='item_splits']//tbody//tr[@class='uir-machine-row uir-machine-row-odd listtextnonedit uir-machine-row-focused']//td[count(//td[@data-label='License Code']//preceding-sibling::td)]")
	WebElement amount_click;
	@FindBy(xpath = "//input[@id='quantity_formattedValue']'")
	WebElement quantity_input;
	@FindBy(xpath = "//input[@id='item_item_display']")
	WebElement item_input;
	@FindBy(xpath = "//input[@id='amount_formattedValue']")
	WebElement amount_input;
	@FindBy(xpath = "//td[@id='spn_secondarymultibutton_submitter']")
	WebElement save_sales_order;
	@FindBy(xpath = "//div[@class='uir-machine-table-container']//table[@id='item_splits']//tbody//tr[@class='uir-machine-row uir-machine-row-odd listtextnonedit uir-machine-row-focused']//td[count(//td[@data-label='Initial Charge Translation']//preceding-sibling::td)]")
	WebElement subscription_associated;
	@FindBy(xpath = "//td[@id='cmmnctntablnk']")
	WebElement communication_tab;
	@FindBy(xpath = "//span[@id='fax_fs']//input[@id='fax' and @name='fax']")
	WebElement fax_number;
	@FindBy(xpath = "//input[@name='inpt_quicksort']")
	WebElement sub_record_arrow;
	@FindBy(xpath = "//div[@class='dropdownDiv']//div")
	List<WebElement> sub_drop_down;
	@FindBy(xpath = "//table[@id='div__bodytab']//tbody//tr//following::tr//td[//td[@data-label='Internal ID']//preceding-sibling::td]//a[@class='dottedlink viewitem']")
	List<WebElement> view_sub_record;
	static String parentWindow=null;
	@FindBy(xpath = "//span[@id='custrecord_tss_start_date_fs_lbl_uir_label']//following-sibling::span")
	WebElement start_date;
	@FindBy(xpath = "//span[@id='custrecord_tss_next_bill_date_fs_lbl_uir_label']//following-sibling::span")
	WebElement next_bill_date;
	
	@FindBy(xpath = "//span[@id='custrecord_tss_hold_end_date_fs_lbl_uir_label']//following-sibling::span")
	WebElement hold_end_date;
	
	@FindBy(xpath = "//span[@id='custrecord_tss_free_trail_enddate_fs_lbl_uir_label']//following-sibling::span")
	WebElement free_trail_end_date;
	@FindBy(xpath = "//span[@id='custrecord_tss_end_date_fs_lbl_uir_label']//following-sibling::span")
	WebElement end_date;
	@FindBy(xpath = "//span[@id='custrecord_subscription_type_sr_fs_lbl_uir_label']//following-sibling::span")
	WebElement subscription_type;
	@FindBy(xpath = "//span[@id='custrecord_tss_subrec_status_fs_lbl_uir_label']//following-sibling::span")
	WebElement s_status;
	@FindBy(xpath = "//span[@id='custrecord_tss_billing_item_fs_lbl_uir_label']//following-sibling::span")
	WebElement billing_item;
	@FindBy(xpath = "//span[@id='custrecord_tss_billing_frequency_sr_fs_lbl_uir_label']//following-sibling::span")
	WebElement billing_frequency;
	@FindBy(xpath = "//span[@id='custrecord_tss_customer_fs_lbl_uir_label']//following-sibling::span//a")
	WebElement s_customer;
	@FindBy(xpath = "//td[@id='custom47lnk']")
	WebElement subscription_event;
	@FindBy(xpath = "//table[@id='recmachcustrecord_tss_subscriptionevent__tab']//tbody//tr//td[count(//td[@data-label='Event Type']//preceding-sibling::td)]")
	List<WebElement> event_date;
	@FindBy(xpath = "//table[@id='recmachcustrecord_tss_subscriptionevent__tab']//tbody//tr//td[count(//td[@data-label='Event Date']//preceding-sibling::td)]//a")
	List<WebElement> related_id;
	@FindBy(xpath = "//table[@id='recmachcustrecord_tss_subscriptionevent__tab']//tbody//tr//td[count(//td[@data-label='Event Type']//preceding-sibling::td)+1]")
	List<WebElement> event_type;
	@FindBy(xpath = "//span[@id='custrecord_tss_related_transaction_fs_lbl_uir_label']//following-sibling::span")
	WebElement related_transcation;
	@FindBy(xpath = "//span[@id='custrecord_tss_subscriptionevent_fs_lbl_uir_label']//following-sibling::span")
	WebElement subcsription_event_relation;
	@FindBy(xpath = "//span[@id='name_fs_lbl_uir_label']//following-sibling::span")
	WebElement sub_id;
	@FindBy(xpath = "//td[@id='custom49lnk']")
	WebElement subcsription_tab_in_customer;
	@FindBy(xpath = "//span[@id='custentity_tss_subscriptn_roles_fs_lbl_uir_label']//following-sibling::span")
	WebElement customer_role;
	@FindBy(xpath = "//span[@id='custitem_tss_billing_frequen_fs_lbl_uir_label']//following-sibling::span")
	WebElement billing_frequency_in_item;
	@FindBy(xpath = "//span[@id='custitem_tss_subscription_type_fs_lbl_uir_label']//following-sibling::span")
	WebElement subscription_type_in_item_record;
	@FindBy(xpath = "//input[@name='inpt_custitem_tss_billing_frequen']")
	WebElement m_q_a_arrow;
	@FindBy(xpath = "//div[@class='dropdownDiv']//div")
	List<WebElement> m_q_a_dropdown;
	@FindBy(xpath = "//td[@id='tdbody_custpage_btn_extendtrial']")
	WebElement extend_free_trail;
	@FindBy(xpath = "//input[@id='custpage_duration_formattedValue']")
	WebElement no_of_free_days;
	@FindBy(xpath = "//td[@id='tdbody_submitter']")
	WebElement extend_free_trail_save;
	@FindBy(xpath = "//td[@id='tdbody_edit']")
	WebElement subscription_edit;
	@FindBy(xpath = "//input[@name='inpt_custrecord_tss_subrec_status']")
	WebElement sub_status_arrow;
	@FindBy(xpath = "//div[@class='dropdownDiv']//div")
	List<WebElement> sub_status_list;
	@FindBy(xpath = "//td[@id='spn_multibutton_submitter']")
	WebElement save_sub_record;
	@FindBy(xpath = "//td[@id='tdbody_custpage_btn_hold']")
	WebElement put_on_hold;
	@FindBy(xpath = "//textarea[@id='custpage_reason']")
	WebElement put_on_hold_reason;
	@FindBy(xpath = "//input[@id='custpage_holdmonths_formattedValue']")
	WebElement no_of_months_to_hod_for;
	@FindBy(xpath = "//td[@id='tdbody_submitter']")
	WebElement hold_sub_button;
	@FindBy(xpath = "//span[@id='custrecord_tss_subscription_hold_count_fs_lbl_uir_label']//following-sibling::span")
	WebElement sub_hold_count;
	@FindBy(xpath = "//span[@id='custrecord_tss_notes_fs_lbl_uir_label']//following-sibling::span")
	WebElement hold_notes;
	@FindBy(xpath = "//span[@id='custrecord_tss_event_type_fs_lbl_uir_label']//following-sibling::span")
	WebElement hold_event_type;
	@FindBy(xpath = "//textarea[@id='custpage_reason']")
	WebElement cancellation_reason;
	@FindBy(xpath = "//input[@id='custpage_canceldate']")
	WebElement cancellaton_date;
	@FindBy(xpath = "//td[@id='tdbody_custpage_btn_cancel']")
	WebElement cancel_button;
	@FindBy(xpath = "//td[@id='tdbody_submitter']")
	WebElement cancel_sub_button;
	@FindBy(xpath = "//span[@id='custpage_warning_fs']")
	WebElement warning_message;//Cannot provide another hold
	@FindBy(xpath = "//span[@id='custrecord_tss_event_type_fs_lbl_uir_label']//following-sibling::span")
	WebElement event_type_in_child_record;
//	@FindBy(xpath = "//td[@id='tdbody_edit']")
///	WebElement script_edit;
//	@FindBy(xpath = "//img[@class='multiBntTri']")
//	WebElement script_arrow;
	@FindBy(xpath = "//table[@id='div__bodytab']//tbody//tr//following-sibling::tr//td[count(//td[@data-label='ID']//preceding-sibling::td)+1]")
	List<WebElement> subscription_ids;
//	@FindBy(xpath = "//td[@id='nl3']")
//	WebElement save_and_execute;
	@FindBy(xpath = "//td[@id='tdbody_edit']")
	WebElement script_edit;
	
	@FindBy(xpath = "//div[@class='bntBgT']")
	WebElement edit_expand;
	
	@FindBy(xpath = "//span[contains(text(),'Save and Execute')]")
	WebElement save_and_execute;
	
	@FindBy(xpath = "//table[@id='div__bodytab']//tbody//tr[contains(@class,'uir-list-row-tr')]//td[count(//td[@data-label='Status']//preceding-sibling::td)+1]")
	List<WebElement> script_status;
	
	@FindBy(xpath = "//span[@id='tobeemailed_fs']//img")
	WebElement to_be_emailed_checkbox;
	
	@FindBy(xpath = "//input[@name='inpt_searchid']")
	WebElement search_arrow;
	
	@FindBy(xpath = "//div[@class='dropdownDiv']//div")
	List<WebElement> search_list;
	
	@FindBy(xpath = "//table[@id='div__bodytab']//tbody//tr[contains(@class,'uir-list-row-tr')]//td[count(//td[@data-label='Billing Frequency']//preceding-sibling::td)]")
	List<WebElement> billing_frequency_list;
	
	@FindBy(xpath = "//table[@id='div__bodytab']//tbody//tr[contains(@class,'uir-list-row-tr')]//td[count(//td[@data-label='End Date']//preceding-sibling::td)]")
	List<WebElement> customer_list_in_subrecord;
	
	@FindBy(xpath = "//table[@id='div__bodytab']//tbody//tr[contains(@class,'uir-list-row-tr')]//td[count(//td[@data-label='Internal ID']//preceding-sibling::td)]//a[@class='dottedlink viewitem']")
	List<WebElement> view_sub_record_list;
	
	@FindBy(xpath = "//input[@name='custrecord_tss_hold_end_date']")
	WebElement hold_e_date;
	
	@FindBy(xpath = "//table[@id='div__bodytab']//tbody//tr[contains(@class,'uir-list-row-tr')]//td[count(//td[@data-label='ID']//preceding-sibling::td)]")
	List<WebElement> sub_internal_id_list;
	
	@FindBy(xpath = "//input[@name='custrecord_tss_free_trail_enddate']")
	WebElement free_trial_date_enter;
	
	@FindBy(xpath = "//input[@name='custrecord_tss_next_bill_date']")
	WebElement next_bill_date_enter;
	
	@FindBy(xpath = "//input[@name='custrecord_tss_start_date']")
	WebElement start_date_enter;
	
	@FindBy(xpath = "//span[@id='custrecord_tss_processed_on_fs']//input[@name='custrecord_tss_processed_on']")
	WebElement processed_date_enter;
	
	@FindBy(xpath = "//td[@id='financiallnk']")
	WebElement financial_tab_in_customer;
	
	@FindBy(xpath = "//td[@id='creditcardslnk']")
	WebElement credit_cards_sublist;
	
	@FindBy(xpath = "//input[@name='ccnumber']")
	WebElement cc_number;
	
	@FindBy(xpath = "//input[@name='ccexpiredate']")
	WebElement expiry_date;
	
	@FindBy(xpath = "//input[@name='inpt_paymentmethod']")
	WebElement credit_card_type;
	
	@FindBy(xpath = "//td[@id='spn_secondarymultibutton_submitter']")
	WebElement secondary_save_customer;
	
	@FindBy(xpath = "//input[@title='Internal ID']")
	WebElement search_internal_id;
	
	@FindBy(xpath = "//a[@title='Set Description']")
	WebElement description_icon;
	
	@FindBy(xpath = "//span[@id='Custom_INTERNALID_fs']//textarea")
	WebElement textarea;
	
	@FindBy(xpath = "//a[@id='Custom_INTERNALID_popup_list']")
	WebElement search_internal_id_searching_arrow;
	
	@FindBy(xpath = "//input[@id='st']")
	WebElement search_internal_id_search_input;
	
	@FindBy(xpath = "//input[@id='Search']")
	WebElement search_search_button;
	
	@FindBy(xpath = "//div[@id='inner_popup_div']//table//tbody//tr//td[2]")
	List<WebElement> id_list;
	
	@FindBy(xpath = "//input[@id='update']")
	WebElement Done;
	
	@FindBy(xpath = "//input[@id='set']")
	WebElement set;
	
	@FindBy(xpath = "//td[@id='spn_secondarymultibutton_save']")
	WebElement save_search;
	
	@FindBy(xpath = "//table[@id='filters_splits']//tbody//tr[contains(@class,'uir-machine-row')]//td[count(td[@data-label='Description']//preceding-sibling::td)+1]")
	List<WebElement> search_internal_id_list;
	
	
	String sub_id_in_s="";
	String billing_freq=null;
	String sub_type_in_item=null;
	String next_date=null;
	String next_date1=null;
	Actions action=new Actions(driver);
	public Subscriptionfunctions()
	{
		PageFactory.initElements(driver, this);
	}
	public String date_fun(int days_add) throws ParseException
	{
		SimpleDateFormat df = new SimpleDateFormat("M/d/yyyy");
		String formatted = df.format(new Date());
		String dt = "2008-01-01";  // Start date
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
		Calendar c=Calendar.getInstance();
		c.setTime(sdf.parse(formatted)); 
		c.add(Calendar.DATE, days_add);
	    next_date=sdf.format(c.getTime());
		return next_date;
	}
	public void create_customer(String customer) throws InterruptedException
	{
		action.moveToElement(Lists).build().perform();
		Thread.sleep(2000);
		action.moveToElement(Relationships).build().perform();
		Thread.sleep(2000);
		action.moveToElement(Customers).build().perform();
		Thread.sleep(2000);
		action.moveToElement(New).build().perform();
		New.click();
		company_name.sendKeys(customer.trim());
		Thread.sleep(1000);
		customer_save.click();
	}
	public static void windowHandle() throws Exception {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String currentwindow = driver.getWindowHandle();
		parentWindow = currentwindow;
		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> i = allWindows.iterator();
		while (i.hasNext()) {
			String childwindow = i.next();
			if (!childwindow.equalsIgnoreCase(currentwindow)) {
				driver.switchTo().window(childwindow);
			}
		}
	}
	public boolean isAlertPresent_() {
		try {
			Alert a = new WebDriverWait(driver, 10).until(ExpectedConditions.alertIsPresent());
			if (a != null) {
				System.out.println("Alert is present");
				return true;
			} else {
				throw new Throwable();
			}
		} catch (Throwable e) {
			System.err.println("Alert isn't present!!");
			return false;
		}

	}
	public void script_running() throws InterruptedException
	{
		Actions action=new Actions(driver);
		driver.navigate().to("https://tstdrv939179-rp.app.netsuite.com/app/common/scripting/script.nl?id=298");
		script_edit.click();
		action.moveToElement(edit_expand).build().perform();
		save_and_execute.click();
		if(isAlertPresent_()==true)
		{
			Alert alert1=driver.switchTo().alert();
			alert1.accept();
		}
		Thread.sleep(5000);
		for (int i = 0; i < 50; i++) {
			driver.navigate().refresh();
			if (script_status.get(0).getText().equals("Complete"))
			break;				
		}
		Thread.sleep(5000);
	}
	public void create_so(String customer,String itemname,String testcase,String subscription,String free_trail_days1,ExtentTest test) throws Exception
	{
		action.moveToElement(Transcations).build().perform();
		Thread.sleep(2000);
		action.moveToElement(Sales).build().perform();
		Thread.sleep(2000);
		action.moveToElement(Enter_Sales_orders).build().perform();
		Thread.sleep(2000);
		Enter_Sales_orders.click();
		WebDriverWait wait=new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.visibilityOf(customer_arrow));
		Thread.sleep(10000);
		form_arrow.click();
		Thread.sleep(1000);
		for(int i=0;i<form_types.size();i++)
		{
			if(form_types.get(i).getText().equals("Standard Sales Order"))
			{
				form_types.get(i).click();
				break;
			}
		}
		Thread.sleep(3000);
		action.moveToElement(customer_arrow).build().perform();
//		JavascriptExecutor executor = (JavascriptExecutor)driver;
//		executor.executeScript("arguments[0].click();", customer_arrow);
		customer_arrow.click();
		customer_list.click();
		customer_input.sendKeys(customer.trim());
		search_button.click();
		Thread.sleep(5000);
		for(int i=0;i<customer_lists.size();i++)
		{
			WebElement cust=customer_lists.get(i);
			if(cust.getText().trim().equals(customer.trim()))
			{
				cust.click();
				break;
			}
		}
		Thread.sleep(10000);
		So_status.click();
		So_status.sendKeys("Pending Fulfillment");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Item_click);
		Item_click.click();
		Item_arrow.click();
		item_search_button.click();
		search.click();
		search_input.sendKeys(itemname);
		item_searching.click();
		Thread.sleep(10000);
		for(int i=0;i<item_list.size();i++)
		{
			item_list.get(0).click();
			break;
		}
		quantity_click.click();
		Item_click.click();
		action.moveToElement(Item_arrow).build().perform();
		open_item.click();
		windowHandle();
		item_edit.click();
		//js.executeScript("arguments[0].scrollIntoView();",subscription_tab )
		subscription_tab.click();
		free_trail_days.clear();
		free_trail_days.sendKeys(free_trail_days1.trim());
		m_q_a_arrow.click();
		for(int i=0;i<m_q_a_dropdown.size();i++)
		{
			WebElement sub=m_q_a_dropdown.get(i);
			if(sub.getText().trim().equals(subscription.trim()))
			{
				sub.click();
				break;
			}
		}
		save_item.click();
		if(isAlertPresent_()==true)
		{
			driver.switchTo().alert().accept();
		}
		subscription_tab.click();
		billing_freq=billing_frequency_in_item.getText().trim();
		sub_type_in_item=subscription_type_in_item_record.getText().trim();
		driver.close();
		driver.switchTo().window(parentWindow);
	    js.executeScript("window.scrollBy(0,-250)", "");
	    Thread.sleep(2000);
	    if(!testcase.trim().equals("Service items testing for subscription"))
	    {	
	    Amount_click.get(0).click();
	    Amount.sendKeys("1000");
	    }
	    Thread.sleep(1000);
		communication_tab.click();
		if(driver.findElement(By.xpath("//span[@id='tobeemailed_fs']")).getAttribute("class").equals("checkbox_unck"))
		{
			System.out.println("unchecked");
		}
		else
		{
			to_be_emailed_checkbox.click();
		}
		wait.until(ExpectedConditions.visibilityOf(save_sales_order));
		save_sales_order.click();	
		if(isAlertPresent_()==true)
		{
			driver.switchTo().alert().accept();;
			
		}
		Thread.sleep(6000);
		if(testcase.trim().equals("Service items testing for subscription"))
		{
			if(driver.findElement(By.xpath("//div[@class='uir-record-status']")).getText().trim().equalsIgnoreCase("Pending Fulfillment"))
			{
				test.pass("Subscription record is not created for service item");
			}
			else
			{
				test.fail("Subscription record is not in pending fulfillment status");
			}
		}
		else
		{
		sub_id_in_s=sub_id_in_sales_order.getText().trim();
		System.out.println("Subscription id in sales order is: "+sub_id_in_s);
		}
		
	}
	public String date_function(String no_of_days) throws ParseException
	{
	
		Calendar cal = Calendar.getInstance();
        SimpleDateFormat format1 = new SimpleDateFormat("M/d/yyyy");
        String today_date = format1.format(cal.getTime());
        System.out.println(today_date);
        cal.setTime(format1.parse(today_date));
        cal.add(Calendar.DATE,Integer.parseInt(no_of_days) );
        String next_day=format1.format(cal.getTime());
        System.out.println(next_day);
        return next_day;
	}
	public String date_function_month(String no_of_days,String date) throws ParseException
	{
	
		Calendar cal = Calendar.getInstance();
        SimpleDateFormat format1 = new SimpleDateFormat("M/d/yyyy");
        String today_date = format1.format(cal.getTime());
        System.out.println(today_date);
        cal.setTime(format1.parse(date));
        cal.add(Calendar.MONTH,Integer.parseInt(no_of_days) );
        String next_day=format1.format(cal.getTime());
        System.out.println(next_day);
        return next_day;
	}
	public String date_function_day(String no_of_days,String date) throws ParseException
	{
	
		Calendar cal = Calendar.getInstance();
        SimpleDateFormat format1 = new SimpleDateFormat("M/d/yyyy");
        String today_date = format1.format(cal.getTime());
        System.out.println(today_date);
        cal.setTime(format1.parse(date));
        cal.add(Calendar.DATE,Integer.parseInt(no_of_days) );
        String next_day=format1.format(cal.getTime());
        System.out.println(next_day);
        return next_day;
	}
	public void subrecord_viewing() throws InterruptedException
	{
		
		driver.navigate().to("https://tstdrv939179-rp.app.netsuite.com/app/common/custom/custrecordentrylist.nl?rectype=202&whence=");
		search_arrow.click();
		for(int i=0;i<search_list.size();i++)
		{
			if(search_list.get(i).getText().trim().equals("Saved Search on Subscription record"))
			{
				search_list.get(i).click();
				break;
			}
		}
		Thread.sleep(3000);
		sub_record_arrow.click();
		for(int i=0;i<sub_drop_down.size();i++)
		{
			WebElement sub=sub_drop_down.get(i);
			if(sub.getText().trim().equals("Recently Created"))
			{
				Thread.sleep(2000);
				sub.click();
				break;
			}
		}
		
		
	}
//	public void credit_card_details()
//	{
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView();", financial_tab_in_customer);
//		financial_tab_in_customer.click();
//		credit_cards_sublist.click();
//		cc_number.sendKeys(");
//		
//	}
	public void clearing(WebElement element)
	{
		String s = Keys.chord(Keys.CONTROL, "a");
		element.click();
		element.sendKeys(s);
		element.sendKeys(Keys.DELETE);
	}
	public void billing(String customername, String itemname, String subscription, String free_trail_days2,String testcase,ExtentTest test) throws InterruptedException, ParseException
	{
		
		if(testcase.trim().equals("Verification of successful billing of a free trial subscription on Free Trial End Date"))
		{
			test.info("No valid Credit Cards are available");
		}
		else if(testcase.trim().equals("Verification of Billing success for a subscription on grace period limit"))
		{
			test.info("No valid Credit Cards are available");
		}
		else
		{
		Calendar cal = Calendar.getInstance();
        SimpleDateFormat format1 = new SimpleDateFormat("M/d/yyyy");
        String today_date = format1.format(cal.getTime());
		subrecord_viewing();
		String internal_id=sub_internal_id_list.get(0).getText().trim();
		view_sub_record_list.get(0).click();
		String url=driver.getCurrentUrl();
		subscription_edit.click();
		clearing(free_trial_date_enter);
		free_trial_date_enter.sendKeys(date_function_day("-1", today_date));
		clearing(next_bill_date_enter);
		next_bill_date_enter.sendKeys(today_date);
		clearing(start_date_enter);
		start_date_enter.sendKeys("-1",today_date);
		subscription_event.click();
		clearing(processed_date_enter);
		processed_date_enter.sendKeys("-1",today_date);
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 0)");
		save_sub_record.click();
		driver.navigate().to("https://tstdrv939179-rp.app.netsuite.com/app/common/search/search.nl?cu=T&e=T&id=162");
		js.executeScript("arguments[0].scrollIntoView();", search_internal_id_list.get(0));
		Thread.sleep(2000);
		for(int i=0;i<search_internal_id_list.size();i++)
		{
			if(search_internal_id_list.get(i).getText().trim().equals("Internal ID"))
			{
				search_internal_id_list.get(i).click();
				break;
			}
		}
		search_internal_id.click();
		description_icon.click();
		Thread.sleep(5000);
		driver.switchTo().frame("filter_frame");
		textarea.sendKeys(Keys.CONTROL + "a");
		textarea.sendKeys(Keys.DELETE);
		search_internal_id_searching_arrow.click();
		Thread.sleep(8000);
		search_internal_id_search_input.sendKeys(internal_id);
		search_search_button.click();
		Thread.sleep(5000);
		for(int i=0;i<id_list.size();i++)
		{
			if(id_list.get(i).getText().equals(internal_id.trim()))
			{
				id_list.get(i).click();
				break;
			}
		}
		Thread.sleep(3000);
		Done.click();
		set.click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		save_search.click();
		script_running();
		driver.navigate().to(url);
		if(s_status.getText().equals("Grace Period"))
		{
			test.pass("Status is correctly displayed: "+s_status.getText());	
		}
		else
		{
			test.fail("Status is incorrect");
		}
		subscription_event.click();
		if(event_date.get(1).getText().equals(today_date))
		{
			test.pass("Event date is correct: "+event_date.get(1).getText());
		}
		else
		{
			test.fail("Event date is incorrect");
		}
		if(event_type.get(1).getText().equals("Payment Failure"))
		{
			test.pass("Event status is : "+event_type.get(1).getText());
		}
		else
		{
			test.fail("Event Status is incorrect");
		}
		}
		
	}
	public void sub_record(String customer,String itemname,String testcase,String free_trail_days1,String end_date1,ExtentTest test) throws Exception
	{
		String next_bill_date_after1=null;
		Calendar cal = Calendar.getInstance();
        SimpleDateFormat format1 = new SimpleDateFormat("M/d/yyyy");
        String today_date = format1.format(cal.getTime());
		if(!itemname.trim().equals(""))
		{
			test.pass("Subscription id in sales order is :"+sub_id_in_s);
		}
			if(testcase.trim().equals("Subscription Hold Release"))
			{
				subrecord_viewing();
				for(int i=0;i<customer_list_in_subrecord.size();i++)
				{
					if(billing_frequency_list.get(i).getText().equalsIgnoreCase("On Hold"))
					{
						view_sub_record_list.get(i).click();
						break;
					}
				}
				String url=driver.getCurrentUrl();
				Thread.sleep(5000);
				subscription_edit.click();
				Thread.sleep(5000);
				String s = Keys.chord(Keys.CONTROL, "a");
				hold_e_date.click();
				hold_e_date.sendKeys(s);
				hold_e_date.sendKeys(Keys.DELETE);
				hold_e_date.sendKeys(date_function_day("-1", today_date));
				save_sub_record.click();
				script_running();
				driver.navigate().to(url);
				if(hold_end_date.getText().trim().equals(""))
				{
					test.pass("Hold End Date is null");
					System.out.println("Hold end date is null");
				}
				if(s_status.getText().trim().equals("Billing"))
				{
					test.pass("Subscription status changed from On Hold to Billing");
					System.out.println("Subscription status changed from On Hold to Billing");
				}
				
				
				
			}
			else
			{
	
		if(testcase.trim().equals("Subscription Cancellation")||testcase.trim().equals("Subscription Put On Hold functionality"))
		{
			subrecord_viewing();
			for(int i=0;i<customer_list_in_subrecord.size();i++)
			{
				if(!billing_frequency_list.get(i).getText().trim().equals("Cancelled")&&!billing_frequency_list.get(i).getText().trim().equals("Billing")&&!billing_frequency_list.get(i).getText().equalsIgnoreCase("On Hold"))
				{
					view_sub_record_list.get(i).click();
					break;
				}
			}
			Thread.sleep(2000);
			String next_bill_date_before=next_bill_date.getText().trim();
			if(testcase.trim().equals("Subscription Put On Hold functionality"))
			{
				for(int i=0;i<3;i++)
				{
				subscription_edit.click();
				sub_status_arrow.click();
				for(int j=0;j<sub_status_list.size();j++)
				{
					WebElement stat=sub_status_list.get(j);
					if(stat.getText().trim().equals("Billing"))
					{
						stat.click();
						break;
					}
							
				}
				save_sub_record.click();
				put_on_hold.click();
				if(i==2)
				{
					Thread.sleep(5000);
					windowHandle();
					if(warning_message.getText().trim().equals("Cannot provide another hold"))
					{
						ExtentTest test1=test.createNode("Providing Hold after Maximum time");
						System.out.println("Warning message is displayed: "+warning_message.getText());
						test1.pass(warning_message.getText());
						driver.switchTo().window(parentWindow);
					}
				break;
				}
			    Thread.sleep(5000);
				ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
			    driver.switchTo().window(tabs.get(1));
				put_on_hold_reason.sendKeys("puttinng on hold"+i);
				Thread.sleep(2000);
				no_of_months_to_hod_for.sendKeys("1");
				hold_sub_button.click();
				driver.switchTo().window(tabs.get(0));
				System.out.println("Hold count is: "+sub_hold_count.getText().trim());
				System.out.println("Subscription Status is: "+s_status.getText().trim());
				String next_bill_date_=next_bill_date.getText().trim();
				String hold_end_date=this.hold_end_date.getText().trim();
				
				subscription_event.click();
				Thread.sleep(2000);
				String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
					for(int k=0;k<event_type.size();k++)
					{
						WebElement event=event_type.get(k);
						if(event.getText().trim().equals("Place on Hold"))
						{
							if(i==0)
							{
								
								related_id.get(k).sendKeys(selectLinkOpeninNewTab);
							}
							if(i==1)
							{
								
								related_id.get(k+1).sendKeys(selectLinkOpeninNewTab);
							}
							windowHandle();
							String notes=hold_notes.getText();
							if(i==0)
							{
							ExtentTest test2=test.createNode("Providing Hold for First Time");
							
							test2.pass("When we Provide Hold for First time "+"<br/>"+" Hold Notes is: "+notes+"<br/>"+"Event Type is: "+event_type_in_child_record.getText().trim()+"<br/>"+"Subscription event relation is "+subcsription_event_relation.getText());
							if(hold_end_date.equals(date_function_month("1", today_date)))
							{
								test2.pass("Hold end date is correct: "+hold_end_date);
							}
							else
							{
								test2.fail("Hold end date is incorrect");
							}
				
							if(next_bill_date_.equals(date_function_month("1",next_bill_date_before)))
							{
								test2.pass("Next Bill date is correct: "+next_bill_date_);
							}
							else
							{
								test2.fail("Next bill date is incorrect");
							}
							System.out.println("Hold Notes is : "+notes);
							System.out.println("Event Type is: "+event_type_in_child_record.getText().trim());
							System.out.println("Subscription event relation is "+subcsription_event_relation.getText());
							}
							if(i==1)
							{
								ExtentTest test3=test.createNode("Providing Hold for Second Time");
								test3.pass("When we Provide Hold for second time "+"<br/>"+" Hold Notes is: "+notes+"<br/>"+"Event Type is: "+event_type_in_child_record.getText().trim()+"<br/>"+"Subscription event relation is "+subcsription_event_relation.getText());
								System.out.println("Hold Notes is : "+notes);
								System.out.println("Event Type is: "+event_type_in_child_record.getText().trim());
								System.out.println("Subscription event relation is "+subcsription_event_relation.getText());
								if(hold_end_date.equals(date_function_month("1", today_date)))
								{
									test3.pass("Hold end date is correct: "+hold_end_date);
								}
								else
								{
									test3.fail("Hold end date is incorrect");
								}
								if(next_bill_date_.equals(date_function_month("1",next_bill_date_after1)))
								{
									test3.pass("Next Bill date is correct: "+next_bill_date_);
								}
								else
								{
									test3.fail("Next bill date is incorrect");
								}
							}
							driver.close();
							driver.switchTo().window(parentWindow);
							JavascriptExecutor js = (JavascriptExecutor) driver;
							js.executeScript("window.scrollTo(0, 0)");
							next_bill_date_after1=next_bill_date.getText().trim();
							break;
						}
					}
				}
				
					
				
				
			
		}
			if(testcase.trim().equals("Subscription Cancellation"))
			{
				String url1=driver.getCurrentUrl();
				cancel_button.click();
				Thread.sleep(5000);
				windowHandle();
				cancellation_reason.sendKeys("Not Interested");
				Thread.sleep(2000);
				cancellaton_date.clear();
				cancellaton_date.sendKeys(date_function("0"));
				cancel_sub_button.click();
				Thread.sleep(1000);
				driver.switchTo().window(parentWindow);
				script_running();
				driver.navigate().to(url1);
				System.out.println("Now the status after cancellation of subscription is: "+s_status.getText());
				test.pass("Status after cancellation of subscription is: "+s_status.getText());
				System.out.println("End date is today's date : "+end_date.getText());
				test.pass("End date is today's date : "+end_date.getText());
				String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
				s_customer.sendKeys(selectLinkOpeninNewTab);
				windowHandle();
				subcsription_tab_in_customer.click();
				String cust_role=customer_role.getText();
				System.out.println("Customer role after cancelling subscription is: "+cust_role);
				test.pass("Customer role after cancelling subscription is: "+cust_role);
				driver.close();
				Thread.sleep(2000);
				driver.switchTo().window(parentWindow);
				subscription_event.click();
				for(int i=0;i<event_type.size();i++)
				{
					WebElement ele=event_type.get(i);
					if(ele.getText().equals("Other"))
					{
						WebElement date=event_date.get(i);
						String datee=date.getText();
						test.pass("Event date for cancellation is today: "+datee);
						test.pass("Event type for cancellation is: "+ele.getText());
						break;
					}
				}
				
				
			}
		}
		else
		{
		String start_d=null;
		String next_bill_d=null;
		String free_trail_end_d=null;
		String end_d=null;
		String billing_f=null;
		String billing_itemm=null;
		String sub_customer=null;
		String sub_type=null;
		String sub_status=null;
		String subscription_id=null;
		String cust_role=null;
		subrecord_viewing();
		if(testcase.trim().equals("subscription purchse with no free trial for an existing customer")||testcase.trim().equals("subscription purchse with free trial for an existing customer"))
		{
			for(int i=0;i<customer_list_in_subrecord.size();i++)
			{
				if(customer_list_in_subrecord.get(i).getText().equals(customer.trim()))
				{
					view_sub_record_list.get(i).click();
					break;
				}
			}
			
		}
		Thread.sleep(3000);
		int f_t_d=Integer.parseInt(free_trail_days1.trim());
		String sub_ids="SUBSCR"+sub_id_in_s.trim();
		System.out.println("subscription id is: "+sub_ids);
		for(int i=0;i<subscription_ids.size();i++)
		{
			WebElement sub_id=subscription_ids.get(i);
			if(sub_id.getText().trim().equals(sub_ids))
			{
				view_sub_record.get(i).click();
				break;
			}
		}
		System.out.println("Subscription record details");
		System.out.println("Todays date is "+date_function("0"));
		start_d=start_date.getText().trim();
		next_bill_d=next_bill_date.getText().trim();
		free_trail_end_d=free_trail_end_date.getText().trim();
		end_d=end_date.getText().trim();
		billing_f=billing_frequency.getText().trim();
		billing_itemm=billing_item.getText().trim();
		sub_customer=s_customer.getText().trim();
		sub_type=subscription_type.getText().trim();
		sub_status=s_status.getText().trim();
		if(testcase.trim().equals("subscription purchse with free trial for an existing customer"))
		{
			free_trail_days1=end_date1;
		}
		if(start_date.getText().trim().equals(date_function(end_date1.trim())))
		{
			System.out.println("Start date is :"+start_d);
			test.pass("Start date is today's date: "+start_d);
		}
		if(!testcase.trim().equals("Subscription Free Trial Extension"))
		{
		if(next_bill_date.getText().trim().equals(date_function(end_date1.trim())))
		{
			test.pass("Next bill date is date: "+next_bill_d);
			System.out.println("Next bill date is date: "+next_bill_d);
		}
		else
		{
			test.fail("Next bill date is incorrect");
		}
		//}
		if(free_trail_end_date.getText().trim().equals(date_function(free_trail_days1.trim())))
		{
			test.pass("Free trail End date is : "+free_trail_end_d);
			System.out.println("Free trail end date is : "+free_trail_end_d);
		}
		else
		{
			test.fail("free trail end date is incorrect");
		}
		if(end_date.getText().trim().equals(""))
		{
			test.pass("End date is null");
			System.out.println("End Date is null");
		}
		else
		{
			test.fail("End date is incorrect");
		}
		}
		if(billing_frequency.getText().trim().equals(billing_freq))
		{
			test.pass("Billing frequency in item record is: "+billing_frequency.getText()+"<br/>"+" Billing frequency in subscription record is: "+billing_freq+"<br/>"+" So, Test case is Verified");
			System.out.println("Billing frequency in item record and in subscription record is same: "+billing_freq);
		}
		else
		{
			test.fail("Billing frequency is incorrect");
		}
		if(itemname.trim().equals(billing_item.getText().trim()))
		{
			test.pass("Billing Item is: "+billing_itemm+"<br/>"+" Purchased Item is :"+itemname.trim()+"<br/>"+" So, testcase is verified");
			System.out.println("Billing item is the purchased item: "+billing_item.getText());
		}
		else
		{
			test.fail("Billing item is incorrect");
		}
		if(customer.trim().equals(s_customer.getText().trim()))
		{
			test.pass("Billing customer is: "+s_customer.getText()+"<br/>"+"Purchased customer is: "+customer.trim()+" So, testcase is verified");
			System.out.println("Billing customer is the purchased customer: "+s_customer.getText());
		}
		else
		{
			test.fail("Customer is incorrect");
		}
		if(subscription_type.getText().trim().equals(sub_type_in_item))
		{
			test.pass("Subcription type in item record is: "+sub_type_in_item+"<br/>"+" Subscription type in the subscription record is: "+subscription_type.getText()+"<br/>"+"So, Testcase is verified");
			System.out.println("Subscription type is same in item and sub record: "+sub_type_in_item);
		}
		else
		{
			test.fail("Subscription type is incorrect");
		}
		if(s_status.getText().trim().equals("New/Free Trial"))
		{
			test.pass("Subscription Status is: "+s_status.getText());
			System.out.println("Subscription status is verified: "+s_status.getText());
		}
		else
		{
			test.fail("Subscription Status is incorrect");
		}
		subscription_id=sub_id.getText();
		subscription_event.click();
		if(event_date.get(0).getText().trim().equals(date_function("0")))
		{
			test.pass("Subscription event date is today's date: "+event_date.get(0).getText());
			System.out.println("Subscription event date is today");
		}
		else
		{
			test.fail("Event date is incorrect");
		}
		System.out.println("Event type is: "+event_type.get(0).getText());
		test.pass("Subscription Event type is: "+event_type.get(0).getText());
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
		related_id.get(0).sendKeys(selectLinkOpeninNewTab);
		windowHandle();
		String related_t=related_transcation.getText();
		String sub_event_rel=subcsription_event_relation.getText().trim();
		System.out.println("related transaction is: "+related_transcation.getText());
		test.pass("Realted Transcation is: "+related_transcation.getText());
		if(subscription_id.trim().equals(subcsription_event_relation.getText().trim()))
		{
			System.out.println("subscription event relation is equal to parent subscription id: "+subcsription_event_relation.getText());
			test.pass("Subscription id in Subscription Record is: "+subscription_id+"<br/>"+"Subscription event relation is: "+subcsription_event_relation.getText()+"<br/>"+" So,Test case is verified");
		}
		else
		{
			test.fail("Subscription id is incorrect");
		}
		driver.close();
		driver.switchTo().window(parentWindow);
		s_customer.sendKeys(selectLinkOpeninNewTab);
		windowHandle();
		subcsription_tab_in_customer.click();
		 cust_role=customer_role.getText();
		System.out.println("customer role is: "+cust_role);
		if(testcase.trim().equals("Subscription Free Trial Extension"))
		{
		driver.close();
		driver.switchTo().window(parentWindow);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 0)");
		String free_trail_end_before=free_trail_end_date.getText().trim();
		String next_bill_date_before=next_bill_date.getText().trim();
		extend_free_trail.click();
		Thread.sleep(5000);
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
		no_of_free_days.sendKeys("1");
		extend_free_trail_save.click();
	    driver.switchTo().window(tabs.get(0));
		free_trail_end_d=free_trail_end_date.getText();
		next_bill_d=next_bill_date.getText();
		test.pass("No of days to extend free trail is: 1");
		test.pass("Free Trail end date before Extending is: "+free_trail_end_before);
		if(free_trail_end_d.equals(date_function_day("1", free_trail_end_before)))
		{
			
			test.pass("Free Trail end date after extension is correct: "+free_trail_end_d);
			System.out.println("Free Trail end date is verified");
		}
		else
		{
			test.fail("Next bill date after extension is incorrect");
		}
		test.pass("Next bill date before extension is: "+next_bill_date_before);
		if(next_bill_d.equals(date_function_day("1", free_trail_end_d)))
		{
			test.pass("Next bill date after extension is correct :"+next_bill_d);
			System.out.println("Next bill date is verified");
		}
		else
		{
			test.fail("Next Bill Date after extension is incorrect");
		}
		}
		
		
	}
	}
	
	
	}
	
}

