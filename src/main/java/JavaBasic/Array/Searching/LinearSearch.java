package JavaBasic.Array.Searching;

public class LinearSearch {
	public void search(int[] array1 ,int key)
	{
		for(int i=0;i<array1.length;i++)
		{
			if(array1[i]==key)
			{
				System.out.println(key+"this postion is"+i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]array= {1,2,3,4,5,6};
		int key=4;
		LinearSearch obj=new LinearSearch();
		obj.search(array, key);

	}

}
