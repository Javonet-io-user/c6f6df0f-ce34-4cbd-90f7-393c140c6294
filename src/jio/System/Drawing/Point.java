package jio.System.Drawing;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.Drawing.*;public class Point {public NObject javonetHandle; public Point (java.lang.Integer x,java.lang.Integer y){ try {  javonetHandle = Javonet.New("Point",x,y);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Point (Size sz){ try {  javonetHandle = Javonet.New("Point",sz);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Point (java.lang.Integer dw){ try {  javonetHandle = Javonet.New("Point",dw);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Point(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}