import java.awt.Color;
//import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	
	boolean isOperatorClicked=false;
	
	JFrame jf;
	JLabel displayLabel;
	JButton sevenButton,eightButton,nineButton,fourButton,fiveButton,sixButton,oneButton,twoButton,threeButton,zeroButton;
	JButton mulButton,plusButton,minusButton,divButton,equalButton,dotButton,clearButton;
	String oldValue,operator;
	
	public Calculator() {
		jf=new JFrame("Calculator");

		jf.setLayout(null);
		jf.setSize(600,600);
		jf.setLocation(370,140);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		displayLabel=new JLabel("");
		displayLabel.setBounds(30,50,540,40); 
		displayLabel.setBackground(Color.gray);
		displayLabel.setForeground(Color.white);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		
		jf.add(displayLabel);
		
		
		sevenButton=new JButton("7");
		sevenButton.setBounds(30,130,80,80); 
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		
		eightButton=new JButton("8");
		eightButton.setBounds(130,130,80,80);
		eightButton.addActionListener(this); 
		jf.add(eightButton);
		
		nineButton=new JButton("9");
		nineButton.setBounds(230,130,80,80);
		nineButton.addActionListener(this); 
		jf.add(nineButton);
		
		fourButton=new JButton("4");
		fourButton.setBounds(30,230,80,80);
		fourButton.addActionListener(this); 
		jf.add(fourButton);
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(130,230,80,80);
		fiveButton.addActionListener(this); 
		jf.add(fiveButton);
		
		sixButton=new JButton("6");
		sixButton.setBounds(230,230,80,80);
		sixButton.addActionListener(this); 
		jf.add(sixButton);
		
		oneButton=new JButton("1");
		oneButton.setBounds(30,330,80,80); 
		oneButton.addActionListener(this); 
		jf.add(oneButton);
		
		twoButton=new JButton("2");
		twoButton.setBounds(130,330,80,80);
		twoButton.addActionListener(this); 
		jf.add(twoButton);
		
		threeButton=new JButton("3");
		threeButton.setBounds(230,330,80,80);
		threeButton.addActionListener(this); 
		jf.add(threeButton);
		
		equalButton=new JButton("=");
		equalButton.setBounds(130,430,80,80);
		equalButton.addActionListener(this); 
		jf.add(equalButton);
		
		dotButton=new JButton(".");
		dotButton.setBounds(230,430,80,80);
		dotButton.addActionListener(this); 
		jf.add(dotButton);
		
		zeroButton=new JButton("0");
		zeroButton.setBounds(30,430,80,80);
		zeroButton.addActionListener(this); 
		jf.add(zeroButton);
		
		
		divButton=new JButton("/");
		divButton.setBounds(330,130,80,80);
		divButton.addActionListener(this); 
		jf.add(divButton);
		
		mulButton=new JButton("*");
		mulButton.setBounds(330,230,80,80); 
		mulButton.addActionListener(this); 
		jf.add(mulButton);
		
		minusButton=new JButton("-");
		minusButton.setBounds(330,330,80,80); 
		minusButton.addActionListener(this); 
		jf.add(minusButton);
		
		plusButton=new JButton("+");
		plusButton.setBounds(330,430,80,80); 
		plusButton.addActionListener(this); 
		jf.add(plusButton);
		
		clearButton=new JButton("C");
		clearButton.setBounds(430,430,80,80); 
		clearButton.addActionListener(this); 
		jf.add(clearButton);
	}
	
	public static void main(String[] args) {
		new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//jf.getContentPane().setBackground(Color.BLUE);
		
		if(e.getSource()==sevenButton) {
			if(isOperatorClicked) {
				displayLabel.setText("7");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"7"); 
			}
		}else if(e.getSource()==eightButton) {
			if(isOperatorClicked) {
				displayLabel.setText("8");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"8 "); 
			}		
		}else if(e.getSource()==nineButton) {
			if(isOperatorClicked) {
				displayLabel.setText("9");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"9"); 
			}
		}else if(e.getSource()==fourButton) {
			if(isOperatorClicked) {
				displayLabel.setText("4");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"4"); 
			}		
		}else if(e.getSource()==fiveButton) {
			if(isOperatorClicked) {
				displayLabel.setText("5");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"5"); 
			}
		}else if(e.getSource()==sixButton) {
			if(isOperatorClicked) {
				displayLabel.setText("6");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"6"); 
			}
		}else if(e.getSource()==oneButton) {
			if(isOperatorClicked) {
				displayLabel.setText("1");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"1"); 
			}
		}else if(e.getSource()==twoButton) {
			if(isOperatorClicked) {
				displayLabel.setText("2");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"2"); 
			}
		}else if(e.getSource()==threeButton) {
			if(isOperatorClicked) {
				displayLabel.setText("3");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"3"); 
			}
		}else if(e.getSource()==zeroButton) {
			if(isOperatorClicked) {
				displayLabel.setText("0");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"0"); 
			}
		}else if(e.getSource()==mulButton) {
			isOperatorClicked=true;
			operator="*";
			oldValue=displayLabel.getText();
		}else if(e.getSource()==divButton) {
			isOperatorClicked=true;
			operator="/";
			oldValue=displayLabel.getText();
		}else if(e.getSource()==minusButton) {
			isOperatorClicked=true;
			operator="-";
			oldValue=displayLabel.getText();
		}else if(e.getSource()==plusButton) {
			isOperatorClicked=true;
			operator="+";
			oldValue=displayLabel.getText();
		}else if(e.getSource()==dotButton) {
			displayLabel.setText(displayLabel.getText()+".");
		}else if(e.getSource()==equalButton) {
			
			String newValue=displayLabel.getText();
			float oldValueFloat=Float.parseFloat(oldValue);
			float newValueFloat=Float.parseFloat(newValue);
						
			if(operator=="-") {
				float result=oldValueFloat-newValueFloat;
				displayLabel.setText(result+"");

			}else if(operator=="/") {
				float result=oldValueFloat/newValueFloat;
				displayLabel.setText(result+"");

			}else if(operator=="+") {
				float result=oldValueFloat+newValueFloat;
				displayLabel.setText(result+"");

			}else if(operator=="*") {
				float result=oldValueFloat*newValueFloat;
				displayLabel.setText(result+"");

			}
			
		}else if(e.getSource()==clearButton) {
			displayLabel.setText("");
		}
		

		
	}

}
