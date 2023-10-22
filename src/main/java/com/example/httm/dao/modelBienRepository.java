package com.example.httm.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.httm.entity.modelBien;

public interface modelBienRepository extends JpaRepository<modelBien, Integer>{
	modelBien findModelBienByActive(int active);
}
