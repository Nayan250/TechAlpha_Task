import java.util.Scanner;
class Main{
	static int getSeat(Scanner sc){
		System.out.print("Enter seats to reserve :");
		int s=sc.nextInt();
		return s;
	}
	public static void main(String a[]){
		System.out.println("***Airline Reservation System***");
		System.out.println("***Available Flights***\nMumbai-Delhi -> 9:00 AM Available seats -> 15\nMumbai-Pune -> 10:00 PM Available seats -> 20\nDelhi-Ahmedabad -> 12:00 PM Available seats -> 30\n");
		System.out.println("***Press***\n1 for flight-1 select\n2 for flight-2 select\n3 for flight-3 select");
		Scanner s=new Scanner(System.in);
		int ch=s.nextInt();
		int seat=getSeat(s);
		switch(ch){
			case 1:
				if(seat<=15 && seat>=0){
					System.out.println("Congratulations, seats are book..!");
				}else{
					System.out.println("Oh sorry, seats are already booked..!");
				}
				break;
			case 2:
				if(seat<=20 && seat>=0){
					System.out.println("Congratulations, seats are book..!");
				}else{
					System.out.println("Oh sorry, seats are already booked..!");
				}
				break;
			case 3:
				if(seat<=30 && seat>=0){
					System.out.println("Congratulations, seats are book..!");
				}else{
					System.out.println("Oh sorry, seats are already booked..!");
				}
				break;
			default:
				System.out.println("Invalid choice...!");
		}
	}
}