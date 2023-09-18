package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CategoryDao;
import dao.ProductDao;
import model.CategoryModel;
import model.ProductModel;

@WebServlet(urlPatterns = { "/category", "/danh-muc-san-pham" })
public class CategoryController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");

		// Get CID from JSP
		String cid = req.getParameter("cid");

		// Get all category
		CategoryDao categorydao = new CategoryDao();
		List<CategoryModel> allCategoryList = categorydao.getAllCategory();
		req.setAttribute("allcategory", allCategoryList);

		// Product
		ProductDao productdao = new ProductDao();
		// Get all products
		List<ProductModel> allProductList = productdao.getAllProduct();
		// Get all products by cid
		List<ProductModel> allProductListByCID = productdao.getAllProductByCID(cid);
		
		if(cid.equals("0")) {
			req.setAttribute("product", allProductList);			
		} else {
			req.setAttribute("product", allProductListByCID);
		}
		
		// Get last product
		ProductModel lastProduct = productdao.getLastProduct();
		req.setAttribute("lastproduct", lastProduct);
		
		// Get current category
		req.setAttribute("categorytag", cid);

		RequestDispatcher rq = req.getRequestDispatcher("views/category.jsp");
		rq.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
