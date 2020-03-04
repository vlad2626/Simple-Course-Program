/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursedirectory;

/**
 *
 * @author mtsguest
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class CourseDirectory {

    /**
     * @param args the command line arguments
     */
    Scanner sc= new Scanner (System.in);
    static ArrayList<Course> classes = new ArrayList<Course>();
    public static void main(String[] args) {
        CourseDirectory myDirectory = new CourseDirectory();
        myDirectory.createFIUCourses();
        myDirectory.displayMenu();
        
    }
    
    public void createFIUCourses()
    {
        //Create a loop that will ask user if he/she wants to create another course - do while
        //Inside loop, ask for all the information for a course 
        //Create another loop inside the outer loop (nested loop) for prerequisites (while)
        //After the nested loop, create a Course object
        //Add Course object to arrayList of courses
       Course c;
        int userAnswer=0;
        String FIUcName, FLAcName;
        int yLevel,nCredit;
        int p;
        String pre;
        ArrayList<String> preReq;
       
        do{
           System.out.println("FIU course name");
           FIUcName = sc.nextLine();
           System.out.println("FLA course Name");
           FLAcName = sc.nextLine();
            System.out.println("Year Level:");
            yLevel = sc.nextInt();
            System.out.println("Number of credits");
            nCredit = sc.nextInt();
            System.out.println("How many preRequisites for this class ?");
            p= sc.nextInt();
            sc.nextLine();
           
            preReq = new ArrayList<String>();
            //loop to populate the arrayList
            for(int i=0; i<p; i++)
            {
                System.out.println("Enter the name of the preReq " + (i+1));
                pre = sc.nextLine();
                preReq.add(pre);
            }
            c= new Course(FIUcName, FLAcName,yLevel,nCredit, preReq);
            classes.add(c);
            
            System.out.println("Do you want to add another course ? (1= yes/ 2=no)");
            userAnswer= sc.nextInt();
            sc.nextLine();
        }while(userAnswer != 2);
    }
    
    public void displayMenu()
    {
        //Create a loop that displays the menu of options:
        //1. Sort courses by FIU course name
        //2. Sort courses by FLA course name
        //3. Sort courses by year level
        //4.  Exit
        //Keep looping until the user enters option 4
        //For each of the options 1- 3, call a specific method
       int userAnswer=0;
       
       do
       { 
       System.out.println("Sorting Menu");
        System.out.println("1. Sort Course by FIU course Name");
        System.out.println("2. Sort Course by FLA course Name");
        System.out.println("3. Sort Course by year level");
        System.out.println("4. exit");
        userAnswer = sc.nextInt();
        
       }while (userAnswer<0 || userAnswer> 4);
       
       if (userAnswer ==1)
       {
           sortCName();
           displayMenu();
       }
       else if (userAnswer == 2)
       {
           sortFla();
           displayMenu();
       }
       else if (userAnswer == 3)
       {
          sortYLevel();
          displayMenu();
       }
       else if(userAnswer== 4)
       {
           System.out.println("Thank you, Exiting");
       }
        
    }
    
    
    public static void sortCName()
    {
        Collections.sort(classes , new sortByFIUCourseName());
        for( Course val: classes)
        {
            System.out.println(val);
        }
    }
    
    public static void sortFla()
    {
        Collections.sort(classes, new sortByFLACourseName());
        
        for( Course val : classes)
        {
            System.out.println(val);
        }
        
    }
    
    public static void sortYLevel()
    {
        Collections.sort(classes , new sortByYearLevel());
        
        for(Course val : classes)
        {
            System.out.println(val);
        }
    }       
            
    
    
    
 
    
    
    
    
}
