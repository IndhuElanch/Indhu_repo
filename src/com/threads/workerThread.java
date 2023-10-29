package com.threads;
import java.util.concurrent.ExecutorService;  
import java.util.concurrent.Executors;

class worker implements Runnable{
	
	String name;
	worker(String name)
	{
		this.name=name;
	}
	public void run()
	{
		System.out.println("Thread "+ Thread.currentThread().getName()+ " " +
	                       this.name + "running");
	}
}

public class workerThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService es = Executors.newFixedThreadPool(5);
		for(int i=0; i<10; i++)
		{
			worker w = new worker(""+i); 
			es.execute(w);
		}
		es.shutdown();
	}

}
