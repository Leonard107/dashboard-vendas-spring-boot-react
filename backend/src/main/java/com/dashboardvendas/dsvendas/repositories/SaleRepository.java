package com.dashboardvendas.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dashboardvendas.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
