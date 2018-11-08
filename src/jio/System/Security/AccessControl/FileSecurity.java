package jio.System.Security.AccessControl;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.Security.AccessControl.*;public class FileSecurity {public NObject javonetHandle; public FileSecurity (){ try {  javonetHandle = Javonet.New("FileSecurity");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public FileSecurity (java.lang.String fileName,AccessControlSections includeSections){ try {  javonetHandle = Javonet.New("FileSecurity",fileName,NEnum.fromJavaEnum(includeSections));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public FileSecurity(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}