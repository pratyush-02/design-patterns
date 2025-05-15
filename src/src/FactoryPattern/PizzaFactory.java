package FactoryPattern;

public class PizzaFactory implements Factory{
    @Override
    public Dish getMeal(){
        return new Pizza();
    }
}
