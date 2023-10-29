package com.threads;

public class threadgrp extends Thread{

	public void run()
	{
		System.out.println("Thread name: "+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threadgrp obj = new threadgrp();
		ThreadGroup tg = new ThreadGroup("Group A");
		Thread t1 = new Thread(tg, obj, "t1");
		Thread t2 = new Thread(tg, obj, "t2");
		t1.start();
		t2.start();
		obj.start();
	}

}
