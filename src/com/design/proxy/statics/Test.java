package com.design.proxy.statics;

public class Test {
	
	public static void main(String[] args) {
		  Image image = new ProxyImage("test.jpg");//调用代理类的初始化方法  
		  
	      //图像将从磁盘加载  
	      image.display();  
	}
}
