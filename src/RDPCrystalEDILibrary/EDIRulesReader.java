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
import jio.System.IO.*;
import jio.System.*;public class EDIRulesReader extends Component {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setLoadDescriptions (java.lang.Boolean value){ try { javonetHandle.set("LoadDescriptions",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getLoadDescriptions (){ try { return javonetHandle.get("LoadDescriptions");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setSampleData (List<java.lang.String> value){ try { javonetHandle.set("SampleData",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public List<java.lang.String> getSampleData (){ try { return new List<java.lang.String>((NObject)javonetHandle.get("SampleData"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.lang.Boolean getParsed (){ try { return javonetHandle.get("Parsed");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * GetProperty
	 */
            public java.lang.Integer getNumberOfLoopsCreated (){ try { return javonetHandle.get("NumberOfLoopsCreated");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * GetProperty
	 */
            public List<ElementCounterDisplay> getElementCounterDisplays (){ try { return new List<ElementCounterDisplay>((NObject)javonetHandle.get("ElementCounterDisplays"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public List<SummaryDisplay> getSummaries (){ try { return new List<SummaryDisplay>((NObject)javonetHandle.get("Summaries"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public List<ElementEqualityDisplay> getElementEqualities (){ try { return new List<ElementEqualityDisplay>((NObject)javonetHandle.get("ElementEqualities"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public List<RuleDisplay> getRules (){ try { return new List<RuleDisplay>((NObject)javonetHandle.get("Rules"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public SortedDictionary<java.lang.Integer,Element> getElements (){ try { return new SortedDictionary<java.lang.Integer,Element>((NObject)javonetHandle.get("Elements"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public SortedDictionary<java.lang.String,Segment> getSegments (){ try { return new SortedDictionary<java.lang.String,Segment>((NObject)javonetHandle.get("Segments"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setRuleFileData (Dictionary<java.lang.String,java.lang.String> value){ try { javonetHandle.set("RuleFileData",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Dictionary<java.lang.String,java.lang.String> getRuleFileData (){ try { return new Dictionary<java.lang.String,java.lang.String>((NObject)javonetHandle.get("RuleFileData"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public SortedDictionary<java.lang.String,Segment> getCompositesSegments (){ try { return new SortedDictionary<java.lang.String,Segment>((NObject)javonetHandle.get("CompositesSegments"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public Dictionary<java.lang.String,ElementCodeList> getElementCodes (){ try { return new Dictionary<java.lang.String,ElementCodeList>((NObject)javonetHandle.get("ElementCodes"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public Dictionary<java.lang.Integer,SegmentSchema> getSegmentSchemas (){ try { return new Dictionary<java.lang.Integer,SegmentSchema>((NObject)javonetHandle.get("SegmentSchemas"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public Dictionary<java.lang.String,java.lang.String> getFileData (){ try { return new Dictionary<java.lang.String,java.lang.String>((NObject)javonetHandle.get("FileData"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public Dictionary<java.lang.String,CodeList> getCodeLists (){ try { return new Dictionary<java.lang.String,CodeList>((NObject)javonetHandle.get("CodeLists"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public Dictionary<java.lang.String,java.lang.String> getElementFormats (){ try { return new Dictionary<java.lang.String,java.lang.String>((NObject)javonetHandle.get("ElementFormats"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public Loop getSchema (){ try { return new Loop((NObject)javonetHandle.get("Schema"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setEDIRulesFilePath (java.lang.String value){ try { javonetHandle.set("EDIRulesFilePath",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getEDIRulesFilePath (){ try { return  (java.lang.String) javonetHandle.get("EDIRulesFilePath");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setEDIRulesFile (Stream value){ try { javonetHandle.set("EDIRulesFile",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Stream getEDIRulesFile (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.get("EDIRulesFile"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setEDIRulesFileData (java.lang.String value){ try { javonetHandle.set("EDIRulesFileData",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getEDIRulesFileData (){ try { return  (java.lang.String) javonetHandle.get("EDIRulesFileData");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public EDIRulesReader (IContainer container){  super((NObject) null); try {  javonetHandle = Javonet.New("EDIRulesReader",container); super.setJavonetHandle(javonetHandle); javonetHandle.addEventListener("ProgressChanged", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EDIRulesReader.GeneralEvent handler : _ProgressChangedListeners) {handler.Invoke(Convert(objects[0], java.lang.Integer.class));}}});javonetHandle.addEventListener("OnErrorOccurred", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EDIRulesReader.ErrorEvent handler : _OnErrorOccurredListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], EDIRulesReaderEventArg.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public EDIRulesReader (){  super((NObject) null); try {  javonetHandle = Javonet.New("EDIRulesReader"); super.setJavonetHandle(javonetHandle); javonetHandle.addEventListener("ProgressChanged", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EDIRulesReader.GeneralEvent handler : _ProgressChangedListeners) {handler.Invoke(Convert(objects[0], java.lang.Integer.class));}}});javonetHandle.addEventListener("OnErrorOccurred", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EDIRulesReader.ErrorEvent handler : _OnErrorOccurredListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], EDIRulesReaderEventArg.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public EDIRulesReader (java.lang.String ediRuleFilePath){  super((NObject) null); try {  javonetHandle = Javonet.New("EDIRulesReader",ediRuleFilePath); super.setJavonetHandle(javonetHandle); javonetHandle.addEventListener("ProgressChanged", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EDIRulesReader.GeneralEvent handler : _ProgressChangedListeners) {handler.Invoke(Convert(objects[0], java.lang.Integer.class));}}});javonetHandle.addEventListener("OnErrorOccurred", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EDIRulesReader.ErrorEvent handler : _OnErrorOccurredListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], EDIRulesReaderEventArg.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public EDIRulesReader(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Reset (){ try { javonetHandle.invoke("Reset");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Parse (java.lang.String rulesFilePath){ try { javonetHandle.invoke("Parse",rulesFilePath);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Parse (){ try { javonetHandle.invoke("Parse");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Event
	 */
            private java.util.ArrayList< EDIRulesReader.GeneralEvent> _ProgressChangedListeners = new java.util.ArrayList<EDIRulesReader.GeneralEvent>();

            public void addProgressChanged(EDIRulesReader.GeneralEvent toAdd)
            {
                _ProgressChangedListeners.add(toAdd);
            }
            public void removeProgressChanged(EDIRulesReader.GeneralEvent toRemove)
            {
                _ProgressChangedListeners.remove(toRemove);
            }/**
	 * Event
	 */
            private java.util.ArrayList< EDIRulesReader.ErrorEvent> _OnErrorOccurredListeners = new java.util.ArrayList<EDIRulesReader.ErrorEvent>();

            public void addOnErrorOccurred(EDIRulesReader.ErrorEvent toAdd)
            {
                _OnErrorOccurredListeners.add(toAdd);
            }
            public void removeOnErrorOccurred(EDIRulesReader.ErrorEvent toRemove)
            {
                _OnErrorOccurredListeners.remove(toRemove);
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
            public void EndInvoke (IAsyncResult result){ try { javonetHandle.invoke("EndInvoke",result);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }}public static class ErrorEvent extends MulticastDelegate {protected NObject javonetHandle; public ErrorEvent (NObject object,java.lang.Integer method){  super((NObject) null); try {  javonetHandle = Javonet.New("ErrorEvent",object,method); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ErrorEvent(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Invoke (NObject sender,EDIRulesReaderEventArg e){ try { javonetHandle.invoke("Invoke",sender,e);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public IAsyncResult BeginInvoke (NObject sender,EDIRulesReaderEventArg e,AsyncCallback callback,NObject object){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("BeginInvoke",sender,e,callback,object));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void EndInvoke (IAsyncResult result){ try { javonetHandle.invoke("EndInvoke",result);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }}	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}