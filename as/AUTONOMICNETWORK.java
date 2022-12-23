package generatedbyassl.as;

import java.util.Hashtable;
import java.util.Enumeration;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Calendar;
import generatedbyassl.as.autonomicnetwork.controlloop.*;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'AutonomicNetwork' (specified as AS ASSL tier).
 */
public class AUTONOMICNETWORK
	extends Thread
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'AUTONOMICNETWORK' class.
	 */
	static private AUTONOMICNETWORK oInstance = null;
	/**
	 * Generated by ASSL Framework
	 * 
	 * Holds pairs 'SLO name'-'SLO reference' of all the SLOs specified by AUTONOMICNETWORK.
	 */
	public Hashtable<String, ASSLSLO> ASSLO = new Hashtable<String, ASSLSLO>();
	/**
	 * Generated by ASSL Framework
	 * 
	 * Holds pairs 'policy name'-'policy reference' of all the self-management policies followed by AUTONOMICNETWORK.
	 */
	private Hashtable<String, ASSLPOLICY> vPolicies = new Hashtable<String, ASSLPOLICY>();
	/**
	 * Generated by ASSL Framework
	 * 
	 * Holds pairs 'AE name'-'AE reference' of all the autonomic elements specified by AUTONOMICNETWORK.
	 */
	public Hashtable<String, ASSLAE> AES = new Hashtable<String, ASSLAE>();
	/**
	 * Generated by ASSL Framework
	 * 
	 * Holds pairs 'action name'-'action reference' of all the actions specified by AUTONOMICNETWORK.
	 */
	public Hashtable<String, ASSLACTION> ACTIONS = new Hashtable<String, ASSLACTION>();
	/**
	 * Generated by ASSL Framework
	 * 
	 * Holds pairs 'event name'-'event reference' of all the events specified by AUTONOMICNETWORK.
	 */
	public Hashtable<String, ASSLEVENT> EVENTS = new Hashtable<String, ASSLEVENT>();
	/**
	 * Generated by ASSL Framework
	 * 
	 * Holds pairs 'metric name'-'metric reference' of all the metrics specified by AUTONOMICNETWORK.
	 */
	public Hashtable<String, ASSLMETRIC> METRICS = new Hashtable<String, ASSLMETRIC>();
	/**
	 * Generated by ASSL Framework
	 * 
	 * Determines whether the AS has been started.
	 */
	private boolean bStarted = false;
	/**
	 * Generated by ASSL Framework
	 * 
	 * Holds a reference to the AUTONOMICNETWORK control loop's monitor.
	 */
	private AUTONOMICNETWORK_ASSLMONITOR oMonitor = new AUTONOMICNETWORK_ASSLMONITOR();
	/**
	 * Generated by ASSL Framework
	 * 
	 * Holds a reference to the AUTONOMICNETWORK control loop's analyzer.
	 */
	private AUTONOMICNETWORK_ASSLANALYZER oAnalyzer = new AUTONOMICNETWORK_ASSLANALYZER();
	/**
	 * Generated by ASSL Framework
	 * 
	 * Holds a reference to the AUTONOMICNETWORK control loop's simulator.
	 */
	private AUTONOMICNETWORK_ASSLSIMULATOR oSimulator = new AUTONOMICNETWORK_ASSLSIMULATOR();
	/**
	 * Generated by ASSL Framework
	 * 
	 * Holds a reference to the AUTONOMICNETWORK control loop's executor.
	 */
	private AUTONOMICNETWORK_ASSLEXECUTOR oExecutor = new AUTONOMICNETWORK_ASSLEXECUTOR();
	/**
	 * Generated by ASSL Framework
	 * 
	 * Determines whether the AS must stop.
	 */
	private boolean bStopAS = false;
	/**
	 * Generated by ASSL Framework
	 * 
	 * Holds a reference to the ASIP class.
	 */
	public generatedbyassl.as.ASIP ASIP = generatedbyassl.as.ASIP.getInstance();
	/**
	 * Generated by ASSL Framework
	 * 
	 * Holds a reference to the ASARCHITECTURE class.
	 */
	public generatedbyassl.as.autonomicnetwork.ASARCHITECTURE ASARCHITECTURE = generatedbyassl.as.autonomicnetwork.ASARCHITECTURE.getInstance();

	/**
	 * Generated by ASSL Framework
	 * 
	 * Because this is a singleton class its constructor is private.
	 */
	private  AUTONOMICNETWORK (  )
	{
		vPolicies.put( "SELF_CONFIGURING", generatedbyassl.as.autonomicnetwork.asself_management.SELF_CONFIGURING.getInstance() );
		ACTIONS.put( "MANAGE", generatedbyassl.as.autonomicnetwork.actions.MANAGE.getInstance() );
		EVENTS.put( "TIMETOMANAGE", generatedbyassl.as.autonomicnetwork.events.TIMETOMANAGE.getInstance() );
		EVENTS.put( "MANAGINGDONE", generatedbyassl.as.autonomicnetwork.events.MANAGINGDONE.getInstance() );
		AES.put( "CONTROLLER", generatedbyassl.as.aes.CONTROLLER.getInstance() );
		AES.put( "VM_INSTANCE", generatedbyassl.as.aes.VM_INSTANCE.getInstance() );
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'AUTONOMICNETWORK' class.
	 */
	static public AUTONOMICNETWORK getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new AUTONOMICNETWORK();
		}
		return oInstance;
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Converts a string to date/date-time.
	 */
	public static Date getDateTime ( String psDateTime )
	{
		//**** Replace the formatting string with one adapted to your date/time format.
		String sDateTimeFormat = "MM.dd.yyyy hh:mm:ss a";
		SimpleDateFormat sdf = new SimpleDateFormat(sDateTimeFormat, Locale.US);
		Date dResult = null;
		String sDate[] = psDateTime.split(" ");
		Calendar oCalendar = Calendar.getInstance(Locale.US);
		if ( sDate.length < 3 ) 
		{
			if ( sDate[0].indexOf('.') < 0 ) 
			{
				if ( sDate[0].split(":").length < 3 ) 
				{
					psDateTime = sDate[0] + ":00";
					if ( sDate.length == 2 ) 
					{
						psDateTime += " " + sDate[1];
					}
				}
				psDateTime = (oCalendar.get(Calendar.MONTH) + 1) + "." + oCalendar.get(Calendar.DAY_OF_MONTH) + "." + oCalendar.get(Calendar.YEAR) + " " + psDateTime;
			}
			else
			{
				psDateTime += " 00:00:00 AM";
			}
			if ( !psDateTime.endsWith("M") &&
				 !psDateTime.endsWith("m") ) 
			{
				psDateTime += " AM";
			}
		}
		try
		{
			dResult = sdf.parse(psDateTime);
		}
		catch ( Exception ex ) 
		{
			System.err.println( ex.getMessage() );
		}
		if ( dResult == null ) 
		{
			dResult = new Date();
		}
		return dResult;
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Returns a reference to an SLO specified by name.
	 */
	public ASSLSLO getSLO ( String psSLOName )
	{
		return ASSLO.get(psSLOName);
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Returns a reference to a policy specified by name.
	 */
	public ASSLPOLICY getPolicy ( String psPolicyName )
	{
		return vPolicies.get(psPolicyName);
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Returns a reference to an AE specified by name.
	 */
	public ASSLAE getAE ( String psAEName )
	{
		return AES.get(psAEName);
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Returns a reference to an action specified by name.
	 */
	public ASSLACTION getAction ( String psActionName )
	{
		return ACTIONS.get(psActionName);
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Returns a reference to an event specified by name.
	 */
	public ASSLEVENT getEvent ( String psEventName )
	{
		return EVENTS.get(psEventName);
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Returns a reference to a metric specified by name.
	 */
	public ASSLMETRIC getMetric ( String psMetricName )
	{
		return METRICS.get(psMetricName);
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Returns true if the AS has been started.
	 */
	public synchronized boolean isStarted (  )
	{
		return bStarted;
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method applies all the policies specified by AUTONOMICNETWORK.
	 */
	private void applayPolicies (  )
	{
		Enumeration<ASSLPOLICY> ePolicies = vPolicies.elements();
		ASSLPOLICY currPolicy = null;
		while ( ePolicies.hasMoreElements() ) 
		{
			currPolicy = ePolicies.nextElement();
			//**** applies only "switched-on" policies
			if ( currPolicy.isSwitchedOn() ) 
			{
				currPolicy.doAllMappings();
			}
		}
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Sets the control loop components.
	 */
	private void setControlLoop (  )
	{
		oMonitor.setMonitoredSLO(ASSLO);
		oMonitor.setMonitoredMetrics(METRICS);
		oMonitor.setAnalyzer(oAnalyzer);
		oAnalyzer.setSimulator(oSimulator);
		oAnalyzer.setExecutor(oExecutor);
		oSimulator.setExecutor(oExecutor);
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Performs the AS control loop.
	 */
	private void controlLoop (  )
	{
		try
		{
			//**** control loops should not be very resource-consuming, thus it releases CPU for a while
			Thread.sleep(1000);
		}
		catch ( InterruptedException ex ) 
		{
			System.err.println( ex.getMessage() );
		}
		//**** performs AS control loop monitor-analyzer-simulator-executor
		oMonitor.perform();
		oAnalyzer.perform();
		oSimulator.perform();
		oExecutor.perform();
		//**** applies all the "switched-on" self-management policies for the AS
		applayPolicies();
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Overrides Thread's start() method - starts the AEs first and then the AS.
	 */
	public void start (  )
	{
		Enumeration<ASSLAE> eAEs = AES.elements();
		Enumeration<ASSLMETRIC> eMetrics = METRICS.elements();
		Enumeration<ASSLEVENT> eEvents = EVENTS.elements();
		Enumeration<ASSLPOLICY> ePolicies = vPolicies.elements();
		ASSLAE currAE = null;
		ASSLMETRIC currMetric = null;
		ASSLEVENT currEvent = null;
		ASSLPOLICY currPolicy = null;
		//**** starts AEs
		while ( eAEs.hasMoreElements() ) 
		{
			currAE = eAEs.nextElement();
			currAE.start();
			while ( !currAE.isStarted() ) 
			{
			}
		}
		//**** starts AS metrics
		while ( eMetrics.hasMoreElements() ) 
		{
			currMetric = eMetrics.nextElement();
			currMetric.start();
			while ( !currMetric.isStarted() ) 
			{
			}
		}
		//**** starts AS events
		while ( eEvents.hasMoreElements() ) 
		{
			currEvent = eEvents.nextElement();
			currEvent.start();
			while ( !currEvent.isStarted() ) 
			{
			}
		}
		//**** starts AS policies
		while ( ePolicies.hasMoreElements() ) 
		{
			currPolicy = ePolicies.nextElement();
			currPolicy.start();
			while ( !currPolicy.isStarted() ) 
			{
			}
		}
		//**** starts AUTONOMICNETWORK
		setControlLoop();
		super.start();
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Runs AS.
	 */
	public void run (  )
	{
		String sMsg = "AS '" + this.getClass().getName() + "': started";
		System.out.println( sMsg );
		bStarted = true;
		System.out.println( "**********************************************************" );
		//**** runs the control loop
		while ( !bStopAS ) 
		{
			controlLoop();
			try
			{
				Thread.sleep(100);
			}
			catch ( InterruptedException ex ) 
			{
				System.err.println( ex.getMessage() );
			}
		}
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Creates and runs AUTONOMICNETWORK.
	 */
	public static void main ( String[] args )
	{
		AUTONOMICNETWORK oANTS = AUTONOMICNETWORK.getInstance();
		System.out.println( "**********************************************************" );
		System.out.println( "********************* INIT ALL TIERS *********************" );
		Enumeration<ASSLEVENT> eEVENTS = oANTS.EVENTS.elements();
		Enumeration<ASSLAE> eAEs = oANTS.AES.elements();
		while ( eAEs.hasMoreElements() ) 
		{
			eAEs.nextElement().postStartInit();
		}
		while ( eEVENTS.hasMoreElements() ) 
		{
			eEVENTS.nextElement().postStartInit();
		}
		System.out.println( "**********************************************************" );
		System.out.println( "******************** START AS THREADS ********************" );
		System.out.println( "**********************************************************" );
		oANTS.start();
		while ( !oANTS.isStarted() ) 
		{
		}
		System.out.println( "***************** AS STARTED SUCCESSFULLY ****************" );
		System.out.println( "**********************************************************" );
	}

}