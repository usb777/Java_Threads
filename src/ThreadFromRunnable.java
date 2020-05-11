
public class ThreadFromRunnable implements Runnable
{
	public void run()
	{  
		System.out.println("thread is running from runnable...");  
	}  
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ThreadFromRunnable r1= new ThreadFromRunnable();
		
		Thread t1 = new Thread(r1);
		
		t1.start();
	}

}
