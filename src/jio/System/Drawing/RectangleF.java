package jio.System.Drawing;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.Drawing.*;public class RectangleF {public NObject javonetHandle; public RectangleF (java.lang.Float x,java.lang.Float y,java.lang.Float width,java.lang.Float height){ try {  javonetHandle = Javonet.New("RectangleF",x,y,width,height);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public RectangleF (PointF location,SizeF size){ try {  javonetHandle = Javonet.New("RectangleF",location,size);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public RectangleF(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}