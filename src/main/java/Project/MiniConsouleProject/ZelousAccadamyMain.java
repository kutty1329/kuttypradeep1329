package Project.MiniConsouleProject;

import java.util.Arrays;
import java.util.Scanner;

public class ZelousAccadamyMain implements ZelousAccadamyAction
{
	static ZelousAccadamy[] academy= new ZelousAccadamy[6];// size fixing
	 Scanner scan = new Scanner(System.in);// scaneer class
	
	public ZelousAccadamyMain()
	{
		academy[0]=new ZelousAccadamy("PRADEEP","JAVA FULL STACK","MANOJ",5,2.00,30000.0);
		academy[1]=new ZelousAccadamy("Tiwin","C++","MANOJ",6,4.00,45000.0);
		academy[2]=new ZelousAccadamy("Thilak","PYTHON","MANOJ",3,1.00,80000.0);
		academy[3]=new ZelousAccadamy("Ganesh","JAVA BASIC","MANOJ",8,3.00,10000.0);
		academy[4]=new ZelousAccadamy("Aswin","JAVA","MANOJ",5,5.00,40000.0);
		academy[5]=new ZelousAccadamy("Manoj","PHP","MANOJ",2,2.00,60000.0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ZelousAccadamyMain Zelous = new  ZelousAccadamyMain(); // constructor
		
		//System.out.println(Arrays.toString(accadamy));
        do
        {
        	System.out.println("Which Process You Want \n 1.addnewStudentDeatils \n 2.ListallStudentdeatils \n 3.updateStudentDetails \n 4.sortStudentDetails \n 5.searchStudentDetails \n 6.deletStudentDetails \n 7.Exit");
            int menu=Zelous.scan.nextInt();
        switch(menu)
        {
        case 1:
        	System.out.println("new student created by you StudentName,Technology,Inchargename,MembersCount,Hours,Price");
        	ZelousAccadamy Z1=new ZelousAccadamy(Zelous.scan.next(),Zelous.scan.next(),Zelous.scan.next(),Zelous.scan.nextInt(),Zelous.scan.nextDouble(),Zelous.scan.nextDouble());
           System.out.println(Zelous.addnewStuedntDetails(Z1));
           
           break;
        case 2:
        	System.out.println("Your value is listed");
        	Zelous.ListallStuedntDetails();
        	break;
        case 3:
        	System.out.println("Which price is you updated");
        	double stud=Zelous.scan.nextDouble();
        	Zelous.updateStudentDetails(stud);
        	Zelous.ListallStuedntDetails();
        	break;
        case 4:
        	Zelous.sortStudentDetails();
        	
        	break;
        case 5:
        	System.out.println("which Student time is you search");
        	double time1=Zelous.scan.nextDouble();
        	Zelous.serachStudentDetails(time1);
        	break;
        case 6:
        	System.out.println("which name is you deleted");
        	String dlt=Zelous.scan.next();
        	Zelous.deleteStudentDetails(dlt);
        	Zelous.ListallStuedntDetails();
        	break;
        case 7:
        	default:System.out.println("Thank You");	
        }
      }
        while(true);
	}

	@Override
	public String addnewStuedntDetails(ZelousAccadamy Zelous) 
	{
		
		for(int i=0;i<academy.length;i++)
		{
			if(academy[i]==null)
			{
				academy[i]=Zelous;	
			   return Zelous.getStuedntName()+"has name succesfully added";
			}
			return Zelous.getStuedntName()+"has name is not added";	
		}
		
		return null;
	}

	@Override
	public void ListallStuedntDetails() 
	{
		for(ZelousAccadamy zea:academy)
		{
			System.out.println(zea);
		}
	}

	@Override
	public void updateStudentDetails(double price) 
	{
		try
		{
		for(int i=0;i<academy.length;i++)
		{
			if(academy[i].getStuedntPackage()==price)
			{
			  System.out.println(price+"which field you want to update");
			  System.out.println(academy[i]);
			  String field=scan.next();
			  switch(field)
			  {
			  case "StudentName":
				  System.out.println("which student name is you update");
				  String stud=scan.next();
				  academy[i].setStuedntName(stud);
				  break;
			  case "StudentTechnology":
				  System.out.println("which student technology you update");
				  String tech=scan.next();
				  academy[i].setStuedntTechnology(tech);
				  break;
			  case "Student Incharge":
				  System.out.println("which student incharge you update");
				  String inch=scan.next();
				  academy[i].setStudentIncharge(inch);
				  break;
			  case "Studentmembers Count":
				  System.out.println("which student memberscount are you changed"+"only numeric numbers are enterd");
				  int count=scan.nextInt();
				  academy[i].setStudentMemberCount(count);
				  break;
			  case "Student Time":
				  System.out.println("which time you updated");
				  double time=scan.nextDouble();
				  academy[i].setStudentTime(time);
				  break;
			  case "Student Package":
				  System.out.println("update your Price");
				  double amount=scan.nextDouble();
				  academy[i].setStuedntPackage(amount);
				  break;				  
			  }
			  System.out.println(field+"has been updated"+price);
			  return;
			}
		}
		throw new ZelousAccadamyException();
		}
		catch(ZelousAccadamyException exe)
		{
			System.out.println(exe+"please enter your correct value");
			for(ZelousAccadamy aca:academy)
			{
				System.out.println(aca.getStuedntPackage());
			}
			System.out.println("which student you want update");
			updateStudentDetails(scan.nextDouble());
		}
		System.out.println("EXIT");
	}

	
	@Override
	public void sortStudentDetails() {
		// TODO Auto-generated method stub
		ZelousAccadamy Zelous=null;
		System.out.println("which field you want sort "+ "" +"studentName,studentTechnology,studentIncharge,studentCount,studentTime,studentPackage");
		String field = scan.next();
		do
		{
		switch (field)
		{
		case "studentName":
			for(int i=0;i<academy.length;i++)
			{
				for(int j=i+1;j<academy.length;j++)
				{
			if(field.equalsIgnoreCase("studentName"))
			{
				if(academy[i].getStuedntName().compareTo(academy[j].getStuedntName())>0)
				{
					Zelous=academy[i];
					academy[i]=academy[j];
					academy[j]=Zelous;
				
				}
			
			}
			}
		}
			break;
				case "studentTechnology":
					for(int i=0;i<academy.length;i++)
					{
						for(int j=i+1;j<academy.length;j++)
						{
						 if(field.equalsIgnoreCase("studentTechnology"))
					 {
					  if(academy[i].getStuedntTechnology().compareTo(academy[j].getStuedntTechnology())>0)
						{
							Zelous=academy[i];
							academy[i]=academy[j];
							academy[j]=Zelous;
							return;
						}
					}
						}
					}
					break;
			 case "studentIncharge":
				 for(int i=0;i<academy.length;i++)
					{
						for(int j=i+1;j<academy.length;j++)
						{		
				 if(field.equalsIgnoreCase("studentIncharge"))
				{
					if(academy[i].getStudentIncharge().compareTo(academy[j].getStudentIncharge())>0)
					{
						Zelous=academy[i];
						academy[i]=academy[j];
						academy[j]=Zelous;
					}
				}
						}
				}
				 break;
				 case "studentCount":
				 for(int i=0;i<academy.length;i++)
					{
						for(int j=i+1;j<academy.length;j++)
						{
				 if(field.equalsIgnoreCase("studentCount"))
				{
					if(academy[i].getStudentMemberCount()>=(academy[j].getStudentMemberCount()))
					{
						Zelous=academy[i];
						academy[i]=academy[j];
						academy[j]=Zelous;
					}
				}
				 
						}
					}
				 break;
				 case "studentTime":
					 
				 for(int i=0;i<academy.length;i++)
					{
						for(int j=i+1;j<academy.length;j++)
						{
				 if(field.equalsIgnoreCase("studentTime"))
				{
					if(academy[i].getStudentTime()>=(academy[j].getStudentTime()))
					{
						Zelous=academy[i];
						academy[i]=academy[j];
						academy[j]=Zelous;
					}
				       }
				}
					}
				 break;
				 case "studentPackage":
				 for(int i=0;i<academy.length;i++)
					{
						for(int j=i+1;j<academy.length;j++)
						{
				if(field.equalsIgnoreCase("studentPackage"))
				{
					if(academy[i].getStuedntPackage()>=(academy[j].getStuedntPackage()))
					{
						Zelous=academy[i];
						academy[i]=academy[j];
						academy[j]=Zelous;
					}
				}
				}
					}
				break;
				default:System.out.println("Thank You");
			}
		}
		while(true);
	}
		
	

	@Override
	public void serachStudentDetails(double time) 
	{
	try
	{
		System.out.println(" i have trying to serch for studenttime"+time);
		for(int i=0;i<academy.length;i++)
		{
			if(academy[i].getStudentTime()==time)
			{
				System.out.println(academy[i].getStudentTime());
				System.out.println(academy[i].getStuedntName());
				return ;
			}
		}
		throw new ZelousAccadamyException();
	}
	catch(ZelousAccadamyException exe)
	{
		System.out.println(exe+"please enter your correct value");
		for(ZelousAccadamy aca:academy)
		{
			System.out.println(aca.getStudentTime());
		}
		System.out.println("which studenttime you want search");
		serachStudentDetails(scan.nextDouble());
	}
	}

	@Override
	public void deleteStudentDetails(String name) 
	{
	 try
	 {
		for(int i=0;i<academy.length;i++)
		{
			if(academy[i].getStuedntName().equalsIgnoreCase(name))
			{
				academy[i]=null;
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

}
