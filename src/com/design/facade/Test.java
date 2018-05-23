package com.design.facade;

public class Test {
	
	public static void main(String[] args) throws InterruptedException {
		Computer computer = new Computer();
		computer.start();
		Thread.currentThread().sleep(5000);
		computer.shutDown();
		
	}
}
