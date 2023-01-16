import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class ÞARKILAR extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField aramacubugu;
	DefaultTableModel model = new DefaultTableModel();
	Object[] kolonlar = {"ID","Þarký Adý","Sanatçý","Türü"};
	Object[] satirlar = new Object[5];
	MuzikIslemleri islemler = new MuzikIslemleri();
     

	public void dinamikAra(String ara){
    	
		TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
		
		table.setRowSorter(tr);
		
		tr.setRowFilter(RowFilter.regexFilter(ara));
		
		
		
    }
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ÞARKILAR frame = new ÞARKILAR();
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
	public ÞARKILAR() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 725, 472);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\JET\\Desktop\\MEDIA PLAYER\\BUTONLAR\\home-page (1).png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ANASAYFA anasayfa = new ANASAYFA();
				setVisible(false);
				anasayfa.setVisible(true);
			}
		});
		
		
	
		JSeparator separator = new JSeparator();
		separator.setBounds(26, 111, 529, 2);
		contentPane.add(separator);
		
		JButton btnNewButton_1 = new JButton("L\u0130STELE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ResultSet rs = islemler.listele();
       		 try {
					while(rs.next()){
						 satirlar[0] = rs.getInt("id");
						 satirlar[1] = rs.getString("Adý");
						 satirlar[2] = rs.getString("Sanatçý");
						 satirlar[3] = rs.getString("Türü");
						 model.addRow(satirlar);
					 }
				} catch (SQLException e) {
				
					e.printStackTrace();
				}
       	        table.setModel(model);
			}
		});
		
		JScrollPane sarkitablosu = new JScrollPane();
		sarkitablosu.setBounds(26, 123, 531, 287);
		contentPane.add(sarkitablosu);
	
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"", "", "", ""
			}
		));
        model.setColumnIdentifiers(kolonlar);
		table.setFillsViewportHeight(true);
		sarkitablosu.setViewportView(table);
		btnNewButton.setBounds(610, 324, 89, 58);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("ANA SAYFA");
		lblNewLabel_1.setFont(new Font("MV Boli", Font.BOLD, 14));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(593, 393, 106, 18);
		contentPane.add(lblNewLabel_1);

		aramacubugu = new JTextField();
		aramacubugu.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				
            String ara = aramacubugu.getText();
        		
        		dinamikAra(ara);
			}
		});
		aramacubugu.setBounds(210, 43, 300, 20);
		contentPane.add(aramacubugu);
		aramacubugu.setColumns(10);
	
		btnNewButton_1.setBounds(438, 77, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("SARKI ARA :");
		lblNewLabel_2.setFont(new Font("MV Boli", Font.BOLD, 17));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(39, 44, 143, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\JET\\Desktop\\MEDIA PLAYER\\ARKA TEMALAR\\\u015EARKILAR.png"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 709, 441);
		contentPane.add(lblNewLabel);
        
		

		
	}
}
