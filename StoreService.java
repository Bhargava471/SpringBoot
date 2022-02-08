package com.springbootwithhibernate.service;

import java.util.List;


import com.springbootwithhibernate.entity.Store;

import com.springbootwithhibernate.exception.StoreNotFoundException;

public interface StoreService {

	Store insertStore(Store newstore);

	Store showStoreById(String storeId) throws StoreNotFoundException;

	List<Store> showAllStores();



	Store updateStoreById(String storeId, Store store) throws StoreNotFoundException;

	void deleteStoreById(String storeId) throws StoreNotFoundException;



}

