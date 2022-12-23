package generatedbyassl.as.aes.controller.actions;

import java.io.Serializable;
import generatedbyassl.as.ASSLACTION;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'AllocateResources' (specified as ACTION ASSL tier).
 */
public class ALLOCATERESOURCES
	extends ASSLACTION
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'ALLOCATERESOURCES' class.
	 */
	static private ALLOCATERESOURCES oInstance = null;
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
	private  ALLOCATERESOURCES (  )
	{
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'ALLOCATERESOURCES' class.
	 */
	static public ALLOCATERESOURCES getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new ALLOCATERESOURCES();
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
		bResult =  generatedbyassl.as.aes.controller.aeself_management.self_configuring.INPROVISIONING.getInstance().isFluentInitiated()  ;
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
		generatedbyassl.as.aes.controller.actions.ALLOCATION.getInstance().perform(  );
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Triggers events in case the action is successfully performed.
	 */
	public void TRIGGERS (  )
	{
		generatedbyassl.as.aes.controller.events.PROVISIONINGDONE.getInstance().triggerEvent();
	}

}