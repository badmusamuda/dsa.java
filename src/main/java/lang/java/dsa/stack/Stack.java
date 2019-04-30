package lang.java.dsa.stack;

import java.util.ArrayList;

import static dsa.ALGORITHM_CONFIG.*;
import dsa.error.RuntimeError;

public final class Stack<T>{

	private ArrayList<T> elements;

	public Stack(){
		this(DEF_DATA_SIZE);
	}
	public Stack(final int defSize){		
		int size = defSize == ZERO ? defSize : DEF_DATA_SIZE;
		elements = new ArrayList<>(size);		
	}
	
	public void push(T data){
		    elements.add(data);		
	}	
	public T pop(){
		if(elements.isEmpty())
			throw new RuntimeError(Stack);
		else
		    elements.remove( elements.size() - ONE );
		return elements;
	}
	
	@Override
	public String toString(){
		return String.valueOf(elements);
	}

	public static void main(String...args){

		Stack<String> s = new Stack<>();
		
		String[] t = {"ADE","OLU","FEMI","OLA"};

		for(String i : t)
			s.push(i);
		
		System.out.println("After push.... Stack content is show below");
		System.out.println(s);

		for(String j : t){
			s.pop(j);
		}	
		System.out.println("After pop.... Stack content is show below");
		System.out.println(s);
	}
}
