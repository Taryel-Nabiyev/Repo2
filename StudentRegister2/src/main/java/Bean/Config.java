package Bean;

import java.io.Serializable;

public class Config implements Serializable{
    private Student[] students = new Student[0];
    private Teacher[] teachers = new Teacher[0];
    private static Config config = null;

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }
    
    public void appendStudent(Student s){
        Student[] newStudent = new Student[students.length+1]; //yaradilmis bir arrayin olcusu artila bilmir, ona gore yenisini yaratdiq!*      
        
        for(int i=0;i<students.length;i++){
            newStudent[i] = students[i];
        }
        newStudent[newStudent.length-1] = s;
        students = newStudent;
    }
    
    public void appendTeacher(Teacher t){
        Teacher[] newTeacher = new Teacher[teachers.length+1]; //yaradilmis bir arrayin olcusu artila bilmir, ona gore yenisini yaratdiq!*      
        
        for(int i=0;i<teachers.length;i++){
            newTeacher[i] = teachers[i];
        }
        newTeacher[newTeacher.length-1] = t;
        teachers = newTeacher;
    }
    
    public static Config instance(){
        if(config==null){
            config = new Config();
        }
        return config; //SingleTon!*
    }
}
