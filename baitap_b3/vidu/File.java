package bt_java.baitap_b3.vidu;

//lớp lá
public class File implements FileSystemNode {
    private String name;
    private long size;

    public File(String name, long size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public long getSize() {
        return size;
    }

    @Override
    public void printInfo(String indent) {
        System.out.println(indent + "- File: " + name + "(" + size +" bytes)");
    }
}
