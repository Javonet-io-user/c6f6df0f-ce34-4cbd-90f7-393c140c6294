package RDPCrystalEDILibrary.UI.Winforms.Controls;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.Windows.Forms.*;
import RDPCrystalEDILibrary.UI.Winforms.Controls.*;
import jio.System.Drawing.*;
import RDPCrystalEDILibrary.*;
import jio.System.*;public class ValidationUnit extends UserControl {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setPreventInfiniteLoopWhileSearching (java.lang.Boolean value){ try { javonetHandle.set("PreventInfiniteLoopWhileSearching",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getPreventInfiniteLoopWhileSearching (){ try { return javonetHandle.get("PreventInfiniteLoopWhileSearching");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setTrackDownUnrecognizedLoops (java.lang.Boolean value){ try { javonetHandle.set("TrackDownUnrecognizedLoops",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getTrackDownUnrecognizedLoops (){ try { return javonetHandle.get("TrackDownUnrecognizedLoops");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
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
            public void setEDIRuleFile (java.lang.String value){ try { javonetHandle.set("EDIRuleFile",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getEDIRuleFile (){ try { return  (java.lang.String) javonetHandle.get("EDIRuleFile");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setEDIFile (java.lang.String value){ try { javonetHandle.set("EDIFile",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getEDIFile (){ try { return  (java.lang.String) javonetHandle.get("EDIFile");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setShowFileGridLines (java.lang.Boolean value){ try { javonetHandle.set("ShowFileGridLines",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getShowFileGridLines (){ try { return javonetHandle.get("ShowFileGridLines");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setShowErrorGridLines (java.lang.Boolean value){ try { javonetHandle.set("ShowErrorGridLines",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getShowErrorGridLines (){ try { return javonetHandle.get("ShowErrorGridLines");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setShowWarningGridLines (java.lang.Boolean value){ try { javonetHandle.set("ShowWarningGridLines",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getShowWarningGridLines (){ try { return javonetHandle.get("ShowWarningGridLines");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setCheckDataTypeRequirements (java.lang.Boolean value){ try { javonetHandle.set("CheckDataTypeRequirements",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getCheckDataTypeRequirements (){ try { return javonetHandle.get("CheckDataTypeRequirements");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setEDIFileBackColor (Color value){ try { javonetHandle.set("EDIFileBackColor",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Color getEDIFileBackColor (){ try { return javonetHandle.get("EDIFileBackColor");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setEDIFileForeColor (Color value){ try { javonetHandle.set("EDIFileForeColor",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Color getEDIFileForeColor (){ try { return javonetHandle.get("EDIFileForeColor");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setErrorTableBackColor (Color value){ try { javonetHandle.set("ErrorTableBackColor",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Color getErrorTableBackColor (){ try { return javonetHandle.get("ErrorTableBackColor");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setErrorTableForeColor (Color value){ try { javonetHandle.set("ErrorTableForeColor",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Color getErrorTableForeColor (){ try { return javonetHandle.get("ErrorTableForeColor");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setWarningTableBackColor (Color value){ try { javonetHandle.set("WarningTableBackColor",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Color getWarningTableBackColor (){ try { return javonetHandle.get("WarningTableBackColor");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setWarningTableForeColor (Color value){ try { javonetHandle.set("WarningTableForeColor",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Color getWarningTableForeColor (){ try { return javonetHandle.get("WarningTableForeColor");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setSuppressValidationCompleteMessage (java.lang.Boolean value){ try { javonetHandle.set("SuppressValidationCompleteMessage",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getSuppressValidationCompleteMessage (){ try { return javonetHandle.get("SuppressValidationCompleteMessage");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setDelimiters (Delimiters value){ try { javonetHandle.set("Delimiters",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Delimiters getDelimiters (){ try { return new Delimiters((NObject)javonetHandle.get("Delimiters"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setEDIFileType (FileType value){ try { javonetHandle.set("EDIFileType",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public FileType getEDIFileType (){ try { return FileType.valueOf(((NEnum) javonetHandle.get("EDIFileType")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setLoadFile (java.lang.Boolean value){ try { javonetHandle.set("LoadFile",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getLoadFile (){ try { return javonetHandle.get("LoadFile");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * GetProperty
	 */
            public java.lang.Integer getNumberOfErrors (){ try { return javonetHandle.get("NumberOfErrors");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * GetProperty
	 */
            public java.lang.Integer getNumberOfWarnings (){ try { return javonetHandle.get("NumberOfWarnings");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetProperty
	 */
            public void setHideLoadDataSection (java.lang.Boolean value){ try { javonetHandle.set("HideLoadDataSection",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getHideLoadDataSection (){ try { return javonetHandle.get("HideLoadDataSection");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setShowProgressSection (java.lang.Boolean value){ try { javonetHandle.set("ShowProgressSection",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getShowProgressSection (){ try { return javonetHandle.get("ShowProgressSection");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setShowFileInputSection (java.lang.Boolean value){ try { javonetHandle.set("ShowFileInputSection",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getShowFileInputSection (){ try { return javonetHandle.get("ShowFileInputSection");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setHideEDIFIleSection (java.lang.Boolean value){ try { javonetHandle.set("HideEDIFIleSection",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getHideEDIFIleSection (){ try { return javonetHandle.get("HideEDIFIleSection");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }public ValidationUnit (){  super((NObject) null); try {  javonetHandle = Javonet.New("ValidationUnit"); super.setJavonetHandle(javonetHandle); javonetHandle.addEventListener("ErrorOccurred", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (ValidationUnit.ErrorEvent handler : _ErrorOccurredListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], GeneralEventArgs.class));}}});javonetHandle.addEventListener("ValidationButtonClicked", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (ValidationUnit.ValidationButtonClickedEvent handler : _ValidationButtonClickedListeners) {handler.Invoke(Convert(objects[0], NObject.class));}}});javonetHandle.addEventListener("ValidationCompleted", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (ValidationUnit.ValidationCompletedEvent handler : _ValidationCompletedListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], ValidationEventsArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ValidationUnit(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void ValidateFile (){ try { javonetHandle.invoke("ValidateFile");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void ExportToCSV (java.lang.String filePath){ try { javonetHandle.invoke("ExportToCSV",filePath);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Event
	 */
            private java.util.ArrayList< ValidationUnit.ErrorEvent> _ErrorOccurredListeners = new java.util.ArrayList<ValidationUnit.ErrorEvent>();

            public void addErrorOccurred(ValidationUnit.ErrorEvent toAdd)
            {
                _ErrorOccurredListeners.add(toAdd);
            }
            public void removeErrorOccurred(ValidationUnit.ErrorEvent toRemove)
            {
                _ErrorOccurredListeners.remove(toRemove);
            }/**
	 * Event
	 */
            private java.util.ArrayList< ValidationUnit.ValidationButtonClickedEvent> _ValidationButtonClickedListeners = new java.util.ArrayList<ValidationUnit.ValidationButtonClickedEvent>();

            public void addValidationButtonClicked(ValidationUnit.ValidationButtonClickedEvent toAdd)
            {
                _ValidationButtonClickedListeners.add(toAdd);
            }
            public void removeValidationButtonClicked(ValidationUnit.ValidationButtonClickedEvent toRemove)
            {
                _ValidationButtonClickedListeners.remove(toRemove);
            }/**
	 * Event
	 */
            private java.util.ArrayList< ValidationUnit.ValidationCompletedEvent> _ValidationCompletedListeners = new java.util.ArrayList<ValidationUnit.ValidationCompletedEvent>();

            public void addValidationCompleted(ValidationUnit.ValidationCompletedEvent toAdd)
            {
                _ValidationCompletedListeners.add(toAdd);
            }
            public void removeValidationCompleted(ValidationUnit.ValidationCompletedEvent toRemove)
            {
                _ValidationCompletedListeners.remove(toRemove);
            }public static class ValidationButtonClickedEvent extends MulticastDelegate {protected NObject javonetHandle; public ValidationButtonClickedEvent (NObject object,java.lang.Integer method){  super((NObject) null); try {  javonetHandle = Javonet.New("ValidationButtonClickedEvent",object,method); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ValidationButtonClickedEvent(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Invoke (NObject sender){ try { javonetHandle.invoke("Invoke",sender);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public IAsyncResult BeginInvoke (NObject sender,AsyncCallback callback,NObject object){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("BeginInvoke",sender,callback,object));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void EndInvoke (IAsyncResult result){ try { javonetHandle.invoke("EndInvoke",result);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }}public static class ValidationCompletedEvent extends MulticastDelegate {protected NObject javonetHandle; public ValidationCompletedEvent (NObject object,java.lang.Integer method){  super((NObject) null); try {  javonetHandle = Javonet.New("ValidationCompletedEvent",object,method); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ValidationCompletedEvent(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Invoke (NObject sender,ValidationEventsArgs e){ try { javonetHandle.invoke("Invoke",sender,e);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public IAsyncResult BeginInvoke (NObject sender,ValidationEventsArgs e,AsyncCallback callback,NObject object){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("BeginInvoke",sender,e,callback,object));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void EndInvoke (IAsyncResult result){ try { javonetHandle.invoke("EndInvoke",result);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }}public static class ErrorEvent extends MulticastDelegate {protected NObject javonetHandle; public ErrorEvent (NObject object,java.lang.Integer method){  super((NObject) null); try {  javonetHandle = Javonet.New("ErrorEvent",object,method); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ErrorEvent(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Invoke (NObject sender,GeneralEventArgs e){ try { javonetHandle.invoke("Invoke",sender,e);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public IAsyncResult BeginInvoke (NObject sender,GeneralEventArgs e,AsyncCallback callback,NObject object){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("BeginInvoke",sender,e,callback,object));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void EndInvoke (IAsyncResult result){ try { javonetHandle.invoke("EndInvoke",result);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }}	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}