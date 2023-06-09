import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Queue extends JFrame {

	private JPanel contentPane;
	private JTextField size;
	private JTextField element;
	private JTextField displaybox;
	private int q[];
	//private int size;
	private int r=-1;
	private int f=0;
	private int s;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue frame = new Queue();
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
	public Queue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 543, 362);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel queueDS = new JLabel("QUEUE DATASTRUCTURE");
		queueDS.setFont(new Font("Times New Roman", Font.BOLD, 14));
		queueDS.setBounds(167, 23, 180, 17);
		contentPane.add(queueDS);
		
		JLabel EQS = new JLabel("ENTER A QUEUE SIZE");
		EQS.setFont(new Font("Constantia", Font.BOLD, 12));
		EQS.setBounds(92, 56, 133, 15);
		contentPane.add(EQS);
		
		size = new JTextField();
		size.setBounds(251, 52, 96, 19);
		contentPane.add(size);
		size.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ENTER AN ELEMENT");
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 12));
		lblNewLabel.setBounds(22, 147, 118, 19);
		contentPane.add(lblNewLabel);
		
		JButton queue = new JButton("CREATE QUEUE");
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR QUEUE CREATION
				s = Integer.valueOf(size.getText());
				q= new int[s];
				String message = "Queue of size "+s+"created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		queue.setForeground(new Color(0, 255, 0));
		queue.setFont(new Font("Constantia", Font.BOLD, 12));
		queue.setBounds(167, 87, 148, 23);
		contentPane.add(queue);
		
		element = new JTextField();
		element.setBounds(156, 144, 96, 23);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton incert = new JButton("INSERT");
		incert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR INCERT
				int elem;
				if(r==s-1)
				{
					JOptionPane.showMessageDialog(contentPane,"Insert is note possible");
				}
				else
				{
					elem = Integer.valueOf(element.getText());
					  ++r;
					q[r]=elem;
					JOptionPane.showMessageDialog(contentPane,"Insert succesfull");
					element.setText("");
			}
			}
		});
		incert.setFont(new Font("Constantia", Font.BOLD, 12));
		incert.setBounds(272, 141, 96, 30);
		contentPane.add(incert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR DELETION
				if(r==-1 || f>r)
				{
					JOptionPane.showMessageDialog(contentPane,"Delete is note possible");
				}
				else
				{
					String message = "Element deleted is: "+q[f];
					JOptionPane.showMessageDialog(contentPane,message);
					++f;
				}
			}
		});
		delete.setFont(new Font("Constantia", Font.BOLD, 12));
		delete.setBounds(389, 141, 107, 30);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR DISPLAY
				String msg="";
				if(r==-1 || f>r)
				{
					displaybox.setText("");
					JOptionPane.showMessageDialog(contentPane,"Display is note possible");
					
				}
				else
				{
					for(int i=f;i<=r;i++)
					{
					 	msg = msg+" "+q[i];
					}
					displaybox.setText(msg);
				}
			}
		});
		display.setForeground(new Color(255, 0, 255));
		display.setFont(new Font("Constantia", Font.BOLD, 12));
		display.setBounds(210, 196, 105, 34);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBounds(136, 240, 256, 19);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
		
		
	}

}
