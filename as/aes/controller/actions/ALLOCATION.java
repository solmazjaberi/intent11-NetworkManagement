package generatedbyassl.as.aes.controller.actions;

import java.io.Serializable;
import generatedbyassl.as.ASSLACTION;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'allocation' (specified as ACTION ASSL tier).
 */
public class ALLOCATION
	extends ASSLACTION
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'ALLOCATION' class.
	 */
	static private ALLOCATION oInstance = null;
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
	private  ALLOCATION (  )
	{
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'ALLOCATION' class.
	 */
	static public ALLOCATION getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new ALLOCATION();
		}
		return oInstance;
	}

}