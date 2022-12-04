package JavaBasic.Variables;

public class GloablVariable {
   String Name="This Is GloablVariable";
   public void gloabl()
   { 
	   String name="Gloabl";
	   System.out.println(name);
	   System.out.println(Name);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GloablVariable obj=new GloablVariable();
		obj.gloabl();
	}
	   

}
