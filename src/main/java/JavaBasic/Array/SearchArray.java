package JavaBasic.Array;

public class SearchArray {
	public void search(int[] array1,int key)
	{
		for(int i=0;i<array1.length;i++)
		{
			if(array1[i]==key)
			{
				System.out.println(key+"This postion is"+i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array= {1,2,3,11,5,6,7,8,9,10};
		int key=9;
        SearchArray obj=new SearchArray();
        obj.search(array, key);
	}

}
