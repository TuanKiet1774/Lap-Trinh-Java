package behavioral.template.starbucks;

public class Coffee extends CaffeinBeverage{

    @Override
    public void brew() {
        System.out.println("- Cho cafe qua bộ lộc");
    }

    @Override
    public void addCondiments() {
        System.out.println("- Thêm đường và sữa");
    }
}
