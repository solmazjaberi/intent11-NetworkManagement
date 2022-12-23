package generatedbyassl.as.aes.controller.aeip.messages;

import java.io.Serializable;
import generatedbyassl.as.ASSLMESSAGE;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'msgSuspend' (specified as MESSAGE ASSL tier).
 */
public class MSGSUSPEND
	extends ASSLMESSAGE
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'MSGSUSPEND' class.
	 */
	static private MSGSUSPEND oInstance = null;
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
	private  MSGSUSPEND (  )
	{
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'MSGSUSPEND' class.
	 */
	static public MSGSUSPEND getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new MSGSUSPEND();
		}
		return oInstance;
	}

}