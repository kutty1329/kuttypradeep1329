package JavaBasic.Array.datastructure;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort<swap> {
	public void sort(int[] array1)
	{
		for(int i=0;i<array1.length;i++)
		{
			for(int j=0;j<array1.length-i-1;j++)
			{
				if(array1[j]>array1[j+1])
				{
					int swap= array1[j];
					array1[j]=array1[j+1];
					array1[j+1]=swap;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {70,5,100,30,50,60};
		BubbleSort obj=new BubbleSort();
		obj.sort(array);
		System.out.println("After Bubble sorting :"+Arrays.toString(array));
	}

}
