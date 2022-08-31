class StringDemo{
	public static void main(String[] args){
		StringBuffer sb = new StringBuffer("Paython"); //23 =16+7

		sb.append("java");    // 
		sb.append("Flutter");
		sb.append("C++");
		sb.append("c");
		sb.append("Android");
		sb.append("ReactJS");
		sb.append("ruby");
		sb.append("MongoDB");
		sb.append("DataStructure");
		sb.append("mySQL");

		System.out.println(sb);
		System.out.println("length = "+sb.toString().length());
		System.out.println("Capacity = "+sb.capacity());

		/*
		 * new capacity = (currentCapacity * 2 ) + 2
		 */
	}
}
