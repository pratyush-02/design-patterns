package Strategy;

import Strategy.Interfaces.DriveMode;

public class CityDriveMode implements DriveMode {
    @Override
    public void  driveModeSelect() {
        System.out.println("City drive mode has been activated");
    }
}
