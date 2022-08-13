
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants; 

public class Calculator {
	public Calculator(){
		JFrame jf = new JFrame("My Calculator");
		jf.setLayout(null);
		jf.setSize(600,600);
	    jf.setLocation(200,100);
	    
	    JLabel displayLabel = new JLabel("Screen");
		displayLabel.setBounds(30,50,540,40);
		displayLabel.setBackground(Color.gray);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT); // to allign text in label to right
		displayLabel.setForeground(Color.white);
		jf.add(displayLabel);
		
		// First Row --- Starts
			JButton sevenButton = new JButton("7");
			sevenButton.setBounds(90, 130, 80, 80);
			jf.add(sevenButton);
		
			JButton eightButton = new JButton("8");
			eightButton.setBounds(200, 130, 80, 80);
			jf.add(eightButton);
			
			JButton nineButton = new JButton("9");
			nineButton.setBounds(310, 130, 80, 80);
			jf.add(nineButton);
		
			JButton divideButton = new JButton("/");
			divideButton.setBounds(420, 130, 80, 80);
			jf.add(divideButton);
		// First Row --- Ends
		
		// Second Row --- Starts
			JButton fourButton = new JButton("4");
			fourButton.setBounds(90, 230, 80, 80);
			jf.add(fourButton);
				
			JButton fiveButton = new JButton("5");
			fiveButton.setBounds(200, 230, 80, 80);
			jf.add(fiveButton);
				
			JButton sixButton = new JButton("6");
			sixButton.setBounds(310, 230, 80, 80);
			jf.add(sixButton);
				
			JButton multiplyButton = new JButton("X");
			multiplyButton.setBounds(420, 230, 80, 80);
			jf.add(multiplyButton);
		// Second Row --- Ends
			
		// Third Row --- Starts
			JButton oneButton = new JButton("1");
			oneButton.setBounds(90, 330, 80, 80);
			jf.add(oneButton);
							
			JButton twoButton = new JButton("2");
			twoButton.setBounds(200, 330, 80, 80);
			jf.add(twoButton);
							
			JButton threeButton = new JButton("3");
			threeButton.setBounds(310, 330, 80, 80);
			jf.add(threeButton);
							
			JButton minusButton = new JButton("-");
			minusButton.setBounds(420, 330, 80, 80);
			jf.add(minusButton);
		// Third Row --- Ends
			
		// Fourth Row --- Starts
			JButton dotButton = new JButton(".");
			dotButton.setBounds(90, 430, 80, 80);
			jf.add(dotButton);
										
			JButton zeroButton = new JButton("0");
			zeroButton.setBounds(200, 430, 80, 80);
			jf.add(zeroButton);
										
			JButton equalButton = new JButton("=");
			equalButton.setBounds(310, 430, 80, 80);
			jf.add(equalButton);
										
			JButton plusButton = new JButton("+");
			plusButton.setBounds(420, 430, 80, 80);
			jf.add(plusButton);
		// Fourth Row --- Ends
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
	}

}