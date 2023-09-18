package application;

import entities.EmployeeLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioEmployeeLists {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<EmployeeLists> list = new ArrayList<>();

        System.out.println("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Employee #" + (i+1) + ": ");
            System.out.println("Id: ");
            Integer id = sc.nextInt();
            while (hasId(list, id)){
                System.out.println("Id already taken! Try again: ");
                id = sc.nextInt();
            }

            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Salary: ");
            Double salary = sc.nextDouble();

            EmployeeLists employee = new EmployeeLists(id, name, salary);
            list.add(employee);

        }

        System.out.println();
        System.out.println("Enter the employee id that will have salary increase: ");
        int idSalary = sc.nextInt();

        EmployeeLists emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);

        if (emp == null){
            System.out.println("This salary does not exist!");
        } else {
            System.out.println("Enter the percentage: ");
            double percent = sc.nextDouble();
            emp.increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for (EmployeeLists e : list) {
            System.out.println(e);
        }


        sc.close();
    }

    public static boolean hasId(List<EmployeeLists> list, int id){
        EmployeeLists emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }


}
