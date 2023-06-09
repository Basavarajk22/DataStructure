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

public class DoublyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField element1;
	private JTextField element2;
	private JTextField displaybox;
	
	class Node
	{
		Node prelink;
		Node nextlink;
		int data;
	}
	Node first;
	private JTextField displaybox2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoublyLinkedList frame = new DoublyLinkedList();
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
	public DoublyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 376);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DOUBLY LINKED LIST DATASTRUCTURE");
		lblNewLabel.setForeground(new Color(153, 50, 204));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(142, 10, 287, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE ELEMENT");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setBounds(49, 53, 134, 23);
		contentPane.add(lblNewLabel_1);
		
		element1 = new JTextField();
		element1.setBounds(193, 55, 96, 19);
		contentPane.add(element1);
		element1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER THE ELEMENT");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_2.setBounds(49, 104, 134, 15);
		contentPane.add(lblNewLabel_2);
		
		element2 = new JTextField();
		element2.setBounds(193, 102, 96, 19);
		contentPane.add(element2);
		element2.setColumns(10);
		
		JButton incertfront = new JButton("INSERT FRONT");
		incertfront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR INSERT FRONT
				int elem = Integer.valueOf(element1.getText());
				Node newnode= new Node();
				newnode.data=elem;
				newnode.prelink=null;
				newnode.nextlink=null;
				if(first==null)
				{
					first=newnode;
				}
				else {
					newnode.nextlink=first;
					first.prelink=newnode;
					first=newnode;
					
				}
				JOptionPane.showMessageDialog(contentPane,"Insert front succesfull");
				element1.setText("");
			}
		});
		incertfront.setFont(new Font("Times New Roman", Font.BOLD, 12));
		incertfront.setBounds(320, 53, 147, 23);
		contentPane.add(incertfront);
		
		JButton insertrea = new JButton("INSERT REAR");
		insertrea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR INSERT REAR
				int elem = Integer.valueOf(element2.getText());
				Node newnode= new Node();
				newnode.data=elem;
				newnode.prelink=null;
				newnode.nextlink=null;
				if(first==null)
				{
					first=newnode;
				}
				else {
					Node temp=first;
					while(temp.nextlink!=null)
					{
						temp=temp.nextlink;
					}
					temp.nextlink=newnode;
					newnode.prelink=temp;
				}
				JOptionPane.showMessageDialog(contentPane,"Insert rear succesfull");
				element2.setText("");
				
			}
		});
		insertrea.setFont(new Font("Times New Roman", Font.BOLD, 12));
		insertrea.setBounds(320, 100, 147, 23);
		contentPane.add(insertrea);
		
		JButton deletefront = new JButton("DELETE FRONT");
		deletefront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR DELETION FRONT
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane,"Delete front is not possible");
				}
				if(first.nextlink==null)
				{
					String message="Element deleted is "+first.data;
					first=null;
					JOptionPane.showMessageDialog(contentPane,message);
				}
				else {
					first=first.nextlink;
					first.prelink=null;
				}

				JOptionPane.showMessageDialog(contentPane,"Delete front succesfull");
				
			}
		});
		deletefront.setFont(new Font("Times New Roman", Font.BOLD, 12));
		deletefront.setBounds(166, 160, 147, 23);
		contentPane.add(deletefront);
		
		JButton deleterear = new JButton("DELETE REAR");
		deleterear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR DELETION REAR
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane,"Delete rear is not posible");
				}
				else if(first.nextlink==null)
				{
					String message="Element deleted is "+first.data;
					first=null;
					JOptionPane.showMessageDialog(contentPane,message);
				}
				else {
					Node temp=first;
					while(temp.nextlink.nextlink!=null)
					{
						temp=temp.nextlink;
					}
					String message="Element deleted is "+temp.nextlink.data;
					temp.nextlink=null;
					JOptionPane.showMessageDialog(contentPane,message);
				}
				
			}
		});
		deleterear.setFont(new Font("Times New Roman", Font.BOLD, 12));
		deleterear.setBounds(348, 160, 140, 23);
		contentPane.add(deleterear);
		
		JButton dispplayforword = new JButton("DISPLAY FORWORD");
		dispplayforword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR DISPLAY forword
				Node temp;
				String msg="";
				if(first==null)
				{
					displaybox.setText(msg);
					JOptionPane.showMessageDialog(contentPane,"Display is not possible");
					
					
				}
				else if(first.nextlink==null)
				{
					//JOptionPane.showMessageDialog(contentPane,first.data);
					String s=first.data+"";
					displaybox.setText(s);
				}
				else {
					temp=first;
					while(temp!=null)
					{
						msg = msg+" "+temp.data;
						temp=temp.nextlink;
					}
					displaybox.setText(msg);
				}
			}
		});
		dispplayforword.setForeground(new Color(255, 0, 0));
		dispplayforword.setFont(new Font("Times New Roman", Font.BOLD, 13));
		dispplayforword.setBounds(49, 232, 184, 25);
		contentPane.add(dispplayforword);
		
		displaybox = new JTextField();
		displaybox.setBounds(271, 235, 255, 19);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
		
		JButton displaybackword = new JButton("DISPLAY BACKWORD");
		displaybackword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR BACKWORD
				String msg = "";
				if(first==null)
				{
					displaybox2.setText(msg);
					JOptionPane.showMessageDialog(contentPane,"Display not posible");
				}
				else if(first.nextlink==null)
				{
					//JOptionPane.showMessageDialog(contentPane,first.data);
					String s1=first.data+"";
					displaybox2.setText(s1);
				}
				else {
					Node temp=first;
					while(temp.nextlink!=null)
					{
						
						temp=temp.nextlink;
					}
					while(temp!=null)
					{
						msg=msg+" "+temp.data;
						temp=temp.prelink;
					}
					displaybox2.setText(msg);
				}
			}
		});
		displaybackword.setFont(new Font("Times New Roman", Font.BOLD, 12));
		displaybackword.setBounds(49, 280, 184, 23);
		contentPane.add(displaybackword);
		
		displaybox2 = new JTextField();
		displaybox2.setBounds(273, 282, 253, 19);
		contentPane.add(displaybox2);
		displaybox2.setColumns(10);
	}
}
