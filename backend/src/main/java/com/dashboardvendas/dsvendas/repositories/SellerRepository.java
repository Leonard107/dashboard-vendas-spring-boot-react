package com.dashboardvendas.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dashboardvendas.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
