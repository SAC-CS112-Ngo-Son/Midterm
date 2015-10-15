
//Son Ngo

import javax.swing.JOptionPane;
import java.util.Random;

public class Q2
{

	public static void main(String[] args)
	{
		Random ran = new Random();

		int iDice, iMod, iReply = 0;

		String sGuess;
		
		do
		{
			iDice = ran.nextInt(6) + 1;
			iMod = iDice % 2;
			
			sGuess = JOptionPane.showInputDialog("ODD or EVEN: ");

			if (((sGuess.equals("ODD") && (iMod == 1)) || ((sGuess.equals("EVEN") && (iMod == 0)))))
				iReply = JOptionPane.showConfirmDialog(null, String.format("You rolled %d. Your guess is correct.\nDo you want to continue?", iDice), null, JOptionPane.YES_NO_OPTION);
			else
				iReply = JOptionPane.showConfirmDialog(null, String.format("You rolled %d. Your guess is incorrect.\nDo you want to continue?", iDice), null, JOptionPane.YES_NO_OPTION);
		
		} while (iReply == JOptionPane.YES_OPTION);
		
	}

}
