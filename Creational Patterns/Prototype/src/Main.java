public class Main {
    public static void main(String[] args) {

        Prototype doc1 = new Document("Thesis", "Cureency-parser");

        Prototype doc2 = doc1.getClone();

    }
}