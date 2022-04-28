package com.vc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vc.models.MF_Fund_dividends;

@Repository
public interface Dao extends JpaRepository<MF_Fund_dividends, Long> {
}
