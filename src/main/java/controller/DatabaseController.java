package controller;


import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.StringUtils;

import model.UserModel;

public class DatabaseController{
	
	public Connection getConnection() throws SQLException, ClassNotFoundException{
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/laptop_galaxy";
		String user= "root";
		String pass = "";
		return DriverManager.getConnection(url, user, pass);
		
	}

	public int addUser(UserModel userModel) {
		try (Connection con = getConnection()) {
			//check for existing userName
			PreparedStatement checkUsernameSt = con.prepareStatement(StringUtils.GET_USERNAME);
			checkUsernameSt.setString(1, userModel.getUserName());
			ResultSet checkUserNameRs= checkUsernameSt.executeQuery();
			checkUserNameRs.next();
			if (checkUserNameRs.getInt(1) > 0) {
				return -2; //Userrname already exists
				
			}
			
			//check for existing phone number
			PreparedStatement checkPhoneSt = con.prepareStatement (StringUtils.GET_PHONE);
			checkPhoneSt.setString(1, userModel.getPhoneNumber());
			ResultSet checkPhoneRs= checkPhoneSt.executeQuery();
			checkPhoneRs.next();
			if(checkPhoneRs.getInt(1) > 0) {
				return -4; //phone number already exists
			}
			
			//check for existing email
			PreparedStatement checkEmailSt = con.prepareStatement(StringUtils.GET_EMAIL);
			checkEmailSt.setString(1, userModel.getEmail());
			ResultSet checkEmailRs = checkEmailSt.executeQuery();
			checkEmailRs.next();
			if (checkEmailRs.getInt(1) > 0) {
				return -3; //Email already exists
			}
			
		
		
			PreparedStatement st = con.prepareStatement(StringUtils.INSERT_USER);
			
			st.setString(1, userModel.getUserName());
			st.setString(2, userModel.getFirstName());
			st.setString(3, userModel.getLastName());
			st.setDate(4, Date.valueOf(userModel.getDob()));
			st.setString(5, userModel.getGender());
			st.setString(6, userModel.getEmail());
			st.setString(7, userModel.getPhoneNumber());
			st.setString(8, userModel.getRole());
			st.setString(9, userModel.getPassword());
			
			int result = st.executeUpdate();
			return result > 0 ? 1: 0;
			
		} catch (SQLException | ClassNotFoundException ex) {
			ex.printStackTrace();
			return -1;
			
		}
		
	}
	
	public int getUserLoginInfo(String username, String password ) {
		try (Connection con =getConnection()){
			PreparedStatement st = con.prepareStatement(StringUtils.GET_LOGIN_USER_INFO);
			st.setString(1, username);
			//st.setString(2, password);
			ResultSet result = st.executeQuery();
			
			if (result.next()) {
				//User name and passsword match in the database
				String userDb = result.getString("user_name");
				String passwordDb = result.getString("password");
				//String decryptedPwd = passwordEncryptionWithAes.decrypt(passwordDb, username);
				
			//	if (decryptedPwd != null && userDb.equals(username) && decryptedPwd.equals(password))
					
				
				return 1;
			
			}else {
				return 0;
				
			}
		} catch (SQLException | ClassNotFoundException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
			return -1;
		/*} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return 0;*/
	
}}

	public String getUserRole(String userName) {
		// TODO Auto-generated method stub
		String roleDb = null;
		try (Connection con = getConnection()) {
	        // Prepare the SQL statement to retrieve the user's role
	        String sql = "SELECT role FROM user_info WHERE user_name = ?";
	        PreparedStatement st = con.prepareStatement(sql);
	        st.setString(1, userName);
	        
	        // Execute the query
	        ResultSet resultSet = st.executeQuery();
	        
	        // Check if the user exists and retrieve their role
	        if (resultSet.next()) {
	            roleDb = resultSet.getString("role");
	        }
	        
	        // Close the resources
	        resultSet.close();
	        st.close();
	    } catch (SQLException | ClassNotFoundException e) {
	        e.printStackTrace(); // Handle or log the exception as needed
	    }
	    
	    return roleDb; // Return the user's role
	}

}