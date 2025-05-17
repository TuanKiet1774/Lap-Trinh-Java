package bt_java.baitap_a4;

public class MainA4 {
    public static void main(String[] args) {
        User u1 = new User("Kiet");
        u1.voteFor(Candidate.Trump);
        User u2 = new User("Thuan");
        u2.voteFor(Candidate.Trump);
        User u3 = new User("Tri");
        u3.voteFor(Candidate.Biden);
        User u4 = new User("Kiet");
        u4.voteFor(Candidate.Biden);

        System.out.println("Kết quả bỏ phiếu: ");
        Election e = new Election();
        e.getInstance().inKetQua();
    }
}
