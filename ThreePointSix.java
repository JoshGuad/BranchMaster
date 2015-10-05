import javax.swing.JOptionPane;
public class ThreePointSix {
	public enum MonthPicked {June, July, August, September, October, November, December, January, February, March, April, May}
	public static void main(String[] args) {
		MonthPicked [] choices = {MonthPicked.June, MonthPicked.July, MonthPicked.August, MonthPicked.September, MonthPicked.October, MonthPicked.November, MonthPicked.December, MonthPicked.January, MonthPicked.February, MonthPicked.March, MonthPicked.April, MonthPicked.May};
	
		while(true){
		MonthPicked select = (MonthPicked) JOptionPane.showInputDialog(null, "Select your Month.", "Month Picked", JOptionPane.QUESTION_MESSAGE, null, choices, choices[11]);


		switch(select) {
		case June :
			JOptionPane.showMessageDialog(null, "It’s a summer time. ");
			break;
		case July :
			JOptionPane.showMessageDialog(null, "It’s a summer time. ");
			break;
		case August :
			JOptionPane.showMessageDialog(null, "It’s a summer time. ");
			break;
		case September :
			JOptionPane.showMessageDialog(null, "Welcome to the foliage season! ");
			break;
		case October :
			JOptionPane.showMessageDialog(null, "Welcome to the foliage season! ");
			break;
		case November :
			JOptionPane.showMessageDialog(null, "Welcome to the foliage season! ");
			break;
		case December :
			JOptionPane.showMessageDialog(null, "Do you want to build a snow man? ");
			break;
		case January :
			JOptionPane.showMessageDialog(null, "Do you want to build a snow man? ");
			break;
		case February :
			JOptionPane.showMessageDialog(null, "Do you want to build a snow man? ");
			break;
		case March :
			JOptionPane.showMessageDialog(null, "Happy Spring days ");
			break;
		case April :
			JOptionPane.showMessageDialog(null, "Happy Spring days ");
			break;
		case May :
			JOptionPane.showMessageDialog(null, "Happy Spring days ");
			break;
		default:
			JOptionPane.showMessageDialog(null, "");
		
		}
		}
	}
}
