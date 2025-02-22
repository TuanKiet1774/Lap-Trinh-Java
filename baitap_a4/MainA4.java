package bt_java.baitap_a4;

public class MainA4 {
    public static void main(String[] args) {
        User u1 = new User("Kiet");
        u1.vote(Candidate.Trump);
        User u2 = new User("Thuan");
        u2.vote(Candidate.Trump);
        User u3 = new User("Tri");
        u3.vote(Candidate.Biden);

        System.out.println("Kết quả bỏ phiếu: ");
        Election.getInstance().inKetQua();
    }
}
