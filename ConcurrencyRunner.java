package com.in28minutes.concurrency;

public class ConcurrencyRunner {
	public static void main(String[] args) {
		
		Counter c=new Counter();
		c.increment();
		c.increment();
		System.out.println(c.getI());
		
		BiCounter bc=new BiCounter();
		bc.incrementI();
		System.out.println(bc.getI());
		bc.incrementJ();
		System.out.println(bc.getJ());
	}

}
