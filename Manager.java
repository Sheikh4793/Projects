package model;
/*Write a model and manager class for Student.
1.Print out all Subject.
2. Print out all Student Names.
3. Top 5 Students
4. Passed Students
5. Failed Students
6. List out all subjects with highest mark.*/
import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Collections;
import java.util.HashMap;
public class Manager {
    ArrayList<Student> students=new ArrayList<>();
    HashSet<String> subjectSet=new HashSet<>();
    HashSet<String> nameSet=new HashSet<>();
    public void addStudent(Student student){
        students.add(student);
    }
    public void printAllSubjects(){
        for(Student s:students){
            subjectSet.add(s.getSubject());
        }
        System.out.println("subjects are");
        System.out.println(subjectSet);
    }
    public void printAllStudentNames(){
        for(Student s:students){
            nameSet.add(s.getStudentName());
        }
        System.out.println("All student names are:");
        System.out.println(nameSet);
    }
    PriorityQueue<Double> marks=new PriorityQueue<>(Collections.reverseOrder());
    public void topFive(){
        for(Student s:students){
            marks.add(s.getMark());
        }
        System.out.println("Top 5 students are:");
        System.out.println(marks);
    }
    public void passedStudents(){
        System.out.println("Total Mark:50,Pass Mark:20 ");
        System.out.println("Passed students are:");
        for(Student s:students){
            double mark=s.getMark();
            if(mark>=20){
                System.out.println(s);
            }
        }
    }
    public void failedStudents(){
        System.out.println("Total Mark:50,Pass Mark:20 ");
        System.out.println("failed students are:");
        for(Student s:students){
            double mark=s.getMark();
            if(mark<20){
                System.out.println(s);
            }
        }
        
    }
    HashMap<String,Double> subjectmarks=new HashMap<>();
    public void subjectHighestMark(){
        for(Student s:students){
            String subject=s.getSubject();
            Double mark=s.getMark();
            if(!subjectmarks.containsKey(subject)||mark>subjectmarks.get(subject)){
                subjectmarks.put(subject,mark);
            }
        }
        System.out.println("Highest subject marks:"+subjectmarks);
    }
    

    
}
