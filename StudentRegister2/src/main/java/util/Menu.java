package util;

import static java.awt.SystemColor.menu;
import service.menu.MenuAddStudentService;
import service.menu.MenuAddTeacherService;
import service.menu.MenuLoginService;
import service.menu.MenuRegisterService;
import service.menu.MenuShowStudentService;
import service.menu.MenuShowTeacherService;
import service.menu.inter.MenuService;

public enum Menu {
    Login(1, "Login.", new MenuLoginService()),
    Register(2, "Register.", new MenuRegisterService()),
    Add_Teacher(3, "Add Teacher.", new MenuAddTeacherService()),
    Add_Student(4, "Add Student.", new MenuAddStudentService()),
    Show_All_Teacher(5, "Show Teachers.", new MenuShowTeacherService()),
    Show_All_Student(6, "Show Students.", new MenuShowStudentService()),
    Unknown;

    private int number;
    private String label;
    private MenuService service;

    Menu() {

    }

    Menu(int number, String label, MenuService service) {
        this.number = number;
        this.label = label;
        this.service = service;
    }

    public String getLabel() {
        return this.label;
    }

    @Override
    public String toString() {
        return number + "." + label;
    }

    public void process() {
        service.process();
        MenuUtil.showMenu();
    }

    public int getNumber() {
        return this.number;
    }

    public static Menu find(int number) {
        Menu[] m = Menu.values();
        for (int i = 0; i < m.length; i++) {
            if (m[i].getNumber() == number) {
                return m[i];
            }
        }
        return Menu.Unknown;
    }

    public static void showAllMenu() {
        Menu[] m = Menu.values();
        for (int i = 0; i < m.length; i++) {
            if (m[i] != Menu.Unknown) {
                System.out.println(m[i]);
            }
        }
    }

}
