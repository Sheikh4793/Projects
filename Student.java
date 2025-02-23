package model;
/*Write a model and manager class for Student.
1.Print out all Subject.
2. Print out all Student Names.
3. Top 5 Students
4. Passed Students
5. Failed Students
6. List out all subjects with highest mark.*/
public class Student{
        private int id;
        private String studentName;
        private String subject;
        private double mark;
        public Student(int id,String studentName,String subject,double mark){
            this.id=id;
            this.studentName=studentName;
            this.subject=subject;
            this.mark=mark;
        }
        public void setId(int id){
            this.id=id;
        }
        public int getId(){
            return id;
        }
        public void setStudentName(String studentName){
            this.studentName=studentName;
        }
        public String getStudentName(){
            return studentName;
        }
        public void setSubject(String subject){
            this.subject=subject;
        }
        public String getSubject(){
            return subject;
        }
        public void setMark(double mark){
            this.mark=mark;
        }
        public double getMark(){
            return mark;
        }
        public String toString(){
            return "id:"+id+",studentName:"+studentName+",subjects"+subject+",mark"+mark;
        }
        
    }
    
