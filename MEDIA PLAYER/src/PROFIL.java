import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class PROFIL extends JFrame {

	private JPanel contentPane;
	private JTextField profilkulladi;
	private JTextField profilemaill;
	private JTextField profilsoyad;
	private JTextField profilad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PROFIL frame = new PROFIL();
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
	public PROFIL() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 641, 436);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\JET\\Desktop\\MEDIA PLAYER\\BUTONLAR\\person-profile-icon (1).png"));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(209, 11, 126, 123);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("KULLANICI ADI :");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("MV Boli", Font.BOLD, 17));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(95, 250, 163, 28);
		contentPane.add(lblNewLabel_2);
		
		profilkulladi = new JTextField();
		profilkulladi.setBounds(265, 256, 173, 20);
		contentPane.add(profilkulladi);
		profilkulladi.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("E-POSTA :");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("MV Boli", Font.BOLD, 17));
		lblNewLabel_3.setBounds(135, 288, 126, 15);
		contentPane.add(lblNewLabel_3);
		
		profilemaill = new JTextField();
		profilemaill.setBounds(265, 287, 173, 20);
		contentPane.add(profilemaill);
		profilemaill.setColumns(10);
		
		JButton btnNewButton = new JButton("B\u0130LG\u0130LER\u0130M\u0130 G\u00D6R\u00DCNT\u00DCLE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GÝRÝSEKRANI giris = new GÝRÝSEKRANI();
				KAYITEKRANI kayit = new KAYITEKRANI();
				profilkulladi.setText(giris.profil_kulladi);
				profilad.setText(kayit.profiladd);
				profilsoyad.setText(kayit.profilsoyadd);
				profilemaill.setText(kayit.profilemail);
				
				
				
			}
		});
		btnNewButton.setBounds(372, 75, 199, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ANASAYFA anasayfa = new ANASAYFA();
				setVisible(false);
				anasayfa.setVisible(true);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\JET\\Desktop\\MEDIA PLAYER\\BUTONLAR\\home-page (1).png"));
		btnNewButton_1.setBounds(501, 304, 89, 58);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("ANA SAYFA");
		lblNewLabel_4.setFont(new Font("MV Boli", Font.BOLD, 17));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(492, 373, 109, 14);
		contentPane.add(lblNewLabel_4);
		
		profilsoyad = new JTextField();
		profilsoyad.setBounds(265, 222, 173, 20);
		contentPane.add(profilsoyad);
		profilsoyad.setColumns(10);
		
		profilad = new JTextField();
		profilad.setBounds(265, 191, 173, 20);
		contentPane.add(profilad);
		profilad.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("SOYAD :");
		lblNewLabel_5.setFont(new Font("MV Boli", Font.BOLD, 17));
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(156, 225, 88, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("AD :");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("MV Boli", Font.BOLD, 17));
		lblNewLabel_6.setBounds(156, 192, 98, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("PROFILIM");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("MV Boli", Font.BOLD, 17));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(202, 145, 143, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\JET\\Desktop\\MEDIA PLAYER\\ARKA TEMALAR\\\u015EARKILAR.png"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 625, 398);
		contentPane.add(lblNewLabel);
	}
}
