public class Main {
    public static void main(String[] args) {

        MenuBuilder MenuBuilder = new MenuBuilder();

        Menu menu1 = MenuBuilder.createMenu1();
        System.out.println("Menu1:");
        System.out.println("-----------------------");
        menu1.getMenu();
        System.out.println("This meal costs: " + menu1.getCost());

        Menu menu2 = MenuBuilder.createMenu2();
        System.out.println("");
        System.out.println("Menu2:");
        System.out.println("-----------------------");
        menu2.getMenu();
        System.out.println("This meal costs: " + menu2.getCost());

        Menu menu3 = MenuBuilder.createMenu3();
        System.out.println("");
        System.out.println("Menu3:");
        System.out.println("-----------------------");
        menu3.getMenu();
        System.out.println("This meal costs: " + menu3.getCost());

    }
}