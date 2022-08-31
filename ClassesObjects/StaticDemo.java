/*
 * 
 *
 */
class StaticDemo{
	int age=53;
	String name="Krishna Kumar";
	public static void main(String[] args){
		System.out.println("Age :"+age);
		System.out.println("Name :"+name);
	}
}
/*
 * 
StaticDemo.java:5: error: non-static variable age cannot be referenced from a static context
                System.out.println("Age :"+age);
                                           ^
StaticDemo.java:6: error: non-static variable name cannot be referenced from a static context
                System.out.println("Name :"+name);
*/
