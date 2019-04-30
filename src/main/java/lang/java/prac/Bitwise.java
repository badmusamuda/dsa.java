package java.lang.prac;

import java.util.Arrays;

/*CODE CURRENTLY NOT SUBJECTED TO ANY COPYRIGHT,
*HOWEVER, IT IS EXPECTED TO WORK PERFECTLY AS INTENDED.
*
*ALL METHODS HAVE THEIR COMMENT, SO READ THORUGH TO SEE WHAT THEY DO, AND HOW THEY WORKS
*/

public final class Bitwise{

	private static final String ZERO = "0"
				,ONE = "1"
				,ZERO_SPACE_BAR = "";

	//Singleton for StringBuilder to prevent uneccasry object creation when it enters iteration
	private static StringBuilder sb = new StringBuilder();
	
	public static StringBuilder getSb(){
		return sb;
	}	

	/*{@code maipulation} manipulates various Bistwise operations for Binary data
	*
	*Example
	*<blockquote><pre>
	*   Suppose at @param value = 000101010 and @param KEY = ~ {@code BITWISE_NOT)
	*   The bitwise operator {@code ~} answer will be = 1111010101
	*   	
	*   Also, consider addiing two binary data with {@code BITWISE_AND} 
	*
	*	@param {@code value} = 00101010 & 00001111
	*	After {@code value} is trimmed, @param value = 00101010&00001111 
	*
	*     	00101010
	*    	&
	*     	00001111
	*    	----------
	*     	00001010
	*    	----------	
	*/
	public static String manipulation(String value, String KEY){

		String result = null;
		
		BitwiseOperator OPERATOR = BitwiseOperator.keyDeterminer(KEY);
		switch(OPERATOR){

			case BITWISE_NOT:
				result = bitWiseNot(value);
			break;
			
			case BITWISE_OR:
				result = bitwiseOr(value);
			break;
			
			case BITWISE_OR_ASSIGNMENT:
			System.out.println("BITWISE_OR_ASSIGNMENT "+OPERATOR.getKey());
			break;

			case BITWISE_AND:
				result = bitWiseAnd(value);
			break;

			case BITWISE_AND_ASSIGNMENT:
			System.out.println("BITWISE_AND_ASSIGNMENT "+OPERATOR.getKey());
			break;

			case BITWISE_EXCLUSIVE_OR:
			System.out.println("BITWISE_EXCLUSIVE_OR "+OPERATOR.getKey());
			break;

			case SHIFT_RIGHT:
			System.out.println("SHIFT_RIGHT "+OPERATOR.getKey());
			break;

			case SHIFT_RIGHT_ZERO_FILL:
			System.out.println("SHIFT_RIGHT_ZERO_FILL "+OPERATOR.getKey());
			break;
			
			case SHIFT_RIGHT_ASSIGNMENT:
			System.out.println("SHIFT_RIGHT_ASSIGNMENT "+OPERATOR.getKey());
			break;

			case SHIFT_RIGHT_ZERO_FILL_ASSIGNMENT:
			System.out.println("SHIFT_RIGHT_ZERO_FILL_ASSIGNMENT "+OPERATOR.getKey());
			break;

			case SHIFT_LEFT:
			System.out.println("SHIFT_LEFT "+OPERATOR.getKey());
			break;

			case SHIFT_LEFT_ASSIGNMENT:
			System.out.println("SHIFT_LEFT_ASSIGNMENT "+OPERATOR.getKey());
			break;

			default :
			System.out.println("INVALID_BITWISE_OPERATORS");
			break;
		}
		return result;
	}

	/*{@code BITWISE_NOT} otherwise called inversion
	*<p>It's primarily used for inverting binary data
	*
	*<b>HOW IT WORKS</b>
	*
	*@param input
	*	The binary input ( which may take any form, such as 0000101010
	*
	*@param input is meant to splited with a non empty white space
	*It the value is zero, it's assumed, {@code ONE}, otherwise @{code ONE}
	*/

	private static String bitWiseNot(String input){

		String[] datas = input.split("");
		final int DATA_LENGTH = datas.length;

		StringBuilder output = getSb();

		for(int i = 0; i < DATA_LENGTH; i++){
			output.append(String.format("%s", datas[i].equals("1") ? 0 : 1) );
		}
		return output.toString();
	}
	
	/**Obtains the BITWISE_NOT data equivalent
	*
	*<p>EXAMPLE</p>
	*
	*<blockquote><pre>
	*@param {@code input} = 00101010 & 00001111
	*After {@code input} is trimmed, @param input = 00101010&00001111 
	*
	*     00101010
	*    &
	*     00001111
	*    ----------
	*     00001010
	*    ----------	  
	*</pre></blockquote>
	*
	*<p>SOLUTION APPROACH</p>
	*
	* @param input is trimmed and splitted with {@code BitwiseOperator.BITWISE_AND.getKey()}
	*if both value are {@code ONE}, the equivalent bitwise operator is 1, otherise {@code ZERO}
	*/

	private static String bitWiseAnd(String input){

	  	String[] datas = input.trim().split(BitwiseOperator.BITWISE_AND.getKey());

	  	final String[] v1 = {datas[0].trim()};
	  	final String[] v2 = datas[1].trim().split(BitwiseOperator.BITWISE_AND.getKey());

		/*REMOVE THIS LINE*System.out.println("v1 ==== "+Arrays.asList(v1));
		System.out.println("v2 ==== "+Arrays.asList(v2));*/

		Integer[] lengths = {v1[0].split("").length, v2[0].split("").length};
		final int MAX = maxData(lengths);

		/*REMOVE THIS LINE*System.out.println("Datas length <<<<<<=-=== "+lengths[0]+","+lengths[1]);
		System.out.println("Maximum length <<<<<<=-=== "+MAX);*/

		StringBuilder output = getSb();


		if( lengths[0] == lengths[1] ){
		    for(int i = 0; i < MAX; i++){
			
			output.append( String.format("%d",zeroAndOne( Integer.valueOf(v1[0].split("")[i]), 								           Integer.valueOf(v2[0].split("")[i]) 
				     )));			
		    }
		}
		
		return output.toString();
	}

	/**The Bitwise OR
	* The OR operator, |, combines bits such that if either of the bits in the operands is a 1, then
	* the resultant bit is a 1
	* Example
	* 00101010 | 00001111
	<p>HOWEVER, IT SEEMS NOT POSSIBLE TO SPLIT A STRING WITH | {@code BitwiseOr}, hence underscore it used instead
	*/
	public static String bitwiseOr(final String input){
		
		String BOR = "_";
		
		String[] datas = input.replace("|","_").trim().split("_");

	  	final String[] v1 = {datas[0].trim()};
	  	final String[] v2 = datas[1].trim().split("_");

		//RM THIS LINE		
		//System.out.println("v1 ==== "+Arrays.asList(v1));
		//System.out.println("v2 ==== "+Arrays.asList(v2));

		Integer[] lengths = {v1[0].split("").length, v2[0].split("").length};
		final int MAX = maxData(lengths);

		//RM THIS LINE
		//System.out.println("Datas length <<<<<<=-=== "+lengths[0]+","+lengths[1]);
		//System.out.println("Maximum length <<<<<<=-=== "+MAX);

		StringBuilder output = getSb();

		if( lengths[0] == lengths[1] ){
		    for(int i = 0; i < MAX; i++){			
			output.append( String.format("%d",zeroOrOne( Integer.valueOf(v1[0].split("")[i]), 								           Integer.valueOf(v2[0].split("")[i]) 
				     )));			
		    }
		}
		return output.toString();
	}

	/**Obtain the maximum value of an array
	*  <p>HOW IT WORKS </p>
	*   <li>It used natural or lexicographical ordering to detering the max value of an array</li>
	*   <li>The first element {@ index} = 0 is assumed the max value, if and if otherwise other value is less or greater
	*	than the assumed value, then do the needful</li>	
	*/

	@SuppressWarnings("unchecked")
	private static<T extends Comparable> T maxData(final T...v){
		
		T assumedMaxData = v[0];
		final int V_LEN = v.length;

		for(int i = 0; i < V_LEN; i++){
			if(assumedMaxData.compareTo(v[i]) > 0)
				assumedMaxData = v[i];
		}
		return assumedMaxData;
	}	

	/*if @param v1 == 1 and @param v2 == 1, the expected result is 1
	*otherwise, it's zero
	*/
	private static int zeroAndOne(int v1, int v2){
		
		if( v1 == 1 && v2 == 1)
			return 1;
		return 0;		
	}

	/*if @param v1 == 1 or @param v2 == 1, the expected result is 1
	*otherwise, it's zero
	*/
	private static int zeroOrOne(int v1, int v2){
		
		if( v1 == 1 || v2 == 1)
			return 1;
		return 0;		
	}

	/*Convert binary to base 10
	*
	*Examples
	*Suppose @param v = 00001010 , 2*0^7 + 2*0^6 + 0*2^5 + 0*2^4 + 2*1^3 + 2*0^2 + 2*1^1 + 2*0^0
	* Equivalent answer = 0 + 0 + 0 + 0 + 8 + 0 + 2 + 0 = 10
	**/
	
	public static int binToBase(String v){

		final String[] i = v.split("");
		final int DATA_LEN = i.length;
		
		int SIZE = i.length;

		int total = 0;
		
		for(int r = 0; r < DATA_LEN; r++){
			 total += Integer.valueOf(i[--SIZE]) * Math.pow( 2, r);
		}	
		return total;
	}

	public static void main(String...args){

		String t = "00101010 | 00001111";

		//System.out.println("Input..."+t);
		//t = manipulation(t,"|"); 
		
		//System.out.println("Manipulation ----- "+ t);
		//System.out.println("Binary to base ***** "+ binToBase(t) );		
	}
}	
