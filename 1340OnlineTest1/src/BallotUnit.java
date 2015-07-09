
public class BallotUnit {
	
	
	int numOfCand;
	ControlUnit cu=new ControlUnit();
	ReadyLamp ready=new ReadyLamp();
    


	public BallotUnit(int numOfCand) {
		super();
		this.numOfCand = numOfCand;
	}



	public void turnOnReadyLamp()
	{
		if(cu.PressBallotBtn()=="pressed")
		{
			ready.setBallotLamp("on");
			System.out.println("the ballot units ready lamp is "+ ready.getBallotLamp());
		}
	}
	
	
	
	
}
