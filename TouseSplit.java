package day3;

public class TouseSplit {
	public static void main(String[] args) {
		String name="java,PYTHON,C++";
		String[] name2=name.split(",");
		int length1=name2[0].length();
		int length2=name2[1].length();
		int length3=name2[2].length();
		String low1=name2[0].toLowerCase();
		String low2=name2[1].toLowerCase();
		String low3=name2[2].toLowerCase();
		System.out.println(length1+","+length2+","+length3);
		System.out.println(low1+","+low2+","+low3);
		
		
		
		
		
		
		
		
	}

}
