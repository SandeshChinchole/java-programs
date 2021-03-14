
// single parameter

/*
 
public class MyGenericClass <T>{

	T x;
	
	MyGenericClass(T x){
		this.x = x;
	}
	
	public T getValue() {
		return x;
	}
}

*/

// multiple parameters

public class MyGenericClass <T, V> {
	
	T x;
	V y;
	
	MyGenericClass(T x, V y){
		this.x = x;
		this.y = y;
	}
	
	public V getValue() { // display only second value 
		return y;
	}
}