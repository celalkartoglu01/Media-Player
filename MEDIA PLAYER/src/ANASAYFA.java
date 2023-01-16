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
import javax.swing.JMenuBar;

import java.awt.Color;

import javax.swing.JMenuItem;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ANASAYFA extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ANASAYFA frame = new ANASAYFA();
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
	public ANASAYFA() {
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 704, 473);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\JET\\Desktop\\MEDIA PLAYER\\BUTONLAR\\music (1).png"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SARKIDUZENLE sarki = new SARKIDUZENLE();
				setVisible(false);
				sarki.setVisible(true);
				
				
			}
		});
		btnNewButton_1.setBounds(521, 11, 126, 123);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\JET\\Desktop\\MEDIA PLAYER\\BUTONLAR\\transparent-list-icon-music-icon-player-icon-5d7cefac5e86a2.9208058615684689083872 (1).png"));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ÞARKILAR sarki = new ÞARKILAR();
				setVisible(false);
				sarki.setVisible(true);
				
			}
		});
		btnNewButton_2.setBounds(20, 247, 126, 123);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\JET\\Desktop\\MEDIA PLAYER\\BUTONLAR\\playlist.png"));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OYNATMALÝSTESÝ oynatma = new OYNATMALÝSTESÝ();
				setVisible(false);
				oynatma.setVisible(true);
			
			}
		});
		btnNewButton_3.setBounds(20, 11, 126, 123);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\JET\\Desktop\\MEDIA PLAYER\\LOGO\\play-button-icon-transparent-4 (1).png"));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(286, 11, 120, 132);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Media Player");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("MV Boli", Font.BOLD, 25));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(265, 154, 161, 32);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\JET\\Desktop\\MEDIA PLAYER\\BUTONLAR\\kisspng-computer-icons-photography-clip-art-5ae13d878c94d3.5407367515247107915758 (1).png"));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Çýkýþ Yapýlýyor...");
				PROJE proje = new PROJE();
				setVisible(false);
				proje.setVisible(true);
				
			}
		});
		btnNewButton_4.setBounds(521, 247, 126, 123);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel_4 = new JLabel("CALMA LISTESI");
		lblNewLabel_4.setFont(new Font("MV Boli", Font.BOLD, 17));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(5, 381, 161, 22);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("SARKI EKLE/KALDIR");
		lblNewLabel_5.setFont(new Font("MV Boli", Font.BOLD, 17));
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(482, 157, 196, 32);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("CIKIS YAP");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("MV Boli", Font.BOLD, 17));
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(526, 376, 121, 32);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("OYNATMA LISTESI\r\n");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("MV Boli", Font.BOLD, 17));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(10, 160, 181, 27);
		contentPane.add(lblNewLabel_7);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PROFIL profil = new PROFIL();
				setVisible(false);
				profil.setVisible(true);
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\JET\\Desktop\\MEDIA PLAYER\\BUTONLAR\\person-profile-icon (1).png"));
		btnNewButton.setBounds(270, 247, 126, 123);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("PROFIL");
		lblNewLabel_3.setFont(new Font("MV Boli", Font.BOLD, 17));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(269, 387, 127, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\JET\\Desktop\\MEDIA PLAYER\\ARKA TEMALAR\\ANA SAYFA 2.png"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 688, 435);
		contentPane.add(lblNewLabel);
	}
}
