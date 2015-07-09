
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



public String PressBallotBtn()
{
	if(lamp.getCULampstate()=="on")
	{	
	  if(busyLamp.state=="off")
	  {
	      balBtn.setBallotButton("pressed");	
	  }
	  else
	  {
		  System.out.println("please wait, the system is processing!!!");
	  }
	}
    return balBtn.getBallotButton();
}

public void closeVoting()
{
	System.out.println("no more voting allowed");
}


}
