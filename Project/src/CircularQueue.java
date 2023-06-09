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

public class CircularQueue extends JFrame {

	private JPanel contentPane;
	private JTextField cqsize;
	private JTextField element;
	private JTextField displaybox;
	private int cq[];
	private int size;
	private int r=-1;
	private int f=0;
	private int count=0;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircularQueue frame = new CircularQueue();
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
	public CircularQueue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 612, 380);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel CQDS = new JLabel("CIRCULAR QUEUE DATASTRUCTURE");
		CQDS.setForeground(new Color(255, 0, 0));
		CQDS.setFont(new Font("Times New Roman", Font.BOLD, 15));
		CQDS.setBounds(138, 27, 279, 18);
		contentPane.add(CQDS);
		
		JLabel lblNewLabel = new JLabel("ENTER CQUEUE SIZE");
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 12));
		lblNewLabel.setBounds(99, 55, 122, 40);
		contentPane.add(lblNewLabel);
		
		cqsize = new JTextField();
		cqsize.setBounds(260, 64, 96, 19);
		contentPane.add(cqsize);
		cqsize.setColumns(10);
		
		JButton Cqueue = new JButton("CREATE CQUEUE");
		Cqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR CQUEUE CREATION
				size = Integer.valueOf(cqsize.getText());
				cq = new int[size];
				String msg = "Circular Queue of size is "+size+" created";
				JOptionPane.showMessageDialog(contentPane,msg);
				
			}
		});
		Cqueue.setForeground(new Color(0, 0, 255));
		Cqueue.setFont(new Font("Constantia", Font.BOLD, 12));
		Cqueue.setBounds(152, 104, 162, 23);
		contentPane.add(Cqueue);
		
		JLabel EN = new JLabel("ENTER AN ELEMENT");
		EN.setFont(new Font("Constantia", Font.BOLD, 12));
		EN.setBounds(23, 153, 118, 30);
		contentPane.add(EN);
		
		element = new JTextField();
		element.setBounds(152, 157, 96, 19);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE  FOR INSERTION
				if(count==size)
				{
					JOptionPane.showMessageDialog(contentPane,"Insert is note possible");
				}
				else {
					int elem = Integer.valueOf(element.getText());
					r= (r+1)%size;
					cq[r]=elem;
				    count++;					
				    JOptionPane.showMessageDialog(contentPane,"Insert  is succesfull");
				    element.setText("");
				}
			}
		});
		insert.setFont(new Font("Constantia", Font.BOLD, 12));
		insert.setBounds(271, 156, 101, 21);
		contentPane.add(insert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR DELETION
				if(count==0)
				{
					JOptionPane.showMessageDialog(contentPane,"Delete is note possible");
				}
				else {
					String message = "Element deleted is "+cq[f];
					JOptionPane.showMessageDialog(contentPane,message);
					f=(f+1)%size;
					count--;
				}
				
			}
		});
		delete.setFont(new Font("Constantia", Font.BOLD, 12));
		delete.setBounds(399, 158, 101, 21);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR DISPLAY
				String msg = "";
				int f1=f;
				if(count==0)
				{
					displaybox.setText("");
					JOptionPane.showMessageDialog(contentPane,"Display is note possible");
				}
				else {
					for(int i=1;i<=count;i++)
					{
						msg = msg+" "+cq[f1];
						f1=(f1+1)%size;
					}
					
					displaybox.setText(msg);
				}
			}
		});
		display.setFont(new Font("Constantia", Font.BOLD, 12));
		display.setBounds(243, 208, 107, 21);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setForeground(new Color(0, 0, 0));
		displaybox.setBounds(170, 251, 247, 19);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}
}
