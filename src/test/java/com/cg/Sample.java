package com.cg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.base.Base;

public class Sample extends Base {

	public static void main(String[] args) throws IOException {
		WebDriver driver = getDriver();

		loadUrl("https://adactinhotelapp.com/");
		WebElement user = driver.findElement(By.id("username"));
		type(user, getData(i, j));
		WebElement pass = driver.findElement(By.id("password"));
		type(pass, getData(i, j));
		WebElement btn = driver.findElement(By.xpath("//input[@id='login']"));
		btnclick(btn);

		WebElement loc = driver.findElement(By.xpath("//select[@name='location']"));
		listDown(loc, getData(1, 2));
		WebElement hot = driver.findElement(By.xpath("//select[@name='hotels']"));
		listDown(hot, getData(1, 3));
		WebElement roomtype = driver.findElement(By.xpath("//select[@name='room_type']"));
		listDown(roomtype, getData(1, 4));
		WebElement roomno = driver.findElement(By.id("room_nos"));
		listDown(roomno, getData(1, 5));
		WebElement datein = driver.findElement(By.id("datepick_in"));
		type(datein, getData(1, 6));
		WebElement dateout = driver.findElement(By.id("datepick_out"));
		type(dateout, getData(1, 7));
		WebElement adultroom = driver.findElement(By.id("adult_room"));
		listDown(adultroom, getData(1, 8));
		WebElement childroom = driver.findElement(By.id("child_room"));
		listDown(childroom, getData(1, 9));
		WebElement btn1 = driver.findElement(By.id("Submit"));
		btnclick(btn1);
		WebElement btn2 = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
		btnclick(btn2);
		WebElement btn3 = driver.findElement(By.xpath("//input[@id='continue']"));
		btnclick(btn3);
		WebElement txt2 = driver.findElement(By.id("first_name"));
		type(txt2, getData(1, 10));
		WebElement txt3 = driver.findElement(By.id("last_name"));
		type(txt3, getData(1, 11));
		WebElement txt4 = driver.findElement(By.id("address"));
		type(txt4, getData(1, 12));
		WebElement txt5 = driver.findElement(By.id("cc_num"));
		type(txt5, getData(1, 13));
		WebElement cctype = driver.findElement(By.id("cc_type"));
		type(cctype, getData(1, 14));
		WebElement cc_exp_month = driver.findElement(By.id("cc_exp_month"));
		type(cc_exp_month, getData(1, 15));
		WebElement cc_exp_year = driver.findElement(By.id("cc_exp_year"));
		type(cc_exp_year, getData(1, 16));
		WebElement txt6 = driver.findElement(By.id("cc_cvv"));
		type(txt6, getData(1, 17));
		WebElement btn4 = driver.findElement(By.id("book_now"));
		btnclick(btn4);
		WebElement orderno = driver.findElement(By.xpath("//input[@id='order_no']"));
		String txt7 = orderno.getAttribute("value");
		setData(txt7);
		System.out.println("order id is" + txt7);

		WebElement logout = driver.findElement(By.id("logout"));
		btnclick(logout);
	}
}
