package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioStudent {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Name: ");
        student.name = sc.nextLine();

        System.out.println("Grade 1: ");
        student.grade1 = sc.nextDouble();

        if (student.grade1 <= 30 && student.grade1 >= 0){
            System.out.println("Grade 2: ");
            student.grade2 = sc.nextDouble();

            System.out.println("Grade 3: ");
            student.grade3 = sc.nextDouble();

            if (student.grade2 <= 35 && student.grade2 >= 0 && student.grade3 <= 35
                    && student.grade3 >= 0 ){
                System.out.println("FINAL GRADE = " + student.finalGrade());
                if (student.approved()){
                    System.out.println("PASS");
                } else {
                    System.out.println("FAILED");
                    System.out.println("MISSING " + String.format("%.2f",student.pointsMissing())  + " POINTS");
                }
            } else {
                System.out.println("The grade cannot be lower than 0 or higher than 35");
            }
        } else {
            System.out.println("The grade cannot be lower than 0 or higher than 30");
        }


        sc.close();
    }
}
