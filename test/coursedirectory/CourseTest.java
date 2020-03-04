/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursedirectory;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author valmi
 */
public class CourseTest {
    
    public CourseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getFIUCourseName method, of class Course.
     */
    @Test
    public void testGetFIUCourseName() {
        System.out.println("getFIUCourseName");
        Course instance = null;
        String expResult = "";
        String result = instance.getFIUCourseName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFIUCourseName method, of class Course.
     */
    @Test
    public void testSetFIUCourseName() {
        System.out.println("setFIUCourseName");
        String FIUCourseName = "";
        Course instance = null;
        instance.setFIUCourseName(FIUCourseName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFLACourseName method, of class Course.
     */
    @Test
    public void testGetFLACourseName() {
        System.out.println("getFLACourseName");
        Course instance = null;
        String expResult = "";
        String result = instance.getFLACourseName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFLACourseName method, of class Course.
     */
    @Test
    public void testSetFLACourseName() {
        System.out.println("setFLACourseName");
        String FLACourseName = "";
        Course instance = null;
        instance.setFLACourseName(FLACourseName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getYearLevel method, of class Course.
     */
    @Test
    public void testGetYearLevel() {
        System.out.println("getYearLevel");
        Course instance = null;
        int expResult = 0;
        int result = instance.getYearLevel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setYearLevel method, of class Course.
     */
    @Test
    public void testSetYearLevel() {
        System.out.println("setYearLevel");
        int yearLevel = 0;
        Course instance = null;
        instance.setYearLevel(yearLevel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumCredits method, of class Course.
     */
    @Test
    public void testGetNumCredits() {
        System.out.println("getNumCredits");
        Course instance = null;
        int expResult = 0;
        int result = instance.getNumCredits();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumCredits method, of class Course.
     */
    @Test
    public void testSetNumCredits() {
        System.out.println("setNumCredits");
        int numCredits = 0;
        Course instance = null;
        instance.setNumCredits(numCredits);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrerequisites method, of class Course.
     */
    @Test
    public void testGetPrerequisites() {
        System.out.println("getPrerequisites");
        Course instance = null;
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getPrerequisites();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrerequisites method, of class Course.
     */
    @Test
    public void testSetPrerequisites() {
        System.out.println("setPrerequisites");
        ArrayList<String> prerequisites = null;
        Course instance = null;
        instance.setPrerequisites(prerequisites);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Course.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Course instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class Course.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Object other = null;
        Course instance = null;
        int expResult = 0;
        int result = instance.compareTo(other);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
