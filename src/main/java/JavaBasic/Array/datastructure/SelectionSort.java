package JavaBasic.Array.datastructure;

import java.util.Arrays;

public class SelectionSort {
	public void sort(int[] array1) 
	{
		for(int i=0;i<array1.length;i++)
		{
			for(int j=0;j<array1.length;j++) 
			{
				if(array1[i]<array1[j])
				{
					 array1[i]^=array1[j];
					 array1[j]^=array1[i];
					 array1[i]^=array1[j];
				}
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] array= {70,5,100,30,50,60};
         SelectionSort obj=new SelectionSort();
         obj.sort(array);
         System.out.println("After SOrting Values :"+Arrays.toString(array));
	}

}
