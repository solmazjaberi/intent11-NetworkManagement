package generatedbyassl.as.autonomicnetwork.asself_management.self_configuring;

import java.io.Serializable;
import generatedbyassl.as.*;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'inManaging' (specified as FLUENT ASSL tier).
 */
public class INMANAGING
	extends ASSLFLUENT
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'INMANAGING' class.
	 */
	static private INMANAGING oInstance = null;
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
	private  INMANAGING (  )
	{
		vInitiatedByEvents.add( generatedbyassl.as.autonomicnetwork.events.TIMETOMANAGE.getInstance() );
		generatedbyassl.as.autonomicnetwork.events.TIMETOMANAGE.getInstance().addEventCatcher(this); //**** fluent registers for that event
		vTerminatedByEvents.add( generatedbyassl.as.autonomicnetwork.events.MANAGINGDONE.getInstance() );
		generatedbyassl.as.autonomicnetwork.events.MANAGINGDONE.getInstance().addEventCatcher(this); //**** fluent registers for that event
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'INMANAGING' class.
	 */
	static public INMANAGING getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new INMANAGING();
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