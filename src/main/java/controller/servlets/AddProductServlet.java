/*package controller.servlets;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.DatabaseController;
import controller.ProductDb;
import model.ProductModel;
import model.UserModel;

@WebServlet("/AddProductServlet")
public class AddProductServlet extends HttpServlet {
private static final long serialVersionUID = 1L;
	
	ProductDb productDb = new ProductDb();
	
	 public AddProductServlet() {
	        super();
	        // TODO Auto\
	 }
       
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productName = request.getParameter("product_name");
        String productDesc = request.getParameter("product_desc");
        double price = Double.parseDouble(request.getParameter("price"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));

        ProductModel productModel = new ProductModel(productName, productDesc, price, quantity);
     // Call the addProductToDb method from ProductDb to add the product to the database
        int result = productDb.addProductToDb(productModel);
        
        
    
    }}*/
package controller.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.ProductDb;
import model.ProductModel;
import util.StringUtils;

@WebServlet("/AddProductServlet")
public class AddProductServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    ProductDb productDb = new ProductDb();

    public AddProductServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	String productId = request.getParameter("product_id");
        String productName = request.getParameter("product_name");
        String productDesc = request.getParameter("product_desc");
        double price = Double.parseDouble(request.getParameter("price"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        
        if (productId == null || productId.isEmpty()) {
            request.setAttribute(StringUtils.MESSAGE, "Product ID cannot be null or empty.");
        } else {

        ProductModel productModel = new ProductModel(productId, productName, productDesc, price, quantity);

        boolean success = productDb.addProductToDb(productModel);
        
        

        if (success) {
            request.setAttribute(StringUtils.MESSAGE, StringUtils.PRODUCT_ADDED_MESSAGE);
             } else {
            request.setAttribute(StringUtils.MESSAGE, StringUtils.PRODUCT_FAILED_MESSAGE);
            		
        }
        
        	request.getRequestDispatcher(StringUtils.DASHBOARD_PAGE).forward(request, response);
		
		
         }
    }
}
