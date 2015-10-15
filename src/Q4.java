
//Son Ngo

import javax.swing.JOptionPane;
import java.util.Random;

public class Q4
{

	public static void main(String[] args)
	{
		Random ran = new Random();

		int iDice, iMod, iReply = 0, iGames = 1, iWin = 0;
		double dPercent;

		String sGuess;

		do
		{
			iDice = ran.nextInt(6) + 1;
			iMod = iDice % 2;

			sGuess = JOptionPane.showInputDialog("ODD or EVEN: ");

			if (((sGuess.equals("ODD") && (iMod == 1)) || ((sGuess.equals("EVEN") && (iMod == 0)))))
			{
				iWin += 1;
				dPercent = iWin * 100.0 / iGames;

				iReply = JOptionPane.showConfirmDialog(null,
						String.format(
								"You rolled %d. Your guess is correct.\nYou've played %d times. Your winning percentage is %f%%.\nDo you want to continue?",
								iDice, iGames, dPercent),
						null, JOptionPane.YES_NO_OPTION);
			} else
			{
				dPercent = iWin * 100.0 / iGames;

				iReply = JOptionPane.showConfirmDialog(null,
						String.format(
								"You rolled %d. Your guess is incorrect.\nYou've played %d times. Your winning percentage is %f%%.\nDo you want to continue?",
								iDice, iGames, dPercent),
						null, JOptionPane.YES_NO_OPTION);
			}

			iGames += 1;

		} while (iReply == JOptionPane.YES_OPTION);

	}

}
