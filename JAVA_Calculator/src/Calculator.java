
import javax.swing.JFrame;

public class Calculator {
	public Calculator(){
		JFrame jf = new JFrame("My Calculator");
		jf.setLayout(null);
		jf.setSize(600,600);
	    jf.setLocation(200,100);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
	}

}