package com.springbootwithhibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.springbootwithhibernate.entity.Store;
import com.springbootwithhibernate.exception.StoreNotFoundException;
import com.springbootwithhibernate.service.StoreService;

@RestController// (@Controller + @ResponseBody)
@RequestMapping("store/api/v1")
public class StoreController {
	
	@Autowired
	StoreService storeService;
	
	@PostMapping("store")
	public Store insertStore(@RequestBody Store newStore) {
		
		return storeService.insertStore(newStore);
		
	}
	
	@GetMapping("store")
	public List<Store> showAllStores(){
		return storeService.showAllStores();
		
	}
	
	@GetMapping("store/{sid}")
	public Store showStoreById(@PathVariable("sid") String storeId) throws StoreNotFoundException{
		return storeService.showStoreById(storeId);
		
	}
	
	@PutMapping("store/{sid}")
	public Store updateStoreById(@PathVariable("sid") String storeId,@RequestBody Store store) throws StoreNotFoundException{
		return storeService.updateStoreById(storeId,store);
		
	}
	
	@DeleteMapping("store/{sid}")
	public String deleteStoreById(@PathVariable("sid") String storeId) throws StoreNotFoundException{
		storeService.deleteStoreById(storeId);
		 return "deleted the Store";
		
	}
	

	
	
}