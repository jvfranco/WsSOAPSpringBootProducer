package com.soap.webservices.customersadministration.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.soap.webservices.customersadministration.model.CustomerDetail;
import com.soap.webservices.customersadministration.model.GetCustomerDetailRequest;
import com.soap.webservices.customersadministration.model.GetCustomerDetailResponse;

@Endpoint
public class CustomerDetailEndpoint {
	
	@PayloadRoot(namespace = "http://soap.com.br", localPart = "GetCustomerDetailRequest")
	@ResponsePayload
	public GetCustomerDetailResponse processCustomerDetailRequest(@RequestPayload GetCustomerDetailRequest req) {
		GetCustomerDetailResponse response = new GetCustomerDetailResponse();
		CustomerDetail customerDetail = new CustomerDetail();
		customerDetail.setId(1);
		customerDetail.setName("Bob");
		customerDetail.setPhone("99999999");
		customerDetail.setEmail("bob@gmail.com");
		
		response.setCustomerDetail(customerDetail);
		
		return response;
	}

}
