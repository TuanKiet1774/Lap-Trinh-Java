package bt_java.baitap_a4;

public class User{
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void voteFor(Candidate c)
    {
        Election election = Election.getInstance();
        election.vote(c, this);
    }
}
