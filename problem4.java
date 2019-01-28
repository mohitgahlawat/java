import java.util.Scanner;
public class problem4
{
	public static void main(string[] args){
		double minuteinyear = 60*24*365;
		Scanner input = new scanner(system.in);
		System.out.print("input the number of minutes:");
		double min = input.nextDouble();
		long years = (long)(min/minutesinyear);
		int days = (int) (min/60/24)%365;
		System.out.println ((int) min + " minutes is approximately " + years + " years and " + days + "days");
			}
}