package com.design.facade;

/**
 * 门面类(核心)
 * 
 * @author Administrator
 *
 */
public class Computer {
	private Cpu cpu;
	private Memory memory;
	private Disk disk;

	public Computer() {
		cpu = new Cpu();
		memory = new Memory();
		disk = new Disk();
	}

	public void start() {
		System.out.println("computer is starting .........");
		cpu.start();
		disk.start();
		memory.start();
		System.out.println("computer is started .........");
	}

	public void shutDown() {
		System.out.println("computer is shutDown .........");
		cpu.shutDown();
		disk.shutDown();
		memory.shutDown();
		System.out.println("computer is shutDowned .........");
	}
}
