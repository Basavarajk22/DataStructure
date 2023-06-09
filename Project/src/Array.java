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

public class Array extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField incertposition;
	private JTextField deletposition;
	private int arr[];
	private JTextField displaybox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 635, 483);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setForeground(new Color(128, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel array = new JLabel("ARRAY DATASTRUCTURE");
		array.setForeground(Color.YELLOW);
		array.setFont(new Font("Times New Roman", Font.BOLD, 14));
		array.setBounds(198, 32, 217, 49);
		contentPane.add(array);
		
		JLabel Lable = new JLabel("ENTER ARRAY LENGTH");
		Lable.setForeground(new Color(0, 255, 255));
		Lable.setFont(new Font("Constantia", Font.BOLD, 12));
		Lable.setBounds(128, 91, 135, 49);
		contentPane.add(Lable);
		
		length = new JTextField();
		length.setBounds(286, 100, 96, 28);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton CREATE = new JButton("CREATE ARRAY ");
		CREATE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR CREATING ARRAY
//				String len = length.getText();
//				int l=Integer.valueOf(len);
				int len = Integer.valueOf(length.getText());
				arr=new int [len];
				String message = "Array of length "+len+" Created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		CREATE.setFont(new Font("Constantia", Font.BOLD, 12));
		CREATE.setBounds(218, 143, 164, 23);
		contentPane.add(CREATE);
		
		JLabel incertelement = new JLabel("INCERT AN INTEGER ELEMENT");
		incertelement.setForeground(new Color(0, 255, 255));
		incertelement.setFont(new Font("Constantia", Font.BOLD, 12));
		incertelement.setBounds(42, 198, 180, 28);
		contentPane.add(incertelement);
		
		element = new JTextField();
		element.setBounds(247, 199, 96, 19);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton incert = new JButton("INSERT");
		incert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR INCERTION
				
				 try {	
				int elem = Integer.valueOf(element.getText());
				int pos = Integer.valueOf(incertposition.getText());
				if(pos>=arr.length) {
					JOptionPane.showMessageDialog(contentPane, "Insertion not posible");
				}
				
				else {
				arr[pos] = elem;
				String message="Element "+elem+" Incerted at positin "+pos;
				JOptionPane.showMessageDialog(contentPane, message);
				element.setText("");
				incertposition.setText("");
				}
			}
				 catch(Exception f) {
						JOptionPane.showMessageDialog(contentPane, "Array is not created");
			}
			
			}
			
		});
		incert.setForeground(Color.BLACK);
		incert.setFont(new Font("Constantia", Font.BOLD, 12));
		incert.setBounds(483, 243, 85, 28);
		contentPane.add(incert);
		
		JLabel position = new JLabel("ENTER POSITION");
		position.setBackground(new Color(240, 240, 240));
		position.setForeground(new Color(128, 255, 255));
		position.setFont(new Font("Constantia", Font.BOLD, 12));
		position.setBounds(371, 205, 102, 15);
		contentPane.add(position);
		
		incertposition = new JTextField();
		incertposition.setBounds(483, 201, 97, 19);
		contentPane.add(incertposition);
		incertposition.setColumns(10);
		
		JLabel delet = new JLabel("DELETE POSITION");
		delet.setForeground(new Color(128, 255, 255));
		delet.setFont(new Font("Constantia", Font.BOLD, 12));
		delet.setBackground(new Color(240, 240, 240));
		delet.setBounds(42, 263, 108, 28);
		contentPane.add(delet);
		
		deletposition = new JTextField();
		deletposition.setBounds(185, 266, 96, 19);
		contentPane.add(deletposition);
		deletposition.setColumns(10);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR DELETION
				int pos = Integer.valueOf(deletposition.getText());
				arr[pos]=0;
				String message = "Element Deleted @ the position" +pos;
				JOptionPane.showMessageDialog(contentPane, message);
				deletposition.setText("");
			}
		});
		delete.setFont(new Font("Constantia", Font.BOLD, 12));
		delete.setBounds(317, 267, 85, 21);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR DISPLAY
				String msg="";
				for(int i=0;i<=arr.length-1;i++)
				{
					msg = msg+" "+arr[i];
				}
				displaybox.setText(msg);
			}
			
		});
		display.setForeground(new Color(255, 0, 255));
		display.setFont(new Font("Constantia", Font.BOLD, 12));
		display.setBounds(93, 322, 85, 38);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBounds(198, 330, 252, 19);
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
		exit.setBounds(286, 390, 85, 21);
		contentPane.add(exit);
		
		JButton cancel = new JButton("CANCEL");
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				this.setVisible(false);
			}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
		cancel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		cancel.setBounds(425, 390, 85, 21);
		contentPane.add(cancel);
	}
}
