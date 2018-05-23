package com.design.bridge;

public class Test {
	public static void main(String[] args) {
	     //白色
        Color white = new White();
        //正方形
        Shape square = new Circle();
        //白色的正方形
        square.setColor(white);
        square.draw();
        
        //长方形
        Shape rectange = new Rectangle();
        rectange.setColor(white);
        rectange.draw();	}
}
