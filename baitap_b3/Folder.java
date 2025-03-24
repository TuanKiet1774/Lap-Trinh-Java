package bt_java.baitap_b3;

import java.util.ArrayList;
import java.util.List;

public class Folder extends TreeFolder {
    private List<TreeFolder> items = new ArrayList<>();

    public Folder(String name, String creationDate, String parentPath) {
        super(name, creationDate, parentPath);
    }

    @Override
    public String getStringTreeFolder(String indent) {
        StringBuilder kq = new StringBuilder();
        kq.append(indent).append("+ Folder: ").append(name).append("\n");
        String childIndent = indent + "..";
        for(TreeFolder i: items){
            kq.append(i.getStringTreeFolder(childIndent)).append("\n");
        }
        return kq.toString();
    }

    public void addItem(TreeFolder item){
        items.add(item);
    }

    public void removeItem(TreeFolder item){
        items.remove(item);
    }


}
