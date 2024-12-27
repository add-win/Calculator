import java.awt.event.*;
import javax.swing.*;
public class Calculator implements ActionListener
{
	static int count;
	static float result,a,b;
	static String str;
	static JFrame frame;
	static JTextField tf;
	static JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b_dec,b_plus,b_minus,b_mult,b_div,b_eq,b_clr;

    public static String getStr() {
        return str;
    }
	public Calculator()
	{
		frame=new JFrame("Calculator");
		tf=new JTextField(18);
		tf.setBounds(50,20,400,40);
		tf.setEditable(false);
		b0=new JButton("0");
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");
		b_dec=new JButton(".");
		b_plus=new JButton("+");
		b_minus=new JButton("-");
		b_mult=new JButton("*");
		b_div=new JButton("/");
		b_eq=new JButton("=");
		b_clr=new JButton("C");
		JPanel p=new JPanel();
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b_dec.addActionListener(this);
		b_plus.addActionListener(this);
		b_minus.addActionListener(this);
		b_mult.addActionListener(this);
		b_div.addActionListener(this);
		b_eq.addActionListener(this);
		b_clr.addActionListener(this);
		p.add(tf);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(b_plus);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b_minus);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b_mult);
		p.add(b_dec);
		p.add(b0);
		p.add(b_eq);
		p.add(b_div);
		p.add(b_clr);
		frame.add(p);
		frame.setSize(220,300);
		frame.setVisible(true);
	}
        @Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			tf.setText(tf.getText().concat("1"));
		}
		else if(e.getSource()==b2)
		{
			tf.setText(tf.getText().concat("2"));
		}
		else if(e.getSource()==b3)
		{
			tf.setText(tf.getText().concat("3"));
		}
		else if(e.getSource()==b4)
		{
			tf.setText(tf.getText().concat("4"));
		}
		else if(e.getSource()==b5)
		{
			tf.setText(tf.getText().concat("5"));
		}
		else if(e.getSource()==b6)
		{
			tf.setText(tf.getText().concat("6"));
		}
		else if(e.getSource()==b7)
		{
			tf.setText(tf.getText().concat("7"));
		}
		else if(e.getSource()==b8)
		{
			tf.setText(tf.getText().concat("8"));
		}
		else if(e.getSource()==b9)
		{
			tf.setText(tf.getText().concat("9"));
		}
		else if(e.getSource()==b0)
		{
			tf.setText(tf.getText().concat("0"));
		}
		else if(e.getSource()==b_plus)
		{
			a=Float.parseFloat(tf.getText());
			count=1;
			tf.setText("");
		}
		else if(e.getSource()==b_minus)
		{
			a=Float.parseFloat(tf.getText());
			count=2;
			tf.setText("");
		}
		else if(e.getSource()==b_mult)
		{
			a=Float.parseFloat(tf.getText());
			count=3;
			tf.setText("");
		}
		else if(e.getSource()==b_div)
		{
			a=Float.parseFloat(tf.getText());
			count=4;
			tf.setText("");
		}
		else if(e.getSource()==b_clr)
		{
			count=0;
			tf.setText("");
		}
		else if(e.getSource()==b_dec)
		{
			tf.setText(tf.getText().concat("."));
		}
		else if(e.getSource()==b_eq)
		{
			b=Float.parseFloat(tf.getText());
			switch(count)
			{
				case 1 -> result=a+b;
				case 2 -> result=a-b;
				case 3 -> result=a*b;
				case 4 -> result=(float)a/b;
				default -> {
                                    result=0;
                                    tf.setText("Math Error");
                        }
			}
			tf.setText(""+result);
		}
	}
	public static void main(String args[])
	{
		new Calculator();
	}
}
