package com.dairy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.dairy.dto.Response;
import com.dairy.model.directMilkPurchase.PurchesInvoiceMaster;
import com.dairy.repository.directMilkPurchase.PurchesInvoiceRepo;
import com.dairy.service.DirectMilkPurchaseService;

@RestController
public class DirectMilkPurchaseController {
	
	@Autowired
	private DirectMilkPurchaseService directMilkPurchaseService ;
	
	
	@Autowired
	private  PurchesInvoiceRepo purchesInvoiceRepo;
	
	//save
	@PostMapping("/savePurchesInvoice")
	public Response savePurchesInvoice(@RequestBody PurchesInvoiceMaster purchesInvoiceMaster)
	{
		Response response = new Response();
		response.setStatus("Not Success");
    	response.setMessage("Data Not Saved..!!");
    	
    	PurchesInvoiceMaster purchesInvoiceMaster2=directMilkPurchaseService.savePurchesInvoice(purchesInvoiceMaster);
    	if(purchesInvoiceMaster2 != null)
    	{
    		response.setStatus("Success");
		    response.setMessage("Data Saved Successfully..!!");
		    response.setData(purchesInvoiceMaster2);
    	}
    	return response;
	}
	
	//find all
	@GetMapping("/findAllPurchesInvoice")
	public List<PurchesInvoiceMaster> findAllPurchesInvoice(){
		return directMilkPurchaseService.findAllPurchesInvoice();
	}
	
	//deleteById
	@PostMapping("/deletePurchesInvoiceById")
	public ResponseEntity<String>deletePurchesInvoiceById(@RequestBody PurchesInvoiceMaster purchesInvoiceMaster){
	int i=purchesInvoiceRepo.deleteByid(purchesInvoiceMaster.getId());
	if(i>0)
	{
		return ResponseEntity.ok("Data Deleted Successfully..!!");
	}
	else
	{
		return ResponseEntity.badRequest().body("Data Not Deleted...!");
	}
	}
	
	//findPurchesInvoiceByDateBetween
	@GetMapping("/findPurchesInvoiceByDateBetween")
	public Response findPurchesInvoiceByDateBetween(@RequestBody PurchesInvoiceMaster purchesInvoiceMaster) {
		Response response=new Response();
		response.setStatus("Not Success");
		response.setMessage("Data Not Found");
		
		List<PurchesInvoiceMaster> purchesInvoiceMaster2=directMilkPurchaseService.findByDateBetween(purchesInvoiceMaster.getfDate(),purchesInvoiceMaster.gettDate());
		if(!purchesInvoiceMaster2.isEmpty())
		{
			 response.setStatus("Success"); 
			 response.setMessage("Data Found..!!");
			 response.setData(purchesInvoiceMaster2);
		}
		return response;
	}

}
