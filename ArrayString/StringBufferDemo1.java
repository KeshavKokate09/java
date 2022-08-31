//StringBuffer Capacity
class StringDemo{
	public static void main(String [] args){
		StringBuffer sb = new StringBuffer();
		StringBuffer sb1 = new StringBuffer("Paython");
		StringBuffer sb2 = new StringBuffer("OS");

		System.out.println(sb.capacity()); //16=initial capacity
		System.out.println(sb1.capacity());//23=16+7
		System.out.println(sb2.capacity());//18=16+2
	}
}

/*
 * 16
 * 23
 * 18
 */
