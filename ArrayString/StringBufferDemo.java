class StringDemo{
	public static void main(String[] args){
		String s1="Keshav";
		s1=s1.concat("Kokate");

		System.out.println(s1+" = "+System.identityHashCode(s1));
		StringBuffer sb = new StringBuffer("Keshav");
		sb.append("Kokate");
		System.out.println(sb+" = "+System.identityHashCode(sb));
	}
}
