
import javax.swing.JOptionPane;

public class IfElseProgram {

	public static void main(String[] args)
	{
		String numPeopleStr = JOptionPane.showInputDialog("Enter the number of people.");

		int numPeople = Integer.parseInt(numPeopleStr);

		int groupSize=0;

		if (numPeople > 10) 
		{
			groupSize = numPeople / 2;
			
			JOptionPane. showMessageDialog(null,"The number of people is "+numPeople+". The group size is "+groupSize + ".");
		}
		else if ((numPeople >=3) && (numPeople <=10)) 
		{
			groupSize = numPeople/3;
			
			JOptionPane. showMessageDialog(null,"The number of people is "+numPeople+". The group size is "+groupSize + ".");
		}
		
		else 
		{	
			JOptionPane.showMessageDialog(null, "The number of people has to be at least 3.");	
		}
		
		String numPlayersStr = JOptionPane.showInputDialog("Enter the number of players.");

		int numPlayers = Integer.parseInt(numPlayersStr);

		int teamSize;	
		
		if ((numPlayers >= 11) && (numPlayers <= 55))
		{
			teamSize = numPlayers/11;
		}
			
		else	
		{	
			teamSize = 1;		
		}
			
		JOptionPane. showMessageDialog(null,"The number of players is "+numPlayers+". The team size is "+teamSize+ ".");

	}
}