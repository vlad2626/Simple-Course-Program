/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursedirectory;

import java.util.Comparator;

/**
 *
 * @author valmi
 */
public class sortByFIUCourseName implements Comparator <Course> {
    
    public int compare(Course courseA, Course CourseB)
    {
        return courseA.getFIUCourseName().compareToIgnoreCase(CourseB.getFIUCourseName());
    }
    
}
