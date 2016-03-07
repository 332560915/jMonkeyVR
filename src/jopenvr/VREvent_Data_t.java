package jopenvr;
import com.sun.jna.Pointer;
import com.sun.jna.Union;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class VREvent_Data_t extends Union {
	/** C type : VREvent_Reserved_t */
	public VREvent_Reserved_t reserved;
	/** C type : VREvent_Controller_t */
	public VREvent_Controller_t controller;
	/** C type : VREvent_Mouse_t */
	public VREvent_Mouse_t mouse;
	/** C type : VREvent_Scroll_t */
	public VREvent_Scroll_t scroll;
	/** C type : VREvent_Process_t */
	public VREvent_Process_t process;
	/** C type : VREvent_Notification_t */
	public VREvent_Notification_t notification;
	/** C type : VREvent_Overlay_t */
	public VREvent_Overlay_t overlay;
	/** C type : VREvent_Status_t */
	public VREvent_Status_t status;
	/** C type : VREvent_Keyboard_t */
	public VREvent_Keyboard_t keyboard;
	/** C type : VREvent_Ipd_t */
	public VREvent_Ipd_t ipd;
	/** C type : VREvent_Chaperone_t */
	public VREvent_Chaperone_t chaperone;
	/** C type : VREvent_PerformanceTest_t */
	public VREvent_PerformanceTest_t performanceTest;
	/** C type : VREvent_TouchPadMove_t */
	public VREvent_TouchPadMove_t touchPadMove;
	/** C type : VREvent_SeatedZeroPoseReset_t */
	public VREvent_SeatedZeroPoseReset_t seatedZeroPoseReset;
	public VREvent_Data_t() {
		super();
	}
	/** @param reserved C type : VREvent_Reserved_t */
	public VREvent_Data_t(VREvent_Reserved_t reserved) {
		super();
		this.reserved = reserved;
		setType(VREvent_Reserved_t.class);
	}
	/** @param controller C type : VREvent_Controller_t */
	public VREvent_Data_t(VREvent_Controller_t controller) {
		super();
		this.controller = controller;
		setType(VREvent_Controller_t.class);
	}
	/** @param mouse C type : VREvent_Mouse_t */
	public VREvent_Data_t(VREvent_Mouse_t mouse) {
		super();
		this.mouse = mouse;
		setType(VREvent_Mouse_t.class);
	}
	/** @param scroll C type : VREvent_Scroll_t */
	public VREvent_Data_t(VREvent_Scroll_t scroll) {
		super();
		this.scroll = scroll;
		setType(VREvent_Scroll_t.class);
	}
	/** @param process C type : VREvent_Process_t */
	public VREvent_Data_t(VREvent_Process_t process) {
		super();
		this.process = process;
		setType(VREvent_Process_t.class);
	}
	/** @param notification C type : VREvent_Notification_t */
	public VREvent_Data_t(VREvent_Notification_t notification) {
		super();
		this.notification = notification;
		setType(VREvent_Notification_t.class);
	}
	/** @param overlay C type : VREvent_Overlay_t */
	public VREvent_Data_t(VREvent_Overlay_t overlay) {
		super();
		this.overlay = overlay;
		setType(VREvent_Overlay_t.class);
	}
	/** @param status C type : VREvent_Status_t */
	public VREvent_Data_t(VREvent_Status_t status) {
		super();
		this.status = status;
		setType(VREvent_Status_t.class);
	}
	/** @param keyboard C type : VREvent_Keyboard_t */
	public VREvent_Data_t(VREvent_Keyboard_t keyboard) {
		super();
		this.keyboard = keyboard;
		setType(VREvent_Keyboard_t.class);
	}
	/** @param ipd C type : VREvent_Ipd_t */
	public VREvent_Data_t(VREvent_Ipd_t ipd) {
		super();
		this.ipd = ipd;
		setType(VREvent_Ipd_t.class);
	}
	/** @param chaperone C type : VREvent_Chaperone_t */
	public VREvent_Data_t(VREvent_Chaperone_t chaperone) {
		super();
		this.chaperone = chaperone;
		setType(VREvent_Chaperone_t.class);
	}
	/** @param performanceTest C type : VREvent_PerformanceTest_t */
	public VREvent_Data_t(VREvent_PerformanceTest_t performanceTest) {
		super();
		this.performanceTest = performanceTest;
		setType(VREvent_PerformanceTest_t.class);
	}
	/** @param touchPadMove C type : VREvent_TouchPadMove_t */
	public VREvent_Data_t(VREvent_TouchPadMove_t touchPadMove) {
		super();
		this.touchPadMove = touchPadMove;
		setType(VREvent_TouchPadMove_t.class);
	}
	/** @param seatedZeroPoseReset C type : VREvent_SeatedZeroPoseReset_t */
	public VREvent_Data_t(VREvent_SeatedZeroPoseReset_t seatedZeroPoseReset) {
		super();
		this.seatedZeroPoseReset = seatedZeroPoseReset;
		setType(VREvent_SeatedZeroPoseReset_t.class);
	}
	public VREvent_Data_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends VREvent_Data_t implements com.sun.jna.Structure.ByReference {
		
	};
	public static class ByValue extends VREvent_Data_t implements com.sun.jna.Structure.ByValue {
		
	};
}
