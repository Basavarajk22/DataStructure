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

public class SinglyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField element1;
	private JTextField element2;
	private JTextField displaybox;
	class Node{
		int data;
		Node link;
	}
	private Node first;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SinglyLinkedList frame = new SinglyLinkedList();
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
	public SinglyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 604, 374);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 240, 245));
		contentPane.setForeground(new Color(255, 240, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel SLLDS = new JLabel("SINGLY LINKED LIST DATASTRUCTURE");
		SLLDS.setForeground(new Color(0, 0, 255));
		SLLDS.setFont(new Font("Times New Roman", Font.BOLD, 14));
		SLLDS.setBounds(143, 20, 281, 25);
		contentPane.add(SLLDS);
		
		JLabel etelem = new JLabel("ENETR THE ELEMENT");
		etelem.setFont(new Font("Times New Roman", Font.BOLD, 12));
		etelem.setBounds(54, 85, 134, 15);
		contentPane.add(etelem);
		
		element1 = new JTextField();
		element1.setBounds(217, 83, 96, 19);
		contentPane.add(element1);
		element1.setColumns(10);
		
		JLabel etelem2 = new JLabel("ENTER THE ELEMENT");
		etelem2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		etelem2.setBounds(54, 132, 134, 25);
		contentPane.add(etelem2);
		
		element2 = new JTextField();
		element2.setBounds(217, 135, 96, 19);
		contentPane.add(element2);
		element2.setColumns(10);
		
		JButton insertrear = new JButton("INSERT REAR");
		insertrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR INSERTION RARE
				Node temp;
				int elem = Integer.valueOf(element1.getText());
				Node newnode= new Node();
				newnode.data=elem;
				newnode.link=null;
				if(first==null)
				{
					first=newnode;
				}
				else {
					temp=first;
					while(temp.link!=null)
					{
						temp=temp.link;
						
					}
					
					temp.link=newnode;
					
					
				}

				JOptionPane.showMessageDialog(contentPane,"Insert rear succesfull");
				element1.setText("");
				
			}
		});
		insertrear.setFont(new Font("Tahoma", Font.BOLD, 12));
		insertrear.setBounds(339, 80, 134, 23);
		contentPane.add(insertrear);
		
		JButton insertfront = new JButton("INSERT FRONT");
		insertfront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR INSERT FRONT
				int elem = Integer.valueOf(element2.getText());
				Node newnode= new Node();
				newnode.data=elem;
				newnode.link=null;
				if(first==null)
				{
					first=newnode;
				}
				else {
					newnode.link=first;
					first=newnode;
					
				}
				JOptionPane.showMessageDialog(contentPane,"Insert front succesfull");
				element2.setText("");
			}
		});
		insertfront.setFont(new Font("Tahoma", Font.BOLD, 12));
		insertfront.setBounds(339, 132, 134, 23);
		contentPane.add(insertfront);
		
		JButton deletrear = new JButton("DELETE REAR");
		deletrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR DELETE REAR
				Node temp;
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane,"Deletion rear not possible");
				}
				if(first.link==null)
				{
					String message="Element deleted is "+first.data;
					first=null;
					JOptionPane.showMessageDialog(contentPane,message);
				}
				else {
					temp=first;
					while(temp.link.link!=null)
					{
						temp=temp.link;
					}
					String message="Element deleted is "+temp.link.data;
					temp.link=null;
					JOptionPane.showMessageDialog(contentPane,message);
				}
			}
		});
		deletrear.setFont(new Font("Tahoma", Font.BOLD, 12));
		deletrear.setBounds(247, 182, 134, 23);
		contentPane.add(deletrear);
		
		JButton deletefront = new JButton("DELETE FRONT");
		deletefront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR DELETE FRONT
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane,"Deletion Front not possible");
				}
				if(first.link==null) {
					String message="Element deleted is "+first.data;
					first=null;
					JOptionPane.showMessageDialog(contentPane,message);
					
				}
				else
				{
					String message="Element deleted is "+first.data;
					first=first.link;
					JOptionPane.showMessageDialog(contentPane,message);
				}				
				
			}
		});
		deletefront.setFont(new Font("Tahoma", Font.BOLD, 12));
		deletefront.setBounds(402, 182, 134, 23);
		contentPane.add(deletefront);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DISPLAY CODE
				Node temp;
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane,"Display is not succesfull");
					displaybox.setText("");
				}
				else if(first.link==null) {
					JOptionPane.showMessageDialog(contentPane,first.data);
					String s=first.data+"";
					displaybox.setText(s);
				}
				else {
					temp=first;
					String msg="";
					while(temp!=null)
					{
						msg=msg+" "+temp.data;
						temp=temp.link;
					}
					displaybox.setText(msg);
				}
			}
		});
		display.setForeground(new Color(0, 255, 0));
		display.setFont(new Font("Tahoma", Font.BOLD, 12));
		display.setBounds(226, 236, 107, 23);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBounds(143, 279, 269, 19);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}

}
