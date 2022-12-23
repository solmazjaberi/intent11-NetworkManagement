package generatedbyassl.as.aes.vm_instance.events;

import java.io.Serializable;
import generatedbyassl.as.ASSLEVENT;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'TimeToRunVM' (specified as EVENT ASSL tier).
 */
public class TIMETORUNVM
	extends ASSLEVENT
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'TIMETORUNVM' class.
	 */
	static private TIMETORUNVM oInstance = null;
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
	private  TIMETORUNVM (  )
	{
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'TIMETORUNVM' class.
	 */
	static public TIMETORUNVM getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new TIMETORUNVM();
		}
		return oInstance;
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Initialises the event after the system has been started.
	 */
	public synchronized void postStartInit (  )
	{
		generatedbyassl.as.aes.controller.aeip.messages.MSGRUN.getInstance().addMsgCatcherSentEvent(this);
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method checks the event's prompting conditions and if satisfied triggers the event.
	 */
	protected void checkEventConditions (  )
	{
		//**** triggers the event if the event conditions are satisfied
		if (  isMessageSent(generatedbyassl.as.aes.controller.aeip.messages.MSGRUN.getInstance())  ) 
		{
			triggerEvent();
		}
		vOccurredEvents.clear();
		vReceivedMessages.clear();
		vSentMessages.clear();
	}

}