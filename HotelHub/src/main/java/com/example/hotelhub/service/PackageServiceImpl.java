package com.example.hotelhub.service;

import com.example.hotelhub.model.Package;
import com.example.hotelhub.repository.PackageRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PackageServiceImpl implements PackageService {
    private final PackageRepository packageRepository;

    public PackageServiceImpl(PackageRepository packageRepository) {
        this.packageRepository = packageRepository;
    }

    @Override
    public List<Package> findAll() {
        return packageRepository.findAll();
    }

    @Override
    public Package save(Package hotelPackage) {
        return packageRepository.save(hotelPackage);
    }

    @Override
    public Package findById(Long id) {
        return packageRepository.findById(id).orElse(null);
    }

}