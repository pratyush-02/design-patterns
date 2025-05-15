package Strategy;

import Strategy.Interfaces.DriveMode;

public class MyVehicle {
    DriveMode driveMode;
    MyVehicle(DriveMode getDriveMode){
        this.driveMode = getDriveMode;
    }
    public void startDriveMode(){
        driveMode.driveModeSelect();
    }

}
