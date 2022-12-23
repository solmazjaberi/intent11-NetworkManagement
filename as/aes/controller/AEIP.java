package generatedbyassl.as.aes.controller;

import java.io.Serializable;
import java.util.Hashtable;
import generatedbyassl.as.ASSLMESSAGE;
import generatedbyassl.as.ASSLCHANNEL;
import generatedbyassl.as.ASSLFUNCTION;
import generatedbyassl.as.ASSLMANAGED_ELEMENT;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'AEIP' (specified as AEIP ASSL tier).
 */
public class AEIP
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'AEIP' class.
	 */
	static private AEIP oInstance = null;
	/**
	 * Generated by ASSL Framework
	 * 
	 * Needed by the class because it implements the Serializable interface.
	 */
	static final long serialVersionUID = 0001L;
	/**
	 * Generated by ASSL Framework
	 * 
	 * Holds pairs 'message name'-'message reference' of all the messages specified by AEIP.
	 */
	public Hashtable<String, ASSLMESSAGE> MESSAGES = new Hashtable<String, ASSLMESSAGE>();
	/**
	 * Generated by ASSL Framework
	 * 
	 * Holds pairs 'channel name'-'channel reference' of all the channels specified by AEIP.
	 */
	public Hashtable<String, ASSLCHANNEL> CHANNELS = new Hashtable<String, ASSLCHANNEL>();
	/**
	 * Generated by ASSL Framework
	 * 
	 * Holds pairs 'function name'-'function reference' of all the functions specified by AEIP.
	 */
	public Hashtable<String, ASSLFUNCTION> FUNCTIONS = new Hashtable<String, ASSLFUNCTION>();
	/**
	 * Generated by ASSL Framework
	 * 
	 * Holds pairs 'managed element name'-'managed element reference' of all the managed elements specified by AEIP.
	 */
	private Hashtable<String, ASSLMANAGED_ELEMENT> MANAGED_ELEMENTS = new Hashtable<String, ASSLMANAGED_ELEMENT>();

	/**
	 * Generated by ASSL Framework
	 * 
	 * Because this is a singleton class its constructor is private.
	 */
	private  AEIP (  )
	{
		MESSAGES.put( "MSGRUN", generatedbyassl.as.aes.controller.aeip.messages.MSGRUN.getInstance() );
		MESSAGES.put( "MSGSTOP", generatedbyassl.as.aes.controller.aeip.messages.MSGSTOP.getInstance() );
		MESSAGES.put( "MSGSUSPEND", generatedbyassl.as.aes.controller.aeip.messages.MSGSUSPEND.getInstance() );
		MESSAGES.put( "MSGTERMINATE", generatedbyassl.as.aes.controller.aeip.messages.MSGTERMINATE.getInstance() );
		MESSAGES.put( "MSGLIFECYCLE", generatedbyassl.as.aes.controller.aeip.messages.MSGLIFECYCLE.getInstance() );
		CHANNELS.put( "CONTROLLER_LINK", generatedbyassl.as.aes.controller.aeip.channels.CONTROLLER_LINK.getInstance() );
		FUNCTIONS.put( "SENDRUNMSG", generatedbyassl.as.aes.controller.aeip.functions.SENDRUNMSG.getInstance() );
		FUNCTIONS.put( "SENDSTOPMSG", generatedbyassl.as.aes.controller.aeip.functions.SENDSTOPMSG.getInstance() );
		FUNCTIONS.put( "SENDSUSPENDMSG", generatedbyassl.as.aes.controller.aeip.functions.SENDSUSPENDMSG.getInstance() );
		FUNCTIONS.put( "SENDTERMINATEMSG", generatedbyassl.as.aes.controller.aeip.functions.SENDTERMINATEMSG.getInstance() );
		FUNCTIONS.put( "SENDLIFECYCLEMSG", generatedbyassl.as.aes.controller.aeip.functions.SENDLIFECYCLEMSG.getInstance() );
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'AEIP' class.
	 */
	static public AEIP getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new AEIP();
		}
		return oInstance;
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Returns a reference to a message specified by name.
	 */
	public ASSLMESSAGE getMessage ( String psMessageName )
	{
		return MESSAGES.get(psMessageName);
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Returns a reference to a channel specified by name.
	 */
	public ASSLCHANNEL getChannel ( String psChannelName )
	{
		return CHANNELS.get(psChannelName);
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Returns a reference to a function specified by name.
	 */
	public ASSLFUNCTION getFunction ( String psFunctionName )
	{
		return FUNCTIONS.get(psFunctionName);
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Returns a reference to a managed element specified by name.
	 */
	public ASSLMANAGED_ELEMENT getManagedElement ( String psManagedElementName )
	{
		return MANAGED_ELEMENTS.get(psManagedElementName);
	}

}