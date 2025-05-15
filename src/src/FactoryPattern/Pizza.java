package FactoryPattern;

public class Pizza implements Dish{
    @Override
    public void prepareDish(){
        System.out.println("Preparing Pizza...Pls wait");
    }
    @Override
    public void serveDish(){
        System.out.println("Pizza is prepared...Enjoy your meal");
    }
}
