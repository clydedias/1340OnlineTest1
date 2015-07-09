
public class CUPowerBtn {
	
	boolean BtnPress;
	OnLamp onlamp=new OnLamp();
	
	public void powerBtnPress()
	{
		if(onlamp.getCULampstate()=="off")
		{
		   onlamp.setCULampstate("on");		   
		}
		else
		{
			onlamp.setCULampstate("off");		
		}
		System.out.println("the CU has been turned "+onlamp.getCULampstate());
	}
	
	

}
