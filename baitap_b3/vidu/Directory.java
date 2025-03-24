package bt_java.baitap_b3.vidu;

import java.util.ArrayList;
import java.util.List;

//Giống lớp lá nhưng khác ở chỗ có thêm danh sách chứa có thể là component hoăc lá
public class Directory implements FileSystemNode {
    private String name;
    private List<FileSystemNode> children = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
        //this.children = children;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public long getSize() {
        long totalsize = 0;
        for(FileSystemNode node : children){
            totalsize += node.getSize();
        }
        return totalsize;
    }

    public void add(FileSystemNode node){
        children.add(node);
    }

    public void remove(FileSystemNode node){
        children.remove(node);
    }

    @Override
    public void printInfo(String indent) {
        System.out.println(indent + "+Directory: " + name + "( " + getSize() + "Bytes) ");
        for(FileSystemNode node: children){
            node.printInfo(indent + "  ");
        }
    }
}
