package util;

import java.io.*;
import java.util.*;
import edu.staff.*;

public class FileUtil {	
	
	
	public static void writeFile(ArrayList<Lecturer> myLecturer , String file) {		
		try {
            FileOutputStream f = new FileOutputStream(file);
            ObjectOutputStream oStream  = new ObjectOutputStream(f);
            oStream .writeObject(myLecturer);
            oStream.close();
            f.close();
        } 
	 	catch (FileNotFoundException fne) {
        	System.out.println("File not found");
        }
		catch (IOException ie) {
	        System.out.println("Error Write file");
	    }
		catch (Exception e) {
	        System.out.println("Error Write file");
	    }
	}
	
	@SuppressWarnings("unchecked")	
	public static ArrayList<Lecturer> readFile(ArrayList<Lecturer> myLecturer, String file) {
		// TODO Auto-generated method stub
		myLecturer = null;
		try {
			FileInputStream f = new FileInputStream(file); 																	
			ObjectInputStream inStream = new ObjectInputStream(f);
			myLecturer = (ArrayList<Lecturer>) inStream.readObject();			
			inStream.close();
			f.close();			
		} 
		catch (ClassNotFoundException cne) {
			System.out.println("Class not found");
		} 
		catch (IOException ie) {
			System.out.println("Error Read file");
		}
		catch (Exception e) {
			System.out.println("Error Read file");
		}
		return myLecturer;
		
	}

}
