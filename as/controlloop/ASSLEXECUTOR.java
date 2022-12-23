package generatedbyassl.as.controlloop;

import java.util.Vector;
import java.util.Enumeration;
import generatedbyassl.as.ASSLACTION;

/**
 * Generated by ASSL Framework
 * 
 * This is the base control loop's executor class. A descendent of this class participates in a monitor-analyzer-simulator-executor control loop of an AS/AE.
 */
public class ASSLEXECUTOR
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * Holds references to actions to be executed at the next executor performance.
	 */
	protected Vector<ASSLACTION> ACTIONS = new Vector<ASSLACTION>();

	/**
	 * Generated by ASSL Framework
	 * 
	 * Adds an action to the list of actions to be executed at the next executor performance.
	 */
	public void addActionToExecute ( ASSLACTION poAction )
	{
		ACTIONS.add(poAction);
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Sets a reference to the list of actions to be executed at the next executor performance.
	 */
	public void setActionToExecute ( Vector<ASSLACTION> pvActions )
	{
		ACTIONS = pvActions;
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Performs the executor.
	 */
	public void perform (  )
	{
		Enumeration<ASSLACTION> eActions = ACTIONS.elements();
		ASSLACTION currAction = null;
		while ( eActions.hasMoreElements() ) 
		{
			currAction = eActions.nextElement();
			currAction.perform();
		}
		ACTIONS.clear();
	}

}