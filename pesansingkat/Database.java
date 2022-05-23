package pesansingkat;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Database {
    Connection koneksi;
    Statement statement;
    
    public void start(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/pesansingkat", "root", "");
            statement = koneksi.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Tidak Bisa Terhubung ! "+e.getMessage());
        }
    }
}
