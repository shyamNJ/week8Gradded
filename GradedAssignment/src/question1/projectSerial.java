package question1;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class projectSerial {


	//ArrayList storing
	ArrayList<employeee> elist1 = new ArrayList<employeee>();
	ArrayList<employeee> elist2 = new ArrayList<employeee>();
	ArrayList<employeee> elist3 = new ArrayList<employeee>();
	
	//Map to store the Key  
	Map<project, ArrayList<employeee>> projectMap1 = new HashMap<project, ArrayList<employeee>>(); 
	
	//method 
	public void serializeProjectDetails(Map<project, ArrayList<employeee>> projectMap12) throws IOException
	{
		//TO create and open a file
		FileOutputStream fos = new FileOutputStream("File.txt");
		//Output Stream to serial the map Object
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(projectMap12);
		oos.flush();
		oos.close();
		System.out.println("Serialized map of project successfully..");
	}
	public static void main(String args[]) throws IOException
	{
		projectSerial projectSerializer = new projectSerial();
	
		project project1 = new project("P1","Music Synthesizer",23);
		project project2 = new project("P2","Vehicle Movement Tracker",13);
		project project3 = new project("P3","Liquid Viscosity Finder",15);
		
		employeee e1 = new employeee("E001","Harsha","9383993933","RTNagar",1000);
		employeee e2 = new employeee("E002","Harish","9354693933","Jayanagar",2000);
		employeee e3 = new employeee("E003","Meenal","9383976833","Malleswaram",1500);
		
		projectSerializer.elist1.add(e1);
		projectSerializer.elist1.add(e2);
		projectSerializer.elist1.add(e3);
		
		employeee e4 = new employeee("E004","Sundar","9334593933","Vijayanagar",3000);
		employeee e5 = new employeee("E005","Suman","9383678933","Indiranagar",2000);
		employeee e6 = new employeee("E006","Suma","9385493933","KRPuram",1750);
		
		projectSerializer.elist2.add(e4);
		projectSerializer.elist2.add(e5);
		projectSerializer.elist2.add(e6);
		employeee e7 = new employeee("E007","Chitra","9383978933","Koramangala",4000);
		employeee e8 = new employeee("E008","Suraj","9383992133","Malleswaram",3000);
		employeee e9 = new employeee("E009","Manu","9345193933","RTNagar",2000);
		
		projectSerializer.elist3.add(e7);
		projectSerializer.elist3.add(e8);
		projectSerializer.elist3.add(e9);
		
		projectSerializer.projectMap1.put(project1, projectSerializer.elist1);
		projectSerializer.projectMap1.put(project2, projectSerializer.elist2);
		projectSerializer.projectMap1.put(project3, projectSerializer.elist3);
		
		projectSerializer.serializeProjectDetails(projectSerializer.projectMap1);


	}
}
