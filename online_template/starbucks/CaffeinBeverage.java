package behavioral.template.starbucks;

public abstract class CaffeinBeverage {
    public void prepareRecipe(){
        boilWater();
        brew();
        pourInCuop();
        addCondiments();
    }

    public void boilWater(){
        System.out.println("- Đun sôi nước nóng");
    }

    public abstract void brew();

    public void pourInCuop(){
        System.out.println("- Rót vào ly");
    }

    public abstract void addCondiments();
}
