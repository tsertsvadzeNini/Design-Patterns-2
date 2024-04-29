public class Pdf extends Document{
    @Override
    void writeText() {
        System.out.println("Write text in PDF format");
    }

    @Override
    void addImages() {
        System.out.println("Add images in PDF format");
    }

    @Override
    void addGraphs() {
        System.out.println("Add Graphs in PDF format");
    }
}
