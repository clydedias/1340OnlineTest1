
public class BallotUnit {
	
	ControlUnit cu=new ControlUnit();
	ReadyLamp ready=new ReadyLamp();
    

	public void getBallotBtnPress()
	{
		if(cu.PressBallotBtn()=="pressed")
		{
			ready.setBallotLamp("on");
			System.out.println("the ballot units ready lamp is "+ ready.getBallotLamp());
		}
	}
	
	
}
