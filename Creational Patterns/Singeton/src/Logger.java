public class Logger {
    private static Logger logger;

    private Logger(){}

    // Double-checked locking to reduce the need for synchronization after the instance is created
    public static Logger getLogger() {
        if (logger == null) {  // First check (no locking)
            synchronized (Logger.class) {  // Lock
                if (logger == null) {  // Second check (with locking)
                    logger = new Logger();
                }
            }
        }
        return logger;
    }

    public void log(String message){
        System.out.println(message);
    }
}
