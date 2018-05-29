package com.design.flyweight;

public class Test {
	public static void main(String[] args) {
		String str = "010113010";
		StringBuffer buffer;

		for (int i = 0; i < 1000000; i++) {
			buffer = new StringBuffer();
			buffer.append(i % 1).append(i % 2).append(i % 3).append(i % 4)
					.append(i % 5).append(i % 6).append(i % 7).append(i % 8)
					.append(i % 9);
			if (buffer.toString().equals(str)) {
				System.out.println(i);
			}
		}
	}
}
