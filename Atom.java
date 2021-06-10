package lab2;

public class Atom {
	/**
	 * the number of protons
	 */
	private int Protons;
	/**
	 * the number of neutrons
	 */
	private int Neutrons;
	/**
	 * the number of electrons
	 */
	private int Electrons;
	/**
	 * @return the number of protons plus neutrons
	 */
	public Atom(int givenProtons, int givenNeutrons, int givenElectrons) {
		   // insert code to assign given values to instance variables 
		Protons = givenProtons;
		Neutrons = givenNeutrons;
		Electrons = givenElectrons;
		
		}
	
	public int getAtomicMass() 
	{
		int result = Protons + Neutrons;
		return result;
	/**
	 * @return 
	 * the difference between the number of protons and electrons
	 */
	}
	public int getAtomicCharge() 
	{
		int result = Protons - Electrons;
		return result;
	/** 
	 * @return
	 * decreases the number of protons by 2 and the number of neutrons by 2	
	 */
	}
	public void decay() 
	{
		Protons -= 2;
		Neutrons -= 2;
		
	}

}
