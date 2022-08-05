package com.db.group12.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.db.group12.api.model.Dogs;

@Repository
public interface DogsRepository extends JpaRepository<Dogs, Long>{

}