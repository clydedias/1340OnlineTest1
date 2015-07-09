
public class ControlUnit {
	
	
CUPowerBtn power=new CUPowerBtn();
TotalButton total=new TotalButton();
BusyLamp busyLamp=new BusyLamp();
BallotButton balBtn=new BallotButton();
OnLamp lamp=new OnLamp();

public void turnOnCU()
{
	power.powerBtnPress();
}
	
public void totalVotes()
{
	if(lamp.getCULampstate()=="on")
	{
		total.getTotalVotes();
	}
	
}

public void PressBallotBtn()
{
	if(lamp.getCULampstate()=="on")
	{	
	  if(busyLamp.state=="off")
	  {
	      balBtn.setBallotButton("press");	
	  }
	  else
	  {
		  System.out.println("please wait, the system is processing!!!");
	  }
	}

}

}
