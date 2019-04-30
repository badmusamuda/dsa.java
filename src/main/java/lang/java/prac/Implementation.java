package java.lang.prac;

import java.util.*;

/*THIS CODE IS NOT SUBJECTED TO ANY COPYRIGHT.
 *IT'S HOWEVER EXPECTED TO WORK IN-LINE WITH THE METHODS COMMENTs
 *DO READ THE METHOD COMMENT TO SEE HOW IT WORKS
 *IMPLEMENTATION AND USAGE OF DIFFERENT DATA STRUCTURES FUNCTIONALITIES*/

public class Implementation{

	private static final int ZERO = 0
				,ONE = 1;

	//static object 0f {@code StringBuilder}
	private static StringBuilder sb = new StringBuilder();

	//get Singleton object of {@code StringBuilder}
	public static StringBuilder getSb(){
		return sb;
	}

	/*Gets the sublist of a given {@code List}
	*
	*    @param list
	*	    The data source ( which can contains duplicate elements
	*
	*    @param offset
	*           The starting index or starting postion on the {@code List}
	*
	*    @param endPoint
	*	    The end point of the {@code List}
	*
	*    
	*	<br/>
	<b> <p>HOW IT EXPECTED TO WORK </p> </b>
	*<br/>
	*           		
	*<p>ASSUMPTION(s) </p>
	* <li>NO ASSUMPTION(s)</li>
	*</br/>
	*<b><p>CONDITION(s)</p></b>
	*<li>{@code vadlidOffset} and @{code validEndPoint} must returns {@code true}</li>
	*<li>if above mentioned is both true, 
	*	the loop initilization is set to @param offset,
	*	loop condtion is < endPoint;
	*	loop steps is +1 increment
	*
	*	Example
	*	<blockquote><pre>
	*	for(int index = offset; index < endPoint; index++)
	*		...
	*
	* </li>
	*/

	private static List<String> subList(List<String> list, int offset, int endPoint){

		List<String> result = new LinkedList<>();
		final int LIST_SIZE = list.size();

		if(!validOffset(offset,list) ){
			System.err.println(offset + " INVALID_OFFSET RANGE \\Offset should be less than 0 and not greater than the element size\\");
			result = null;
		}
		if(!validEndpoint(endPoint,list) ){
		   System.err.println(endPoint + " INVALID_LAST-INDEX \\Last index should be > than 0 and not greater than the element size\\");
		   result = null;
		}
		if( validOffset(offset,list) && validEndpoint(offset,list) ){
			for(int index = offset; index < endPoint; index++)
				result.add(list.get(index)); 
		}
		return result;
	}

	/**
	*<p>Determine the starting point of a list from a given integer
	
	* Example
	* <blockquote><pre>
	* int v = 1;
	* List<String> l = Arrays.asList("A","B","C","D","E");
	* //Expected starting point should be from B 
	*</pre></blockquote>
	*
	*<p>ASSUMPTION(s)</p>
	* <b>NO ASSUMPTION, ENSURE ALL VALID CONDITIONS FROM ALL MEANS
	*
	*<p>CONDITION(s)</p>
	*<ul>BASE_CONDITION(s)</ul>
	* <li> if @param value is greater than @param LIST_SIZE, @return {@code output} is false</li>
	* <li> if @param value is less than {@ code ZERO}, @ return {@code output} is false</li>
	* <li> if the subtraction of @param LIST_SIZE from @param value is <= {@code ZERO}, @ return {@code output} is false</li>
	*
	*  <b>If above given base conditions is met, the given @param value is valid for the provided @param offset
	*	hence the validOffset is valid and @return {@code output} is true
	*/

	private static boolean validOffset(final int value, final List<String> list){
		
		boolean output = true;
		final int LIST_SIZE = list.size();

		if(value > LIST_SIZE)
			output = false;
		if(value < ZERO)
			output = false;
		if(LIST_SIZE - value <= ZERO)
			output = false;	
		
		return output;	
	}

	/**
	*<p>Determine the end point of a list from a given integer
	
	* Example
	* <blockquote><pre>
	* int v = 4;
	* List<String> l = Arrays.asList("A","B","C","D","E");
	* //Expected end point should be from E 
	*</pre></blockquote>
	*
	*<p>ASSUMPTION(s)</p>
	* <b>NO ASSUMPTION, ENSURE ALL VALID CONDITIONS FROM ALL MEANS
	*
	*<p>CONDITION(s)</p>
	*<ul>BASE_CONDITION(s)</ul>
	* <li> if @param value is greater than @param LIST_SIZE, @return {@code output} is false</li>
	* <li> if @param value is less than {@ code ZERO}, @ return {@code output} is false</li>
	* <li> if the subtraction of @param LIST_SIZE from @param value is <= {@code ZERO}, @ return {@code output} is false</li>
	*
	*  <b>If above given base conditions is met, the given @param value is valid for the provided @param offset
	*	hence the validOffset is valid and @return {@code output} is true
	*/

	private static boolean validEndpoint(final int value, final List<String> list){
		
		boolean output = true;
		final int LIST_SIZE = list.size();

		if(value > LIST_SIZE)
			output = false;
		if(value < ZERO)
			output = false;
		if(LIST_SIZE - value <= ZERO)
			output = false;	
		
		return output;	
	}

	/**Reverse a {@code List}
	*
	*@param source
	* 	The data source
	*<p>ASSUMPTION</p>
	*The @param source is assummed to not be a null element
	*
	*<p>HOW IT IS EXPECTED TO WORK</P>
	*
	*Example
	*<blockquote><pre>
	* List<String> l = Arrays.asList("Oracle","Is","Java");
	* //After reversed, expected result should be
	* "JAVA","IS","ORACLE"
	*
	*<p>HOW IT WORKS</p>
	*Simply reverse the list using any iteration approach
	*/
	private static List<String> listReversal(final List<String> source){
		
		final int LIST_SIZE = source.size();
		List<String> result = new LinkedList<>();
		for(int i = LIST_SIZE - ONE; i >= ZERO; i--)
			result.add( source.get(i) );
		return result;
	}

	/**Reverse a {@code String} @param source
	*
	*@param source
	* 	The data source
	*<p>ASSUMPTION</p>
	*The @param source is assummed to not be a null element
	*
	*<p>HOW IT IS EXPECTED TO WORK</P>
	*
	*Example
	*<blockquote><pre>
	* String s = "Oracle Is Java";
	* //After reversed, expected result should be
	* "avaJ sI elcarO"
	*
	*<p>HOW IT WORKS</p>
	*Simply reverse the list using any iteration approach
	*/
	private static String stringReversal(final String source){
	
		String [] data = source.split("");
		final int DATA_SIZE = data.length;

		StringBuilder sb = getSb();
	
		for(int index = DATA_SIZE - ONE; index >= ZERO; index--)
				sb.append( data[index] );				
		return sb.toString();
	}

	/**
	*Get the word occurence of a String and returns the output as a {@code Map}
	*
	*Example
	*<blockquote><pre>
	*String text = "Who own oracle ? Who owns Java and Oracle ? What is the future of Java and Oracle ?"
	*EXPECTED RESULT
	*{?=3, and=2, future=1, is=1, java=2, of=1, oracle=3, own=1, owns=1, the=1, what=1, who=2}
	*</pre></blockquote>
	*
	*@param text
	*   data source
	*@param output
	*    @return {@code output} as a {@code Map} for occurent of each word in lexicographical order
	*/
	
	protected static Map<String,Integer> wordOccurence(final String text){

		Map<String,Integer> output = new TreeMap<>();
		String[] info = text.toLowerCase().split(" ");
		final int INFO_SIZE = info.length;

		for(int index = ZERO; index < INFO_SIZE; index++){

			if( output.containsKey(info[index]) ){
				int counter = output.get( info[index] );
				output.put(info[index], counter+ONE);
			}else
			     output.put(info[index], ONE);
		}
		return output;
	}

	/*
	*<p>Use lexicographical or natural ordering to determine the maximum value of a any list</p>
	*HOW IT WORKS
	*@param v is a {@code List} of any data type {@code T} which extends @{code Comparable}
	*@param TYPE is used to help the user/devs decide whether they are interested in the finding the maximum of minimum value of a list
	*@param assumedVal
	*	By default, element at index {@code ZERO} is assumed to either be maximum of minimum of any list
	*/
        @SuppressWarnings("unchecked")
	public static <T extends Comparable> T obtain(List<T> v, final String TYPE){

		T assumedVal = v.get(ZERO);
		final int LIST_SIZE = v.size();
		
		for(int index = ZERO; index < LIST_SIZE; index++){
			if( v.get(index).compareTo( assumedVal ) > ZERO && TYPE.toUpperCase().equals("MAXIMUM") )
				assumedVal = v.get(index);
			if( v.get(index).compareTo( assumedVal ) < ZERO && TYPE.toUpperCase().equals("MINIMUM") )
				assumedVal = v.get(index);
		}
		return assumedVal;
	}

	/*Obtain octal and hexedecimal value of multiplication table
	*/

	public static List<String> multiplicationTable(int n){

		List<String> result = new LinkedList<>();
	
		for(int x = ONE; x < n; x++){
			for(int y = ONE; y < n; y++){
				String f = String.format("%4X ", (x*y));
				result.add(f);
				f = null;
				//System.out.printf("%4d ", (x*y));
			}
			result.add("\n");
			//System.out.println();
		}
		return result;
	}

	/**Obtains the binary inversion of a negative or positive integers
	*
	*Example
	*
	*<blockquote><pre>
	*byte 42 = 00101010
	*byte 42 = 11010101 + 1 ~ 11010110
	*
	*<p>HOW IS WORKS </p>
	*
	*
	*/

	public static void main(String...args){

		List<String> l1 = Arrays.asList("A","B","C","D","E","F","G");
		//int offset = Integer.valueOf(args[0]), lastIndex = Integer.valueOf(args[1]);		

		///System.out.println( subList(l1,offset, lastIndex) );

		List<String> l2 = Arrays.asList("Oracle","Owns","Java");
		//System.out.println( listReversal(l2) );
		
		//for(String l3 : l2)
		//System.out.printf("%10s ", stringReversal(l3) );

		String s = "Who own oracle ? Who owns Java and Oracle ? What is the future of Java and Oracle ?";
		//System.out.println(wordOccurence(s));

		//System.out.println( "Maximum val : "+obtain(l2,"maximum") );
		//System.out.println( "Minimum val : "+obtain(l2,"minimum") );
		
		System.out.println( table(multiplicationTable) );
	}

}
