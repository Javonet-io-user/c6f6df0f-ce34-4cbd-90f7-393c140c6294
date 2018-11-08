package RDPCrystalEDILibrary;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.ComponentModel.*;
import RDPCrystalEDILibrary.*;
import jio.System.Collections.Generic.*;
import jio.System.*;public class EDIFileScrubber extends Component {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public java.lang.Double getTimeElapsed (){ try { return javonetHandle.get("TimeElapsed");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0.0;} }/**
	 * GetProperty
	 */
            public List<ScrubRule> getScrubRules (){ try { return new List<ScrubRule>((NObject)javonetHandle.get("ScrubRules"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setEDISource (EDISource value){ try { javonetHandle.set("EDISource",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public EDISource getEDISource (){ try { return EDISource.valueOf(((NEnum) javonetHandle.get("EDISource")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setTrimString (java.lang.String value){ try { javonetHandle.set("TrimString",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getTrimString (){ try { return  (java.lang.String) javonetHandle.get("TrimString");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setAutoDetectDelimiters (java.lang.Boolean value){ try { javonetHandle.set("AutoDetectDelimiters",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getAutoDetectDelimiters (){ try { return javonetHandle.get("AutoDetectDelimiters");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setDelimiters (Delimiters value){ try { javonetHandle.set("Delimiters",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Delimiters getDelimiters (){ try { return new Delimiters((NObject)javonetHandle.get("Delimiters"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.lang.String getErrorString (){ try { return  (java.lang.String) javonetHandle.get("ErrorString");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setEDIFileType (FileType value){ try { javonetHandle.set("EDIFileType",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public FileType getEDIFileType (){ try { return FileType.valueOf(((NEnum) javonetHandle.get("EDIFileType")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setEDIFile (java.lang.String value){ try { javonetHandle.set("EDIFile",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getEDIFile (){ try { return  (java.lang.String) javonetHandle.get("EDIFile");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setFileBlockSize (java.lang.Integer value){ try { javonetHandle.set("FileBlockSize",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Integer getFileBlockSize (){ try { return javonetHandle.get("FileBlockSize");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetProperty
	 */
            public void setEDIDataString (java.lang.String value){ try { javonetHandle.set("EDIDataString",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getEDIDataString (){ try { return  (java.lang.String) javonetHandle.get("EDIDataString");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public EDIFileScrubber (){  super((NObject) null); try {  javonetHandle = Javonet.New("EDIFileScrubber"); super.setJavonetHandle(javonetHandle); javonetHandle.addEventListener("FileScrubbingCompleted", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EDIFileScrubber.EDIFileScrubbingCompletedEvent handler : _FileScrubbingCompletedListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], FileLoadingEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public EDIFileScrubber (IContainer container){  super((NObject) null); try {  javonetHandle = Javonet.New("EDIFileScrubber",container); super.setJavonetHandle(javonetHandle); javonetHandle.addEventListener("FileScrubbingCompleted", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EDIFileScrubber.EDIFileScrubbingCompletedEvent handler : _FileScrubbingCompletedListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], FileLoadingEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public EDIFileScrubber(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public EDILightWeightDocument ScrubFile (java.lang.String ediFilePath){ try { return new EDILightWeightDocument((NObject)javonetHandle.invoke("ScrubFile",ediFilePath));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public EDILightWeightDocument Scrub (java.lang.String ediData){ try { return new EDILightWeightDocument((NObject)javonetHandle.invoke("Scrub",ediData));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public EDILightWeightDocument Scrub (){ try { return new EDILightWeightDocument((NObject)javonetHandle.invoke("Scrub"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Event
	 */
            private java.util.ArrayList< EDIFileScrubber.EDIFileScrubbingCompletedEvent> _FileScrubbingCompletedListeners = new java.util.ArrayList<EDIFileScrubber.EDIFileScrubbingCompletedEvent>();

            public void addFileScrubbingCompleted(EDIFileScrubber.EDIFileScrubbingCompletedEvent toAdd)
            {
                _FileScrubbingCompletedListeners.add(toAdd);
            }
            public void removeFileScrubbingCompleted(EDIFileScrubber.EDIFileScrubbingCompletedEvent toRemove)
            {
                _FileScrubbingCompletedListeners.remove(toRemove);
            }public static class EDIFileScrubbingCompletedEvent extends MulticastDelegate {protected NObject javonetHandle; public EDIFileScrubbingCompletedEvent (NObject object,java.lang.Integer method){  super((NObject) null); try {  javonetHandle = Javonet.New("EDIFileScrubbingCompletedEvent",object,method); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public EDIFileScrubbingCompletedEvent(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Invoke (NObject sender,FileLoadingEventArgs e){ try { javonetHandle.invoke("Invoke",sender,e);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public IAsyncResult BeginInvoke (NObject sender,FileLoadingEventArgs e,AsyncCallback callback,NObject object){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("BeginInvoke",sender,e,callback,object));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void EndInvoke (IAsyncResult result){ try { javonetHandle.invoke("EndInvoke",result);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }}	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}