package behavioral.template.starbucks;

public class Tea extends CaffeinBeverage{
    @Override
    public void brew() {
        System.out.println("- Nhúng túi trà vào nước sôi");
    }

    @Override
    public void addCondiments() {
        System.out.println("- Thêm chanh");
    }
}
