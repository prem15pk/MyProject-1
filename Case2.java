package Project1.copy;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Case2 {
	String a;
	String b;
    String c;
    String d;
    
    MainMenu mm =new MainMenu();
    
    
    void Phase2() throws Exception {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the Digite : ");
		String sa = sc.next();
		
		if  (sa.equals("a")) {
			System.out.print("Enter the FileName to be Created : ");
			String newFile = sc.next();
			File file = new File("C:\\Users\\DELL\\Desktop\\ProjectDemo\\"+ newFile+".txt");
			 if(file.createNewFile()) {
				 System.out.println("File Created: "+ file.getName());
			 }
			 else {
				 System.out.println("File already exist ");
			 }
			 
			 //mm.showSecond();
			
			
		}
		
		else if(sa.equals("b")) {
			System.out.print("Searching To Deleted.....");
			String Deleted=sc.next();
			Path path =  Paths.get("C:\\Users\\DELL\\Desktop\\ProjectDemo\\"+ Deleted+".txt");
			try {
				boolean Sucess = Files.deleteIfExists(path);
				System.out.println("Delete status: " + Sucess);
			}
			catch(NoSuchFileException e) {
				System.out.println("No Such a file in Diractory ");
			}
			catch(DirectoryNotEmptyException e) {
				System.out.println("Directory is not Exist");
			}
			
			catch(IOException| SecurityException e){
				System.out.println(e);
				
			}
			mm.showSecond();
			Phase2();
			
			 
		}
		
		else if (sa.equals("c")) {
			System.out.print("Enter the path to folder to search for files: ");
			String str = sc.next();
			File file = new File("C:\\Users\\DELL\\Desktop\\ProjectDemo\\"+ str+".txt");
			if(file.exists()) {
				System.out.println("Available");
			}
			else {
				throw new Exception("no Un_Available");
			}
			mm.showSecond();
			Phase2();
			 
			
		}
		
		else if(sa.equals("d")) {
			// MainMenu m = new  MainMenu();
			mm.showFirstMenu();
			
		}
		else {
			System.out.println("Some Things Went wrong , please check the input.");
		}
		}
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

	
}
