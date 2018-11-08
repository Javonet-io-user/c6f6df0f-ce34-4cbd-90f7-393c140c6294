package jio.System.Security;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.Security.*;public class SecureString {public NObject javonetHandle; public SecureString (){ try {  javonetHandle = Javonet.New("SecureString");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SecureString (java.lang.Character value,java.lang.Integer length){ try {  javonetHandle = Javonet.New("SecureString",value,length);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SecureString(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}