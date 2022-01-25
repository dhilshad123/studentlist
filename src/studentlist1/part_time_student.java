/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentlist1;

/**
 *
 * @author dhils
 */
public class part_time_student extends Student {
    private int numCourse;
    public part_time_student(String name,String studId int numCourse){
        super(name,studId);
        this.numCourse = numCourse;
    }

    public int getNumCourse() {
        return numCourse;
    }

    public void setNumCourse(int numCourse) {
        this.numCourse = numCourse;
    }
    
    
    
    
}
