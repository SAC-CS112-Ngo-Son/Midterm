
//Son Ngo

import javax.swing.JOptionPane;
import java.util.Random;

public class Q6
{

	public static void main(String[] args)
	{
		Random ran = new Random();

		int iDice, iMod, iReply = 0, iGames = 1, iWin = 0, iEven = 0, iOdd = 0;
		double dPercentWin, dPercentEven, dPercentOdd;

		String sGuess;

		do
		{
			iDice = ran.nextInt(6) + 1;
			iMod = iDice % 2;

			if (iMod == 1)
				iOdd += 1;

			dPercentOdd = iOdd * 100.0 / iGames;

			sGuess = JOptionPane.showInputDialog("ODD or EVEN: ");

			while ((!sGuess.equals("ODD")) && (!sGuess.equals("EVEN")))
			{
				sGuess = JOptionPane.showInputDialog("Please enter again. ODD or EVEN: ");
			}

			if (((sGuess.equals("ODD") && (iMod == 1)) || ((sGuess.equals("EVEN") && (iMod == 0)))))
			{
				if (sGuess.equals("EVEN"))
					iEven += 1;

				iWin += 1;
				dPercentWin = iWin * 100.0 / iGames;
				dPercentEven = iEven * 100.0 / iGames;

				iReply = JOptionPane.showConfirmDialog(null,
						String.format(
								"You rolled %d. Your guess is correct.\nYou've played %d times. Your winning percentage is %f%%.\nYou've guessed EVEN %f%% of the times.\nYou've rolled an odd number %f%% of the times.\nDo you want to continue?",
								iDice, iGames, dPercentWin, dPercentEven, dPercentOdd),
						null, JOptionPane.YES_NO_OPTION);
			} else
			{
				if (sGuess.equals("EVEN"))
					iEven += 1;

				dPercentWin = iWin * 100.0 / iGames;
				dPercentEven = iEven * 100.0 / iGames;

				iReply = JOptionPane.showConfirmDialog(null,
						String.format(
								"You rolled %d. Your guess is incorrect.\nYou've played %d times. Your winning percentage is %f%%.\nYou've guessed EVEN %f%% of the times.\nYou've rolled an odd number %f%% of the times.\nDo you want to continue?",
								iDice, iGames, dPercentWin, dPercentEven, dPercentOdd),
						null, JOptionPane.YES_NO_OPTION);
			}

			iGames += 1;

		} while (iReply == JOptionPane.YES_OPTION);

	}

}
