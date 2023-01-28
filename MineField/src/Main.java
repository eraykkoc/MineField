import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int row,column;
		System.out.println("Let's Play Main Field");
		System.out.println("Please enter the size of field");
		System.out.print("Number of rows : ");
		row = scan.nextInt();
		System.out.print("Number of columns : ");
		column = scan.nextInt();
		
		MineField mine = new MineField(row,column);
		mine.run();

	}
}