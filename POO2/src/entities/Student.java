package entities;

public class Student {
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;
    public double finalGrade(){
        return grade1 + grade2 + grade3;
    }
    public double pointsMissing(){
        return 60 - finalGrade();
    }

    public boolean approved(){
        double minimumGrade = 60;
        double finalGrade = finalGrade();

        return finalGrade >= minimumGrade;
    }

}
