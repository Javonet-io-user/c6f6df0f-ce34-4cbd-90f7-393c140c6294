package RDPCrystalEDILibrary;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.ComponentModel.*;
import RDPCrystalEDILibrary.*;
import jio.System.*;
import jio.System.Net.*;public class HTTP extends Component {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setUsername (java.lang.String value){ try { javonetHandle.set("Username",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getUsername (){ try { return  (java.lang.String) javonetHandle.get("Username");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setPassword (java.lang.String value){ try { javonetHandle.set("Password",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getPassword (){ try { return  (java.lang.String) javonetHandle.get("Password");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setHostname (java.lang.String value){ try { javonetHandle.set("Hostname",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getHostname (){ try { return  (java.lang.String) javonetHandle.get("Hostname");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setCommand (java.lang.String value){ try { javonetHandle.set("Command",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getCommand (){ try { return  (java.lang.String) javonetHandle.get("Command");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public HTTP (){  super((NObject) null); try {  javonetHandle = Javonet.New("HTTP"); super.setJavonetHandle(javonetHandle); javonetHandle.addEventListener("FileUploadCompleted", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (HTTP.UploadFileCompletedDelegate handler : _FileUploadCompletedListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], UploadFileCompletedEventArgs.class));}}});javonetHandle.addEventListener("DownloadFileCompleted", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (HTTP.DownloadFileCompletedDelegate handler : _DownloadFileCompletedListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], AsyncCompletedEventArgs.class));}}});javonetHandle.addEventListener("DownloadFileProgressChanged", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (HTTP.DownloadFileProgressChangedDelegate handler : _DownloadFileProgressChangedListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], DownloadProgressChangedEventArgs.class));}}});javonetHandle.addEventListener("FileUploadProgressChanged", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (HTTP.UploadFileProgressChangedDelegate handler : _FileUploadProgressChangedListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], UploadProgressChangedEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public HTTP (IContainer container){  super((NObject) null); try {  javonetHandle = Javonet.New("HTTP",container); super.setJavonetHandle(javonetHandle); javonetHandle.addEventListener("FileUploadCompleted", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (HTTP.UploadFileCompletedDelegate handler : _FileUploadCompletedListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], UploadFileCompletedEventArgs.class));}}});javonetHandle.addEventListener("DownloadFileCompleted", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (HTTP.DownloadFileCompletedDelegate handler : _DownloadFileCompletedListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], AsyncCompletedEventArgs.class));}}});javonetHandle.addEventListener("DownloadFileProgressChanged", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (HTTP.DownloadFileProgressChangedDelegate handler : _DownloadFileProgressChangedListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], DownloadProgressChangedEventArgs.class));}}});javonetHandle.addEventListener("FileUploadProgressChanged", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (HTTP.UploadFileProgressChangedDelegate handler : _FileUploadProgressChangedListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], UploadProgressChangedEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public HTTP(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void UploadFile (java.lang.String path){ try { javonetHandle.invoke("UploadFile",path);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void UploadFileAsync (java.lang.String path){ try { javonetHandle.invoke("UploadFileAsync",path);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void DownloadFile (java.lang.String downloadedFilePath){ try { javonetHandle.invoke("DownloadFile",downloadedFilePath);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void DownloadFileAsync (java.lang.String downloadedFilePath){ try { javonetHandle.invoke("DownloadFileAsync",downloadedFilePath);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Event
	 */
            private java.util.ArrayList< HTTP.UploadFileCompletedDelegate> _FileUploadCompletedListeners = new java.util.ArrayList<HTTP.UploadFileCompletedDelegate>();

            public void addFileUploadCompleted(HTTP.UploadFileCompletedDelegate toAdd)
            {
                _FileUploadCompletedListeners.add(toAdd);
            }
            public void removeFileUploadCompleted(HTTP.UploadFileCompletedDelegate toRemove)
            {
                _FileUploadCompletedListeners.remove(toRemove);
            }/**
	 * Event
	 */
            private java.util.ArrayList< HTTP.DownloadFileCompletedDelegate> _DownloadFileCompletedListeners = new java.util.ArrayList<HTTP.DownloadFileCompletedDelegate>();

            public void addDownloadFileCompleted(HTTP.DownloadFileCompletedDelegate toAdd)
            {
                _DownloadFileCompletedListeners.add(toAdd);
            }
            public void removeDownloadFileCompleted(HTTP.DownloadFileCompletedDelegate toRemove)
            {
                _DownloadFileCompletedListeners.remove(toRemove);
            }/**
	 * Event
	 */
            private java.util.ArrayList< HTTP.DownloadFileProgressChangedDelegate> _DownloadFileProgressChangedListeners = new java.util.ArrayList<HTTP.DownloadFileProgressChangedDelegate>();

            public void addDownloadFileProgressChanged(HTTP.DownloadFileProgressChangedDelegate toAdd)
            {
                _DownloadFileProgressChangedListeners.add(toAdd);
            }
            public void removeDownloadFileProgressChanged(HTTP.DownloadFileProgressChangedDelegate toRemove)
            {
                _DownloadFileProgressChangedListeners.remove(toRemove);
            }/**
	 * Event
	 */
            private java.util.ArrayList< HTTP.UploadFileProgressChangedDelegate> _FileUploadProgressChangedListeners = new java.util.ArrayList<HTTP.UploadFileProgressChangedDelegate>();

            public void addFileUploadProgressChanged(HTTP.UploadFileProgressChangedDelegate toAdd)
            {
                _FileUploadProgressChangedListeners.add(toAdd);
            }
            public void removeFileUploadProgressChanged(HTTP.UploadFileProgressChangedDelegate toRemove)
            {
                _FileUploadProgressChangedListeners.remove(toRemove);
            }public static class UploadFileCompletedDelegate extends MulticastDelegate {protected NObject javonetHandle; public UploadFileCompletedDelegate (NObject object,java.lang.Integer method){  super((NObject) null); try {  javonetHandle = Javonet.New("UploadFileCompletedDelegate",object,method); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public UploadFileCompletedDelegate(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Invoke (NObject sender,UploadFileCompletedEventArgs e){ try { javonetHandle.invoke("Invoke",sender,e);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public IAsyncResult BeginInvoke (NObject sender,UploadFileCompletedEventArgs e,AsyncCallback callback,NObject object){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("BeginInvoke",sender,e,callback,object));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void EndInvoke (IAsyncResult result){ try { javonetHandle.invoke("EndInvoke",result);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }}public static class UploadFileProgressChangedDelegate extends MulticastDelegate {protected NObject javonetHandle; public UploadFileProgressChangedDelegate (NObject object,java.lang.Integer method){  super((NObject) null); try {  javonetHandle = Javonet.New("UploadFileProgressChangedDelegate",object,method); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public UploadFileProgressChangedDelegate(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Invoke (NObject sender,UploadProgressChangedEventArgs e){ try { javonetHandle.invoke("Invoke",sender,e);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public IAsyncResult BeginInvoke (NObject sender,UploadProgressChangedEventArgs e,AsyncCallback callback,NObject object){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("BeginInvoke",sender,e,callback,object));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void EndInvoke (IAsyncResult result){ try { javonetHandle.invoke("EndInvoke",result);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }}public static class DownloadFileCompletedDelegate extends MulticastDelegate {protected NObject javonetHandle; public DownloadFileCompletedDelegate (NObject object,java.lang.Integer method){  super((NObject) null); try {  javonetHandle = Javonet.New("DownloadFileCompletedDelegate",object,method); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DownloadFileCompletedDelegate(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Invoke (NObject sender,AsyncCompletedEventArgs e){ try { javonetHandle.invoke("Invoke",sender,e);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public IAsyncResult BeginInvoke (NObject sender,AsyncCompletedEventArgs e,AsyncCallback callback,NObject object){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("BeginInvoke",sender,e,callback,object));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void EndInvoke (IAsyncResult result){ try { javonetHandle.invoke("EndInvoke",result);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }}public static class DownloadFileProgressChangedDelegate extends MulticastDelegate {protected NObject javonetHandle; public DownloadFileProgressChangedDelegate (NObject object,java.lang.Integer method){  super((NObject) null); try {  javonetHandle = Javonet.New("DownloadFileProgressChangedDelegate",object,method); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DownloadFileProgressChangedDelegate(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Invoke (NObject sender,DownloadProgressChangedEventArgs e){ try { javonetHandle.invoke("Invoke",sender,e);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public IAsyncResult BeginInvoke (NObject sender,DownloadProgressChangedEventArgs e,AsyncCallback callback,NObject object){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("BeginInvoke",sender,e,callback,object));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void EndInvoke (IAsyncResult result){ try { javonetHandle.invoke("EndInvoke",result);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }}	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}