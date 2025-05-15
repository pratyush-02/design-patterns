package Strategy;

import Strategy.Interfaces.DriveMode;

public class SportsDriveMode implements DriveMode {
    @Override
    public void driveModeSelect(){
        System.out.println("Sports Drive Mode is activated");
    }
}
