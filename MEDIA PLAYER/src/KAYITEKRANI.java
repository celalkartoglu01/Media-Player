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
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;


public class KAYITEKRANI extends JFrame {
	MuzikIslemleri islemler = new MuzikIslemleri();
	static String profiladd;
	static String profilsoyadd;
	static String profilemail;

	private JPanel contentPane;
	private JTextField kayitad;
	private JTextField kayitsoyad;
	private JTextField eposta;
	private JTextField kayitkulladi;
	private JPasswordField kayitsifre;
	private JPasswordField kayitsifretekrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KAYITEKRANI frame = new KAYITEKRANI();
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
	public KAYITEKRANI() {
		GÝRÝSEKRANI giris = new GÝRÝSEKRANI();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 743, 458);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Kay\u0131t Ekran\u0131");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("MV Boli", Font.BOLD, 20));
		lblNewLabel_4.setBounds(10, 237, 150, 33);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\JET\\Desktop\\MEDIA PLAYER\\LOGO\\play-button-icon-transparent-4 (1).png"));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(31, 25, 120, 132);
		contentPane.add(lblNewLabel_1);
		
		kayitad = new JTextField();
		kayitad.setBounds(401, 21, 150, 26);
		contentPane.add(kayitad);
		kayitad.setColumns(10);
		
		kayitsoyad = new JTextField();
		kayitsoyad.setBounds(401, 74, 150, 26);
		contentPane.add(kayitsoyad);
		kayitsoyad.setColumns(10);
		
		eposta = new JTextField();
		eposta.setBounds(401, 131, 150, 26);
		contentPane.add(eposta);
		eposta.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Media Player\r\n");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("MV Boli", Font.BOLD, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 164, 157, 83);
		contentPane.add(lblNewLabel_2);
		
		kayitkulladi = new JTextField();
		kayitkulladi.setBounds(401, 186, 150, 26);
		contentPane.add(kayitkulladi);
		kayitkulladi.setColumns(10);
		
		JButton kayitol = new JButton("Kay\u0131t Ol");
		kayitol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
		if(kayitad.getText().trim().equals("") && kayitsoyad.getText().trim().equals("") && eposta.getText().trim().equals("") && kayitkulladi.getText().trim().equals("") && kayitsifre.getText().trim().equals("")){
				JOptionPane.showMessageDialog(null,"Bilgiler Boþ Býrakýlamaz !");
				
			}else if(kayitad.getText().trim().equals("")){
				JOptionPane.showMessageDialog(null,"Ad Boþ Býrakýlamaz !");
			}else if(kayitsoyad.getText().trim().equals("")){
				JOptionPane.showMessageDialog(null,"Soyad Boþ Býrakýlamaz !");
			}else if(eposta.getText().trim().equals("")){
				JOptionPane.showMessageDialog(null,"E-posta Boþ Býrakýlamaz !");
			}else if(kayitkulladi.getText().trim().equals("")){
				JOptionPane.showMessageDialog(null,"Kullanýcý Adý Boþ Býrakýlamaz !");
			}else if(kayitsifre.getText().trim().equals("")){
				JOptionPane.showMessageDialog(null,"Þifre Boþ Býrakýlamaz !");
			}else if(!kayitsifretekrar.getText().trim().equals(kayitsifre.getText())){
				JOptionPane.showMessageDialog(null,"Þifre Tekrarý Yanlýþ !");
			}
			else{
				profiladd = kayitad.getText();
				profilsoyadd = kayitsoyad.getText();
				profilemail = eposta.getText();
				String ad = kayitad.getText();
				String soyad = kayitsoyad.getText();
				String email = eposta.getText();
				String kullanici_adi = kayitkulladi.getText();
				String parola = new String(kayitsifre.getText());
				islemler.uyeEkle(ad,soyad,email,kullanici_adi,parola);
				JOptionPane.showMessageDialog(null,"Kayýt Oluþturuldu !");
				setVisible(false);
				giris.setVisible(true);
				
				
			}
		
			}
		});
		kayitol.setFont(new Font("Tahoma", Font.PLAIN, 20));
		kayitol.setBounds(401, 360, 150, 33);
		contentPane.add(kayitol);
		
		JLabel lblNewLabel_3 = new JLabel("Ad :");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Lucida Sans", Font.BOLD, 20));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(237, 21, 120, 26);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("Soyad :");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Lucida Sans", Font.BOLD, 20));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(242, 74, 115, 26);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("E-posta :");
		lblNewLabel_6.setFont(new Font("Lucida Sans", Font.BOLD, 20));
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(256, 131, 115, 26);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Kullan\u0131c\u0131 Ad\u0131 :");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("Lucida Sans", Font.BOLD, 20));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(217, 192, 154, 20);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("\u015Eifre :");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("Lucida Sans", Font.BOLD, 20));
		lblNewLabel_8.setBounds(256, 250, 120, 20);
		contentPane.add(lblNewLabel_8);
		
		JCheckBox sifregoster = new JCheckBox("\u015Eifreyi G\u00F6ster");
		sifregoster.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(sifregoster.isSelected()){
					kayitsifre.setEchoChar((char)0);
				}else{
					kayitsifre.setEchoChar('*');
				}
			}
		});
		sifregoster.setFont(new Font("Tahoma", Font.PLAIN, 13));
		sifregoster.setBounds(585, 252, 110, 23);
		contentPane.add(sifregoster);
		
		kayitsifre = new JPasswordField();
		kayitsifre.setBounds(401, 250, 150, 26);
		contentPane.add(kayitsifre);
		
		kayitsifretekrar = new JPasswordField();
		kayitsifretekrar.setBounds(401, 312, 150, 26);
		contentPane.add(kayitsifretekrar);
		
		JLabel lblNewLabel_9 = new JLabel("\u015Eifre Tekrar :");
		lblNewLabel_9.setFont(new Font("Lucida Sans", Font.BOLD, 20));
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setBounds(217, 312, 154, 26);
		contentPane.add(lblNewLabel_9);
		
		JCheckBox sifregoster2 = new JCheckBox("\u015Eifreyi G\u00F6ster \r\n");
		sifregoster2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(sifregoster2.isSelected()){
					kayitsifretekrar.setEchoChar((char)0);
				}else{
					kayitsifretekrar.setEchoChar('*');
				}
			}
		});
		sifregoster2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		sifregoster2.setBounds(585, 314, 110, 23);
		contentPane.add(sifregoster2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\JET\\Desktop\\MEDIA PLAYER\\ARKA TEMALAR\\KAYIT.png"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 727, 420);
		contentPane.add(lblNewLabel);
	}
}
