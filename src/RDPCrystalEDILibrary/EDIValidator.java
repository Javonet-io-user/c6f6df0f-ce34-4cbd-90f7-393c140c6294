package RDPCrystalEDILibrary;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.ComponentModel.*;
import RDPCrystalEDILibrary.*;
import jio.System.Collections.ObjectModel.*;
import jio.System.Collections.Generic.*;
import jio.System.*;
import RDPCrystalEDILibrary.Rules.*;public class EDIValidator extends Component {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setMaxErrorsBeforeThrowingException (java.lang.Long value){ try { javonetHandle.set("MaxErrorsBeforeThrowingException",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Long getMaxErrorsBeforeThrowingException (){ try { return javonetHandle.get("MaxErrorsBeforeThrowingException");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setCopyElementNumber (java.lang.Boolean value){ try { javonetHandle.set("CopyElementNumber",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getCopyElementNumber (){ try { return javonetHandle.get("CopyElementNumber");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setPreventInfiniteLoopWhileSearching (java.lang.Boolean value){ try { javonetHandle.set("PreventInfiniteLoopWhileSearching",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getPreventInfiniteLoopWhileSearching (){ try { return javonetHandle.get("PreventInfiniteLoopWhileSearching");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setFileBlockSize (java.lang.Integer value){ try { javonetHandle.set("FileBlockSize",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Integer getFileBlockSize (){ try { return javonetHandle.get("FileBlockSize");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
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
            public void setTreatWarningsAsErrors (java.lang.Boolean value){ try { javonetHandle.set("TreatWarningsAsErrors",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getTreatWarningsAsErrors (){ try { return javonetHandle.get("TreatWarningsAsErrors");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * GetProperty
	 */
            public java.lang.Double getTimeElapsed (){ try { return javonetHandle.get("TimeElapsed");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0.0;} }/**
	 * SetProperty
	 */
            public void setEDIDataString (java.lang.String value){ try { javonetHandle.set("EDIDataString",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getEDIDataString (){ try { return  (java.lang.String) javonetHandle.get("EDIDataString");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setEDIFile (java.lang.String value){ try { javonetHandle.set("EDIFile",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getEDIFile (){ try { return  (java.lang.String) javonetHandle.get("EDIFile");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setCheckForEmptyTrailingElements (java.lang.Boolean value){ try { javonetHandle.set("CheckForEmptyTrailingElements",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getCheckForEmptyTrailingElements (){ try { return javonetHandle.get("CheckForEmptyTrailingElements");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setCheckMinMaxRequirements (java.lang.Boolean value){ try { javonetHandle.set("CheckMinMaxRequirements",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getCheckMinMaxRequirements (){ try { return javonetHandle.get("CheckMinMaxRequirements");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setCheckDataTypeRequirements (java.lang.Boolean value){ try { javonetHandle.set("CheckDataTypeRequirements",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getCheckDataTypeRequirements (){ try { return javonetHandle.get("CheckDataTypeRequirements");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setEDIFileType (FileType value){ try { javonetHandle.set("EDIFileType",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public FileType getEDIFileType (){ try { return FileType.valueOf(((NEnum) javonetHandle.get("EDIFileType")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setEDISource (EDISource value){ try { javonetHandle.set("EDISource",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public EDISource getEDISource (){ try { return EDISource.valueOf(((NEnum) javonetHandle.get("EDISource")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setDebugMode (java.lang.Boolean value){ try { javonetHandle.set("DebugMode",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getDebugMode (){ try { return javonetHandle.get("DebugMode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setLoadValidatedData (java.lang.Boolean value){ try { javonetHandle.set("LoadValidatedData",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getLoadValidatedData (){ try { return javonetHandle.get("LoadValidatedData");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * GetProperty
	 */
            public java.lang.Boolean getPassed (){ try { return javonetHandle.get("Passed");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * GetProperty
	 */
            public EDILightWeightDocument getEDILightWeightDocument (){ try { return new EDILightWeightDocument((NObject)javonetHandle.get("EDILightWeightDocument"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.lang.Integer getNumberOfLines (){ try { return javonetHandle.get("NumberOfLines");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetProperty
	 */
            public void setEDIRulesReader (EDIRulesReader value){ try { javonetHandle.set("EDIRulesReader",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public EDIRulesReader getEDIRulesReader (){ try { return new EDIRulesReader((NObject)javonetHandle.get("EDIRulesReader"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setEDIRulesFile (java.lang.String value){ try { javonetHandle.set("EDIRulesFile",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getEDIRulesFile (){ try { return  (java.lang.String) javonetHandle.get("EDIRulesFile");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setEDIRulesFileData (java.lang.String value){ try { javonetHandle.set("EDIRulesFileData",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getEDIRulesFileData (){ try { return  (java.lang.String) javonetHandle.get("EDIRulesFileData");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public LightWeightLoop getDataLoop (){ try { return new LightWeightLoop((NObject)javonetHandle.get("DataLoop"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public Collection<EDIError> getErrors (){ try { return new Collection<EDIError>((NObject)javonetHandle.get("Errors"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public Collection<EDIWarning> getWarnings (){ try { return new Collection<EDIWarning>((NObject)javonetHandle.get("Warnings"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.lang.Integer getErrorCount (){ try { return javonetHandle.get("ErrorCount");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * GetProperty
	 */
            public java.lang.Integer getWarningCount (){ try { return javonetHandle.get("WarningCount");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * GetProperty
	 */
            public java.lang.String getProgressMessages (){ try { return  (java.lang.String) javonetHandle.get("ProgressMessages");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public java.lang.String[] getEDIFileLines (){ try { return Helper.ConvertNObjectToDestinationType((NObject[])javonetHandle.get("EDIFileLines"),java.lang.String[].class);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setDelimiters (Delimiters value){ try { javonetHandle.set("Delimiters",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Delimiters getDelimiters (){ try { return new Delimiters((NObject)javonetHandle.get("Delimiters"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetFiled
	 */
            public List<LightWeightSegment> getValidatedTransactions (){ try { return new List<LightWeightSegment>((NObject)javonetHandle.get("ValidatedTransactions"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setValidatedTransactions (List<LightWeightSegment> param){ try { javonetHandle.set("ValidatedTransactions",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public EDIValidator (IContainer container){  super((NObject) null); try {  javonetHandle = Javonet.New("EDIValidator",container); super.setJavonetHandle(javonetHandle); javonetHandle.addEventListener("OnCodeCondition", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EDIValidator.CodeConditionEvent handler : _OnCodeConditionListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], CodeConditionEventArgs.class));}}});javonetHandle.addEventListener("ProgressChanged", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EDIValidator.GeneralEvent handler : _ProgressChangedListeners) {handler.Invoke(Convert(objects[0], java.lang.Integer.class));}}});javonetHandle.addEventListener("ValidationCompleted", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EDIValidator.ValidationCompletedEvent handler : _ValidationCompletedListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], ValidationEventsArgs.class));}}});javonetHandle.addEventListener("ValidationStarted", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EDIValidator.ValidationStartedEvent handler : _ValidationStartedListeners) {handler.Invoke(Convert(objects[0], NObject.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public EDIValidator (){  super((NObject) null); try {  javonetHandle = Javonet.New("EDIValidator"); super.setJavonetHandle(javonetHandle); javonetHandle.addEventListener("OnCodeCondition", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EDIValidator.CodeConditionEvent handler : _OnCodeConditionListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], CodeConditionEventArgs.class));}}});javonetHandle.addEventListener("ProgressChanged", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EDIValidator.GeneralEvent handler : _ProgressChangedListeners) {handler.Invoke(Convert(objects[0], java.lang.Integer.class));}}});javonetHandle.addEventListener("ValidationCompleted", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EDIValidator.ValidationCompletedEvent handler : _ValidationCompletedListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], ValidationEventsArgs.class));}}});javonetHandle.addEventListener("ValidationStarted", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EDIValidator.ValidationStartedEvent handler : _ValidationStartedListeners) {handler.Invoke(Convert(objects[0], NObject.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public EDIValidator(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void LoadRuleFile (java.lang.String EDIRulesFilePath){ try { javonetHandle.invoke("LoadRuleFile",EDIRulesFilePath);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Validate (EDIDocument document){ try { javonetHandle.invoke("Validate",document);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Validate (EDILightWeightDocument document){ try { javonetHandle.invoke("Validate",document);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Validate (){ try { javonetHandle.invoke("Validate");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Validate (java.lang.String ediFile,java.lang.String ediRuleFile){ try { javonetHandle.invoke("Validate",ediFile,ediRuleFile);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void ResetValidation (){ try { javonetHandle.invoke("ResetValidation");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Event
	 */
            private java.util.ArrayList< EDIValidator.CodeConditionEvent> _OnCodeConditionListeners = new java.util.ArrayList<EDIValidator.CodeConditionEvent>();

            public void addOnCodeCondition(EDIValidator.CodeConditionEvent toAdd)
            {
                _OnCodeConditionListeners.add(toAdd);
            }
            public void removeOnCodeCondition(EDIValidator.CodeConditionEvent toRemove)
            {
                _OnCodeConditionListeners.remove(toRemove);
            }/**
	 * Event
	 */
            private java.util.ArrayList< EDIValidator.GeneralEvent> _ProgressChangedListeners = new java.util.ArrayList<EDIValidator.GeneralEvent>();

            public void addProgressChanged(EDIValidator.GeneralEvent toAdd)
            {
                _ProgressChangedListeners.add(toAdd);
            }
            public void removeProgressChanged(EDIValidator.GeneralEvent toRemove)
            {
                _ProgressChangedListeners.remove(toRemove);
            }/**
	 * Event
	 */
            private java.util.ArrayList< EDIValidator.ValidationCompletedEvent> _ValidationCompletedListeners = new java.util.ArrayList<EDIValidator.ValidationCompletedEvent>();

            public void addValidationCompleted(EDIValidator.ValidationCompletedEvent toAdd)
            {
                _ValidationCompletedListeners.add(toAdd);
            }
            public void removeValidationCompleted(EDIValidator.ValidationCompletedEvent toRemove)
            {
                _ValidationCompletedListeners.remove(toRemove);
            }/**
	 * Event
	 */
            private java.util.ArrayList< EDIValidator.ValidationStartedEvent> _ValidationStartedListeners = new java.util.ArrayList<EDIValidator.ValidationStartedEvent>();

            public void addValidationStarted(EDIValidator.ValidationStartedEvent toAdd)
            {
                _ValidationStartedListeners.add(toAdd);
            }
            public void removeValidationStarted(EDIValidator.ValidationStartedEvent toRemove)
            {
                _ValidationStartedListeners.remove(toRemove);
            }public static class GeneralEvent extends MulticastDelegate {protected NObject javonetHandle; public GeneralEvent (NObject object,java.lang.Integer method){  super((NObject) null); try {  javonetHandle = Javonet.New("GeneralEvent",object,method); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public GeneralEvent(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Invoke (java.lang.Integer progress){ try { javonetHandle.invoke("Invoke",progress);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public IAsyncResult BeginInvoke (java.lang.Integer progress,AsyncCallback callback,NObject object){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("BeginInvoke",progress,callback,object));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void EndInvoke (IAsyncResult result){ try { javonetHandle.invoke("EndInvoke",result);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }}public static class ValidationStartedEvent extends MulticastDelegate {protected NObject javonetHandle; public ValidationStartedEvent (NObject object,java.lang.Integer method){  super((NObject) null); try {  javonetHandle = Javonet.New("ValidationStartedEvent",object,method); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ValidationStartedEvent(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
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
            public void EndInvoke (IAsyncResult result){ try { javonetHandle.invoke("EndInvoke",result);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }}public static class CodeConditionEvent extends MulticastDelegate {protected NObject javonetHandle; public CodeConditionEvent (NObject object,java.lang.Integer method){  super((NObject) null); try {  javonetHandle = Javonet.New("CodeConditionEvent",object,method); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public CodeConditionEvent(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Invoke (NObject sender,CodeConditionEventArgs e){ try { javonetHandle.invoke("Invoke",sender,e);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public IAsyncResult BeginInvoke (NObject sender,CodeConditionEventArgs e,AsyncCallback callback,NObject object){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("BeginInvoke",sender,e,callback,object));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void EndInvoke (IAsyncResult result){ try { javonetHandle.invoke("EndInvoke",result);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }}	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}