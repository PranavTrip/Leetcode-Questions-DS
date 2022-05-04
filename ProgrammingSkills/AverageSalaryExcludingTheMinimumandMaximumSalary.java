package com.Leetcode.ProgrammingSkills;

import java.util.Arrays;

public class AverageSalaryExcludingTheMinimumandMaximumSalary {
    public static void main(String[] args) {
        int[] salary={48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000};
        System.out.println(average(salary));
    }
    public static double average(int[] salary) {
        double minSalary=salary[0];
        double maxSalary=salary[0];
        int count=salary.length;
        double sumSalary=0;

        for(int i=0;i<count ;i++){
            if(minSalary>salary[i]){
                minSalary=salary[i];
            }
            if(maxSalary<salary[i]){
                maxSalary=salary[i];
            }
            sumSalary+=salary[i];
        }

        return (sumSalary-minSalary-maxSalary)/(count-2);
    }
}
