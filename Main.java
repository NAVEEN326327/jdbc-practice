import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args)  {
    	//your code goes here...
		// created connection
       ItemTypeDAO obj = new ItemTypeDAO();
       obj.getAllItemTypes();
		
	}
}