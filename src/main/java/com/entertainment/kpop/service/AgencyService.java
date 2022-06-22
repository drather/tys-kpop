package com.entertainment.kpop.service;

import com.entertainment.kpop.domain.Agency;
import com.entertainment.kpop.repository.AgencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class AgencyService {
    @Autowired
    AgencyRepository agencyRepository;

    // 전체 조회
    public List<Agency> findAll() {
        return agencyRepository.findAll();
    }

    // 특정 ID 로 조회
    public Agency findById(Integer id) {
        return agencyRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    // Upsert
    public Agency save(Agency agency) {
        agencyRepository.save(agency);
        return agency;
    }

    // 삭제
    public void delete(Integer id) {
        agencyRepository.deleteById(id);
    }
}
