package com.design.proxy.statics;

public class RealImage implements Image {

	  private String fileName;  
	  
	  
	   public RealImage(String fileName){//传入图片名称  
	      this.fileName = fileName;  
	      loadFromDisk(fileName);  
	   }  
	  
	  
	   @Override  
	   public void display() {  
	      System.out.println("Displaying " + fileName);  
	   }  
	  
	  
	   private void loadFromDisk(String fileName){  
	      System.out.println("Loading " + fileName);  
	   }  
}
