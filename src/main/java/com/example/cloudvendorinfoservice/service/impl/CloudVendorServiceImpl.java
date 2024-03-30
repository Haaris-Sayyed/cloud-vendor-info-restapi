package com.example.cloudvendorinfoservice.service.impl;

import com.example.cloudvendorinfoservice.model.CloudVendor;
import com.example.cloudvendorinfoservice.repository.CloudVendorRepository;
import com.example.cloudvendorinfoservice.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {
    CloudVendorRepository cloudVendorRepository;
    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }
    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }
    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String deleteCloudVendor(String vendorId) {
        cloudVendorRepository.deleteById(vendorId);
        return "Success";
    }

    @Override
    public CloudVendor getCloudVendor(String vendorId) {
        return cloudVendorRepository.findById(vendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return cloudVendorRepository.findAll();
    }
}
