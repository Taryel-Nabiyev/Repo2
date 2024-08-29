package service.menu;

import java.util.Scanner;
import service.menu.inter.MenuLoginServiceInter;

public class MenuLoginService implements MenuLoginServiceInter {

    @Override
    public void process() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter username:");
        String s = sc.nextLine();
        System.out.println("enter password:");
        String s2 = sc.nextLine();
        if(!(s.equals("user") && s2.equals("11111"))){
            throw new IllegalArgumentException("username or password is invalid!");
        }
    }

    @Override
    public void foo2() {
        
    }

}
