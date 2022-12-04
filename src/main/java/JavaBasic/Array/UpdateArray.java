package JavaBasic.Array;

import java.util.Arrays;

public class UpdateArray {
	public void update(int[] array1)
	{
		array1[0]=5;
		array1[3]=45;
		System.out.println(Arrays.toString(array1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] array= {10,20,30,40,50,60};
       UpdateArray obj=new UpdateArray();
       obj.update(array);
	}

}
