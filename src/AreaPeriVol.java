import java.util.Scanner;

public class AreaPeriVol {

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		boolean b=true;
		while(b==true)
		{
		System.out.println("Enter the length of the room");
		double len=scr.nextDouble();
		System.out.println("Enter the width of the room");
		double width=scr.nextDouble();
		System.out.println("Enter the height of the room");
		double height=scr.nextDouble();
		double area=0;
		double perimeter=0;
		double volume=0;
		area=len*width;
		perimeter=2*(len+width);
		volume=len*width*height;
		System.out.println("Area of the romm is "+area);
		System.out.println("Perimeter of the room is "+perimeter);
		System.out.println("Volume of the room is "+volume);
		System.out.println("Do you want to continue:(y/n)");
	    b=scr.next().toLowerCase().startsWith("y");	
		}	
		scr.close();
	}

}
