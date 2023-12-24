package question1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

public class projectDeserial {


	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// to get the object returned from the file
		Map<project, ArrayList<employeee>> obj = null; 
		
		FileInputStream fis = new FileInputStream("File.txt");

		ObjectInputStream ois = new ObjectInputStream(fis);
		obj=(Map<project, ArrayList<employeee>>) ois.readObject();
		ois.close();
		
		for(Entry<project, ArrayList<employeee>> temp : obj.entrySet())
		{
			System.out.println("The project");
			System.out.println(temp.getKey()+" Has the following employees");
			System.out.println("Employees..");
			for(employeee t : temp.getValue())
			{
				System.out.println(t);
			}
		}
	}
}
