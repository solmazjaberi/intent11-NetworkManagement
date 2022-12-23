package generatedbyassl.as.aes.vm_instance.actions;

import java.io.Serializable;
import generatedbyassl.as.ASSLACTION;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'modifyState' (specified as ACTION ASSL tier).
 */
public class MODIFYSTATE
	extends ASSLACTION
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'MODIFYSTATE' class.
	 */
	static private MODIFYSTATE oInstance = null;
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
	private  MODIFYSTATE (  )
	{
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'MODIFYSTATE' class.
	 */
	static public MODIFYSTATE getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new MODIFYSTATE();
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
		bResult =  generatedbyassl.as.aes.vm_instance.aeself_management.self_healing.INSTATESIMULATION.getInstance().isFluentInitiated()  ;
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
		generatedbyassl.as.aes.vm_instance.aeip.functions.RECEIVESTOPMSG.getInstance().perform(  );
		generatedbyassl.as.aes.vm_instance.aeip.managed_elements.VM_INSTANCE_INTERFACE.getInstance().STOP(  );
		generatedbyassl.as.aes.vm_instance.aeip.functions.RECEIVESUSPENDMSG.getInstance().perform(  );
		generatedbyassl.as.aes.vm_instance.aeip.managed_elements.VM_INSTANCE_INTERFACE.getInstance().SUSPEND(  );
		generatedbyassl.as.aes.vm_instance.aeip.functions.RECEIVETERMINATEMSG.getInstance().perform(  );
		generatedbyassl.as.aes.vm_instance.aeip.managed_elements.VM_INSTANCE_INTERFACE.getInstance().TERMINATE(  );
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Triggers events in case the action is successfully performed.
	 */
	public void TRIGGERS (  )
	{
		generatedbyassl.as.aes.vm_instance.events.STATESIMULATED.getInstance().triggerEvent();
	}

}