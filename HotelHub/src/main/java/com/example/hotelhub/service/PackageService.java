package com.example.hotelhub.service;

import com.example.hotelhub.model.Package;
import java.util.List;

public interface PackageService {
    List<Package> findAll();
    Package save(Package hotelPackage);
    Package findById(Long id);
}
