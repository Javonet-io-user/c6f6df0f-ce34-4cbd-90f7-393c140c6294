package RDPCrystalEDILibrary.Rules;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import RDPCrystalEDILibrary.Rules.*;
import jio.System.*;public class TokenDefinition {protected NObject javonetHandle; /**
	 * GetFiled
	 */
            public RegexMatcher getMatcher (){ try { return new RegexMatcher((NObject)javonetHandle.get("Matcher"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setMatcher (RegexMatcher param){ try { javonetHandle.set("Matcher",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public NObject getToken (){ try { return  (NObject) javonetHandle.get("Token");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setToken (NObject param){ try { javonetHandle.set("Token",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public TokenDefinition (java.lang.String regex,NObject token){ try {  javonetHandle = Javonet.New("TokenDefinition",regex,token);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public TokenDefinition(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}