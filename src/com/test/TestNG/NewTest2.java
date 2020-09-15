package com.test.TestNG;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest2 {

//	@BeforeClass
//	public void initiateTest() {
//		Assert.assertEquals("test", "test");
//		System.out.println("Method name is InitialTest and thread id: "+Thread.currentThread().getId()+ " "+Thread.currentThread().getName());
//	}
	@Test (priority =7, groups = {"smoke", "Performance"})
	public void openPage() {
		Assert.assertEquals("test", "test");
		System.out.println("Method name is openPage and thread id: "+Thread.currentThread().getId()+ " ");
	}
	@Test (priority =8, groups = {"smoke", "Performance"})
	public void login() {
		Assert.assertEquals("test", "test");
		System.out.println("Method name is login and thread id: "+Thread.currentThread().getId()+ " ");
	}
	@Test (priority =9, groups = {"smoke", "Performance"})
	public void addNewUser() {
		Assert.assertEquals("test", "test");
		System.out.println("Method name is addNewUser and thread id: "+Thread.currentThread().getId()+ " ");
	}
	@Test (priority =10, groups = {"Performance"})
	public void viewUsers() {
		Assert.assertEquals("test", "test");
		System.out.println("Method name is viewUsers and thread id: "+Thread.currentThread().getId()+ " ");
	}
	@Test (priority =11, groups = {"Performance"})
	public void removeExistingUser() {
		Assert.assertEquals("test", "test");
		System.out.println("Method name is removeExistingUser and thread id: "+Thread.currentThread().getId()+ " ");
	}
	@Test (priority =12, groups = {"smoke", "Performance"})
	public void Logout() {
		Assert.assertEquals("test", "test");
		System.out.println("Method name is Logout and thread id: "+Thread.currentThread().getId()+ " ");
	}
}
