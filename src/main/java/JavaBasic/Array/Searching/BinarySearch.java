package JavaBasic.Array.Searching;

public class BinarySearch {
	public int bin(int[] array1,int low,int key,int high)
	{
	     if(low<high)
	     {
	    	 int mid = (high+low)/2;
	    	 if(array1[mid]==key)
	    	 
	    		 return mid;
	    	 
	    		 else if (array1[mid]>key)
	    			 return bin(array1,low,mid,key);
	    	 
	    		 else if(array1[mid]<key)
	    			 return bin(array1,mid+1,high,key);  	 
	     }
			
			return -1;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array= {10,20,30,40,50,60,70,80,90,100};
		int key=70;
		BinarySearch obj=new BinarySearch();
		System.out.println(key+ "THIS NUMBER IS POSTION "+obj.bin(array,0,array.length,key));
		

	}

}
