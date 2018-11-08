package jio.System.Windows.Forms;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.Windows.Forms.*;public class TreeNode {public NObject javonetHandle; public TreeNode (){ try {  javonetHandle = Javonet.New("TreeNode");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public TreeNode (java.lang.String text){ try {  javonetHandle = Javonet.New("TreeNode",text);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public TreeNode (java.lang.String text,TreeNode[] children){ try {  javonetHandle = Javonet.New("TreeNode",text,new Object[] {children});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public TreeNode (java.lang.String text,java.lang.Integer imageIndex,java.lang.Integer selectedImageIndex){ try {  javonetHandle = Javonet.New("TreeNode",text,imageIndex,selectedImageIndex);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public TreeNode (java.lang.String text,java.lang.Integer imageIndex,java.lang.Integer selectedImageIndex,TreeNode[] children){ try {  javonetHandle = Javonet.New("TreeNode",text,imageIndex,selectedImageIndex,new Object[] {children});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public TreeNode(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}