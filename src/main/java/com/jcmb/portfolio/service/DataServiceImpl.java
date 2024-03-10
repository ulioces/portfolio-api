package com.jcmb.portfolio.service;

import com.jcmb.portfolio.entities.Data;
import com.jcmb.portfolio.repository.DataRepository;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class DataServiceImpl implements DataService {
	
	private final DataRepository dataRepository;
	
	public DataServiceImpl(DataRepository dataRepository) {
		// TODO Auto-generated constructor stub
		this.dataRepository = dataRepository;
	}
	
    @Override
    public List<Data> findAll() {
        return dataRepository.findAll();
    }
	
}
