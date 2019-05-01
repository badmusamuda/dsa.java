# Implementation and Usage of Various Data Structure and Algorithm in Java

  **[DSA.JAVA](https://work-ps.herokuapp.com)**;

### Content 
 * [Stack](src/main/java/lang/java/dsa/stack/Stack.java)
	**{@code push} and @{pop}**

 * [Biwise Operators](src/main/java/lang/java/prac/Bitwise.java)
   <br/><li> <a href="https://amudabadmus.wordpress.com/2019/01/13/how-bitwise-operation-works-in-java/"> Bitwise paper</a></li>
  ```Java

	public static void main(String...args){

		String t = "00101010 & 00001111";

		System.out.println("Input..."+t);
		t = manipulation(t,"&"); 
		
		System.out.println("Manipulation ----- "+ t);
		//System.out.println("Binary to base ***** "+ binToBase(t) );
		}
  ``` 
  * Regex<br/>
    <li>**(?i) -> Case insensitive**</li>
    **Hexadecimal value of**
    <li>\n = \0A</li>
    <li>\v = \0B</li>
    <li>\r = \0D</li>
    <li>\f = \0C</li>
    <li>\e = \x1B</li>
    <li>\a = \x07</li>

  * [Implementation of](src/main/java/lang/java/prac/Implementation.java)
	<li>** subList(List<String> list, int offset, int endPoint) **
	</li><li>** listReversal(final List<String> source) **
	</li><li>** stringReversal(final String source) **
	</li><li>** wordOccurence(final String text) **
	</li><li>** obtain(List<T> v, final String TYPE) **
	</li><li>** multiplicationTable(int n) **
	</li>
	
   
 * [Implementation of urlConverterToHref & emailCreator](src/main/java/lang/java/prac/Implementation.java)
  ```Java

	public static void main(String...args){
		String a = "http://WWW.work-as-app.NG";
		System.out.println( urlConverterToHref(a) ); 
		//<a href="http://www.work-as-app.ng">WORK-AS-APP</a> 
	}
  ```  	

   * [Euclid algorithm](https://amudabadmus.wordpress.com/2019/04/08/implementation-real-life-application-of-euclid-algorithmpaper/)
