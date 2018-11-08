package jio.System.Collections.Generic;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.Collections.Generic.*;
import jio.System.Collections.*;
import jio.System.*;public class SortedDictionary<TKey,TValue> implements jio.System.Collections.IEnumerable,jio.System.Collections.IDictionary,ICollection {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void set_Item (TKey key,TValue value){ try { javonetHandle.generic(getGetObjectName(key),getGetObjectName(value)).invoke("set_Item",key,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public TValue get_Item (TKey key, Class<?> returnType){ try { return (TValue)Convert(javonetHandle.generic(getGetObjectName(key),getReturnObjectName(returnType)).invoke("get_Item",key), returnType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.lang.Integer getCount (){ try { return javonetHandle.get("Count");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * GetProperty
	 */
            public IComparer<TKey> getComparer (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.get("Comparer"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public KeyCollection<TKey,TValue> getKeys (){ try { return new KeyCollection<TKey,TValue>((NObject)javonetHandle.get("Keys"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public ValueCollection<TKey,TValue> getValues (){ try { return new ValueCollection<TKey,TValue>((NObject)javonetHandle.get("Values"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public SortedDictionary (){ try {  javonetHandle = Javonet.New("SortedDictionary");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SortedDictionary (jio.System.Collections.Generic.IDictionary<TKey,TValue> dictionary){ try {  javonetHandle = Javonet.New("SortedDictionary",dictionary);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SortedDictionary (jio.System.Collections.Generic.IDictionary<TKey,TValue> dictionary,IComparer<TKey> comparer){ try {  javonetHandle = Javonet.New("SortedDictionary",dictionary,comparer);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SortedDictionary (IComparer<TKey> comparer){ try {  javonetHandle = Javonet.New("SortedDictionary",comparer);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SortedDictionary(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Add (TKey key,TValue value){ try { javonetHandle.generic(getGetObjectName(key),getGetObjectName(value)).invoke("Add",key,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Clear (){ try { javonetHandle.invoke("Clear");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Boolean ContainsKey (TKey key){ try { return javonetHandle.generic(getGetObjectName(key)).invoke("ContainsKey",key);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.Boolean ContainsValue (TValue value){ try { return javonetHandle.generic(getGetObjectName(value)).invoke("ContainsValue",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public void CopyTo (KeyValuePair[] array,java.lang.Integer index){ try { javonetHandle.invoke("CopyTo",new Object[] {array},index);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public Enumerator<TKey,TValue> GetEnumerator (){ try { return javonetHandle.invoke("GetEnumerator");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public java.lang.Boolean Remove (TKey key){ try { return javonetHandle.generic(getGetObjectName(key)).invoke("Remove",key);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.Boolean TryGetValue (TKey key,TValue value){ try { return javonetHandle.generic(getGetObjectName(key),getGetObjectName(value)).invoke("TryGetValue",key,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public IEnumerator IEnumerable_GetEnumerator (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("IEnumerable_GetEnumerator"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public NObject IDictionary_get_Item (NObject key){ try { return  (NObject) javonetHandle.invoke("IDictionary_get_Item",key);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void IDictionary_set_Item (NObject key,NObject value){ try { javonetHandle.invoke("IDictionary_set_Item",key,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public ICollection IDictionary_get_Keys (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("IDictionary_get_Keys"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public ICollection IDictionary_get_Values (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("IDictionary_get_Values"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public java.lang.Boolean IDictionary_Contains (NObject key){ try { return javonetHandle.invoke("IDictionary_Contains",key);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public void IDictionary_Add (NObject key,NObject value){ try { javonetHandle.invoke("IDictionary_Add",key,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Boolean IDictionary_get_IsReadOnly (){ try { return javonetHandle.invoke("IDictionary_get_IsReadOnly");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.Boolean IDictionary_get_IsFixedSize (){ try { return javonetHandle.invoke("IDictionary_get_IsFixedSize");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public IDictionaryEnumerator IDictionary_GetEnumerator (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("IDictionary_GetEnumerator"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void IDictionary_Remove (NObject key){ try { javonetHandle.invoke("IDictionary_Remove",key);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void ICollection_CopyTo (java.lang.reflect.Array array,java.lang.Integer index){ try { javonetHandle.invoke("ICollection_CopyTo",array,index);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public NObject ICollection_get_SyncRoot (){ try { return  (NObject) javonetHandle.invoke("ICollection_get_SyncRoot");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public java.lang.Boolean ICollection_get_IsSynchronized (){ try { return javonetHandle.invoke("ICollection_get_IsSynchronized");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }public static class Enumerator<TKey,TValue> extends ValueType implements IDisposable,IEnumerator,IDictionaryEnumerator {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public KeyValuePair<TKey,TValue> getCurrent (){ try { return javonetHandle.get("Current");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public Enumerator(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public java.lang.Boolean MoveNext (){ try { return javonetHandle.invoke("MoveNext");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public void Dispose (){ try { javonetHandle.invoke("Dispose");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public NObject get_Current (){ try { return  (NObject) javonetHandle.invoke("get_Current");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void Reset (){ try { javonetHandle.invoke("Reset");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public NObject get_Key (){ try { return  (NObject) javonetHandle.invoke("get_Key");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public NObject get_Value (){ try { return  (NObject) javonetHandle.invoke("get_Value");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public DictionaryEntry get_Entry (){ try { return javonetHandle.invoke("get_Entry");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }}public static class KeyCollection<TKey,TValue> implements jio.System.Collections.IEnumerable,ICollection {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public java.lang.Integer getCount (){ try { return javonetHandle.get("Count");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }public KeyCollection (SortedDictionary<TKey,TValue> dictionary){ try {  javonetHandle = Javonet.New("KeyCollection",dictionary);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public KeyCollection(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public java.lang.Object GetEnumerator (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("GetEnumerator"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void CopyTo (TKey[] array,java.lang.Integer index){ try { javonetHandle.generic(getGetObjectName(array)).invoke("CopyTo",new Object[] {array},index);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void CopyTo (java.lang.reflect.Array array,java.lang.Integer index){ try { javonetHandle.invoke("CopyTo",array,index);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public NObject get_SyncRoot (){ try { return  (NObject) javonetHandle.invoke("get_SyncRoot");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public java.lang.Boolean get_IsSynchronized (){ try { return javonetHandle.invoke("get_IsSynchronized");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }public static class Enumerator<TKey,TValue> extends ValueType implements IDisposable,IEnumerator {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public TKey get_Current (Class<?> returnType){ try { return (TKey)Convert(javonetHandle.generic(getReturnObjectName(returnType)).invoke("get_Current"), returnType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public Enumerator(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
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
            public void Reset (){ try { javonetHandle.invoke("Reset");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }}}public static class ValueCollection<TKey,TValue> implements jio.System.Collections.IEnumerable,ICollection {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public java.lang.Integer getCount (){ try { return javonetHandle.get("Count");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }public ValueCollection (SortedDictionary<TKey,TValue> dictionary){ try {  javonetHandle = Javonet.New("ValueCollection",dictionary);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ValueCollection(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public java.lang.Object GetEnumerator (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("GetEnumerator"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void CopyTo (TValue[] array,java.lang.Integer index){ try { javonetHandle.generic(getGetObjectName(array)).invoke("CopyTo",new Object[] {array},index);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void CopyTo (java.lang.reflect.Array array,java.lang.Integer index){ try { javonetHandle.invoke("CopyTo",array,index);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public NObject get_SyncRoot (){ try { return  (NObject) javonetHandle.invoke("get_SyncRoot");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public java.lang.Boolean get_IsSynchronized (){ try { return javonetHandle.invoke("get_IsSynchronized");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }public static class Enumerator<TKey,TValue> extends ValueType implements IDisposable,IEnumerator {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public TValue get_Current (Class<?> returnType){ try { return (TValue)Convert(javonetHandle.generic(getReturnObjectName(returnType)).invoke("get_Current"), returnType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public Enumerator(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
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
            public void Reset (){ try { javonetHandle.invoke("Reset");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }}}	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}