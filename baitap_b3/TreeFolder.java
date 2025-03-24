package bt_java.baitap_b3;

public abstract class TreeFolder {
    protected String name;
    protected String creationDate;
    protected String parentPath;

    public TreeFolder(String name, String creationDate, String parentPath) {
        this.name = name;
        this.creationDate = creationDate;
        this.parentPath = parentPath;
    }

    public String getName() {
        return name;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public String getParentPath() {
        return parentPath;
    }

    public String getPath() {
        return parentPath + "/" + name;
    }

    public abstract String getStringTreeFolder(String indent);

}
