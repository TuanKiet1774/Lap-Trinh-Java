package bt_java.baitap_b3;

public class MainB3 {
    public static void main(String[] args) {
        Folder ds = new Folder("Design Pattern","20/3/2025","");
        File f1 = new File("CreationalPattern.pptx","21/3/2025",ds.getPath());
        //File f2 = new File("StructuralPattern.pptx","21/3/2025",ds.getPath());
        ds.addItem(f1);

        System.out.println(ds.getStringTreeFolder(" "));
    }
}
