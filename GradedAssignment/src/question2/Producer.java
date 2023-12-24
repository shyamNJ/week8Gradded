package question2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Map.Entry;

public class Producer extends Thread{

	Thread1 thread;
	
	Producer(Thread1 thread) throws IOException
	{
		this.thread=thread;
	} 
	public Producer() {
		// TODO Auto-generated constructor stub
	}
	public void run()
	{
		synchronized (thread) 
		{
			try {
				FileOutputStream fos=new FileOutputStream("File.txt");;
				ObjectOutputStream oos= new ObjectOutputStream(fos);;
				oos.writeObject(thread.hMap);
				oos.flush();
				oos.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			System.out.println("Serialize call by Producer...\nSerialized Data : ");
			for(Entry<Project, ArrayList<Employee>> temp : thread.hMap.entrySet())
			{
				System.out.println("The project");
				System.out.println(temp.getKey()+" Has the following employees");
				System.out.println("Employees..");
				for(Employee t : temp.getValue())
				{
					System.out.println(t);
				}
			}
			thread.notifyAll();
		};
	}
	
	
}
