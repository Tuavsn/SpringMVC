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

@WebServlet(urlPatterns = { "/product", "/san-pham" })
public class ProductController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");

		// Get all category
		CategoryDao categorydao = new CategoryDao();
		List<CategoryModel> allCategoryList = categorydao.getAllCategory();
		req.setAttribute("allcategory", allCategoryList);

		// Get pid
		String pid = req.getParameter("pid");
		// Get product by pid
		ProductDao productdao  = new ProductDao();
		ProductModel product = productdao.getProductByPID(pid);
		req.setAttribute("product", product);
		
		RequestDispatcher rq = req.getRequestDispatcher("/views/product.jsp");
		rq.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
