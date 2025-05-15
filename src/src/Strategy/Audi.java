package Strategy;

import ListovSubsitutionPrinciple.Vehicle;
import Strategy.Interfaces.DriveMode;

public class Audi extends MyVehicle {
    Audi(DriveMode getDriveMode){
        super(getDriveMode);
    }
}
