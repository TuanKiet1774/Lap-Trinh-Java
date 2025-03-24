package bt_java.baitap_b3;

public class File extends TreeFolder{
    public File(String name, String creationDate, String parentPath) {
        super(name, creationDate, parentPath);
    }

    @Override
    public String getStringTreeFolder(String indent) {

        return indent + "- File: " + name + " |Path: " + getPath() + " |Date: " + getCreationDate();
    }
}
