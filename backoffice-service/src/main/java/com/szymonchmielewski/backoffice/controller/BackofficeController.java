package com.szymonchmielewski.backoffice.controller;

import com.szymonchmielewski.backoffice.entity.Backoffice;
import com.szymonchmielewski.backoffice.service.BackofficeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/backoffices")
@Slf4j
public class BackofficeController {

    @Autowired
    private BackofficeService backofficeService;

    @PostMapping("/")
    public Backoffice saveBackoffice(@RequestBody Backoffice backoffice){
        log.info("Inside saveBackoffice method od BackofficeController");
        return backofficeService.saveBackoffice(backoffice);
    }
    @GetMapping("/{id}")
    public Backoffice findBackofficeById(@PathVariable("id") Long backofficeId){
        log.info("Inside findBackofficeById method od BackofficeController");
        return backofficeService.findBackofficeById(backofficeId);

    }
}
