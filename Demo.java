import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Demo{
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		Random rand =new Random();
		int num=rand.nextInt(100)+1;
		int guess;
		int count=0;
		while(true) {
			int x=Integer.parseInt(JOptionPane.showInputDialog("Enter a num(1-100)"));
			if(x==num) {
				JOptionPane.showMessageDialog(null,"you winn!!!!");
				break;
			}
			else if(x>num) {
				JOptionPane.showMessageDialog(null,"guess is higher try again");
			}
			else {
				JOptionPane.showMessageDialog(null,"guess is lower try again");
			}
			count++;
		}
		JOptionPane.showMessageDialog(null,"It took you "+count+" times");
	}
}