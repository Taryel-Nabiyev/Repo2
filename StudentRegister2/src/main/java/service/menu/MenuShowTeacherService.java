package service.menu;

import Bean.Config;
import Bean.Teacher;
import service.menu.inter.MenuShowTeacherServiceInter;

public class MenuShowTeacherService implements MenuShowTeacherServiceInter {

    @Override
    public void process() {
        Teacher[] showTeachers = Config.instance().getTeachers();
        for(int i=0;i<showTeachers.length;i++){
            System.out.println(showTeachers[i]);
        }
    }

}
