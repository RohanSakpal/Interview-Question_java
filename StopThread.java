import java.util.*;
class StopThread
{
	public static void main(String[] args)
	{
		MyThread th = new MyThread();
		th.start();
		try
		{
			Thread.sleep(100);
		} 
		catch (InterruptedException e) 
       		{
            		e.printStackTrace();
        	}
		th.stopRunning();
		//th.interrupt(); 2nd method
	}
}

class MyThread extends Thread
{
	boolean flag = true;
	public void stopRunning()
	{
		flag = false;
	}
	public void run()
	{
		while(flag) //while(!Thread.interrupted()) 2nd method
		{
			System.out.println("Thread is running");
		}
		System.out.println("Thread is not running");
	}	
}