
public class EleventhAssignment {

	public static void main(String[] args)
	{
		student stu=new student();
     stu.student1();
     stu.student2();
     
   int grade=  stu.student3("balakrishnan", 12, 100, 100, 98);
   
    
     
	}
}
	
		
class student
{
  String  name="navin";
   int m1=100,m2=54,m3=43;
   int rollno=10;
   int avg;
   int total;
   char result;	


void student1()
{ 
	
	avg=(m1+m2+m3)/3;
	total=(m1+m2+m3);
	if(avg>=60&&avg<=70)
	{
		System.out.println(" \n name is " +name + "\nrollno is " +rollno +"\ntotal is "+total+ "\n C grade ");
	}
	else if(avg>=71&&avg<=80)
	{
		System.out.println(" \nname is " +name+ "\n rollno is " +rollno +"\ntotal is "+total+ "\n B grade ");
	}
		
	else if(avg>=81&&avg<=100)
	{
		System.out.println(" \nname is " +name+ "\n rollno is " +rollno +"\ntotal is "+total+ "\n A grade ");
	}
	else 
	{
		System.out.println(" \nname is " +name+"\n rollno is " +rollno +"\ntotal is "+total+"\n FAIL ");
	}
}


void student2()
{ 
	String  name="bala";
	int m1=87,m2=87,m3=53;
	int rollno=11;
	int avg;
	int total;
	char result;	
	total=(m1+m2+m3);
	avg=(m1+m2+m3)/3;
	if(avg>=60&&avg<=70)
	{
		System.out.println(" \n name is " +name + "\nrollno is " +rollno +"\n total is "+total+ "\n C grade ");
	}
	else if(avg>=71&&avg<=80)
	{
		System.out.println(" \nname is " +name+ "\n rollno is " +rollno +"\ntotal is "+total+ "\n B grade ");
	}
		
	else if(avg>=81&&avg<=100)
	{
		System.out.println(" \nname is " +name+ "\n rollno is " +rollno + "\ntotal is "+total+"\n A grade ");
	}
	else 
	{
		System.out.println(" \nname is " +name+"\n rollno is " +rollno +"\ntotal is "+total+"\n FAIL ");
	}
}	

int student3(String name,int rollno,int m1,int m2,int m3)
{
	this.rollno=rollno;
	this.name=name;
	this.avg=avg;
	this.m1=m1;
	this.m2=m2;
	this.m3=m3;
	this.result=result;
	total=(m1+m2+m3);
	avg=(m1+m2+m3)/3;
	if(avg>=60&&avg<=70)
	{
		System.out.println(" \n name is " +name + "\nrollno is " +rollno +"\ntotal is "+total+ "\n C grade ");
	}
	else if(avg>=71&&avg<=80)
	{
		System.out.println(" \nname is " +name+ "\n rollno is " +rollno +"\ntotal is "+total+ "\n B grade ");
	}
		
	else if(avg>=81&&avg<=100)
	{
		System.out.println(" \nname is " +name+ "\n rollno is " +rollno +"\ntotal is "+total+ "\n A grade ");
	}
	else 
	{
		System.out.println(" \nname is " +name+"\n rollno is " +rollno +"\ntotal is "+total+"\n FAIL ");

	}
	return avg;
	
	
}

	
}


		
	
