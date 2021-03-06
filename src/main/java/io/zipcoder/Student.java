package io.zipcoder;

import io.zipcoder.interfaces.Learner;

public class Student extends Person implements Learner{

    protected double totalStudyTime = 0;

    public Student(String name, long id){
        super(name, id);
    }

    @Override
    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }

}
