package service.menu;

import Bean.Config;
import Bean.Student;
import java.util.Scanner;
import service.menu.inter.MenuAddStudentServiceInter;

public class MenuAddStudentService implements MenuAddStudentServiceInter {

    @Override
    public void process() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name:");
        String name = sc.nextLine();
        
        Scanner sc2 = new Scanner(System.in);
        System.out.println("enter surname:");
        String surname = sc.nextLine();
        
        Student s = new Student();
        s.setName(name);
        s.setSurname(surname);
        
        //Config c = new Config(); Bunla eliye bilerdik, amma nese elemedik, ona gore SingleTondan istifade edek!*
        //Student[] students =  c.getStudents();
        Config.instance().appendStudent(s); //set etdik!*
        
        
    }

}
