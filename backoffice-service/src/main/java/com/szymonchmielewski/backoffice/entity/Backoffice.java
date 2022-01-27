package com.szymonchmielewski.backoffice.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Backoffice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long backofficeId;
    private String backofficeName;
    private String backofficeAddress;
    private String backofficeCode;

}
