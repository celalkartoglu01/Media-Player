import jaco.mp3.player.MP3Player;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.Line;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.nio.file.Paths;

import javax.swing.JTextField;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class OYNATMALÝSTESÝ extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OYNATMALÝSTESÝ frame = new OYNATMALÝSTESÝ();
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
	MP3Player player;
	File sarkidosya;
	String currentDirectory = "home.user";
	String currentPath;
	boolean tekrar = false;
	boolean windowCollapsed = false;
	
	
	
 
	
	
	
	
	public OYNATMALÝSTESÝ() {
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 725, 469);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton anasayfa_1 = new JButton("");
		anasayfa_1.setIcon(new ImageIcon("C:\\Users\\JET\\Desktop\\MEDIA PLAYER\\BUTONLAR\\home-page (1).png"));
		anasayfa_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0){
				ANASAYFA anasayfa = new ANASAYFA();
				setVisible(false);
				anasayfa.setVisible(true);
			}
		});
		anasayfa_1.setBounds(601, 350, 89, 58);
		contentPane.add(anasayfa_1);
		
		JLabel lblNewLabel_1 = new JLabel("ANA SAYFA");
		lblNewLabel_1.setFont(new Font("MV Boli", Font.BOLD, 14));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(593, 413, 106, 18);
		contentPane.add(lblNewLabel_1);
		
		JLabel sarkiAdi = new JLabel("");
		sarkiAdi.setFont(new Font("MV Boli", Font.BOLD, 17));
		sarkiAdi.setToolTipText("");
		sarkiAdi.setForeground(Color.WHITE);
		sarkiAdi.setHorizontalAlignment(SwingConstants.CENTER);
		sarkiAdi.setBounds(112, 207, 455, 40);
		contentPane.add(sarkiAdi);
		
		JButton tekrarbuton = new JButton("");
		tekrarbuton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(tekrar == false){
					tekrar = true;
					player.setRepeat(tekrar);
				}else if(tekrar == true){
					tekrar = false;
					player.setRepeat(tekrar);
				}
			}
		});
		tekrarbuton.setIcon(new ImageIcon("C:\\Users\\JET\\Desktop\\MEDIA PLAYER\\BUTONLAR\\repeat_11 (1).png"));
		tekrarbuton.setBounds(20, 299, 65, 40);
		contentPane.add(tekrarbuton);
		
		JButton oynatbuton = new JButton("");
		oynatbuton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			player.play();
			}
		});
		oynatbuton.setIcon(new ImageIcon("C:\\Users\\JET\\Desktop\\MEDIA PLAYER\\BUTONLAR\\play-button (1).png"));
		oynatbuton.setBounds(209, 272, 89, 67);
		contentPane.add(oynatbuton);
		
		JButton durdurbuton = new JButton("");
		durdurbuton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				player.pause();
			}
		});
		durdurbuton.setIcon(new ImageIcon("C:\\Users\\JET\\Desktop\\MEDIA PLAYER\\BUTONLAR\\video-pause-button (1).png"));
		durdurbuton.setBounds(118, 299, 65, 40);
		contentPane.add(durdurbuton);
		
		JButton kapatbuton = new JButton("");
		kapatbuton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				player.stop();
			}
		});
		kapatbuton.setIcon(new ImageIcon("C:\\Users\\JET\\Desktop\\MEDIA PLAYER\\BUTONLAR\\music-stop-icon-39445 (1).png"));
		kapatbuton.setBounds(319, 299, 65, 40);
		contentPane.add(kapatbuton);
		
		JButton acbuton = new JButton("");
		acbuton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JFileChooser openFileChooser = new JFileChooser(currentDirectory);
				openFileChooser.setFileFilter(new FileTypeFilter(".mp3","Open MP3 Files Only !"));
				int result = openFileChooser.showOpenDialog(null);
				if(result==JFileChooser.APPROVE_OPTION){
					sarkidosya = openFileChooser.getSelectedFile();
					player.addToPlayList(sarkidosya);
					player.skipForward();
					currentDirectory = sarkidosya.getAbsolutePath();
					sarkiAdi.setText("Suan Çalýyor.." + sarkidosya.getName());
				}
			}
		});
		acbuton.setIcon(new ImageIcon("C:\\Users\\JET\\Desktop\\MEDIA PLAYER\\BUTONLAR\\11zon_resized.png"));
		acbuton.setBounds(394, 299, 65, 40);
		contentPane.add(acbuton);
		
		JButton sonsesbuton = new JButton("");
		sonsesbuton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ses(1.0);
			}
		});
		sonsesbuton.setIcon(new ImageIcon("C:\\Users\\JET\\Desktop\\MEDIA PLAYER\\BUTONLAR\\volume-level (1).png"));
		sonsesbuton.setBounds(577, 299, 44, 40);
		contentPane.add(sonsesbuton);
		
		JButton sessizbuton = new JButton("");
		sessizbuton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ses(0.0);
			}
		});
		sessizbuton.setIcon(new ImageIcon("C:\\Users\\JET\\Desktop\\MEDIA PLAYER\\BUTONLAR\\mute (1).png"));
		sessizbuton.setBounds(631, 299, 44, 40);
		contentPane.add(sessizbuton);
		
		JButton seskisbuton = new JButton("");
		seskisbuton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				sesKis(0.1);
			}
		});
		seskisbuton.setIcon(new ImageIcon("C:\\Users\\JET\\Desktop\\MEDIA PLAYER\\BUTONLAR\\volume (1).png"));
		seskisbuton.setBounds(469, 299, 44, 40);
		contentPane.add(seskisbuton);
		
		JButton sesacbuton = new JButton("");
		sesacbuton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				sesArtir(0.1);
			}
		});
		sesacbuton.setIcon(new ImageIcon("C:\\Users\\JET\\Desktop\\MEDIA PLAYER\\BUTONLAR\\volume (2).png"));
		sesacbuton.setBounds(523, 299, 44, 40);
		contentPane.add(sesacbuton);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\JET\\Desktop\\MEDIA PLAYER\\LOGO\\play-button-icon-transparent-4 (1).png"));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(278, 11, 120, 132);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("MEDIA PLAYER");
		lblNewLabel_4.setFont(new Font("MV Boli", Font.BOLD, 25));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(228, 154, 231, 30);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\JET\\Desktop\\MEDIA PLAYER\\ARKA TEMALAR\\\u015EARKILAR.png"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 709, 431);
		contentPane.add(lblNewLabel);
		
		sarkidosya = new File("C:\\Users\\JET\\Desktop\\MEDIA PLAYER");
		String dosyaAd = sarkidosya.getName();
	    player = mp3Player();
	    player.addToPlayList(sarkidosya);
	    currentPath = Paths.get(".").toAbsolutePath().normalize().toString();
	    
	 
	}
	
	private MP3Player mp3Player(){
    	MP3Player mp3Player = new MP3Player();
    	return mp3Player;
    }
	
	
	private void ses(Double valueToPlusMinus){
		Mixer.Info[] mixers = AudioSystem.getMixerInfo();
		for(Mixer.Info mixerInfo : mixers){
			Mixer mixer = AudioSystem.getMixer(mixerInfo);
			Line.Info[] lineInfos = mixer.getTargetLineInfo();
			
			for(Line.Info lineInfo : lineInfos){
				Line line = null;
				boolean opened = true;
				try {
					line = mixer.getLine(lineInfo);
					opened = line.isOpen() || line instanceof Clip;
					if(!opened){
						line.open();
					}
					
					FloatControl volControl = (FloatControl) line.getControl(FloatControl.Type.VOLUME);
					float currentVolume = volControl.getValue();
					Double volumeToCut = valueToPlusMinus;
					float changedCalc = (float) ((double)volumeToCut);
					volControl.setValue(changedCalc);
				} catch (LineUnavailableException lineException) {	
				}catch (IllegalArgumentException illException){
				}finally{
					if(line != null && !opened){
						line.close();
						
					}
				}
			}
		
		}
			
		}
		
	
	
	private void sesArtir(Double valueToPlusMinus){
		Mixer.Info[] mixers = AudioSystem.getMixerInfo();
		for(Mixer.Info mixerInfo : mixers){
			Mixer mixer = AudioSystem.getMixer(mixerInfo);
			Line.Info[] lineInfos = mixer.getTargetLineInfo();
			
			for(Line.Info lineInfo : lineInfos){
				Line line = null;
				boolean opened = true;
				try {
					line = mixer.getLine(lineInfo);
					opened = line.isOpen() || line instanceof Clip;
					if(!opened){
						line.open();
					}
					
					FloatControl volControl = (FloatControl) line.getControl(FloatControl.Type.VOLUME);
					float currentVolume = volControl.getValue();
					Double volumeToCut = valueToPlusMinus;
					float changedCalc = (float) ((float)currentVolume+(double)volumeToCut);
					volControl.setValue(changedCalc);
				} catch (LineUnavailableException lineException) {	
				}catch (IllegalArgumentException illException){
				}finally{
					if(line != null && !opened){
						line.close();
						
					}
				}
			}
		
			
			
		}
	}
		
	
	
	
	
	private void sesKis(Double valueToPlusMinus){
		Mixer.Info[] mixers = AudioSystem.getMixerInfo();
		for(Mixer.Info mixerInfo : mixers){
			Mixer mixer = AudioSystem.getMixer(mixerInfo);
			Line.Info[] lineInfos = mixer.getTargetLineInfo();
			
			for(Line.Info lineInfo : lineInfos){
				Line line = null;
				boolean opened = true;
				try {
					line = mixer.getLine(lineInfo);
					opened = line.isOpen() || line instanceof Clip;
					if(!opened){
						line.open();
					}
					
					FloatControl volControl = (FloatControl) line.getControl(FloatControl.Type.VOLUME);
					float currentVolume = volControl.getValue();
					Double volumeToCut = valueToPlusMinus;
					float changedCalc = (float) ((float)currentVolume-(double)volumeToCut);
					volControl.setValue(changedCalc);
				} catch (LineUnavailableException lineException) {	
				}catch (IllegalArgumentException illException){
				}finally{
					if(line != null && !opened){
						line.close();
						
					}
				}
			}
		
			
			
		}
		
	}
	
	

	

}
