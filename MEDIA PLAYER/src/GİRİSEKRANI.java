import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;


public class GÝRÝSEKRANI extends JFrame {
	static String profil_kulladi;
    MuzikIslemleri islemler = new MuzikIslemleri();
    

	private JPanel contentPane;
	private JTextField kulladi;
	private JPasswordField girissifre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GÝRÝSEKRANI frame = new GÝRÝSEKRANI();
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
	public GÝRÝSEKRANI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 606, 403);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		kulladi = new JTextField();
		kulladi.setBounds(234, 222, 158, 25);
		contentPane.add(kulladi);
		kulladi.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Kullan\u0131c\u0131 Ad\u0131 :");
		lblNewLabel_1.setFont(new Font("Lucida Sans", Font.BOLD, 20));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(66, 222, 158, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u015Eifre :");
		lblNewLabel_2.setFont(new Font("Lucida Sans", Font.BOLD, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(76, 262, 144, 25);
		contentPane.add(lblNewLabel_2);
		
		ANASAYFA ana = new ANASAYFA();
		
		
		JButton girisyap = new JButton("Giri\u015F Yap");
		girisyap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				profil_kulladi = kulladi.getText();
				String kullanici_adi = kulladi.getText();
				String parola = new String(girissifre.getPassword());
				boolean girisbasarili = islemler.girisYap(kullanici_adi,parola);
				
				if(girisbasarili){
					JOptionPane.showMessageDialog(null, "Giriþ Baþarýlý !");
					ANASAYFA anasayfa = new ANASAYFA();
					setVisible(false);
					anasayfa.setVisible(true);
				}else{
					JOptionPane.showMessageDialog(null, "Giriþ Baþarýsýz ! Lütfen Tekrar Deneyiniz.");

				}
				
			
			
				
				
				
			}
		});
		girisyap.setBounds(234, 316, 158, 23);
		contentPane.add(girisyap);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\JET\\Desktop\\MEDIA PLAYER\\LOGO\\play-button-icon-transparent-4 (1).png"));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(248, 11, 120, 132);
		contentPane.add(lblNewLabel_3);
		
		JCheckBox sifregoster = new JCheckBox("\u015Eifreyi G\u00F6ster");
		sifregoster.setFont(new Font("Tahoma", Font.PLAIN, 13));
		sifregoster.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sifregoster.isSelected()){
					girissifre.setEchoChar((char)0);
				}else{
					girissifre.setEchoChar('*');
				}
			}
		});
		sifregoster.setForeground(Color.BLACK);
		sifregoster.setBackground(new Color(255, 255, 255));
		sifregoster.setBounds(437, 262, 110, 23);
		contentPane.add(sifregoster);
		
		girissifre = new JPasswordField();
		girissifre.setBounds(234, 265, 158, 25);
		contentPane.add(girissifre);
		
		JLabel lblNewLabel_4 = new JLabel("Media Player ");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("MV Boli", Font.BOLD, 24));
		lblNewLabel_4.setBounds(195, 157, 241, 25);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\JET\\Desktop\\MEDIA PLAYER\\ARKA TEMALAR\\G\u0130R\u0130\u015E ANA EKRAN.png"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 591, 364);
		contentPane.add(lblNewLabel);
	}
}
