package com.ey.insurancealerts.services;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.Part;

import com.cloudant.client.api.model.Response;
import com.ey.insurancealerts.dao.GenericDAO;
import com.ey.insurancealerts.dao.GenericDAOImpl;
import com.ey.insurancealerts.models.UserInfo;

import au.com.bytecode.opencsv.CSVReader;

public class UploadPolicyHoldersService {

	GenericDAO dao = new GenericDAOImpl();

	public UploadPolicyHoldersResponse insertPolicyHolders(Part part) throws IOException {
		
		InputStream inputStream = part.getInputStream();
		CSVReader reader = new CSVReader(new InputStreamReader(inputStream));
		List<String[]> allRows = reader.readAll();
		
		List<UserInfo> userInfoList = new ArrayList<>();
		
		for(String[] userinfo : allRows) {
			UserInfo userInfo = new UserInfo();
			userInfo.setCity(userinfo[0]);
			userInfo.setContactNumber(userinfo[1]);
			userInfo.setName(userinfo[2]);
			userInfo.setPolicyNumber(userinfo[3]);
			userInfoList.add(userInfo);
		}
		
		List<Response> responses = dao.createMany(userInfoList);
		
		for(Response response : responses) {
			System.out.println(response.getStatusCode());
		}

		UploadPolicyHoldersResponse uploadPolicyHoldersResponse = new UploadPolicyHoldersResponse();
		uploadPolicyHoldersResponse.setStatus("Success");
		uploadPolicyHoldersResponse.setRecordsDiscarded(
				(int)responses.stream().filter(response -> response.getStatusCode() >= 400).count());
		uploadPolicyHoldersResponse.setRecordsUploaded(
				(int)responses.stream()
					.filter(response -> response.getStatusCode() == 200
											|| response.getStatusCode() == 201).count());
		uploadPolicyHoldersResponse.setTotalRecords(responses.size());
		
				
		
		return uploadPolicyHoldersResponse;
		
	}

}
