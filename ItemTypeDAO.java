import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
public class ItemTypeDAO {
    
	public List<ItemType> getAllItemTypes() throws ClassNotFoundException, SQLException  {
        
     
         
    	Connection con = DbConnection.getConnection();

		String sql = "select * from item_type";
		
		 Statement st=con.createStatement();
		 
		 ResultSet rs = st.executeQuery(sql);
         
         while(rs.next())
    	 {
			 Long id = rs.getLong("id");
			 String name = rs.getString("name");
             Double deposit = rs.getDouble("deposit");
             Double cost_per_day = rs.getDouble("cost_per_day");
             
             
             
             
             System.out.println(id);
             System.out.println(name);
             System.out.println(deposit);
             System.out.println(cost_per_day);
			 

		 }
		 
		con.close();
		return null;
		//your code goes here...
	}
}