package com.design.chain;

public class Test {
	public static void main(String[] args) {
	       //创建处理器
        Handler handler1=new ConcreteHandler1();
        Handler handler2=new ConcreteHandler2();
               //客户端创建处理器的关联，形成链
        handler1.setHandler(handler2);
               //创建任务，此处为一些数字，不同大小，处理器处理结果不同
        int[] requests={4,10,59,2,16};
               //调用处理器处理        
        for(int request:requests){
            handler1.request(request);
        }
	}
}
