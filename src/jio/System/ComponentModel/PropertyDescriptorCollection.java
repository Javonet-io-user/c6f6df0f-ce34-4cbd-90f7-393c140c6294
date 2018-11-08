package jio.System.ComponentModel;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.ComponentModel.*;public class PropertyDescriptorCollection {public NObject javonetHandle; public PropertyDescriptorCollection (PropertyDescriptor[] properties){ try {  javonetHandle = Javonet.New("PropertyDescriptorCollection",new Object[] {properties});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public PropertyDescriptorCollection (PropertyDescriptor[] properties,java.lang.Boolean readOnly){ try {  javonetHandle = Javonet.New("PropertyDescriptorCollection",new Object[] {properties},readOnly);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public PropertyDescriptorCollection(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}