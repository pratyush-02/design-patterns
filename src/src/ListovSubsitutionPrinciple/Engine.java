package ListovSubsitutionPrinciple;

public class Engine implements Vehicle{
    @Override
    public Integer getNumberOfWheels(){
        return 2;
    }
    public Boolean hasEngine(){
        return true;
    }
}
