package lang.java.dsa.error;

import static dsa.ALGORITHM_CONFIG.*;

public final class RuntimeError extends RuntimeException{

	private RuntimeError(){
		throw new Exception(ACCESS_DENIED);
	}
	public RuntimeError(Class clazz){
		this(clazz,EMPTY);
	}
	public EmptyStackException(final Class clazz, String message){
		final String err = messgae + clazz.getClassName().toString().toUpperCase();
		super(err);
	}


}
