package Microsoft.Win32.SafeHandles;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Microsoft.Win32.SafeHandles.*;
import jio.System.*;public class SafeFileHandle {public NObject javonetHandle; public SafeFileHandle (java.lang.Integer preexistingHandle,java.lang.Boolean ownsHandle){ try {  javonetHandle = Javonet.New("SafeFileHandle",preexistingHandle,ownsHandle);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SafeFileHandle(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}