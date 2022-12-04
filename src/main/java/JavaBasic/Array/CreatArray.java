package JavaBasic.Array;

import java.util.Arrays;

public class CreatArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {1,2,3,4,5};
		for(int i=0;i<array.length;i++)
		{
			System.out.println(Arrays.toString(array));
		}
		for(int array1:array)
		{
			System.out.println(Arrays.toString(array));
		}
        System.out.println(Arrays.toString(array));
	}

}
