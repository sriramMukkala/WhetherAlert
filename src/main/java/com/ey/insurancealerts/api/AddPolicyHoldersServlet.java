package com.ey.insurancealerts.api;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.ey.insurancealerts.services.UploadPolicyHoldersResponse;
import com.ey.insurancealerts.services.UploadPolicyHoldersService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@WebServlet("/addpolicyholders")
@MultipartConfig()
public class AddPolicyHoldersServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Part part = request.getPart("file");

		UploadPolicyHoldersService service = new UploadPolicyHoldersService();
		
		UploadPolicyHoldersResponse uploadPolicyHoldersResponse = service.insertPolicyHolders(part);

		System.out.println("Upload completed.");

		Gson gson = new GsonBuilder().create();
		String payloadStr = gson.toJson(uploadPolicyHoldersResponse);
		
		response.getWriter().println(payloadStr);
	}
	
}