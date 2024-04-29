public abstract class Document {
    abstract void writeText();
    abstract void addImages();
    abstract void addGraphs();

    //Template Method

    public final void createDocumnet(){
        writeText();
        addImages();
        addGraphs();
    }
}
