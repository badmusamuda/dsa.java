package lang.java.dsa.stack;

public class StackTest{

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
