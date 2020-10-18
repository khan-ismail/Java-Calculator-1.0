import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Calsi extends Frame
{
	private TextField t1,disableText;
	private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17,b18;
	private static String action = "";
	private static int num1 = 0;
	private static int num2 = 0;
	private static double result = 0;
		public Calsi(String s)
		{
			super(s);
			setVisible(true);
			setSize(290,365);
			setLayout(null);
			initComponent();
			ClosingButton();
			setLocation(500,250);

			
		}
	
		/***
		* Closing method with Cross button.
		*/	
		private void ClosingButton()
		{
			addWindowListener(new WindowAdapter(){
				public void windowClosing(WindowEvent e)
				{
					System.exit(0);
				}
			});
		}
	
		/**
		* Initialization all the Component
		*/
		private void initComponent()
		{
			setResizable(false);
			t1 = new TextField("0");
			t1.setBounds(20,40,150,30);
			Font f = new Font("Calibir",Font.PLAIN,17);
			t1.setFont(f);
			add(t1);
			
			disableText = new TextField();
			disableText.setBounds(180,40,90,30);
			disableText.setFont(f);
			add(disableText);
			disableText.setEnabled(false);
				
			/**
			* Adding the Button in the Frame;
			*/
			Font b = new Font("Calibri",Font.BOLD,15);
			
			b1 = new Button(" C ");
			b1.setBounds(20,85,55,40);
			b1.setFont(b);
			add(b1);
			b1.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e)
				{
					t1.setText("");
					disableText.setText("");
				}
			});
		
			b2 = new Button(" / ");
			b2.setBounds(85,85,55,40);
			b2.setFont(b);
			add(b2);
			b2.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e)
				{
					action = "/";
					num1 = Integer.parseInt(t1.getText());
					disableText.setText(String.valueOf(num1)+"/");
					t1.setText("");
				}
			});
			
			b3 = new Button(" * ");
			b3.setBounds(150,85,55,40);
			b3.setFont(b);
			add(b3);
			b3.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e)
				{
					action = "*";
					num1 = Integer.parseInt(t1.getText());
					disableText.setText(String.valueOf(num1)+"*");
					t1.setText("");
				}
			});
		
			b4 = new Button(" - ");
			b4.setBounds(215,85,55,40);
			b4.setFont(b);
			add(b4);
			b4.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e)
				{
					action = "-";
					num1 = Integer.parseInt(t1.getText());
					disableText.setText(String.valueOf(num1)+"-");
					t1.setText("");
				}
			});
		
			b5 = new Button(" 7 ");
			b5.setBounds(20,140,55,40);
			b5.setFont(b);
			add(b5);
			b5.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e)
				{
					String str = t1.getText().trim() + b5.getLabel().trim();
					t1.setText(str);
				}	
			});
		
			b6 = new Button(" 8 ");
			b6.setBounds(85,140,55,40);
			b6.setFont(b);
			add(b6);
			b6.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e)
				{
					String str = t1.getText().trim() + b6.getLabel().trim();
					t1.setText(str);
				}
		});
		
			b7 = new Button(" 9 ");
			b7.setBounds(150,140,55,40);
			b7.setFont(b);
			add(b7);
			b7.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e)
				{
					String str = t1.getText().trim() + b7.getLabel().trim();
					t1.setText(str);
				}
			});
		
			b8 = new Button(" + ");
			b8.setBounds(215,140,55,40);
			b8.setFont(b);
			add(b8);
			b8.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e)
				{
					action = "+";
					num1 = Integer.parseInt(t1.getText());
					disableText.setText(String.valueOf(num1)+"+");
					t1.setText("");
				}
			});
		
			///
			b9 = new Button(" 4 ");
			b9.setBounds(20,195,55,40);
			b9.setFont(b);
			add(b9);
			b9.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e)
				{
					String str = t1.getText().trim() + b9.getLabel().trim();
					t1.setText(str);
				}
			});
		
			b10 = new Button(" 5 ");
			b10.setBounds(85,195,55,40);
			b10.setFont(b);
			add(b10);
			b10.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e)
				{
					String str = t1.getText().trim() + b10.getLabel().trim();
					t1.setText(str);
				}
			});
		
			b11 = new Button(" 6 ");
			b11.setBounds(150,195,55,40);
			b11.setFont(b);
			add(b11);
			b11.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e)
				{
					String str = t1.getText().trim() + b11.getLabel().trim();
					t1.setText(str);
				}
			});
		
			b13 = new Button(" 1 ");
			b13.setBounds(20,250,55,40);
			b13.setFont(b);
			add(b13);
			b13.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e)
				{
					String str = t1.getText().trim() + b13.getLabel().trim();
					t1.setText(str);
				}
			});
			
			b14 = new Button(" 2 ");
			b14.setBounds(85,250,55,40);
			b14.setFont(b);
			add(b14);
			b14.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e)
				{
					String str = t1.getText().trim() + b14.getLabel().trim();
					t1.setText(str);
				}
			});
		
			b15 = new Button(" 3 ");
			b15.setBounds(150,250,55,40);
			b15.setFont(b);
			add(b15);
			b15.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e)
				{
					String str = t1.getText().trim() + b15.getLabel().trim();
					t1.setText(str);
				}
			});
			
			b16 = new Button(" . ");
			b16.setBounds(150,305,55,40);
			b16.setFont(b);
			add(b16);
			b16.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e)
				{
					String str = t1.getText().trim() + b16.getLabel().trim();
					t1.setText(str);
				}
			});
		
		
			b17 = new Button(" 0 ");
			b17.setBounds(20,305,120,40);
			b17.setFont(b);
			add(b17);
			b17.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e)
				{
					String str = t1.getText().trim() + b17.getLabel().trim();
					t1.setText(str);
				}
			});
		
		
			b18 = new Button(" % ");
			b18.setBounds(215,195,55,40);
			b18.setFont(b);
			add(b18);
			b18.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e)
				{
					action = "%";
					num1 = Integer.parseInt(t1.getText());
					disableText.setText(String.valueOf(num1)+"%");
					t1.setText("");
				}
			});
		
			b12 = new Button(" = ");
			b12.setBounds(215,250,55,95);
			add(b12);
			b12.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e)
				{
					num2 = Integer.parseInt(t1.getText());
					if("+".equals(action))
					{
						result = num1 + num2;
						disableText.setText("");
					} 
					else if("-".equals(action))
					{
						result  = num1 - num2;
						disableText.setText("");
					}
					else if("*".equals(action))
					{
						result  = num1 * num2;
						disableText.setText("");
					}
					else if("/".equals(action))
					{
						result  = num1 / num2;
						disableText.setText("");
					}
					else if("%".equals(action))
					{
						result  = num1 % num2;
						disableText.setText("");
					}
				t1.setText(String.valueOf(result));
				}
			});
	    }
	    public static void main(String []args)
		{

			Calsi n1 = new Calsi("Calculator");
			
		}
}
