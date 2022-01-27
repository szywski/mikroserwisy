package com.szymonchmielewski.backoffice.service;

import com.szymonchmielewski.backoffice.entity.Backoffice;
import com.szymonchmielewski.backoffice.repository.BackofficeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BackofficeService {

    @Autowired
    private BackofficeRepository backofficeRepository;

    public Backoffice saveBackoffice(Backoffice backoffice) {
        log.info("Inside saveBackoffice method of BackofficeService");
        return backofficeRepository.save(backoffice);
    }

    public Backoffice findBackofficeById(Long backofficeId) {
        return backofficeRepository.findByBackofficeId(backofficeId);

    }
}
