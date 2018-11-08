package RDPCrystalEDILibrary;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import RDPCrystalEDILibrary.*;
import jio.System.Collections.ObjectModel.*;
import jio.System.Collections.Generic.*;
import jio.System.*;public class DataElement extends LightWeightElement {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setFormatCollection (Collection<ElementFormat> value){ try { javonetHandle.set("FormatCollection",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Collection<ElementFormat> getFormatCollection (){ try { return new Collection<ElementFormat>((NObject)javonetHandle.get("FormatCollection"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setCodeList (CodeList value){ try { javonetHandle.set("CodeList",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public CodeList getCodeList (){ try { return new CodeList((NObject)javonetHandle.get("CodeList"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setAcceptedValues (HashSet<java.lang.String> value){ try { javonetHandle.set("AcceptedValues",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public HashSet<java.lang.String> getAcceptedValues (){ try { return new HashSet<java.lang.String>((NObject)javonetHandle.get("AcceptedValues"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setCodes (Dictionary<java.lang.String,java.lang.String> value){ try { javonetHandle.set("Codes",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Dictionary<java.lang.String,java.lang.String> getCodes (){ try { return new Dictionary<java.lang.String,java.lang.String>((NObject)javonetHandle.get("Codes"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setUniqueValueOnRepetition (java.lang.Boolean value){ try { javonetHandle.set("UniqueValueOnRepetition",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getUniqueValueOnRepetition (){ try { return javonetHandle.get("UniqueValueOnRepetition");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setPaddingCharacter (java.lang.Character value){ try { javonetHandle.set("PaddingCharacter",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Character getPaddingCharacter (){ try { return javonetHandle.get("PaddingCharacter");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setDataType (ElementDataType value){ try { javonetHandle.set("DataType",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public ElementDataType getDataType (){ try { return ElementDataType.valueOf(((NEnum) javonetHandle.get("DataType")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setDescription (java.lang.String value){ try { javonetHandle.set("Description",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getDescription (){ try { return  (java.lang.String) javonetHandle.get("Description");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setTag (NObject value){ try { javonetHandle.set("Tag",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public NObject getTag (){ try { return  (NObject) javonetHandle.get("Tag");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setUsage (Usage value){ try { javonetHandle.set("Usage",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Usage getUsage (){ try { return Usage.valueOf(((NEnum) javonetHandle.get("Usage")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setget_DataElementDataElementElements (DataElements value){ try { javonetHandle.set("get_DataElementDataElementElements",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public DataElements getDataElementDataElementElements (){ try { return new DataElements((NObject)javonetHandle.get("DataElementDataElementElements"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setMinimumLength (java.lang.Integer value){ try { javonetHandle.set("MinimumLength",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Integer getMinimumLength (){ try { return javonetHandle.get("MinimumLength");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetProperty
	 */
            public void setMaximumLength (java.lang.Integer value){ try { javonetHandle.set("MaximumLength",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Integer getMaximumLength (){ try { return javonetHandle.get("MaximumLength");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetProperty
	 */
            public void setName (java.lang.String value){ try { javonetHandle.set("Name",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getName (){ try { return  (java.lang.String) javonetHandle.get("Name");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setCodeListName (java.lang.String value){ try { javonetHandle.set("CodeListName",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getCodeListName (){ try { return  (java.lang.String) javonetHandle.get("CodeListName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public DataElement (){  super((NObject) null); try {  javonetHandle = Javonet.New("DataElement"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DataElement (java.lang.String dataValue,java.lang.String description){  super((NObject) null); try {  javonetHandle = Javonet.New("DataElement",dataValue,description); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DataElement (java.lang.String dataValue,java.lang.Integer elementNumber){  super((NObject) null); try {  javonetHandle = Javonet.New("DataElement",dataValue,elementNumber); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DataElement (java.lang.Integer elementNumber,java.lang.Integer min,java.lang.Integer max){  super((NObject) null); try {  javonetHandle = Javonet.New("DataElement",elementNumber,min,max); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DataElement (java.lang.String name,java.lang.String dataValue,java.lang.Integer min,java.lang.Integer max){  super((NObject) null); try {  javonetHandle = Javonet.New("DataElement",name,dataValue,min,max); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DataElement (java.lang.String dataValue,java.lang.Integer min,java.lang.Integer max){  super((NObject) null); try {  javonetHandle = Javonet.New("DataElement",dataValue,min,max); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DataElement (java.lang.String elementName,java.lang.Integer elementNumber,Usage usage,java.lang.Boolean uniqueValueOnRepetition,java.lang.String[] acceptedValues){  super((NObject) null); try {  javonetHandle = Javonet.New("DataElement",elementName,elementNumber,NEnum.fromJavaEnum(usage),uniqueValueOnRepetition,new Object[] {acceptedValues}); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DataElement (java.lang.String elementName,java.lang.Integer elementNumber,Usage usage,java.lang.String[] acceptedValues){  super((NObject) null); try {  javonetHandle = Javonet.New("DataElement",elementName,elementNumber,NEnum.fromJavaEnum(usage),new Object[] {acceptedValues}); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DataElement (java.lang.String dataValue,java.lang.Integer elementNumber,java.lang.String description){  super((NObject) null); try {  javonetHandle = Javonet.New("DataElement",dataValue,elementNumber,description); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DataElement (java.lang.String dataValue,java.lang.Integer elementNumber,java.lang.String description,java.lang.Integer minLength,java.lang.Integer maxLength){  super((NObject) null); try {  javonetHandle = Javonet.New("DataElement",dataValue,elementNumber,description,minLength,maxLength); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DataElement (java.lang.String dataValue){  super((NObject) null); try {  javonetHandle = Javonet.New("DataElement",dataValue); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DataElement (java.lang.String name,ElementDataType dataType){  super((NObject) null); try {  javonetHandle = Javonet.New("DataElement",name,NEnum.fromJavaEnum(dataType)); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DataElement (java.lang.Boolean composite){  super((NObject) null); try {  javonetHandle = Javonet.New("DataElement",composite); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DataElement (java.lang.String name,ElementDataType dataType,java.lang.String dataValue){  super((NObject) null); try {  javonetHandle = Javonet.New("DataElement",name,NEnum.fromJavaEnum(dataType),dataValue); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DataElement(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public DataElement Clone (){ try { return new DataElement((NObject)javonetHandle.invoke("Clone"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public java.lang.Boolean InAcceptedValues (java.lang.String value){ try { return javonetHandle.invoke("InAcceptedValues",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.Boolean HasAcceptedValues (){ try { return javonetHandle.invoke("HasAcceptedValues");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.String GetAcceptedValues (){ try { return  (java.lang.String) javonetHandle.invoke("GetAcceptedValues");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}