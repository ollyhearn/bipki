package pr4;

import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Zad extends JFrame {
	private int a = 0;
	private int clck = 1;
	private String s;
	Font fnt = new Font("Verdana",Font.BOLD,36); 
	JTextField text = new JTextField(8);
	JButton button = new JButton("Бипки!");
	JButton buy1 = new JButton("купить бипкаклик! - 100Б");
	JLabel ver = new JLabel("ver 0.0.3");
	Zad(){
		super("kek");
		setSize(1000, 200);
		setVisible(true);
		setLayout(new FlowLayout());
		JFrame.setDefaultLookAndFeelDecorated(true);
		text.setText("0");
		add(text);
		add(button);
		add(buy1);
		add(ver);
		ver.setAlignmentX(RIGHT_ALIGNMENT);
		ver.setAlignmentY(BOTTOM_ALIGNMENT);
		text.setFont(fnt);
		text.setAlignmentX(CENTER_ALIGNMENT);
		text.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		text.setEditable(false);
		
		button.setAlignmentX(CENTER_ALIGNMENT);
		button.setFont(fnt);
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.addActionListener(new ActionListener() 
		  { 
		   public void actionPerformed(ActionEvent ae) 
		   { 
			   a = a + clck;
			   s = "" + a;
			   text.setText(s);
		   } 
		  });
		buy1.setAlignmentX(CENTER_ALIGNMENT);
		buy1.setFont(fnt);
		buy1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		buy1.setToolTipText("Увеличивает мультиплаер клика на 1. Текущий множитель: 1");
		buy1.addActionListener(new ActionListener() 
		  { 
		   public void actionPerformed(ActionEvent ae) 
		   { 
			   if(a >= 100) {
				   a-=100;
				   clck++;
				   s = "" + a;
				   text.setText(s);
				   buy1.setToolTipText("Увеличивает мультиплаер клика на 1. Текущий множитель: " + clck);
			   }
			   else {
				   JOptionPane.showMessageDialog(null, "БИПОК МАЛО!!1!", "УВАГА!", JOptionPane.INFORMATION_MESSAGE);
			   }
		   } 
		  });
	}
}
