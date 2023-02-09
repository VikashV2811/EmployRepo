package com.sai.android.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sai.android.data.Employ;

@Repository
public interface EmployRepository extends JpaRepository<Employ, Integer>{

}
