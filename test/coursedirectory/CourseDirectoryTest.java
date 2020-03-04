/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursedirectory;

import java.util.ArrayList;
import java.util.Collections;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Scanner;

/**
 *
 * @author valmi
 */
public class CourseDirectoryTest {
    ArrayList<Course> ray;
ArrayList<String> preReq ;
    public CourseDirectoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
      
        preReq= new ArrayList<String>();
        ray= new ArrayList<Course>();
        preReq.add("math"+"programing");
        preReq.add("Science");
        Course classes = new Course("Math", "Algebra" , 1, 3 ,preReq); 
        Course classe1 = new Course("Science", "Biology" , 4, 3 ,preReq); 
        Course classe2 = new Course("Physics ", "Velocity" , 5, 3 ,preReq); 
        ray.add(classes);
        ray.add(classe1);
        ray.add(classe2);
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class CourseDirectory.
     */
    @Test
    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        CourseDirectory.main(args);
//        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of createFIUCourses method, of class CourseDirectory.
     */
//    @Test
//    public void testCreateFIUCourses() {
//        System.out.println("createFIUCourses");
//        CourseDirectory instance = new CourseDirectory();
//        instance.createFIUCourses();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of displayMenu method, of class CourseDirectory.
     */
//    @Test
//    public void testDisplayMenu() {
////        System.out.println("displayMenu");
////        CourseDirectory instance = new CourseDirectory();
////        //instance.displayMenu();
////        System.out.println("THis is working");
////        
//       testSortFIUName();
//       testSortFla();
//       testSortYLevel();
//        System.out.println("awfwo");
//        // TODO review the generated test code and remove the default call to fail.
//        
//    }
//
////    /**
//     * Test of sortCName method, of class CourseDirectory.
//     */
//    @Test
//    public void testSortCName() {
//        System.out.println("sortCName");
//        CourseDirectory.sortCName();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of sortFla method, of class CourseDirectory.
     */
    @Test
    public void testSortFIUName()
    {
        System.out.println("Sort FIU Course Name");
        Collections.sort(ray , new sortByFIUCourseName());
        String result= ray.get(0).getFIUCourseName();
        String expResult = "Math";
        assertEquals(expResult , result);
    }
    @Test
    public void testSortFla() {
        System.out.println("sort Fla course name");
        Collections.sort(ray, new sortByFLACourseName());
        String expResult = "Algebra";
        String result = ray.get(0).getFLACourseName();
        assertEquals(expResult , result);
        
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of sortYLevel method, of class CourseDirectory.
     */
    @Test
    public void testSortYLevel() {
        System.out.println("sort Year Level");
        Collections.sort(ray , new sortByYearLevel());
        int expResult = 1;
        int result = ray.get(0).getYearLevel();
        assertEquals(expResult , result);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
}
