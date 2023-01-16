import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JMenuBar;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;


public class SARKIDUZENLE extends JFrame {

	private JPanel contentPane;
	private JTextField sarkiadi;
	private JTextField sanatciadi;
	private JTextField sarkiadii;
	private JTextField sarkiid;
	MuzikIslemleri islemler = new MuzikIslemleri();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SARKIDUZENLE frame = new SARKIDUZENLE();
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
	public SARKIDUZENLE() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 772, 521);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(646, 398, 89, 58);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\JET\\Desktop\\MEDIA PLAYER\\BUTONLAR\\home-page (1).png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			 ANASAYFA anasayfa = new ANASAYFA();
			 setVisible(false);
			 anasayfa.setVisible(true);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("ANA SAYFA");
		lblNewLabel_1.setBounds(639, 457, 107, 19);
		lblNewLabel_1.setFont(new Font("MV Boli", Font.BOLD, 14));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_1);
		
		sarkiadi = new JTextField();
		sarkiadi.setBounds(171, 213, 143, 32);
		contentPane.add(sarkiadi);
		sarkiadi.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("SARKI ADI :");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("MV Boli", Font.BOLD, 17));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(20, 220, 156, 14);
		contentPane.add(lblNewLabel_2);
		
		sanatciadi = new JTextField();
		sanatciadi.setBounds(171, 285, 143, 32);
		contentPane.add(sanatciadi);
		sanatciadi.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("SANATCI ADI :");
		lblNewLabel_3.setFont(new Font("MV Boli", Font.BOLD, 17));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(20, 292, 147, 14);
		contentPane.add(lblNewLabel_3);
		
		JComboBox tur = new JComboBox();
		tur.setModel(new DefaultComboBoxModel(new String[] {"Kategori", "Hiphop", "T\u00FCrk\u00FC", "Pop", "Arabesk", "Rock", "Jazz", "Reggae"}));
		tur.setBounds(171, 340, 143, 25);
		contentPane.add(tur);
		
		JButton btnNewButton_1 = new JButton("\u015EARKI EKLE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MuzikIslemleri islemler = new MuzikIslemleri();
				String sarkiad = sarkiadi.getText();
				String sanatciad = sanatciadi.getText();
				String turu = tur.getSelectedItem().toString();
				if(sarkiadi.getText().trim().equals("")){
					JOptionPane.showMessageDialog(null,"Þarký Adý Boþ Býrakýlamaz !");
				}else if(sanatciadi.getText().trim().equals("")){
					JOptionPane.showMessageDialog(null,"Sanatçý Adý Boþ Býrakýlamaz !");
				}else{
				JOptionPane.showMessageDialog(null,"Yeni Þarký Eklendi !");
				islemler.sarkiEkle(sarkiad,sanatciad,turu);
				sarkiadi.setText("");
				sanatciadi.setText("");
				tur.setSelectedIndex(0);
				


				}
			}
		});
		btnNewButton_1.setBounds(182, 398, 119, 37);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\JET\\Desktop\\MEDIA PLAYER\\BUTONLAR\\add-song-interface-symbol (1).png"));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(147, 24, 98, 101);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("SARKI EKLE");
		lblNewLabel_5.setFont(new Font("MV Boli", Font.BOLD, 20));
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(124, 147, 147, 25);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\JET\\Desktop\\MEDIA PLAYER\\BUTONLAR\\delete-song-interface-symbol (1).png"));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(517, 24, 98, 101);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("SARKI KALDIR");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("MV Boli", Font.BOLD, 20));
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setBounds(497, 147, 156, 25);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("SARKI ADI :");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("MV Boli", Font.BOLD, 17));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setBounds(393, 220, 156, 14);
		contentPane.add(lblNewLabel_8);
		
		sarkiadii = new JTextField();
		sarkiadii.setBounds(540, 213, 143, 32);
		contentPane.add(sarkiadii);
		sarkiadii.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("SARKI ID :");
		lblNewLabel_9.setFont(new Font("MV Boli", Font.BOLD, 17));
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setBounds(416, 292, 119, 14);
		contentPane.add(lblNewLabel_9);
		
		sarkiid = new JTextField();
		sarkiid.setBounds(540, 285, 143, 32);
		contentPane.add(sarkiid);
		sarkiid.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("\u015EARKI KALDIR");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
	         
				
				if(sarkiadii.getText().trim().equals("")){
					JOptionPane.showMessageDialog(null,"Þarký Adý Boþ Býrakýlamaz !");
					
				}else if(sarkiid.getText().trim().equals("")){
					JOptionPane.showMessageDialog(null," ID Boþ Býrakýlamaz !");
				}else{
				
				String idornek = sarkiid.getText();
				
				int id = Integer.valueOf(idornek);
				
				islemler.sarkiSil(id);
				sarkiadii.setText("");
				sarkiid.setText("");
				
				
				
				JOptionPane.showMessageDialog(null, "Þarký Kaldýrýldý !");
				
				
				

				
				
			    
				}
			
			}
		});
		btnNewButton_2.setBounds(550, 334, 119, 37);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\JET\\Desktop\\MEDIA PLAYER\\ARKA TEMALAR\\\u015EARKI EKLE S\u0130L 2.png"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 756, 483);
		contentPane.add(lblNewLabel);
	}
}
