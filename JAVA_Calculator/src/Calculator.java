
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants; 

public class Calculator implements ActionListener{
	
	JFrame jf = new JFrame("My Calculator");
	JLabel displayLabel = new JLabel();
	JButton sevenButton = new JButton("7");
	JButton eightButton = new JButton("8");
	JButton nineButton = new JButton("9");
	JButton divideButton = new JButton("/");
	JButton fourButton = new JButton("4");
	JButton fiveButton = new JButton("5");
	JButton sixButton = new JButton("6");
	JButton multiplyButton = new JButton("X");
	JButton oneButton = new JButton("1");
	JButton twoButton = new JButton("2");
	JButton threeButton = new JButton("3");
	JButton minusButton = new JButton("-");
	JButton dotButton = new JButton(".");
	JButton zeroButton = new JButton("0");
	JButton equalButton = new JButton("=");
	JButton plusButton = new JButton("+");
	JButton clearButton = new JButton("C");
	
	boolean isOperatorClicked = false;
	String oldValue,newValue;
	String checkOperator = "";
	float result=0;
	
	public Calculator(){
		
		jf.setLayout(null);
		jf.setSize(550,550);
	    jf.setLocation(200,100);
	    
	    
		displayLabel.setBounds(30,50,475,40);
		displayLabel.setBackground(Color.gray);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT); // to allign text in label to right
		displayLabel.setForeground(Color.white);
		displayLabel.setFont(new Font("Arial", Font.PLAIN,30));
		jf.add(displayLabel);
		
		// First Row --- Starts
		
		clearButton.setBounds(70, 120, 100, 50);
		clearButton.setFont(new Font("Arial", Font.PLAIN,30));
		jf.add(clearButton);
		clearButton.addActionListener(this);
			
			sevenButton.setBounds(70, 200, 50, 50);
			sevenButton.setFont(new Font("Arial", Font.PLAIN,20));
			jf.add(sevenButton);
			sevenButton.addActionListener(this);
		
			
			eightButton.setBounds(150, 200, 50, 50);
			eightButton.setFont(new Font("Arial", Font.PLAIN,20));
			jf.add(eightButton);
			eightButton.addActionListener(this);
			
			
			nineButton.setBounds(230, 200, 50, 50);
			nineButton.setFont(new Font("Arial", Font.PLAIN,20));
			jf.add(nineButton);
			nineButton.addActionListener(this);
		
			
			divideButton.setBounds(310, 200, 50, 50);
			divideButton.setFont(new Font("Arial", Font.PLAIN,20));
			jf.add(divideButton);
			divideButton.addActionListener(this);
		// First Row --- Ends
		
		// Second Row --- Starts
			
			fourButton.setBounds(70, 280, 50, 50);
			fourButton.setFont(new Font("Arial", Font.PLAIN,20));
			jf.add(fourButton);
			fourButton.addActionListener(this);
				
			
			fiveButton.setBounds(150, 280, 50, 50);
			fiveButton.setFont(new Font("Arial", Font.PLAIN,20));
			jf.add(fiveButton);
			fiveButton.addActionListener(this);
				
			
			sixButton.setBounds(230, 280, 50, 50);
			sixButton.setFont(new Font("Arial", Font.PLAIN,20));
			jf.add(sixButton);
			sixButton.addActionListener(this);
				
			
			multiplyButton.setBounds(310, 280, 50, 50);
			multiplyButton.setFont(new Font("Arial", Font.PLAIN,20));
			jf.add(multiplyButton);
			multiplyButton.addActionListener(this);
		// Second Row --- Ends
			
		// Third Row --- Starts
			
			oneButton.setBounds(70, 360, 50, 50);
			oneButton.setFont(new Font("Arial", Font.PLAIN,20));
			jf.add(oneButton);
			oneButton.addActionListener(this);
							
			
			twoButton.setBounds(150, 360, 50, 50);
			twoButton.setFont(new Font("Arial", Font.PLAIN,20));
			jf.add(twoButton);
			twoButton.addActionListener(this);
							
			
			threeButton.setBounds(230, 360, 50, 50);
			threeButton.setFont(new Font("Arial", Font.PLAIN,20));
			jf.add(threeButton);
			threeButton.addActionListener(this);
							
			
			minusButton.setBounds(310, 360, 50, 50);
			minusButton.setFont(new Font("Arial", Font.PLAIN,20));
			jf.add(minusButton);
			minusButton.addActionListener(this);
		// Third Row --- Ends
			
		// Fourth Row --- Starts
			
			dotButton.setBounds(70, 440, 50, 50);
			dotButton.setFont(new Font("Arial", Font.PLAIN,20));
			jf.add(dotButton);
			dotButton.addActionListener(this);
										
			
			zeroButton.setBounds(150, 440, 50, 50);
			zeroButton.setFont(new Font("Arial", Font.PLAIN,20));
			jf.add(zeroButton);
			zeroButton.addActionListener(this);
										
			
			equalButton.setBounds(230, 440, 50, 50);
			equalButton.setFont(new Font("Arial", Font.PLAIN,20));
			jf.add(equalButton);
			equalButton.addActionListener(this);
										
			
			plusButton.setBounds(310, 440, 50, 50);
			plusButton.setFont(new Font("Arial", Font.PLAIN,20));
			jf.add(plusButton);
			plusButton.addActionListener(this);
		// Fourth Row --- Ends
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
			
		if(e.getSource()==sevenButton) {
			
			if(isOperatorClicked == true) {
				displayLabel.setText("7");
				isOperatorClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"7");
			}	
		}
		else if(e.getSource()==eightButton) {
			
			if(isOperatorClicked == true) {
				displayLabel.setText("8");
				isOperatorClicked=false;
			}
			
			else {
				displayLabel.setText(displayLabel.getText()+"8");
			}
		}
		else if(e.getSource()==nineButton) {
			
			if(isOperatorClicked == true) {
				displayLabel.setText("9");
				isOperatorClicked=false;
			}
			
			else {
				displayLabel.setText(displayLabel.getText()+"9");
			}
		}
		else if(e.getSource()==divideButton) {
			oldValue = displayLabel.getText();
			isOperatorClicked=true;
			checkOperator = "/";
		}
		else if(e.getSource()==fourButton) {
			
			if(isOperatorClicked == true) {
				displayLabel.setText("4");
				isOperatorClicked=false;
			}
			
			else {
				displayLabel.setText(displayLabel.getText()+"4");
			}
		}
		else if(e.getSource()==fiveButton) {
			
			if(isOperatorClicked == true) {
				displayLabel.setText("5");
				isOperatorClicked=false;
			}
			
			else {
				displayLabel.setText(displayLabel.getText()+"5");
			}
		}
		else if(e.getSource()==sixButton) {
			
			if(isOperatorClicked == true) {
				displayLabel.setText("6");
				isOperatorClicked=false;
			}
			
			else {
				displayLabel.setText(displayLabel.getText()+"6");
			}
		}
		else if(e.getSource()==multiplyButton) {
			oldValue = displayLabel.getText();
			isOperatorClicked=true;
			checkOperator = "X";
		}
		else if(e.getSource()==oneButton) {
			
			if(isOperatorClicked == true) {
				displayLabel.setText("1");
				isOperatorClicked=false;
			}
			
			else {
				displayLabel.setText(displayLabel.getText()+"1");
			}
		}
		else if(e.getSource()==twoButton) {
			
			if(isOperatorClicked == true) {
				displayLabel.setText("2");
				isOperatorClicked=false;
			}
			
			else {
				displayLabel.setText(displayLabel.getText()+"2");
			}
		}
		else if(e.getSource()==threeButton) {
			
			if(isOperatorClicked == true) {
				displayLabel.setText("3");
				isOperatorClicked=false;
			}
			
			else {
				displayLabel.setText(displayLabel.getText()+"3");
			}
		}
		else if(e.getSource()==minusButton) {
			oldValue = displayLabel.getText();
			isOperatorClicked=true;
			checkOperator = "-";
		}
		else if(e.getSource()==dotButton) {
			displayLabel.setText(displayLabel.getText()+".");
		}
		else if(e.getSource()==zeroButton) {
			
			if(isOperatorClicked == true) {
				displayLabel.setText("0");
				isOperatorClicked=false;
			}
			
			else {
				displayLabel.setText(displayLabel.getText()+"0");
			}
		}
		else if(e.getSource()==plusButton) {
			oldValue = displayLabel.getText();
			isOperatorClicked=true;
			checkOperator = "+";
		}
		else if(e.getSource()==equalButton) {
			newValue=displayLabel.getText();
			if(checkOperator.equals("+")) {
				result = Float.parseFloat(oldValue) + Float.parseFloat(newValue);
				displayLabel.setText(Float.toString(result));
			}
			
			if(checkOperator.equals("-")) {
				result = Float.parseFloat(oldValue) - Float.parseFloat(newValue);
				displayLabel.setText(Float.toString(result));
			}
			
			if(checkOperator.equals("X")) {
				result = Float.parseFloat(oldValue) * Float.parseFloat(newValue);
				displayLabel.setText(Float.toString(result));
			}
			
			if(checkOperator.equals("/")) {
				result = Float.parseFloat(oldValue) / Float.parseFloat(newValue);
				displayLabel.setText(Float.toString(result));
			}
			
		}
		else if(e.getSource()==clearButton) {
			displayLabel.setText("");
		}
		else {
			displayLabel.setText("ERROR");
		}
	
		
	}

}