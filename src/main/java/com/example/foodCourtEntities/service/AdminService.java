package com.example.foodCourtEntities.service;

import java.util.List;

import com.example.foodCourtEntities.entity.Admin;

public interface AdminService {
Admin addAdmin(Admin Admin);
	
	List<Admin> getAllAdmins();
	
	Admin getAdminById(Long AdminId);
	
	Admin updateAdmin(Long AdminId,Admin Admin);
	
	void deleteAdminById(Long AdminId);
	
	void deleteAllAdmin();
	
	boolean isAdminExists(Long AdminId);
}
