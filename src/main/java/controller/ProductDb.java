/*package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.ProductModel;
import util.StringUtils;

public class ProductDb{

	public static Connection getConnection() throws SQLException, ClassNotFoundException{
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/laptop_galaxy/products_table";
		String user= "root";
		String pass = "";
		return DriverManager.getConnection(url, user, pass);

	}
	public int addProductToDb(ProductModel productModel) {
		
		// Example logic to insert into a database (you'll need to replace this with your actual database operations)
		try (Connection con = getConnection();
				PreparedStatement st = con.prepareStatement(StringUtils.GET_USERNAME)) {
			st.setString(1, ProductModel.getProductName());
			st.setString(2, productDesc);
			st.setDouble(3, price);
			st.setInt(4, quantity);
			int rowsInserted = st.executeUpdate();
			return rowsInserted > 0;
		} catch (SQLException | ClassNotFoundException ex) {
			ex.printStackTrace();
			return false;
		}
	}
}*/
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.ProductModel;

public class ProductDb {
    public boolean addProductToDb(ProductModel productModel) {
        try (Connection con = getConnection();
                PreparedStatement st = con.prepareStatement("INSERT INTO products (product_id,product_name, product_desc, price, quantity) VALUES (?, ?, ?, ?, ?)")) {
           st.setString(1, productModel.getProductId());
        	st.setString(2, productModel.getProductName());
            st.setString(3, productModel.getProductDesc());
            st.setDouble(4, productModel.getPrice());
            st.setInt(5, productModel.getQuantity());
            int rowsInserted = st.executeUpdate();
            return rowsInserted > 0;
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    private Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/laptop_galaxy";
        String user = "root";
        String pass = "";
        return DriverManager.getConnection(url, user, pass);
    }
}