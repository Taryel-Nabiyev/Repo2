package service.menu;

import service.menu.inter.MenuRegisterServiceInter;

public class MenuRegisterService implements MenuRegisterServiceInter {

    @Override
    public void process() {
        System.out.println("Register is processing");
    }

    @Override
    public void foo() {

    }

}
