import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class cabproject {
	public static void main(String[] args) {
		double gst = 0.07;
		double pgst = 0.0125;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a mobile number(10 digit)=");
		String mobileNumber = sc.next();
		System.out.print("Enter the password(8 digit)=");
		String passWord = sc.next();
		System.out.println(
				"OFFERS:\nFor age above 60 ,50% offer\n" + "During peak time(5pm to 7pm) GST=1.25%\nNormal GST=7%");
		System.out.println("1.MICRO(Rs10/Km)\n2.MINI(Rs15/Km)\n3.PRIME(Rs20/Km)");
		System.out.print("Enter a number of a cab=");
		int cab = sc.nextInt();
		// correct
		if (cab == 1) {
			System.out.print("Enter the Km=");
			int c1 = sc.nextInt();
			System.out.print("Enter the journey date(yyyy-mm-dd)=");
			String journeyDate = sc.next();
			System.out.print("Enter the pickup time=(hh:mm:ss)=");
			String journeyTime = sc.next();
			LocalTime a = LocalTime.parse(journeyTime);
			int a1 = a.getHour();
			System.out.print("Enter the date of birth(yyyy-mm-dd)=");
			String dateOfBirth = sc.next();
			LocalDate d = LocalDate.parse(dateOfBirth);
			int year = d.getYear();
			LocalDate now = LocalDate.now();
			int cur = now.getYear();
			double rs = c1 * 10;
			double rsg = (rs * gst) + rs;
			// correct
			if ((a1 >= 17 && a1 <= 19) && ((cur - year) > 60)) {
				double rspy = ((rsg * pgst) + rsg) * 0.5;
				System.out.println("The amount is=" + rspy);
			} else if (a1 >= 17 && a1 <= 19) {
				double rsp = (rsg * pgst) + rsg;
				System.out.print("The amount is=" + rsp);
			} else if ((cur - year) > 60) {
				double rupee = rsg * 0.5;
				System.out.print("The amount is =" + rupee);
			} else {
				System.out.print("The amount is=" + rsg);
			}
		}
		if (cab == 2) {
			System.out.print("Enter the Km=");
			int c2 = sc.nextInt();
			System.out.print("Enter the journey date(yyyy-mm-dd)=");
			String journeyDate = sc.next();
			System.out.print("Enter the pickup time(hh:mm:ss)=");
			String journeyTime = sc.next();
			LocalTime a = LocalTime.parse(journeyTime);
			int a2 = a.getHour();
			System.out.print("Enter the date of birth(yyyy-mm-dd)=");
			String dateOfBirth = sc.next();
			LocalDate d = LocalDate.parse(dateOfBirth);
			int year = d.getYear();
			LocalDate now = LocalDate.now();
			int cur = now.getYear();
			double rs = c2 * 15;
			double rsg = (rs * gst) + rs;
			// correct
			if ((a2 >= 17 && a2 <= 19) && ((cur - year) > 60)) {
				double rspy = ((rsg * pgst) + rsg) * 0.5;
				System.out.println("The amount is=" + rspy);
			} else if (a2 >= 17 && a2 <= 19) {
				double rsp = (rsg * pgst) + rsg;
				System.out.print("The amount is=" + rsp);
			} else if ((cur - year) > 60) {
				double rupee = rsg * 0.5;
				System.out.print("The amount is =" + rupee);
			} else {
				System.out.print("The amount is=" + rsg);
			}

		}
		if (cab == 3) {
			System.out.print("Enter the Km=");
			int c3 = sc.nextInt();
			System.out.print("Enter the journey date(yyyy-mm-dd)=");
			String journeyDate = sc.next();
			System.out.print("Enter the pickup time(hh:mm:ss)=");
			String journeyTime = sc.next();
			LocalTime a = LocalTime.parse(journeyTime);
			int a3 = a.getHour();
			System.out.print("Enter the date of birth(yyyy-mm-dd)=");
			String dateOfBirth = sc.next();
			LocalDate d = LocalDate.parse(dateOfBirth);
			int year = d.getYear();
			LocalDate now = LocalDate.now();
			int cur = now.getYear();
			double rs = c3 * 20;
			double rsg = (rs * gst) + rs;
			// correct
			if ((a3 >= 17 && a3 <= 19) && ((cur - year) > 60)) {
				double rspy = ((rsg * pgst) + rsg) * 0.5;
				System.out.println("The amount is=" + rspy);
			} else if (a3 >= 17 && a3 <= 19) {
				double rsp = (rsg * pgst) + rsg;
				System.out.print("The amount is=" + rsp);
			} else if ((cur - year) > 60) {
				double rupee = rsg * 0.5;
				System.out.print("The amount is =" + rupee);
			} else {
				System.out.print("The amount is=" + rsg);
			}
		}
	}
}
