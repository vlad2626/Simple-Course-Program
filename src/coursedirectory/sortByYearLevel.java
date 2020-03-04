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
public class sortByYearLevel implements Comparator <Course> {
    
    public int compare(Course courseA, Course courseB)
    {
       if(courseA.getYearLevel() > courseB.getYearLevel())
           return 1;
       else if (courseA.getYearLevel()< courseB.getYearLevel())
           return -1;
       else
           return 0;
    }
    
}
