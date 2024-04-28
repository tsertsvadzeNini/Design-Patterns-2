public class MediatorPatternDemo {

    public static void main(String args[])
    {

        Chat chat = new ChatRoom();

        User1 u1=new User1(chat);
        u1.setname("Nini ");
        u1.sendMsg("Hi Nini! how are you?");


        User2 u2=new User2(chat);
        u2.setname("Lasha");
        u2.sendMsg("I am Fine ! You tell?");
    }

}