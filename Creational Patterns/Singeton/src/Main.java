public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getLogger();
        logger1.log("hi from logger1");

        Logger logger2 = Logger.getLogger();
        logger2.log("hi from logger2");

        if(logger1 == logger2){
            System.out.println("they are same instance");
        }
    }
}