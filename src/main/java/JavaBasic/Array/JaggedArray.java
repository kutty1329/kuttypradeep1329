package JavaBasic.Array;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] [] JaggedArray=new int[5][1];
		JaggedArray[1]=new int[1];
		JaggedArray[2]=new int[2];
		JaggedArray[3]=new int[3];
//		JaggedArray[4]=new int[4];
//		JaggedArray[5]=new int[5];
		int count=0;
 for (int i=0;i<JaggedArray.length;i++)
 {
	for(int j=0;j<JaggedArray[i].length;j++)
	{
		JaggedArray[i][j]=count+=1;
	}
 }
	for(int i=0;i<JaggedArray.length;i++)
{
	for(int j=0;j<JaggedArray[i].length;j++)
	{
		System.out.println(JaggedArray[i][j]+" ");
	}
	System.out.println();
 }
	 
}

}
