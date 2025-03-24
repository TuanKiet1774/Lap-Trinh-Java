package bt_java.baitap_b3;

public class MainB3 {
    public static void main(String[] args) {
        Folder ds = new Folder("Design Pattern","20/3/2025","");
        File f1 = new File("CreationalPattern.pptx","21/3/2025",ds.getPath());
        File f2 = new File("StructuralPattern.pptx","21/3/2025",ds.getPath());
        ds.addItem(f1);
        ds.addItem(f2);
        Folder ltj = new Folder("Lập Trình Java","20/3/2025","");
        File f3 = new File("LapTrinhJavaCoBan.docx","21/3/2025",ltj.getPath());
        File f4 = new File("LapTrinhJavaNangCao.pdf","21/3/2025",ltj.getPath());
        ltj.addItem(f3);
        ltj.addItem(f4);
        Folder nnlt = new Folder("Ngôn ngữ lập trình C","20/3/2025","");
        Folder lttbdd = new Folder("Lập trình thiết bị di dộng","20/3/2025","");
        File f5 = new File("NangCao.pdf","21/3/2025",lttbdd.getPath());
        File f6 = new File("CoBan.pdf","21/3/2025",lttbdd.getPath());
        lttbdd.addItem(f5);
        lttbdd.addItem(f6);


        System.out.println(ds.getStringTreeFolder(" "));
        System.out.println(ltj.getStringTreeFolder(" "));
        System.out.println(nnlt.getStringTreeFolder(" "));
        System.out.println(lttbdd.getStringTreeFolder(" "));
    }
}
