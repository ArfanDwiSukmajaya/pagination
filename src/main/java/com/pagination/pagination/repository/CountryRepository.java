package com.pagination.pagination.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;

import com.pagination.pagination.entity.Country;

public interface CountryRepository extends JpaRepository<Country, Long>{
    @NonNull
    Page<Country> findAll(@NonNull Pageable pageable);
}
