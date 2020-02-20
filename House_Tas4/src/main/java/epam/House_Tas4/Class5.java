package epam.House_Tas4;

import java.util.Scanner;



public class Class5 {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Which type of material you want\n 1)standard materials \n2)above standard materials\n 3) high standard material \n 4) high standard material and fully automated home" );
	int material_standards=sc.nextInt();
	System.out.print("Enter the area of the house in square feets");
	double house_area=sc.nextDouble();
	Class4 details=new Class4();
	double house_cost;
	house_cost=details.construction(material_standards,house_area);
	System.out.print("cost of the House"+house_cost);
	sc.close();
	
	}
}
