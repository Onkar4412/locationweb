package com.onkar.location.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onkar.location.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
