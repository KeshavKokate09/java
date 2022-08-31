class StringDemo{
	public static void main(String[] args){
		String s1="Keshav";   // string literal saves on SCP
		String s2 = new String("Keshav"); // object created on Heap
		String s3 = "Keshav";
		String s4 = new String("Keshav");

		System.out.println(s1+" = "+System.identityHashCode(s1));
		System.out.println(s2+" = "+System.identityHashCode(s2));
		System.out.println(s3+" = "+System.identityHashCode(s3));
		System.out.println(s4+" = "+System.identityHashCode(s4));
	}
}

/*
 * 
	Keshav = 1639622804
	Keshav = 687241927
	Keshav = 1639622804
	Keshav = 627185331

 So the String literals having the same identity hash code for equal string but but having diffrent identityHashcode for objects String wich having same name
 */
