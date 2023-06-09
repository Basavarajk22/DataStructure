import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.CardLayout;
import javax.swing.JRadioButton;

public class DataStructure extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DataStructure frame = new DataStructure();
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
	public DataStructure() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 557, 365);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(199, 21, 133));
		contentPane.setBackground(new Color(124, 252, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton cq = new JButton("Circular Queue");
		cq.setBounds(52, 182, 143, 23);
		cq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE Circular Queue LIST WINDOW OPENING CODE HERE
				new CircularQueue().setVisible(true);
			}
		});
		
		JButton array1 = new JButton("Array");
		array1.setBounds(204, 73, 95, 23);
		array1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE ARRAY WINDOW OPENING CODE HERE
//				Array a = new Array();
//				a.setVisible(true);
				new Array().setVisible(true);
						
			}
		});
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CHOOSE DATASTRUCTURE");
		lblNewLabel.setBounds(166, 22, 208, 30);
		lblNewLabel.setForeground(new Color(199, 21, 133));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(lblNewLabel);
		array1.setForeground(new Color(0, 0, 255));
		array1.setFont(new Font("Constantia", Font.BOLD, 12));
		contentPane.add(array1);
		
		JButton queue = new JButton("Queue");
		queue.setBounds(320, 120, 90, 23);
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE QUEUE WINDOW OPENING CODE HERE
			new Queue().setVisible(true);
				
			}
		});
		
		JButton stack = new JButton("Stack");
		stack.setBounds(94, 120, 84, 23);
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE STACK WINDOW OPENING CODE HERE
				new Stack().setVisible(true);
			}
		});
		stack.setForeground(new Color(165, 42, 42));
		stack.setFont(new Font("Constantia", Font.BOLD, 12));
		contentPane.add(stack);
		queue.setForeground(new Color(255, 0, 0));
		queue.setFont(new Font("Constantia", Font.BOLD, 12));
		contentPane.add(queue);
		cq.setForeground(new Color(0, 0, 128));
		cq.setFont(new Font("Constantia", Font.BOLD, 12));
		contentPane.add(cq);
		
		JButton dll = new JButton("Double Linked List");
		dll.setBounds(169, 247, 163, 23);
		dll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE DOBLYLINKEDLIST WINDOW OPENING CODE HERE
				new DoublyLinkedList().setVisible(true);
			}
		});
		
		JButton sll = new JButton("Single Linked List");
		sll.setBounds(307, 182, 143, 23);
		sll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE SINGLELINKKED WINDOW OPENING CODE HERE
				new SinglyLinkedList().setVisible(true);
			}
		});
		sll.setForeground(new Color(138, 43, 226));
		sll.setFont(new Font("Constantia", Font.BOLD, 12));
		contentPane.add(sll);
		dll.setForeground(new Color(47, 79, 79));
		dll.setFont(new Font("Constantia", Font.BOLD, 12));
		contentPane.add(dll);
	}
}
