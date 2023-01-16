import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;


public class MuzikIslemleri{
	
	private Connection con = null;
	   
	 private Statement statement = null;
	   
	 private PreparedStatement preparedStatement = null;
	 
	 
	 public void sarkiEkle(String sarki_ad,String sanatci_ad,String tur){
		 
			String sorgu = "Insert Into sarkilar (Adý,Sanatçý,Türü) VALUES(?,?,?)";
			 try {
				 
				preparedStatement = con.prepareStatement(sorgu);
				preparedStatement.setString(1,sarki_ad);
				preparedStatement.setString(2,sanatci_ad);
				preparedStatement.setString(3,tur);
				
				preparedStatement.executeUpdate();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			 
		 }
	 
	 public void sarkiSil(int id){
			String sorgu = "Delete from sarkilar where id = ?";
			try {
				preparedStatement = con.prepareStatement(sorgu);
				preparedStatement.setInt(1, id);
				preparedStatement.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
	 
	 
	  public ResultSet listele(){
	    	String sorgu = "select * from sarkilar";
	    try {
			preparedStatement = con.prepareStatement(sorgu);
			ResultSet rs =preparedStatement.executeQuery(sorgu);
			return rs;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
			
		}	
	    }
	 
	 public void uyeEkle(String ad,String soyad,String email,String kullanici_adi,String parola){
		 String sorgu = "Insert into kullanýcýlar (ad,soyad,eposta,kulladi,sifre) VALUES (?,?,?,?,?)";
				 
		 try {
			preparedStatement = con.prepareStatement(sorgu);
			preparedStatement.setString(1,ad);
			preparedStatement.setString(2,soyad);
			preparedStatement.setString(3,email);
			preparedStatement.setString(4,kullanici_adi);
			preparedStatement.setString(5,parola);
			
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		 
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 public boolean girisYap(String kullanici_adi,String parola){
		String sorgu = "Select * From kullanýcýlar where kulladi = ? and sifre = ?";
		try {
			preparedStatement = con.prepareStatement(sorgu);
			preparedStatement.setString(1,kullanici_adi);
			preparedStatement.setString(2,parola);
			
			ResultSet rs = preparedStatement.executeQuery();
			
			return rs.next();
		

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
		
		
	}
	 
	 public MuzikIslemleri(){
		  String url = "jdbc:mysql://"+Database.host+":"+Database.port+"/"+ Database.db_ismi+"?useUnicode=true&characterEncoding=utf8";
	       
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	        } catch (ClassNotFoundException ex) {
	            System.out.println("Driver bulunamadý");
	        }
	       
	        try {
	            con = (Connection) DriverManager.getConnection(url,Database.kullanici_adi,Database.parola);
	            System.out.println("Baðlantý Baþarýlý");
	        } catch (SQLException ex) {
	        	System.out.println(ex);
	            System.out.println("Baðlantý Baþarýsýz");
	        }
		 
	 }
	 
	

	 
	 
	 
	 
	 

}
