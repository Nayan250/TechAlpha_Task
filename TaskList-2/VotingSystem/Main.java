import java.util.Scanner;
class Main{
	public static void main(String a[]){
		String nm;
		int age,ch;
		System.out.println("***Voting System***");
		System.out.println("Enter name :");
		Scanner s=new Scanner(System.in);
		nm=s.nextLine();
		System.out.print("Enter age :");
		age=s.nextInt();
		System.out.println("***Press***\n1 for BJP\n2 for Congress\n3 for AAP\n4 Nota\n");
		ch=s.nextInt();
		String vote;
		if(age>17 && age<101){
			switch(ch){
				case 1:
				vote="BJP";
				break;
				case 2:
				vote="Congress";
				break;
				case 3:
				vote="AAP";
				break;
				case 4:
				vote="Nota";
				break;
				default:
					vote="";
					System.out.println("Not Press given choice");
			}
			if(ch>0 && ch<5){
				System.out.println("Congratulation for your vote...!");
				System.out.println("Name :" + nm + "\nAge :" + age + "\nVote :" + vote);
			}
		}else{
			System.out.println("Sorry, You are not eligible for vote..!");
		}
	}
}