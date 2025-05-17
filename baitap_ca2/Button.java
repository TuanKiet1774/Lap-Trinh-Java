package bt_java.baitap_ca2;

public class Button {
    private String label;
    private IClickListener listener;
    //Theo yêu cầu thì chỉ có 1
    //Bình thường thì sẽ là một danh sách

    public Button(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    void setClickListener(IClickListener Clistener){
        this.listener = Clistener;
    }

    void perfromClick(){
        System.out.println("Button " + getLabel() + " vừa được nhấn");
        if(listener != null){
            listener.onClick(); //Thông báo cho Observer
        }
        else{
            System.out.println("Không có ai lắng nghe sự kiện Click của Button " + getLabel());
        }
    }
}
