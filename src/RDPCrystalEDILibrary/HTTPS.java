package RDPCrystalEDILibrary;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.ComponentModel.*;
import RDPCrystalEDILibrary.*;
import jio.System.Net.*;
import jio.System.*;public class HTTPS extends Component {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setX509CertificateFile (java.lang.String value){ try { javonetHandle.set("X509CertificateFile",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getX509CertificateFile (){ try { return  (java.lang.String) javonetHandle.get("X509CertificateFile");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setHeaders (WebHeaderCollection value){ try { javonetHandle.set("Headers",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public WebHeaderCollection getHeaders (){ try { return new WebHeaderCollection((NObject)javonetHandle.get("Headers"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
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
            public void setContentType (java.lang.String value){ try { javonetHandle.set("ContentType",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getContentType (){ try { return  (java.lang.String) javonetHandle.get("ContentType");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public HTTPS (){  super((NObject) null); try {  javonetHandle = Javonet.New("HTTPS"); super.setJavonetHandle(javonetHandle); javonetHandle.addEventListener("CertificateValidation", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (HTTPS.CertificateValidationDelegate handler : _CertificateValidationListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], CertificationEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public HTTPS (IContainer container){  super((NObject) null); try {  javonetHandle = Javonet.New("HTTPS",container); super.setJavonetHandle(javonetHandle); javonetHandle.addEventListener("CertificateValidation", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (HTTPS.CertificateValidationDelegate handler : _CertificateValidationListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], CertificationEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public HTTPS(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void UploadFile (java.lang.String path){ try { javonetHandle.invoke("UploadFile",path);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void DownloadFile (java.lang.String downloadedFilePath){ try { javonetHandle.invoke("DownloadFile",downloadedFilePath);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Event
	 */
            private java.util.ArrayList< HTTPS.CertificateValidationDelegate> _CertificateValidationListeners = new java.util.ArrayList<HTTPS.CertificateValidationDelegate>();

            public void addCertificateValidation(HTTPS.CertificateValidationDelegate toAdd)
            {
                _CertificateValidationListeners.add(toAdd);
            }
            public void removeCertificateValidation(HTTPS.CertificateValidationDelegate toRemove)
            {
                _CertificateValidationListeners.remove(toRemove);
            }public static class CertificateValidationDelegate extends MulticastDelegate {protected NObject javonetHandle; public CertificateValidationDelegate (NObject object,java.lang.Integer method){  super((NObject) null); try {  javonetHandle = Javonet.New("CertificateValidationDelegate",object,method); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public CertificateValidationDelegate(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Invoke (NObject sender,CertificationEventArgs e){ try { javonetHandle.invoke("Invoke",sender,e);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public IAsyncResult BeginInvoke (NObject sender,CertificationEventArgs e,AsyncCallback callback,NObject object){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("BeginInvoke",sender,e,callback,object));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void EndInvoke (IAsyncResult result){ try { javonetHandle.invoke("EndInvoke",result);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }}	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}