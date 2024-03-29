package generatedbyassl.as.aes.controller.aeself_management.self_secheduling;

import java.io.Serializable;
import generatedbyassl.as.*;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'inLifeCycle' (specified as FLUENT ASSL tier).
 */
public class INLIFECYCLE
	extends ASSLFLUENT
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'INLIFECYCLE' class.
	 */
	static private INLIFECYCLE oInstance = null;
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
	private  INLIFECYCLE (  )
	{
		vInitiatedByEvents.add( generatedbyassl.as.aes.controller.events.TIMETORECORDLIFECYCLE.getInstance() );
		generatedbyassl.as.aes.controller.events.TIMETORECORDLIFECYCLE.getInstance().addEventCatcher(this); //**** fluent registers for that event
		vTerminatedByEvents.add( generatedbyassl.as.aes.controller.events.LIFECYCLERECORDED.getInstance() );
		generatedbyassl.as.aes.controller.events.LIFECYCLERECORDED.getInstance().addEventCatcher(this); //**** fluent registers for that event
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'INLIFECYCLE' class.
	 */
	static public INLIFECYCLE getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new INLIFECYCLE();
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