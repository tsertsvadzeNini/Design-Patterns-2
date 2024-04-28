public class User2 extends Participant {

    private String name;
    private Chat chat;

    @Override
    public void sendMsg(String msg) {
        this.chat.showMsg(msg,this);

    }

    @Override
    public void setname(String name) {
        this.name=name;
    }

    @Override
    public String getName() {
        return name;
    }

    public User2(Chat chat){
        this.chat=chat;
    }



}