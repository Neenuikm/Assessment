package com.ikm.assessment.service;

import com.ikm.assessment.contract.VoucherDetailsRequest;
import com.ikm.assessment.model.VoucherDetails;
import com.ikm.assessment.repository.VoucherRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class VoucherService {

    private final VoucherRepository voucherRepository;

    private  final ModelMapper modelMapper = new ModelMapper();

    public VoucherDetails saveVoucherDetails(VoucherDetailsRequest request){
        VoucherDetails voucherDetails=modelMapper.map(request, VoucherDetails.class);
        return voucherRepository.save(voucherDetails);

    }
}
