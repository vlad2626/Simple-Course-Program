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
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author valmi
 */
public class sortByFLACourseNameTest {
    
    public sortByFLACourseNameTest() {
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
     * Test of compare method, of class sortByFLACourseName.
     */
    @Test
    public void testCompare() {
        System.out.println("compare");
        Course courseA = null;
        Course courseB = null;
        sortByFLACourseName instance = new sortByFLACourseName();
        int expResult = 0;
        int result = instance.compare(courseA, courseB);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
