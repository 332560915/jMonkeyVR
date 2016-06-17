package jopenvr;
import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.LongByReference;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class VR_IVRTrackedCamera_FnTable extends Structure {
	/** C type : GetCameraErrorNameFromEnum_callback* */
	public VR_IVRTrackedCamera_FnTable.GetCameraErrorNameFromEnum_callback GetCameraErrorNameFromEnum;
	/** C type : HasCamera_callback* */
	public VR_IVRTrackedCamera_FnTable.HasCamera_callback HasCamera;
	/** C type : GetCameraFrameSize_callback* */
	public VR_IVRTrackedCamera_FnTable.GetCameraFrameSize_callback GetCameraFrameSize;
	/** C type : GetCameraIntrinisics_callback* */
	public VR_IVRTrackedCamera_FnTable.GetCameraIntrinisics_callback GetCameraIntrinisics;
	/** C type : GetCameraProjection_callback* */
	public VR_IVRTrackedCamera_FnTable.GetCameraProjection_callback GetCameraProjection;
	/** C type : AcquireVideoStreamingService_callback* */
	public VR_IVRTrackedCamera_FnTable.AcquireVideoStreamingService_callback AcquireVideoStreamingService;
	/** C type : ReleaseVideoStreamingService_callback* */
	public VR_IVRTrackedCamera_FnTable.ReleaseVideoStreamingService_callback ReleaseVideoStreamingService;
	/** C type : GetVideoStreamFrameBuffer_callback* */
	public VR_IVRTrackedCamera_FnTable.GetVideoStreamFrameBuffer_callback GetVideoStreamFrameBuffer;
	public interface GetCameraErrorNameFromEnum_callback extends Callback {
		Pointer apply(int eCameraError);
	};
	public interface HasCamera_callback extends Callback {
		int apply(int nDeviceIndex, Pointer pHasCamera);
	};
	public interface GetCameraFrameSize_callback extends Callback {
		int apply(int nDeviceIndex, int eFrameType, IntByReference pnWidth, IntByReference pnHeight, IntByReference pnFrameBufferSize);
	};
	public interface GetCameraIntrinisics_callback extends Callback {
		int apply(int nDeviceIndex, int eFrameType, HmdVector2_t pFocalLength, HmdVector2_t pCenter);
	};
	public interface GetCameraProjection_callback extends Callback {
		int apply(int nDeviceIndex, int eFrameType, float flZNear, float flZFar, HmdMatrix44_t pProjection);
	};
	public interface AcquireVideoStreamingService_callback extends Callback {
		int apply(int nDeviceIndex, LongByReference pHandle);
	};
	public interface ReleaseVideoStreamingService_callback extends Callback {
		int apply(long hTrackedCamera);
	};
	public interface GetVideoStreamFrameBuffer_callback extends Callback {
		int apply(long hTrackedCamera, int eFrameType, Pointer pFrameBuffer, int nFrameBufferSize, CameraVideoStreamFrameHeader_t pFrameHeader, int nFrameHeaderSize);
	};
	public VR_IVRTrackedCamera_FnTable() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("GetCameraErrorNameFromEnum", "HasCamera", "GetCameraFrameSize", "GetCameraIntrinisics", "GetCameraProjection", "AcquireVideoStreamingService", "ReleaseVideoStreamingService", "GetVideoStreamFrameBuffer");
	}
	/**
	 * @param GetCameraErrorNameFromEnum C type : GetCameraErrorNameFromEnum_callback*<br>
	 * @param HasCamera C type : HasCamera_callback*<br>
	 * @param GetCameraFrameSize C type : GetCameraFrameSize_callback*<br>
	 * @param GetCameraIntrinisics C type : GetCameraIntrinisics_callback*<br>
	 * @param GetCameraProjection C type : GetCameraProjection_callback*<br>
	 * @param AcquireVideoStreamingService C type : AcquireVideoStreamingService_callback*<br>
	 * @param ReleaseVideoStreamingService C type : ReleaseVideoStreamingService_callback*<br>
	 * @param GetVideoStreamFrameBuffer C type : GetVideoStreamFrameBuffer_callback*
	 */
	public VR_IVRTrackedCamera_FnTable(VR_IVRTrackedCamera_FnTable.GetCameraErrorNameFromEnum_callback GetCameraErrorNameFromEnum, VR_IVRTrackedCamera_FnTable.HasCamera_callback HasCamera, VR_IVRTrackedCamera_FnTable.GetCameraFrameSize_callback GetCameraFrameSize, VR_IVRTrackedCamera_FnTable.GetCameraIntrinisics_callback GetCameraIntrinisics, VR_IVRTrackedCamera_FnTable.GetCameraProjection_callback GetCameraProjection, VR_IVRTrackedCamera_FnTable.AcquireVideoStreamingService_callback AcquireVideoStreamingService, VR_IVRTrackedCamera_FnTable.ReleaseVideoStreamingService_callback ReleaseVideoStreamingService, VR_IVRTrackedCamera_FnTable.GetVideoStreamFrameBuffer_callback GetVideoStreamFrameBuffer) {
		super();
		this.GetCameraErrorNameFromEnum = GetCameraErrorNameFromEnum;
		this.HasCamera = HasCamera;
		this.GetCameraFrameSize = GetCameraFrameSize;
		this.GetCameraIntrinisics = GetCameraIntrinisics;
		this.GetCameraProjection = GetCameraProjection;
		this.AcquireVideoStreamingService = AcquireVideoStreamingService;
		this.ReleaseVideoStreamingService = ReleaseVideoStreamingService;
		this.GetVideoStreamFrameBuffer = GetVideoStreamFrameBuffer;
	}
	public VR_IVRTrackedCamera_FnTable(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends VR_IVRTrackedCamera_FnTable implements Structure.ByReference {
		
	};
	public static class ByValue extends VR_IVRTrackedCamera_FnTable implements Structure.ByValue {
		
	};
}
