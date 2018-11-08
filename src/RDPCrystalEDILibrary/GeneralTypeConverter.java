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
import jio.System.Globalization.*;public class GeneralTypeConverter extends TypeConverter {protected NObject javonetHandle; public GeneralTypeConverter (){  super((NObject) null); try {  javonetHandle = Javonet.New("GeneralTypeConverter"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public GeneralTypeConverter(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public java.lang.Boolean CanConvertTo (ITypeDescriptorContext context,Class destinationType){ try { return javonetHandle.invoke("CanConvertTo",context,Javonet.getType(getReturnObjectName(destinationType).getTypeName()));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public NObject ConvertTo (ITypeDescriptorContext context,CultureInfo culture,NObject value,Class destinationType){ try { return  (NObject) javonetHandle.invoke("ConvertTo",context,culture,value,Javonet.getType(getReturnObjectName(destinationType).getTypeName()));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public PropertyDescriptorCollection GetProperties (ITypeDescriptorContext context,NObject value,Attribute[] attributes){ try { return new PropertyDescriptorCollection((NObject)javonetHandle.invoke("GetProperties",context,value,new Object[] {attributes}));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public java.lang.Boolean GetPropertiesSupported (ITypeDescriptorContext context){ try { return javonetHandle.invoke("GetPropertiesSupported",context);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}