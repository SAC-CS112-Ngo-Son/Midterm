
//Son Ngo

import javax.swing.JOptionPane;
import java.util.Random;

public class Q1
{

	public static void main(String[] args)
	{
		Random ran = new Random();

		int iDice = ran.nextInt(6) + 1;
		int iMod = iDice % 2;

		String sGuess;

		sGuess = JOptionPane.showInputDialog("ODD or EVEN: ");

		if (((sGuess.equals("ODD") && (iMod == 1)) || ((sGuess.equals("EVEN") && (iMod == 0)))))
			JOptionPane.showMessageDialog(null, String.format("You rolled %d. Your guess is correct.", iDice));
		else
			JOptionPane.showMessageDialog(null, String.format("You rolled %d. Your guess is incorrect.", iDice));

	}

}
