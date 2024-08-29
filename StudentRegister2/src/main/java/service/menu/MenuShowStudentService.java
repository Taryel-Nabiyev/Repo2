package service.menu;

import Bean.Config;
import Bean.Student;
import service.menu.inter.MenuShowStudentServiceInter;

public class MenuShowStudentService implements MenuShowStudentServiceInter {

    @Override
    public void process() {
        Student[] showStudents = Config.instance().getStudents();
        for(int i=0;i<showStudents.length;i++){
            System.out.println(showStudents[i]);
        }
    }
}
