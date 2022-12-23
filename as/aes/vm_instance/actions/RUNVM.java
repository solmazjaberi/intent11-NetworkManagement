package generatedbyassl.as.aes.vm_instance.actions;

import java.io.Serializable;
import generatedbyassl.as.ASSLACTION;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'runVM' (specified as ACTION ASSL tier).
 */
public class RUNVM
	extends ASSLACTION
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'RUNVM' class.
	 */
	static private RUNVM oInstance = null;
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
	private  RUNVM (  )
	{
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'RUNVM' class.
	 */
	static public RUNVM getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new RUNVM();
		}
		return oInstance;
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Provides conditions to be fulfilled before processing the action.
	 */
	public boolean GUARDS (  )
	{
		boolean bResult = true;
		bResult =  generatedbyassl.as.aes.vm_instance.aeself_management.self_configuring.INRUNNINGVM.getInstance().isFluentInitiated()  ;
		return bResult;
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Embeds statements to be performed by the action if the GURADS conditions are fulfilled.
	 */
	public void DOES (  )
	{
		super.DOES();
		generatedbyassl.as.aes.vm_instance.aeip.functions.RECEIVERUNMSG.getInstance().perform(  );
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Triggers events in case the action is successfully performed.
	 */
	public void TRIGGERS (  )
	{
		generatedbyassl.as.aes.vm_instance.events.VMSTARTED.getInstance().triggerEvent();
	}

}