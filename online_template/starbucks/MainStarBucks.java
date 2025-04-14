package behavioral.template.starbucks;

public class MainStarBucks {
    public static void main(String[] args) {
        System.out.println("CÔNG THỨC PHA COFFEE");
        CaffeinBeverage cf = new Coffee();
        cf.prepareRecipe();

        System.out.println("CÔNG THỨC PHA TRÀ");
        CaffeinBeverage tea = new Tea();
        tea.prepareRecipe();
    }
}
