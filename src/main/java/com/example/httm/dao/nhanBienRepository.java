package com.example.httm.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.httm.entity.NhanBien;

public interface nhanBienRepository extends JpaRepository<NhanBien, Integer>{
	Boolean existsByNhan(String nhan);
}
