package com.design.proxy.statics;

public class ProxyImage implements Image {

	private RealImage realImage;
	private String fileName;
	
	public ProxyImage(String fileNmae) {
		this.fileName = fileNmae;
	}
	
	
	
	@Override
	public void display() {
		if(realImage == null) {
			realImage = new RealImage(fileName);
		}
		realImage.display();
	}

}
