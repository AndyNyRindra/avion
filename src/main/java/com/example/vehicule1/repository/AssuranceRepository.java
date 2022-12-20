package com.example.vehicule1.repository;

import com.example.vehicule1.model.Assurance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;


@Repository
public interface AssuranceRepository extends JpaRepository<Assurance,Integer> {
    List<Assurance>  findByIdAvion(Integer id);
    @Query(value = "select assurance.* from assurance where  date_expiration < :date_limit", nativeQuery = true)
    List<Assurance> findByAssuranceExpire(@Param(value = "date_limit") Date date_limit);

}
