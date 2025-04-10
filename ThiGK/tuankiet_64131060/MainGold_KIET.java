package tuankiet_64131060;

public class MainGold_KIET {
    public static void main(String[] args) {
        UI_KIET u1KIET = new UI_KIET();
        Gold_KIET g1 = new Gold_KIET("666","6/4/2025",300000,500000);
        Gold_KIET g2 = new Gold_KIET("999","5/4/2025",4500000,65000000);

        u1KIET.them(g1);
        u1KIET.them(g2);

        System.out.println("Gíá vàng của ngày 5/4/2025");
        u1KIET.xem("5/4/2025");

        System.out.println("Gíá vàng của ngày 6/4/2025");
        u1KIET.xem("6/4/2025");

    }
}
