package lockedMe;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Scanner;

public class LockedMe {

	public static void main(String[] args) {
		
	     
        while(true) {
        System.out.println("Enter 1 to  Welcome Page \n2 to Add File .\n3 to Delete File");
        System.out.println("4 to Search File .\n5 Return to Welcome \n6 close application");
        System.out.println("enter your choice");
        Scanner scan=new Scanner(System.in);
	     
        int choice=scan.nextInt();
        scan.close();
        switch(choice)
        {
        case 1:
       	 LockedMe.welcomeScreen();
       	 break;
           case 2:
               try {
				addFile();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
               break;
           case 3:
               deleteFile();
               break;
           case 4:
               searchFile();
               break;
           case 5:
               break;
           case 6:
               closeApp();
               break;
           
           default:
               System.out.println("Invalid input");
               break;
       }
    
        }

}
public static void welcomeScreen() {
	
	System.out.println("-------LockedMe.com----------");
	System.out.println("Hello User! ,Welcome to the LockedMe.com Application");
	
}

public static void closeApp() {
	System.out.println("exit..."); 
	 System.exit(0); 
	 File file = new File("E:\\dxc-data\\test.txt");
		if (file.exists())
			System.out.println("File exists");
		else
			System.out.println("Filt doesn't exists.");

}

public static void searchFile() {
	 File dir = new File("C:");
     FilenameFilter filter = new FilenameFilter() {
        public boolean accept (File dir, String name) { 
           return name.startsWith("b");
        } 
     }; 
     String[] children = dir.list(filter);
     if (children == null) {
        System.out.println("Either dir does not exist or is not a directory"); 
     } else { 
        for (int i = 0; i< children.length; i++) {
           String filename = children[i];
           System.out.println(filename);
        } 
     } 
}

private static void deleteFile() {
	
	try  
	{         
	File f= new File(" C:\\files\first.txt");          
	if(f.delete())                       
	{  
	System.out.println(f.getName() + " deleted"); 
	}  
	else  
	{  
	System.out.println("failed");  
	}  
	}  
	catch(Exception e)  
	{  
	e.printStackTrace();  
	}  
}

public  static void addFile() throws IOException {
	File file = new File("E:\\dxc-data\\test.txt");
	boolean status;
	if (file.exists())
		System.out.println("File exists");
	else {
		status = file.createNewFile();
		System.out.println((status == true) ? "File Created.." : "File Not Created..");
	}

}
}

