import javax.swing.JOptionPane;


public class SwitchCodeRoles { 
	

	public static void main(String[] args) {
		String roleOptions= JOptionPane.showInputDialog("Enter your role.");
		switch(roleOptions) {
		case "Administrator":
			System.out.println("Hello "+ roleOptions);
			break;
		case "Faculty":
			System.out.println("Hello "+ roleOptions);
			break;
		case "Staff":
			System.out.println("Hello "+ roleOptions);
			break;
		case "StudentGuest":
			System.out.println("Hello "+ roleOptions);
			break;
		default:
			System.out.println("Hello");
		}
	
	}

}
