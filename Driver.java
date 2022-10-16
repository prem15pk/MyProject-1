package Project1.copy;

import java.io.File;

public class Driver {
	 static final int input = 0;
		static String DIRECTORY;
		File foldername;
		private static Object file;
		
		public static void projectintro() {
			File file = new File("C:\\Users\\DELL\\Desktop\\ProjectDemo");
			if (!file.exists())
				file.mkdirs();
			System.out.println("Application Name     : " + "Lockers.in");
			System.out.println("Developer Details    : " + "Premkumar M");
			System.out.println("DIRECTORY             : " + file.getAbsolutePath());
			System.out.println("------------------------------------------------------------------");
			
		}
		
	
		public static void case1() {
			File file = new File("C:\\Users\\DELL\\Desktop\\ProjectDemo");
			System.out.println("List of Files in Directory :");
			File[] Listoffiles = file.listFiles();

			for (File s : Listoffiles)

				System.out.print("["+" "+s.getName()+"]");
			
		}
		

	public static void main(String[] args) {
		Driver Dr =new Driver();
		Driver.projectintro();
		
		MainMenu main = new MainMenu();
		main.showFirstMenu();

	}

}
