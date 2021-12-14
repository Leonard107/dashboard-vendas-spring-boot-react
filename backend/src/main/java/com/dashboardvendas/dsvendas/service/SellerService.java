package com.dashboardvendas.dsvendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dashboardvendas.dsvendas.dto.SellerDTO;
import com.dashboardvendas.dsvendas.entities.Seller;
import com.dashboardvendas.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository repository;
	
	public List<SellerDTO> findAll() {
		 List<Seller> result = repository.findAll();
		 //A função map vai converter a coleção de Seller para SellerDTO
		 //E a função collect converter o stream  para uma uma lista
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}

}
