package generatedbyassl.as.aes.controller.aeip.functions;

import java.io.Serializable;
import generatedbyassl.as.ASSLFUNCTION;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'sendTerminateMsg' (specified as FUNCTION ASSL tier).
 */
public class SENDTERMINATEMSG
	extends ASSLFUNCTION
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'SENDTERMINATEMSG' class.
	 */
	static private SENDTERMINATEMSG oInstance = null;
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
	private  SENDTERMINATEMSG (  )
	{
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'SENDTERMINATEMSG' class.
	 */
	static public SENDTERMINATEMSG getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new SENDTERMINATEMSG();
		}
		return oInstance;
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Embeds statements to be performed by the function.
	 */
	public void DOES (  )
	{
		super.DOES();
		generatedbyassl.as.aes.controller.aeip.channels.CONTROLLER_LINK.getInstance().putMessage("generatedbyassl.as.aes.controller.aeip.messages.MSGTERMINATE", generatedbyassl.as.aes.controller.aeip.messages.MSGTERMINATE.getInstance());
	}

}