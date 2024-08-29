package service.menu;

import Bean.Config;
import Bean.Teacher;
import java.util.Scanner;
import service.menu.inter.MenuAddTeacherServiceInter;

public class MenuAddTeacherService implements MenuAddTeacherServiceInter {

    @Override
    public void process() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        String name = sc.nextLine();
        
        Scanner sc2 = new Scanner(System.in);
        System.out.println("enter username:");
        String surname = sc.nextLine();
        
        Teacher t = new Teacher();
        t.setName(name);
        t.setSurname(surname);
        
        //Config c = new Config(); Bunla eliye bilerdik, amma nese elemedik, ona gore SingleTondan istifade edek!*
        //Student[] students =  c.getStudents();
        Config.instance().appendTeacher(t); //set etdik!*
    }

}
