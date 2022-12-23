package generatedbyassl.as.asip.functions;

import java.io.Serializable;
import generatedbyassl.as.ASSLFUNCTION;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'receiveStartLifeCycleMsg' (specified as FUNCTION ASSL tier).
 */
public class RECEIVESTARTLIFECYCLEMSG
	extends ASSLFUNCTION
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'RECEIVESTARTLIFECYCLEMSG' class.
	 */
	static private RECEIVESTARTLIFECYCLEMSG oInstance = null;
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
	private  RECEIVESTARTLIFECYCLEMSG (  )
	{
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'RECEIVESTARTLIFECYCLEMSG' class.
	 */
	static public RECEIVESTARTLIFECYCLEMSG getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new RECEIVESTARTLIFECYCLEMSG();
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
		generatedbyassl.as.asip.channels.PUBLIC_LINK.getInstance().getMessage("generatedbyassl.as.asip.messages.MSGSTARTLIFECYCLE");
	}

}