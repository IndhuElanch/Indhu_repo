package com.threads;

class task extends Thread
{
	int counter = 1;
	public void Even() {
		synchronized(this)
		{
			while(counter<20)
			{
				if(counter%2==0)
				{
					try {
						wait();
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				}
				System.out.println(counter);
				counter++;
				notify();
			}
		}
	}
	
	public void Odd() {
		synchronized(this)
		{
			while(counter<20)
			{
				if(counter%2!=0)
				{
					try {
						wait();
					}
					catch(Exception e)
					{
						e.printStackTrace(); 
					}
				
				}
				System.out.println(counter);
				counter++;
				notify();
			}
		}
	}


}

public class syncMultiTask {
	public static void main(String[] a)
	{
		task t = new task();
		Thread t1 = new Thread(new Runnable()
			{
				public void run()
				{
					t.Even();
				}
			});
		Thread t2 = new Thread(new Runnable()
			{
				public void run()
				{
					t.Odd();
				}
			});
		t1.start();
		t2.start();
	}
}
