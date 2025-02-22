package bt_java.baitap_a4;

public class User{
    private String name;
    //int voted = 0;

    public User(String name) {
        this.name = name;
    }

    public void vote(Candidate c)
    {
        Election election = Election.getInstance();
//        if(voted == 0)
//            election.vote(c);
//            voted++;
        election.vote(c, this);
    }

    public String getName(){
        return name;
    }
}
