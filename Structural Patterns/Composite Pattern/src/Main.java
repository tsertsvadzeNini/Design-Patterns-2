public class Main {
    public static void main(String[] args) {
        // Create files
        Component file1 = new Leaf("file1.txt", 100);
        Component file2 = new Leaf("file2.txt", 200);
        Component file3 = new Leaf("file3.txt", 300);

        // Create directories
        Directory dir1 = new Directory("dir1");
        Directory dir2 = new Directory("dir2");

        // Add files to directories
        dir1.add(file1);
        dir1.add(file2);
        dir2.add(file3);

        // Add directory to another directory (creating a tree structure)
        dir1.add(dir2);

        // Perform operation on the composite structure
        dir1.operation();
    }
}