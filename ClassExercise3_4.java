/**
 * Author: Eli Brennan
 * Class: CSC200
 * 
 */
import javax.swing.JOptionPane;
public class ClassExercise3_4 {
	public static void main(String[] args) {
		// Declaring integers.
		int groupSize, teamSize, numberOfPlayersInt, numberOfPeopleInt;
		// Prompting for number of people with JOptionPane class.
		String numberOfPeople = JOptionPane.showInputDialog(
			null,
			"Please enter the number of people.");
		// Here I convert the string into an integer and name it numberOfPeopleInt.
		numberOfPeopleInt = Integer.parseInt(numberOfPeople);
		// Here starts the first if else statement that puts it into a group size and displaying the number of people as
		// well as the group size with JOptionPane.
		if (numberOfPeopleInt > 10)  {
			groupSize =  numberOfPeopleInt / 2;
			JOptionPane.showMessageDialog(null, "The number of people is " + numberOfPeopleInt + 
					" and the group size is " + groupSize + "." );	
		} else if ((3 < numberOfPeopleInt) && (numberOfPeopleInt <= 10)) {
			groupSize = numberOfPeopleInt / 3;
			JOptionPane.showMessageDialog(null, "The number of people is " + numberOfPeopleInt + 
					" and the group size is " + groupSize + "." );
		}else{	
			JOptionPane.showMessageDialog(null, "The number of people has to be at least 3.");
		}
		// Here I prompt for the number of players with JOptionPane.
		String numberOfPlayers = JOptionPane.showInputDialog(
				null,
				"Please enter the number of players.");
		numberOfPlayersInt = Integer.parseInt(numberOfPlayers);
		// This determines the teamsize with an if else statement, then displays a message about the number of 
		// players and the team size.
		if ((11 < numberOfPlayersInt) && (numberOfPlayersInt < 55))  {
			teamSize = numberOfPlayersInt / 11;
		}else{
			teamSize = 1;
		}
		JOptionPane.showMessageDialog(null, "The number of players is " + numberOfPlayersInt + 
				" and the team size is " + teamSize + "." );
		
		
		
	
		    
	}
	
}
