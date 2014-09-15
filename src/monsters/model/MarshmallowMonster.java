package monsters.model;

public class MarshmallowMonster
{
	private String name;
	private double numberOfLegs;
	private double amountOfHair;
	private int armCount;
	private int eyeCount;
	private int noseCount;
	private boolean hasBellyButton;
	
	public MarshmallowMonster(String name, int eyeCount, double numberOfLegs, double amountOfHair, int armCount, int noseCount, boolean hasBellyButton)
	{
		this.name = name;
		this.eyeCount = eyeCount;
		this.numberOfLegs = numberOfLegs;
		this.amountOfHair = amountOfHair;
		this.armCount = armCount;
		this.noseCount = noseCount;
		this.hasBellyButton = hasBellyButton;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getEyeCount()
	{
		return eyeCount;
	}
	
	public double getNumberOfLegs()
	{
		return numberOfLegs;
	}
	
	public double getAmountOfHair()
	{
		return amountOfHair;
	}
	
	public int getArmCount()
	{
		return armCount;
	}
	
	public int getNoseCount()
	{
		return noseCount;
	}
	
	public boolean hasBellyButton()
	{
		return hasBellyButton;
	}
}
