package com.jcmb.portfolio.service;

import com.jcmb.portfolio.entities.Data;
import com.jcmb.portfolio.repository.DataRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DataServiceImpl implements DataService {


    private final DataRepository dataRepository;

    public DataServiceImpl(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    /*  private DataRepository dataRepository;

*   @Autowired
     public void setDataRepository(DataRepository dataRepository){
         this.dataRepository=dataRepository;
     }
 */
    @Override
    public List<Data> findAll() {
        return dataRepository.findAll();
    }
	
}
