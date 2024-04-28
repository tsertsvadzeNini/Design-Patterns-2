import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ChatRoom implements Chat{
    DateFormat dateFormat = new SimpleDateFormat("E dd-MM-yyyy hh:mm a");
    Date date = new Date();
    @Override
    public void showMsg(String msg, Participant p) {

        System.out.println(p.getName()+"'gets message: "+msg);
        System.out.println("\t\t\t\t"+"["+dateFormat.format(date).toString()+"]");
    }
}