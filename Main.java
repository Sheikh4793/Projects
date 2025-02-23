package model;
/*Write a model and manager class for Student.
1.Print out all Subject.
2. Print out all Student Names.
3. Top 5 Students
4. Passed Students
5. Failed Students
6. List out all subjects with highest mark.*/
public class Main {
    public static void main(String []args){
        Manager manager=new Manager();
        manager.addStudent(new Student(1,"Ramesh","Maths",25));
        manager.addStudent(new Student(2,"Ram","Maths",10));
        manager.addStudent(new Student(3,"Sumesh","Science",49));
        manager.addStudent(new Student(4,"Rajesh","Physics",18));
        manager.addStudent(new Student(5,"Rakesh","Science",22.5));
        manager.addStudent(new Student(6,"Ravi","Physics",5));
        manager.printAllSubjects();
        manager.printAllStudentNames();
        manager.topFive();
        manager.passedStudents();
        manager.failedStudents();
        manager.subjectHighestMark();
    }

    
}
