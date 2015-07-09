
public class Lamp {

	OnLamp powerLamp=new OnLamp("off");
	BusyLamp busyLamp=new BusyLamp("off"); 
	
	public void turnOnCU()
	{
		powerLamp.CUstate="on";
	}
	
	public void turnoffCU()
	{
		powerLamp.CUstate="off";
	}
	
	public void CUbusy()
	{
		busyLamp.state="on";
	}
	
	public void CUfree()
	{
		busyLamp.state="off";
	}
	
}
