package com.Leetcode.ProgrammingSkills;

import java.util.Arrays;

public class AverageSalaryExcludingMinimumAndMaximumSalary {
    public static void main(String[] args) {
        int[] salary={4000,3000,1000,2000};
        System.out.println(average(salary));

    }
    public static double average(int[] salary) {
        Arrays.sort(salary);
        long sum=0;
        for (int i=0;i<salary.length;i++){
            sum+=salary[i];
        }
        sum-=salary[0]-salary[salary.length-1];
        return (double)(sum/ salary.length-2);
    }
}
