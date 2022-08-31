class StringDemo{
	public static void main(String[] args){
		String s1="Paython";
		String s2="Java";
		String s3 = new String("C++");
		String s4 = new String("Android");

		s1=s2+s3; // it concats s1 and s2 and stored it into s1
		s3.concat(s4); // it concats s3 and s4 but not storing into any variable

		System.out.println(s1); //JavaC++
		System.out.println(s2); //Java
		System.out.println(s3); //C++
		System.out.println(s4); //Android
	}

}
