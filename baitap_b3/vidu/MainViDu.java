package bt_java.baitap_b3.vidu;

public class MainViDu {
    public static void main(String[] args) {
        File f1 = new File("hello.txt", 1024);
        File f2 = new File("bye.txt", 1024);
        Directory folder = new Directory("Folder");
        folder.add((new File("sub file",1024)));
        Directory root = new Directory("Root");

        root.add(f1);
        root.add(folder);
        root.add(f2);
        root.add(f2);

        System.out.println("Tổng kích thước của Root: " + root.getSize());
        System.out.println("Danh sách thu mục");
        root.printInfo(" ");
    }
}
