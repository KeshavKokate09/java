class StringDemo{
	public static void main(String [] args){
		String s1="java";
		String s2 = new String("Android");
		String s3="java";
		String s4 = new String("Android");
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s4));

		s1=s1+s2;
		s4=s3.concat(s4);

		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s4));

		//when we concat the strings it will create new object on heap every time
	}
}
