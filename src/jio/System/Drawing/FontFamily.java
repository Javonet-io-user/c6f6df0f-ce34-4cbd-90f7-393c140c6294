package jio.System.Drawing;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.Drawing.*;
import jio.System.Drawing.Text.*;public class FontFamily {public NObject javonetHandle; public FontFamily (java.lang.String name){ try {  javonetHandle = Javonet.New("FontFamily",name);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public FontFamily (java.lang.String name,FontCollection fontCollection){ try {  javonetHandle = Javonet.New("FontFamily",name,fontCollection);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public FontFamily (GenericFontFamilies genericFamily){ try {  javonetHandle = Javonet.New("FontFamily",NEnum.fromJavaEnum(genericFamily));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public FontFamily(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}