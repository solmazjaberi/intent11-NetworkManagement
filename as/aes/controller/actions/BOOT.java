package generatedbyassl.as.aes.controller.actions;

import java.io.Serializable;
import generatedbyassl.as.ASSLACTION;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'Boot' (specified as ACTION ASSL tier).
 */
public class BOOT
	extends ASSLACTION
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'BOOT' class.
	 */
	static private BOOT oInstance = null;
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
	private  BOOT (  )
	{
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'BOOT' class.
	 */
	static public BOOT getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new BOOT();
		}
		return oInstance;
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Triggers events in case the action is successfully performed.
	 */
	public void TRIGGERS (  )
	{
		generatedbyassl.as.aes.controller.events.STAGINGDONE.getInstance().triggerEvent();
	}

}