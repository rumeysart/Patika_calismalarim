package interfce;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the amount: ");
		double price = input.nextDouble();
		
		System.out.print("Enter the card no: ");
		String cardNumber = input.next();
		
		System.out.print("Enter the expire date: ");
		String date = input.next();
		
		System.out.print("Enter the CVC: ");
		String cvc = input.next();
		
		System.out.println("1. Bank A");
		System.out.println("2. Bank B");
		System.out.println("3. Bank C");
		System.out.println("Select a bank: ");
		int selectBank = input.nextInt();
		
		switch(selectBank)
		{
		case 1:
			BankA aPos = new BankA("Bank A", "56520556", "872331");
			aPos.connect("127.0.0.1");
			aPos.payment(price, cardNumber, date, cvc);
			break;
		case 2:
			bankB bPos = new bankB("Bank B", "5654218748", "820149");
			bPos.connect("127.0.0.1");
			bPos.payment(price, cardNumber, date, cvc);
			break;
		default:
			System.out.println("Make a valid select");	
		}

	}

}
