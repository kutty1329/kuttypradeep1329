package JavaBasic.Array;

public class MultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int [][] array= {{1,2,3},{4,5,6},{7,8,9}};
          for(int i=0;i<array.length;i++)
          {
        	  for(int j=0;j<array.length;j++)
        	  {
        		  System.out.println(array[i][j]+" "+" ");
        	  }
        	  System.out.println("");
          }
	}

}
