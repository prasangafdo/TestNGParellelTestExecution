package com.test.TestNG;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
	//This will require basic knowledge in Threads
	//Created by Prasanga Fernando on 2020.09.13
	
	@BeforeClass
	public void initiateTest() {
		Assert.assertEquals("test", "test");
		System.out.println("Method name is InitialTest and thread id: "+Thread.currentThread().getId()+ " ");
	}
	@Test (priority =1, groups = {"smoke", "Performance"})
	public void openPage() {
		Assert.assertEquals("test", "test");
		System.out.println("Method name is openPage and thread id: "+Thread.currentThread().getId()+ " ");
	}
	@Test (priority =2, groups = {"smoke", "Performance"})
	public void login() {
		Assert.assertEquals("test", "test");
		System.out.println("Method name is login and thread id: "+Thread.currentThread().getId()+ " ");
	}
	@Test (priority =3, groups = {"smoke", "Performance"})
	public void addNewUser() {
		Assert.assertEquals("test", "test");
		System.out.println("Method name is addNewUser and thread id: "+Thread.currentThread().getId()+ " ");
	}
	@Test (priority =4, groups = {"Performance"})
	public void viewUsers() {
		Assert.assertEquals("test", "test");
		System.out.println("Method name is viewUsers and thread id: "+Thread.currentThread().getId()+ " ");
	}
	@Test (priority =5, groups = {"Performance"})
	public void removeExistingUser() {
		Assert.assertEquals("test", "test");
		System.out.println("Method name is removeExistingUser and thread id: "+Thread.currentThread().getId()+ " ");
	}
	@Test (priority =6, groups = {"smoke", "Performance"})
	public void Logout() {
		Assert.assertEquals("test", "test");
		System.out.println("Method name is Logout and thread id: "+Thread.currentThread().getId()+ " ");
	}
}
