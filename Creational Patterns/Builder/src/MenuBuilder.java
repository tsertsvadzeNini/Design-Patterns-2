public class MenuBuilder {
    public Menu createMenu1(){
        Menu menu = new Menu();
        menu.addItem(new McChicken());
        menu.addItem(new Free());

        return menu;
    }

    public Menu createMenu2(){
        Menu menu = new Menu();
        menu.addItem(new BigMac());
        menu.addItem(new Free());

        return menu;
    }

    public Menu createMenu3(){
        Menu menu = new Menu();
        menu.addItem(new Hamburger());
        menu.addItem(new Free());

        return menu;
    }
}
