
public class ThreadFromThread extends Thread

{
	public void run()
	   {  
		for(int i=1;i<5;i++)
		{  
		    try{Thread.sleep(1500);}catch(InterruptedException e){System.out.println(e);		}  
		    System.out.println(i);  
		    
		  }  
		}  

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ThreadFromThread t1=new ThreadFromThread();  
		
		 t1.start(); 
		 

		
		
		/*
		ThreadFromThread t2=new ThreadFromThread();  
		t2.start();  
		*/
		System.out.println("Name of t1:"+t1.getName());  	
		ThreadWithChar tch = new ThreadWithChar();
		tch.start();
		System.out.println("Name of tch:"+tch.getName());  
		try{  
			//  tch.join(200);  
			 }catch(Exception e){System.out.println(e);}  
			 
	}

}
