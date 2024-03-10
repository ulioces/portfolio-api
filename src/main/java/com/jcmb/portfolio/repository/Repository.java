package com.jcmb.portfolio.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.jcmb.portfolio.entities.Data;


public interface Repository extends JpaRepository<Data, Long> {

}
