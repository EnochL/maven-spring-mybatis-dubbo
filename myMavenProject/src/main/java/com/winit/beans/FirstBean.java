package com.winit.beans;

import org.springframework.stereotype.Component;

@Component(value="first")
public class FirstBean {
	public String name;
	public FirstBean()
	{
		this.name="hehe";
	}
	public FirstBean(String str)
	{
		this.name="hehe1";
	}
}
