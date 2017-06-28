package ch.makery.address.DAO;

import application.MySQLSSHConnector;
import ch.makery.address.model.Table_restaurant;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author maxim
 */
public class Table_restaurantDAO {
    public Table_restaurant getTableById(int id){
        MySQLSSHConnector db = new MySQLSSHConnector();
            try {
                Connection connection = db.connection_db();
		PreparedStatement pr = null;
		pr = (PreparedStatement) connection.prepareStatement("Select * from Table_restaurant WHERE id_table = " + id);
		ResultSet rs = pr.executeQuery();

		if (rs.next()){
                    Table_restaurant res = new Table_restaurant();
                    res.setId_table(rs.getInt("id_table"));
                    res.setNb_place(rs.getInt("nb_places"));
                    res.setNumero_table(rs.getInt("numero_table"));
                    
                    connection.close();
		    db.CloseSSHConnection();
                    return res;
		}
			
            } catch (SQLException e) {
		// TODO Auto-generated catch block
                db.CloseSSHConnection();
		e.printStackTrace();
            }
            
        db.CloseSSHConnection();
        return null;
    }
    public ArrayList<Table_restaurant> getAll(){
        MySQLSSHConnector db = new MySQLSSHConnector();
            try {
                Connection connection = db.connection_db();
		PreparedStatement pr = null;
		pr = (PreparedStatement) connection.prepareStatement("Select * from Table_restaurant");
		ResultSet rs = pr.executeQuery();
                ArrayList<Table_restaurant> tabTable = new ArrayList<>();
                
		if (rs.next()){
                    Table_restaurant res = new Table_restaurant();
                    res.setId_table(rs.getInt("id_table"));
                    res.setNb_place(rs.getInt("nb_places"));
                    res.setNumero_table(rs.getInt("numero_table"));
                    
                    connection.close();
		    db.CloseSSHConnection();
                    tabTable.add(res);
		}
                return tabTable;
			
            } catch (SQLException e) {
		// TODO Auto-generated catch block
                db.CloseSSHConnection();
		e.printStackTrace();
            }
            
        db.CloseSSHConnection();
        return null;
    }
}
