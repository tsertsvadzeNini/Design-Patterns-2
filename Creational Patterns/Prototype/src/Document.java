public class Document implements Prototype{
    private String title;
    private String content;

    public Document(String title, String content){
        this.title = title;
        this.content = content;
    }

    public String getTitle(){
        return this.title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public Prototype getClone() {
        return new Document(title, content) {
        };
    }
}
