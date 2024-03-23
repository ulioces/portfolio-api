package com.jcmb.portfolio.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.jcmb.portfolio.entities.Data;
import org.springframework.stereotype.Repository;


@Repository
public interface DataRepository extends JpaRepository<Data, Long> {

}
