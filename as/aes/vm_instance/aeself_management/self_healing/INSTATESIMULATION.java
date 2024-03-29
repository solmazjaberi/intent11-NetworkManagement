package generatedbyassl.as.aes.vm_instance.aeself_management.self_healing;

import java.io.Serializable;
import generatedbyassl.as.*;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'InStateSimulation' (specified as FLUENT ASSL tier).
 */
public class INSTATESIMULATION
	extends ASSLFLUENT
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'INSTATESIMULATION' class.
	 */
	static private INSTATESIMULATION oInstance = null;
	/**
	 * Generated by ASSL Framework
	 * 
	 * Needed by the class because it implements the Serializable interface.
	 */
	static final long serialVersionUID = 0001L;

	/**
	 * Generated by ASSL Framework
	 * 
	 * Because this is a singleton class its constructor is private.
	 */
	private  INSTATESIMULATION (  )
	{
		vInitiatedByEvents.add( generatedbyassl.as.aes.vm_instance.events.TIMETOSTATESIMULATION.getInstance() );
		generatedbyassl.as.aes.vm_instance.events.TIMETOSTATESIMULATION.getInstance().addEventCatcher(this); //**** fluent registers for that event
		vTerminatedByEvents.add( generatedbyassl.as.aes.vm_instance.events.STATESIMULATED.getInstance() );
		generatedbyassl.as.aes.vm_instance.events.STATESIMULATED.getInstance().addEventCatcher(this); //**** fluent registers for that event
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'INSTATESIMULATION' class.
	 */
	static public INSTATESIMULATION getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new INSTATESIMULATION();
		}
		return oInstance;
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method calls all the fluent-mapped actions in sequence.
	 */
	protected synchronized void callFluentActions (  )
	{
	}

}