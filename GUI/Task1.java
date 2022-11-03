package window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Task1 implements ActionListener
{
	JFrame frame1,frame2;
    JLabel l1,l2,l3,l4,l5,l6;
    JTextField tf1,tf2,tf3,tf4;
    JButton b1,b2;
    JPasswordField p1;
    
	public Task1()
	{
		frame1 = new JFrame();
		 
		JLabel l1 = new JLabel("Login");
		l1.setBounds(216, 35, 70, 20);
		
		JLabel l2 = new JLabel("Email");
		l2.setBounds(53, 78, 70, 20);
		
		JTextField tf1 = new JTextField();
		tf1.setBounds(133, 78, 220, 20);
		
		JLabel l3 = new JLabel("Password");
		l3.setBounds(53, 125, 70, 20);
		
		JPasswordField p1 = new JPasswordField();
		p1.setBounds(133, 125, 220, 20);
		
		JButton b1 = new JButton("Login");
		b1.setBounds(197, 199, 89, 20);
		
		b1.addActionListener(this);
		
		
		frame1.setLayout(null);
		frame1.setVisible(true);
		frame1.setSize(500,500);
		frame1.add(b1);
		frame1.add(p1);
		frame1.add(l3);
		frame1.add(tf1);
		frame1.add(l2);
		frame1.add(l1);
		
		
	}
	public static void main(String[] args) {
		new Task1();
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		frame2 = new JFrame();
		
		JLabel l4 = new JLabel("Collage");
		l4.setBounds(40, 44, 91, 21);
		
		JTextField tf2 = new JTextField();
		tf2.setBounds(141, 44, 211, 20);
		
		JLabel l5 = new JLabel("Semester");
		l5.setBounds(40, 82, 91, 21);
		
		JTextField tf3 = new JTextField();
		tf3.setBounds(141, 82, 211, 20);
		
		JLabel l6 = new JLabel("Branch");
		l6.setBounds(40, 120, 91, 21);
		
		JTextField tf4 = new JTextField();
		tf4.setBounds(141, 120, 211, 20);
		
		JButton b2 = new JButton("Register");
		b2.setBounds(181, 203, 89, 23);
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String collage = tf2.getText().toString();
				String semester = tf3.getText().toString();
				String branch = tf4.getText().toString();
				try {
					FileOutputStream f = new FileOutputStream("E://Tops.txt");
					String collage1 = "\n Your collage name : \n";
					f.write(collage1.getBytes());
					f.write(collage.getBytes());
					
					String semester1 = "\n Your semester is :";
					f.write(semester1.getBytes());
					f.write(semester.getBytes());
					
					String branch1 = "\n Your Branch is  :";
					f.write(branch1.getBytes());
					f.write(branch.getBytes());
					
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		frame2.setLayout(null);
		frame2.setVisible(true);
		frame2.setSize(500,500);
		frame2.add(b2);
		frame2.add(tf4);
		frame2.add(l6);
		frame2.add(tf3);
		frame2.add(l5);
		frame2.add(tf2);
		frame2.add(l4);
		
		
	}

}
