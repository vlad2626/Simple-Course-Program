/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursedirectory;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import java.util.ArrayList;
import static org.junit.Assert.*;
import java.util.Collections;

/**
 *
 * @author valmi
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({coursedirectory.sortByFIUCourseNameTest.class, coursedirectory.sortByFLACourseNameTest.class, coursedirectory.CourseTest.class, coursedirectory.sortByYearLevelTest.class, coursedirectory.CourseDirectoryTest.class})
public class CoursedirectorySuite {

ArrayList<Course> ray;
ArrayList<String> preReq;
    @BeforeClass
    public static void setUpClass() throws Exception 
    {
        
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
      preReq.add("math");
      preReq.add("Science");
        Course classes = new Course("test ", "tes1" , 1, 3 ,preReq); 
        Course classe1 = new Course("cop1 ", "ally" , 1, 3 ,preReq); 
        Course classe2 = new Course("Cop2 ", "pppow" , 1, 3 ,preReq); 
        ray.add(classes);
        ray.add(classe1);
        ray.add(classe2);
    }

    @After
    public void tearDown() throws Exception {
    }
    
    public void testFiu()
    {
        Collections.sort(ray, new sortByFIUCourseName());
        String result = ray.get(0).getFIUCourseName();
        String expResult = "cop1";
        assertEquals(expResult, result);
       
        
    }
    
}
