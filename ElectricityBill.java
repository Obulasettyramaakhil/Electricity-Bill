import java.util.Scanner;
class Electricity
{
	double s, t, u, v;
	void groupa(int units)
	{
		if(units>=0 && units<=50)
		{
			s = units*1.45;
			t = 25;
			u = 5.27;
			v = (units*1.45)+t+u;
			System.out.println("You have to pay the money\ncurrent bill : " + s + "\ncustomer charges : " + t + "\nFixed charges : " + u);
			System.out.println("Total bill is : "+v + "/-");
		}
		else if(units>=51 && units<=75)
		{
			s = units*2.60;
			t = 30;
			u = 4.12;
			v = (units*2.60)+t+u;
			System.out.println("You have to pay the money\ncurrent bill : " + s + "\ncustomer charges : " + t + "\nFixed charges : " + u);
			System.out.println("Total bill is : "+v + "/-");
		}
	}
	void groupb(int units)
	{
		if(units>=0 && units<=50)
		{
			s = units*2.50;
			t = 35;
			u = 4.12;
			v = (units*2.50)+t+u;
			System.out.println("You have to pay the money\ncurrent bill : " + s + "\ncustomer charges : " + t + "\nFixed charges : " + u);
			System.out.println("Total bill is : "+v + "/-");
		}
		else if(units>=51 && units<=100)
		{
			s = units*2.60;
			t = 40;
			u = 4.12;
			v = (units*2.60)+t+u;
			System.out.println("You have to pay the money\ncurrent bill : " + s + "\ncustomer charges : " + t + "\nFixed charges : " + u);
			System.out.println("Total bill is : "+v + "/-");
		}
		else if(units>=101 && units <=200)
		{
			s = units*3.00;
			t = 45;
			u = 3.12;
			v = (units*3.00)+t+u;
			System.out.println("You have to pay the money\ncurrent bill : " + s + "\ncustomer charges : " + t + "\nFixed charges : " + u);
			System.out.println("Total bill is : "+v + "/-");
		}
		else if(units>=201 && units <= 225)
		{
			s = units*6.00;
			t = 50;
			v = (units*6.00)+t;
			System.out.println("You have to pay the money\ncurrent bill : " + s + "\ncustomer charges : " + t + "\nFixed charges : NULL" );
			System.out.println("Total bill is : "+v + "/-");
		}
	}
	void groupc(int units)
	{
		if(units>=0 && units<=50)
		{
			s = units*2.50;
			t = 35;
			u = 4.07;
			v = (units*2.50)+t+u;
			System.out.println("You have to pay the money\ncurrent bill : " + s + "\ncustomer charges : " + t + "\nFixed charges : " + u);
			System.out.println("Total bill is : "+v + "/-");
		}
		else if(units>=51 && units<=100)
		{
			s = units*3.35;
			t = 40;
			u = 3.07;
			v = (units*3.35)+t+u;
			System.out.println("You have to pay the money\ncurrent bill : " + s + "\ncustomer charges : " + t + "\nFixed charges : " + u);
			System.out.println("Total bill is : "+v + "/-");
		}
		else if(units>=101 && units <=200)
		{
			s = units*5.40;
			t = 45;
			u = 1.32;
			v = (units*5.40)+t+u;
			System.out.println("You have to pay the money\ncurrent bill : " + s + "\ncustomer charges : " + t + "\nFixed charges : " + u);
			System.out.println("Total bill is : "+v + "/-");
		}
		else if(units>=201 && units <= 300)
		{
			s = units*7.10;
			t = 50;
			v = (units*7.10)+t;
			System.out.println("You have to pay the money\ncurrent bill : " + s + "\ncustomer charges : " + t + "\nFixed charges : NULL");
			System.out.println("Total bill is : "+v + "/-");
		}
		else if(units>=301 && units <= 400)
		{
			s = units*7.95;
			t = 55;
			v = (units*7.95)+t;
			System.out.println("You have to pay the money\ncurrent bill : " + s + "\ncustomer charges : " + t + "\nFixed charges : NULL");
			System.out.println("Total bill is : "+v + "/-");
		}
		else if(units>=401 && units <= 500)
		{
			s = units*8.50;
			t = 55;
			v = (units*8.50)+t;
			System.out.println("You have to pay the money\ncurrent bill : " + s + "\ncustomer charges : " + t + "\nFixed charges : NULL");
			System.out.println("Total bill is : "+v + "/-");
		}
		else if(units>=500)
		{
			s = units*9.95;
			t = 55;
			v = (units*9.95)+t;
			System.out.println("You have to pay the money\ncurrent bill : " + s + "\ncustomer charges : " + t + "\nFixed charges : NULL");
			System.out.println("Total bill is : "+v + "/-");
		}
	}
	void groupaa(int units)
	{
		if(units>=0 && units<=50)
		{
			s = units*6.40;
			t = 30;
			u = 6.40;
			v = (units*6.40)+t+u;
			System.out.println("You have to pay the money\ncustomer charges : " + t + "\nstira charges : " + u);
			System.out.println("Total bill is : "+v + "/-");
		}
	}
	void groupbb(int units)
	{
		if(units>=0 && units<=50)
		{
			s = units*6.90;
			t = 30;
			v = (units*2.50)+t;
			System.out.println("You have to pay the money\ncurrent bill : " + s + "\ncustomer charges : " + t + "\nFixed charges : NULL");
			System.out.println("Total bill is : "+v + "/-");
		}
		else if(units>=51 && units<=100)
		{
			s = units*7.65;
			t = 40;
			v = (units*3.35)+t;
			System.out.println("You have to pay the money\ncurrent bill : " + s + "\ncustomer charges : " + t + "\nFixed charges : NULL");
			System.out.println("Total bill is : "+v + "/-");
		}
		else if(units>=101 && units <=300)
		{
			s = units*9.05;
			t = 45;
			v = (units*9.05)+t;
			System.out.println("You have to pay the money\ncurrent bill : " + s + "\ncustomer charges : " + t + "\nFixed charges : NULL");
			System.out.println("Total bill is : "+v + "/-");
		}
		else if(units>=301 && units <= 500)
		{
			s = units*9.60;
			t = 45;
			v = (units*9.60)+t;
			System.out.println("You have to pay the money\ncurrent bill : " + s + "\ncustomer charges : " + t + "\nFixed charges : NULL");
			System.out.println("Total bill is : "+v + "/-");
		}
		else if(units>=501)
		{
			s = units*10.15;
			t = 45;
			v = (units*10.15)+t;
			System.out.println("You have to pay the money\ncurrent bill : " + s + "\ncustomer charges : " + t + "\nFixed charges : NULL");
			System.out.println("Total bill is : "+v + "/-");
		}
	}
}
class ElectricityBill
{
	public static void main(String args[])
	{
		int choice, units, currentreading, beforereading, type;
		Scanner obj = new Scanner(System.in);
		Electricity t = new Electricity();
	
		System.out.println("1. House Bill\n2. Shop Bill\nEnter what type of bill");
		choice = obj.nextInt();
		switch(choice)
		{
			case 1 : 	System.out.println("Enter currentreading");
				currentreading = obj.nextInt(); 

				System.out.println("Enter beforereading");
				beforereading = obj.nextInt();
		
				units = currentreading - beforereading;
		
				System.out.println("Units of your reading");
				System.out.println(units);

				if(units <= 75)
				{
					type = 1;
				}
				else if(units <= 225)
				{
					type = 2;
				}
				else
				{
					type = 3;
				}

				switch(type)
				{
					case 1 : t.groupa(units);
					         break;
					case 2 : t.groupb(units);
					         break;
					case 3 : t.groupc(units);
					         break;
				}
				break;
			case 2 : 	System.out.println("Enter currentreading");
				currentreading = obj.nextInt(); 

				System.out.println("Enter beforereading");
				beforereading = obj.nextInt();
		
				units = currentreading - beforereading;
		
				System.out.println("Units of your reading");
				System.out.println(units);

				if(units <= 50)
				{
					type = 1;
				}
				else
				{
					type = 2;
				}
				
				switch(type)
				{
					case 1 : t.groupaa(units);
					         break;
					case 2 : t.groupbb(units);
					         break;
				}
				break;
		}
	}
}
		