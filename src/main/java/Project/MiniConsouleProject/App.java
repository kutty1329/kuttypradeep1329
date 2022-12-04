package Project.MiniConsouleProject;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application Access = new Application();
		Thread th=new Thread(Access,"MANOJ");
		Thread th1=new Thread(Access,"TIWIN");
		Thread th2=new Thread(Access,"THILAK");
		Thread th3=new Thread(Access,"PRADEEP");
		Thread th4=new Thread(Access,"GANESH");
		Thread th5=new Thread(Access,"ASWIN");
		
		th.start();
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		th5.start();
		

	}

}
