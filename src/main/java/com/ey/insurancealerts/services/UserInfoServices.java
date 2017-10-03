package com.ey.insurancealerts.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.Part;

import com.ey.insurancealerts.dao.GenericDAO;
import com.ey.insurancealerts.dao.GenericDAOImpl;
import com.ey.insurancealerts.models.UserInfo;

public class UserInfoServices {

	GenericDAO dao = new GenericDAOImpl();

	public void addUser(Part part) throws IOException {
		InputStream inputStream = part.getInputStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
		String line;
		StringBuffer sb = new StringBuffer();
		while ((line = reader.readLine()) != null) {
			sb.append(line);
		}

		List<UserInfo> userInfoList = new ArrayList<>();
		userInfoList.forEach(dao::create);
	}

}
