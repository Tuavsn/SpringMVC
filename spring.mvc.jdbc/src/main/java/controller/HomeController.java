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

@WebServlet(urlPatterns = {"/home", "/trang-chu"})
public class HomeController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		//Get all category
		CategoryDao categorydao = new CategoryDao();
		List<CategoryModel> allCategoryList = categorydao.getAllCategory();
		req.setAttribute("allcategory", allCategoryList);
		//Get top 4 last product
		ProductDao productdao = new ProductDao();
		List<ProductModel> top4LastProductList = productdao.getTop4LastProduct();
		req.setAttribute("top4lastproduct", top4LastProductList);
		
		RequestDispatcher rq = req.getRequestDispatcher("/views/home.jsp");
		rq.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
	}
}
