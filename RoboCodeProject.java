public interface RoboCodeProject {

    void periodic();
    
    boolean reachedTarget();
    
    ControlMode getControlMode();

    void setControlMode (ControlMode);

    G getPoisitionTarget();
    
    void setPositionTarget (G);

    public static Command zeroingCommand ();
    
    public static Command goToPositionCommand (G);

}