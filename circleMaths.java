
import java.util.Scanner;
/*ask the user for the radius of a sphere, and call method
sphereVolume to calculate and display the volume of the sphere. Use the following statement to calculate the
volume:  volume = (4/3) * Math.PI * MAth.pow *( radius * 3)*/
public class circleMaths {
	
	public static void main(String[] args) {
		double radius = 0.0;
		double volume = 0.0;
		System.out.print("Enter the radius of the circle: ");
		Scanner inputScanner = new Scanner(System.in);
		radius = inputScanner.nextDouble();		
		inputScanner.close();
		System.out.print("The volume of the circle is: " + sphereVolume(radius, volume) + "cm^2");
	}
	
	public static double sphereVolume (double radius, double volume)
	{
		volume = (4/3) * Math.PI * Math.pow(radius, 3);
		return volume;
	}

}
