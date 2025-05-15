package FactoryPattern;

public class Sushi implements Dish{
    @Override
    public void prepareDish()
    {
        System.out.println("Preparing Sushi...Pls wait");
    }

    @Override
    public void serveDish(){
        System.out.println("Sushi is prepared...Enjoy your meal");
    }
}
