package com.example.hotelhub.repository;

import com.example.hotelhub.model.Package;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PackageRepository extends JpaRepository<Package, Long> {
}
