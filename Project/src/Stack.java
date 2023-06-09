import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Stack extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField displaybox;
	private int s[];
	private int size;
	private int top=-1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 564, 383);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 127, 80));
		contentPane.setBackground(new Color(255, 240, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel SD = new JLabel("STACK DATASTRUCTURE");
		SD.setForeground(new Color(0, 0, 255));
		SD.setFont(new Font("Times New Roman", Font.BOLD, 14));
		SD.setBounds(180, 24, 179, 17);
		contentPane.add(SD);
		
		JLabel enterlenggth = new JLabel("ENETR A STACK LENGTH");
		enterlenggth.setFont(new Font("Constantia", Font.BOLD, 12));
		enterlenggth.setBounds(100, 66, 144, 22);
		contentPane.add(enterlenggth);
		
		length = new JTextField();
		length.setBounds(268, 66, 96, 19);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton stack = new JButton("CREATE STACK");
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR STACK CREATION
				size = Integer.valueOf(length.getText());
				s=new int[size];
				String message = "Stack of length "+size+" created";
				JOptionPane.showMessageDialog(contentPane, message);
				
			}
		});
		stack.setForeground(new Color(255, 99, 71));
		stack.setFont(new Font("Constantia", Font.BOLD, 12));
		stack.setBounds(183, 113, 144, 31);
		contentPane.add(stack);
		
		JLabel enterelement = new JLabel("ENTER AN ELEMENT");
		enterelement.setFont(new Font("Constantia", Font.BOLD, 12));
		enterelement.setBounds(100, 183, 118, 15);
		contentPane.add(enterelement);
		
		element = new JTextField();
		element.setBounds(242, 179, 96, 19);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton push = new JButton("PUSH\r\n");
		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR PUSH
				int elem;
				if(top==size-1)
				{
					JOptionPane.showMessageDialog(contentPane,"Stack is not created");
				}
				else
				{
					elem = Integer.valueOf(element.getText());
					++top;
					s[top]=elem;
					JOptionPane.showMessageDialog(contentPane,"push succesfull");
					element.setText("");
			}
			}
		});
		push.setForeground(new Color(139, 0, 0));
		push.setFont(new Font("Constantia", Font.BOLD, 12));
		push.setBounds(374, 180, 96, 21);
		contentPane.add(push);
		
		JButton pop = new JButton("POP");
		pop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR POP
				if(top==-1)
				{
					JOptionPane.showMessageDialog(contentPane,"pop is note possible");
				}
				else
				{
					String message = "Element deleted is: "+s[top];
					JOptionPane.showMessageDialog(contentPane,message);
					top--;
				}
				
			}
		});
		pop.setForeground(new Color(139, 0, 0));
		pop.setFont(new Font("Constantia", Font.BOLD, 12));
		pop.setBounds(374, 225, 85, 21);
		contentPane.add(pop);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR DISPLAY
				String msg="";
				if(top==-1)
				{
					displaybox.setText("");
					JOptionPane.showMessageDialog(contentPane,"Display is note possible");
				}
				else
				{
					for(int i=top;i>=0;i--)
					{
						msg = msg+" "+s[i];
					}
					displaybox.setText(msg);
				
				}
			}
		});
		display.setForeground(new Color(255, 0, 0));
		display.setFont(new Font("Constantia", Font.BOLD, 12));
		display.setBounds(216, 233, 109, 31);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setForeground(new Color(0, 0, 0));
		displaybox.setFont(new Font("Times New Roman", Font.BOLD, 12));
		displaybox.setBounds(120, 279, 310, 22);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
		
		JButton exit = new JButton("EXIT");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame("EXIT");
				if(JOptionPane.showConfirmDialog(frame,"Confirm if yoy want Exit", "Exit", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
				}
			}
		});
		exit.setFont(new Font("Times New Roman", Font.BOLD, 12));
		exit.setBounds(216, 311, 85, 21);
		contentPane.add(exit);
	}

}
