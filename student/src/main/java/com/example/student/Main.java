package com.example.student;

import java.util.*;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();
        int choice;

        do 
        {
            System.out.println("\n--- Student Management ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) 
            {
                case 1:
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Grade: ");
                    String grade = sc.nextLine();
                    dao.addStudents(new Students(0, name, age, grade));
                    break;
                case 2:
                    List<Students> students = dao.getAllStudents();
                    for (Students s : students)
                        System.out.println(s.getId() + ": " + s.getName() + " (" + s.getAge() + ", " + s.getGrade() + ")");
                    break;
                case 3:
                    System.out.print("Enter ID to update: ");
                    int idToUpdate = sc.nextInt();
                    sc.nextLine();
                    System.out.print("New Name: ");
                    String newName = sc.nextLine();
                    System.out.print("New Age: ");
                    int newAge = sc.nextInt();
                    sc.nextLine();
                    System.out.print("New Grade: ");
                    String newGrade = sc.nextLine();
                    dao.updateStudents(new Students(idToUpdate, newName, newAge, newGrade));
                    break;
                case 4:
                    System.out.print("Enter ID to delete: ");
                    int idToDelete = sc.nextInt();
                    dao.deleteStudents(idToDelete);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } 
        while (choice != 5);

        sc.close();
    }
}
