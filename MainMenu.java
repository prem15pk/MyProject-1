package Project1.copy;

import java.util.Scanner;




public class MainMenu {
	
	 static String Second_Pashe = 
	    		"\nSlect Any Of Following:\n"+
	    		"       a -> Add a File\n"+
	    	    "       b -> Delete a file\n" + 
	    		"       c -> Search a file\n" +
	    		"       d -> GoBack\n";
	    
	    static void showSecond() {
	   	 System.out.println(Second_Pashe);
	    }
	
	public static  String Main_Menu =
			
				"\nMAIN_MENU - Slect Any Of Following:\n"+
				 "\nPRESS- 1 -> List files in directory\n" +
				  "\nPRESS- 2 -> Add, Delete or Search\n"+
				  "\nPRESS- 3 -> Exit Program\n";
	 static void showFirstMenu() {
	    	
    	 try {
    		 System.out.println("------------------------------------------------------------------");
			System.out.println(Main_Menu);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	 
    	/*---------------------------------------------------------------------------------*/ 
     
			try {
				
				Scanner sc = new Scanner(System.in);
				int input = sc.nextInt();

				switch (input) {
				
				
/* CASE 1 ->*/		 case 1: {
	                     //showFirstMenu();
	                     Driver Dr =new Driver();
	                     Dr.case1();
	                     
	                     showFirstMenu();
					}
					
					break;
				        
				

/* CASE 2 ->*/		case 2:{
	                 showSecond();
	                 Case2 cas= new Case2();
	                 cas.Phase2();
					
					showSecond();
					cas.Phase2();
					
					
				}
                 break;
                
/* CASE 3 ->*/		case 3: {
				System.out.println("Thank You ");
					
                }

				
				}
				
			}

			catch (Exception e) {
				System.out.println("Some Things Went Wrong ");

			}

		}
	


	


	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		MainMenu main = new MainMenu();
		main.Main_Menu();

	}

	private void Main_Menu() {
		// TODO Auto-generated method stub
		
	}

	
	

}
