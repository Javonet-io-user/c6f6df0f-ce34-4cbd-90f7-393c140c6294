package jio.System.IO;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.IO.*;
import jio.System.Security.AccessControl.*;
import jio.System.*;
import Microsoft.Win32.SafeHandles.*;public class FileStream {public NObject javonetHandle; public FileStream (java.lang.String path,FileMode mode){ try {  javonetHandle = Javonet.New("FileStream",path,NEnum.fromJavaEnum(mode));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public FileStream (java.lang.String path,FileMode mode,FileAccess access){ try {  javonetHandle = Javonet.New("FileStream",path,NEnum.fromJavaEnum(mode),NEnum.fromJavaEnum(access));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public FileStream (java.lang.String path,FileMode mode,FileAccess access,FileShare share){ try {  javonetHandle = Javonet.New("FileStream",path,NEnum.fromJavaEnum(mode),NEnum.fromJavaEnum(access),NEnum.fromJavaEnum(share));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public FileStream (java.lang.String path,FileMode mode,FileAccess access,FileShare share,java.lang.Integer bufferSize){ try {  javonetHandle = Javonet.New("FileStream",path,NEnum.fromJavaEnum(mode),NEnum.fromJavaEnum(access),NEnum.fromJavaEnum(share),bufferSize);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public FileStream (java.lang.String path,FileMode mode,FileAccess access,FileShare share,java.lang.Integer bufferSize,FileOptions options){ try {  javonetHandle = Javonet.New("FileStream",path,NEnum.fromJavaEnum(mode),NEnum.fromJavaEnum(access),NEnum.fromJavaEnum(share),bufferSize,NEnum.fromJavaEnum(options));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public FileStream (java.lang.String path,FileMode mode,FileAccess access,FileShare share,java.lang.Integer bufferSize,java.lang.Boolean useAsync){ try {  javonetHandle = Javonet.New("FileStream",path,NEnum.fromJavaEnum(mode),NEnum.fromJavaEnum(access),NEnum.fromJavaEnum(share),bufferSize,useAsync);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public FileStream (java.lang.String path,FileMode mode,FileSystemRights rights,FileShare share,java.lang.Integer bufferSize,FileOptions options,FileSecurity fileSecurity){ try {  javonetHandle = Javonet.New("FileStream",path,NEnum.fromJavaEnum(mode),NEnum.fromJavaEnum(rights),NEnum.fromJavaEnum(share),bufferSize,NEnum.fromJavaEnum(options),fileSecurity);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public FileStream (java.lang.String path,FileMode mode,FileSystemRights rights,FileShare share,java.lang.Integer bufferSize,FileOptions options){ try {  javonetHandle = Javonet.New("FileStream",path,NEnum.fromJavaEnum(mode),NEnum.fromJavaEnum(rights),NEnum.fromJavaEnum(share),bufferSize,NEnum.fromJavaEnum(options));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public FileStream (java.lang.Integer handle,FileAccess access){ try {  javonetHandle = Javonet.New("FileStream",handle,NEnum.fromJavaEnum(access));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public FileStream (java.lang.Integer handle,FileAccess access,java.lang.Boolean ownsHandle){ try {  javonetHandle = Javonet.New("FileStream",handle,NEnum.fromJavaEnum(access),ownsHandle);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public FileStream (java.lang.Integer handle,FileAccess access,java.lang.Boolean ownsHandle,java.lang.Integer bufferSize){ try {  javonetHandle = Javonet.New("FileStream",handle,NEnum.fromJavaEnum(access),ownsHandle,bufferSize);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public FileStream (java.lang.Integer handle,FileAccess access,java.lang.Boolean ownsHandle,java.lang.Integer bufferSize,java.lang.Boolean isAsync){ try {  javonetHandle = Javonet.New("FileStream",handle,NEnum.fromJavaEnum(access),ownsHandle,bufferSize,isAsync);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public FileStream (SafeFileHandle handle,FileAccess access){ try {  javonetHandle = Javonet.New("FileStream",handle,NEnum.fromJavaEnum(access));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public FileStream (SafeFileHandle handle,FileAccess access,java.lang.Integer bufferSize){ try {  javonetHandle = Javonet.New("FileStream",handle,NEnum.fromJavaEnum(access),bufferSize);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public FileStream (SafeFileHandle handle,FileAccess access,java.lang.Integer bufferSize,java.lang.Boolean isAsync){ try {  javonetHandle = Javonet.New("FileStream",handle,NEnum.fromJavaEnum(access),bufferSize,isAsync);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public FileStream(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}