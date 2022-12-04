package Project.MiniConsouleProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Vector;

public class Application1 implements Runnable, ZelousAccadamyAction
{
	File file = new File("D:\\JAVA RECALL\\Fille ZelousAccadamy");
	OutputStream fos=null;
	FileInputStream fis=null;
	ObjectOutputStream oos=null;
	ObjectInputStream ois=null;
	LinkedList<ZelousAccadamy>academy=new LinkedList<ZelousAccadamy>();
	Scanner scan = new Scanner(System.in);// scaneer class
	//LinkedList<ZelousAccadamy>academy=new LinkedList<ZelousAccadamy>();
	public void affect() throws IOException
	{
	  fos=new FileOutputStream(file);
	  oos=new ObjectOutputStream(fos);
	  oos.writeObject(academy);
	  oos.close();
	  fos.close();
	}
	public void fetch() throws IOException, ClassNotFoundException 
	{
	 fis=new FileInputStream(file);
	 ois=new ObjectInputStream(fis);
	 academy=(LinkedList<ZelousAccadamy>)ois.readObject();
	 ois.close();
	 fis.close();
	}
	public Application1()
	{
		academy.add(new ZelousAccadamy("PRADEEP","JAVA FULL STACK","MANOJ",5,2.00,30000.0));
		academy.add(new ZelousAccadamy("Tiwin","C++","MANOJ",6,4.00,45000.0));
	}

	@Override
	public String addnewStuedntDetails(ZelousAccadamy Zelous) {
		// TODO Auto-generated method stub
		academy.add(Zelous);
		return Zelous.getStuedntName()+"has name successfully added";
	
	}

	@Override
	public void ListallStuedntDetails() {
		// TODO Auto-generated method stub
		Iterator<ZelousAccadamy> it=academy.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

	@Override
	public void updateStudentDetails(double price) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sortStudentDetails() {
		// TODO Auto-generated method stub
	   
	}

	@Override
	public void serachStudentDetails(double time) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStudentDetails(String name) {
		// TODO Auto-generated method stub
		List<ZelousAccadamy> tmp=new Vector<ZelousAccadamy>();
		tmp.addAll(academy);
		try
		 {
			for(int i=0;i<tmp.size();i++)
			{
				if(tmp.get(i).getStuedntName().equalsIgnoreCase(name))
				{
					academy.remove(tmp.get(i));
					System.out.println(name+"has been deleted sucessfully");
					return;
				}
			}
			throw new ZelousAccadamyException();
		 }
		 catch(ZelousAccadamyException exe)
		 {
			 System.out.println(exe+"name is not matching please Enter your CorrectMatching name");
			 for(ZelousAccadamy aca:academy)
			 {
				 System.out.println(aca.getStuedntName());
			 }
			 System.out.println("which name you want delete");
			 deleteStudentDetails(scan.next());
		 }
			
		System.out.println("name has been deleted");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		do
        {
        	System.out.println("Which Process You Want \n 1.addnewStudentDeatils \n 2.ListallStudentdeatils \n 3.updateStudentDetails \n 4.sortStudentDetails \n 5.searchStudentDetails \n 6.deletStudentDetails \n 7.Exit");
            int menu=scan.nextInt();
        switch(menu)
        {
        case 1:
        	System.out.println("new student created by you StudentName,Technology,Inchargename,MembersCount,Hours,Price");
        	ZelousAccadamy Z1=new ZelousAccadamy(scan.next(),scan.next(),scan.next(),scan.nextInt(),scan.nextDouble(),scan.nextDouble());
           System.out.println(addnewStuedntDetails(Z1));
           
           break;
        case 2:
        	System.out.println("Your value is listed");
        	ListallStuedntDetails();
        	break;
        case 3:
        	System.out.println("Which price is you updated");
        	double stud=scan.nextDouble();
        	updateStudentDetails(stud);
        	ListallStuedntDetails();
        	break;
        case 4:
        	sortStudentDetails();
        	
        	break;
        case 5:
        	System.out.println("which Student time is you search");
        	double time1=scan.nextDouble();
        	serachStudentDetails(time1);
        	break;
        case 6:
        	System.out.println("which name is you deleted");
        	String dlt=scan.next();
        	deleteStudentDetails(dlt);
        	ListallStuedntDetails();
        	break;
        case 7:
        	default:System.out.println("Thank You");	
        }
      }
        while(true);
		
	}

}

