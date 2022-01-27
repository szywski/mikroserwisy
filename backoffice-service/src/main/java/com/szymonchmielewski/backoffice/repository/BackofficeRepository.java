package com.szymonchmielewski.backoffice.repository;

import com.szymonchmielewski.backoffice.entity.Backoffice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BackofficeRepository extends JpaRepository<Backoffice,Long> {


    Backoffice findByBackofficeId(Long backofficeId);
}
