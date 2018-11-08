package jio.System.Collections.Generic;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.Collections.Generic.*;
import jio.System.Collections.*;
import jio.System.*;
import jio.System.Collections.ObjectModel.*;public class List<T> implements jio.System.Collections.IEnumerable,jio.System.Collections.IList,ICollection {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setCapacity (java.lang.Integer value){ try { javonetHandle.set("Capacity",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Integer getCapacity (){ try { return javonetHandle.get("Capacity");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * GetProperty
	 */
            public java.lang.Integer getCount (){ try { return javonetHandle.get("Count");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetProperty
	 */
            public void set_Item (java.lang.Integer index,T value){ try { javonetHandle.generic(getGetObjectName(value)).invoke("set_Item",index,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public T get_Item (java.lang.Integer index, Class<?> returnType){ try { return (T)Convert(javonetHandle.generic(getReturnObjectName(returnType)).invoke("get_Item",index), returnType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public List (){ try {  javonetHandle = Javonet.New("List");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public List (java.lang.Integer capacity){ try {  javonetHandle = Javonet.New("List",capacity);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public List (jio.System.Collections.Generic.IEnumerable<T> collection){ try {  javonetHandle = Javonet.New("List",collection);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public List(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Add (T item){ try { javonetHandle.generic(getGetObjectName(item)).invoke("Add",item);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void AddRange (jio.System.Collections.Generic.IEnumerable<T> collection){ try { javonetHandle.invoke("AddRange",collection);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Integer BinarySearch (java.lang.Integer index,java.lang.Integer count,T item,IComparer<T> comparer){ try { return javonetHandle.generic(getGetObjectName(item)).invoke("BinarySearch",index,count,item,comparer);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public void Clear (){ try { javonetHandle.invoke("Clear");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Boolean Contains (T item){ try { return javonetHandle.generic(getGetObjectName(item)).invoke("Contains",item);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public <T,TOutput> List<TOutput> ConvertAll (Converter<T,TOutput> converter){ try { return new List<TOutput>((NObject)javonetHandle.invoke("ConvertAll",converter));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void CopyTo (java.lang.Integer index,T[] array,java.lang.Integer arrayIndex,java.lang.Integer count){ try { javonetHandle.generic(getGetObjectName(array)).invoke("CopyTo",index,new Object[] {array},arrayIndex,count);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void ForEach (Action<T> action){ try { javonetHandle.invoke("ForEach",action);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public Enumerator<T> GetEnumerator (){ try { return javonetHandle.invoke("GetEnumerator");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public java.lang.Integer IndexOf (T item){ try { return javonetHandle.generic(getGetObjectName(item)).invoke("IndexOf",item);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public void Insert (java.lang.Integer index,T item){ try { javonetHandle.generic(getGetObjectName(item)).invoke("Insert",index,item);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void InsertRange (java.lang.Integer index,jio.System.Collections.Generic.IEnumerable<T> collection){ try { javonetHandle.invoke("InsertRange",index,collection);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Boolean Remove (T item){ try { return javonetHandle.generic(getGetObjectName(item)).invoke("Remove",item);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.Integer RemoveAll (Predicate<T> match){ try { return javonetHandle.invoke("RemoveAll",match);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public void RemoveAt (java.lang.Integer index){ try { javonetHandle.invoke("RemoveAt",index);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void RemoveRange (java.lang.Integer index,java.lang.Integer count){ try { javonetHandle.invoke("RemoveRange",index,count);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Reverse (java.lang.Integer index,java.lang.Integer count){ try { javonetHandle.invoke("Reverse",index,count);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Sort (){ try { javonetHandle.invoke("Sort");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Sort (IComparer<T> comparer){ try { javonetHandle.invoke("Sort",comparer);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Sort (java.lang.Integer index,java.lang.Integer count,IComparer<T> comparer){ try { javonetHandle.invoke("Sort",index,count,comparer);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Sort (Comparison<T> comparison){ try { javonetHandle.invoke("Sort",comparison);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public T[] ToArray (Class<?> returnType){ try { return (T[])Convert(javonetHandle.generic(getReturnObjectName(returnType)).invoke("ToArray"), returnType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void TrimExcess (){ try { javonetHandle.invoke("TrimExcess");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public ReadOnlyCollection<T> AsReadOnly (){ try { return new ReadOnlyCollection<T>((NObject)javonetHandle.invoke("AsReadOnly"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public java.lang.Integer BinarySearch (T item){ try { return javonetHandle.generic(getGetObjectName(item)).invoke("BinarySearch",item);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer BinarySearch (T item,IComparer<T> comparer){ try { return javonetHandle.generic(getGetObjectName(item)).invoke("BinarySearch",item,comparer);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public void CopyTo (T[] array){ try { javonetHandle.generic(getGetObjectName(array)).invoke("CopyTo",new Object[] {array});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void CopyTo (T[] array,java.lang.Integer arrayIndex){ try { javonetHandle.generic(getGetObjectName(array)).invoke("CopyTo",new Object[] {array},arrayIndex);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Boolean Exists (Predicate<T> match){ try { return javonetHandle.invoke("Exists",match);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public T Find (Predicate<T> match, Class<?> returnType){ try { return (T)Convert(javonetHandle.generic(getReturnObjectName(returnType)).invoke("Find",match), returnType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public List<T> FindAll (Predicate<T> match){ try { return new List<T>((NObject)javonetHandle.invoke("FindAll",match));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public java.lang.Integer FindIndex (Predicate<T> match){ try { return javonetHandle.invoke("FindIndex",match);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer FindIndex (java.lang.Integer startIndex,Predicate<T> match){ try { return javonetHandle.invoke("FindIndex",startIndex,match);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer FindIndex (java.lang.Integer startIndex,java.lang.Integer count,Predicate<T> match){ try { return javonetHandle.invoke("FindIndex",startIndex,count,match);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public T FindLast (Predicate<T> match, Class<?> returnType){ try { return (T)Convert(javonetHandle.generic(getReturnObjectName(returnType)).invoke("FindLast",match), returnType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public java.lang.Integer FindLastIndex (Predicate<T> match){ try { return javonetHandle.invoke("FindLastIndex",match);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer FindLastIndex (java.lang.Integer startIndex,Predicate<T> match){ try { return javonetHandle.invoke("FindLastIndex",startIndex,match);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer FindLastIndex (java.lang.Integer startIndex,java.lang.Integer count,Predicate<T> match){ try { return javonetHandle.invoke("FindLastIndex",startIndex,count,match);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public List<T> GetRange (java.lang.Integer index,java.lang.Integer count){ try { return new List<T>((NObject)javonetHandle.invoke("GetRange",index,count));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public java.lang.Integer IndexOf (T item,java.lang.Integer index){ try { return javonetHandle.generic(getGetObjectName(item)).invoke("IndexOf",item,index);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer IndexOf (T item,java.lang.Integer index,java.lang.Integer count){ try { return javonetHandle.generic(getGetObjectName(item)).invoke("IndexOf",item,index,count);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer LastIndexOf (T item){ try { return javonetHandle.generic(getGetObjectName(item)).invoke("LastIndexOf",item);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer LastIndexOf (T item,java.lang.Integer index){ try { return javonetHandle.generic(getGetObjectName(item)).invoke("LastIndexOf",item,index);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer LastIndexOf (T item,java.lang.Integer index,java.lang.Integer count){ try { return javonetHandle.generic(getGetObjectName(item)).invoke("LastIndexOf",item,index,count);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public void Reverse (){ try { javonetHandle.invoke("Reverse");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Boolean TrueForAll (Predicate<T> match){ try { return javonetHandle.invoke("TrueForAll",match);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public IEnumerator IEnumerable_GetEnumerator (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("IEnumerable_GetEnumerator"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public NObject get_Item (java.lang.Integer index){ try { return  (NObject) javonetHandle.invoke("get_Item",index);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void set_Item (java.lang.Integer index,NObject value){ try { javonetHandle.invoke("set_Item",index,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Integer Add (NObject item){ try { return javonetHandle.invoke("Add",item);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Boolean Contains (NObject item){ try { return javonetHandle.invoke("Contains",item);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.Boolean get_IsReadOnly (){ try { return javonetHandle.invoke("get_IsReadOnly");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.Boolean get_IsFixedSize (){ try { return javonetHandle.invoke("get_IsFixedSize");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.Integer IndexOf (NObject item){ try { return javonetHandle.invoke("IndexOf",item);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public void Insert (java.lang.Integer index,NObject item){ try { javonetHandle.invoke("Insert",index,item);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Remove (NObject item){ try { javonetHandle.invoke("Remove",item);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void ICollection_CopyTo (java.lang.reflect.Array array,java.lang.Integer arrayIndex){ try { javonetHandle.invoke("ICollection_CopyTo",array,arrayIndex);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public NObject ICollection_get_SyncRoot (){ try { return  (NObject) javonetHandle.invoke("ICollection_get_SyncRoot");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public java.lang.Boolean ICollection_get_IsSynchronized (){ try { return javonetHandle.invoke("ICollection_get_IsSynchronized");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }public static class Enumerator<T> extends ValueType implements IDisposable,IEnumerator {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public T get_Current (Class<?> returnType){ try { return (T)Convert(javonetHandle.generic(getReturnObjectName(returnType)).invoke("get_Current"), returnType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public Enumerator(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Dispose (){ try { javonetHandle.invoke("Dispose");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Boolean MoveNext (){ try { return javonetHandle.invoke("MoveNext");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public NObject get_Current (){ try { return  (NObject) javonetHandle.invoke("get_Current");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void Reset (){ try { javonetHandle.invoke("Reset");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }}	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}