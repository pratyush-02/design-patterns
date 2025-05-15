package FactoryPattern;

public class SushiFactory implements Factory{

    @Override
    public Dish getMeal(){
        return new Sushi();
    }
}
