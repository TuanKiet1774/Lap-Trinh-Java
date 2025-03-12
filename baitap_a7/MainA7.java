package bt_java.baitap_a7;

public class MainA7{
    public static void main(String[] args) {
        Computer b = new Computer.Builder()
                .builderRam("Ä")
                .builderCPU("B")
                .builderScreen("C").builderhardDisk("D").build();
        System.out.println(b);
    }
}
