package com.winit.beans;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="second")
public class SecondBean {
 
	 @Resource(name="first")
	 private FirstBean fb;
	 
	 public FirstBean getFirBean()
	 {
		 return this.fb;
	 }
}
