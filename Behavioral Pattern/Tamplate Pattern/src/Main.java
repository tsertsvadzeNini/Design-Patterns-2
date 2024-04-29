public class Main {
    public static void main(String[] args) {
        Document csv = new CSV();
        Document pdf = new Pdf();

        csv.createDocumnet();
        pdf.createDocumnet();
    }
}