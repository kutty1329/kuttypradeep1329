package JavaBasic;

import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
//		//String Name="PRADEEP";
//		int age=28;
//		long mobno=7904201927l;
//		short salry=4500;
//		double doorno=81.5d;
//		float height=5.3f;
//		char inl='N';
//		boolean mybool=true;
//		byte test=0;
		System.out.println("Enter Your Name");
		String Name=scan.next();
		System.out.println("Enter Your Age");
		int Age=scan.nextInt();
		System.out.println("Enter Your MobNo");
		long MobNo=scan.nextLong();
		System.out.println("Enter Your Salry 4 digit");
		short Salry=scan.nextShort();
		System.out.println("Enter Your StreetNumber");
		double StreetNo=scan.nextDouble();
		System.out.println("Enter your Height");
		float height=scan.nextFloat();
		System.out.println("Tell US TRUE OR FLASE YOUR DETAILS");
		boolean say=scan.nextBoolean();

	}

}
