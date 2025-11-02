package com.shubham.project.service;

import com.amazonaws.util.EC2MetadataUtils;
import org.springframework.stereotype.Service;

@Service
public class MainService {

    public String getAvailabilityZone() {
        return EC2MetadataUtils.getAvailabilityZone();
    }
}
