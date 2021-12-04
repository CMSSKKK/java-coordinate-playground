package inheritance;

public class Coffee extends CaffeineBeverage{
    void prePareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    @Override
    void brew() {
        System.out.println("커피를 내린다.");
    }

    @Override
    void addCondiments() {
        System.out.println("설탕과 우유를 넣는다.");
    }
}
