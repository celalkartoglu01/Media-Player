import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class PROJE extends JFrame {
	

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PROJE frame = new PROJE();
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
	public PROJE() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 607, 404);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton kayitbuton = new JButton("Media Player'\u0131 ilk defa m\u0131 kullan\u0131yorsun ? Kaydol !");
		kayitbuton.setBackground(Color.WHITE);
		GÝRÝSEKRANI giriss = new GÝRÝSEKRANI();
		KAYITEKRANI kayit = new KAYITEKRANI();
		kayitbuton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				kayit.setVisible(true);
			}
		});
		kayitbuton.setFont(new Font("MS UI Gothic", Font.BOLD, 15));
		kayitbuton.setBounds(118, 298, 400, 23);
		contentPane.add(kayitbuton);
		
		JButton girisbuton = new JButton("Oturum A\u00E7");
		girisbuton.setBackground(Color.WHITE);
		girisbuton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				giriss.setVisible(true);
				
				
			}
		});
		girisbuton.setFont(new Font("MS UI Gothic", Font.BOLD, 19));
		girisbuton.setBounds(118, 231, 400, 23);
		contentPane.add(girisbuton);
		
		JLabel lblNewLabel_3 = new JLabel("Milyonlarca sark\u0131 Media Player'da \u00FCcretsiz !");
		lblNewLabel_3.setBackground(Color.BLACK);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("MV Boli", Font.BOLD, 20));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(65, 154, 472, 41);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("Media Player");
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("MV Boli", Font.BOLD, 35));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(263, 47, 255, 57);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\JET\\Desktop\\MEDIA PLAYER\\LOGO\\play-button-icon-transparent-4 (1).png"));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(133, 11, 120, 132);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\JET\\Desktop\\MEDIA PLAYER\\ARKA TEMALAR\\...png"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 591, 364);
		contentPane.add(lblNewLabel);
	}
}
