package com.ikm.assessment.controller;

import com.ikm.assessment.contract.VoucherDetailsRequest;
import com.ikm.assessment.contract.VoucherDetailsResponse;
import com.ikm.assessment.common.contract.Response;
import com.ikm.assessment.model.VoucherDetails;
import com.ikm.assessment.service.VoucherService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/assessment")
@RequiredArgsConstructor
public class VoucherController {

private final VoucherService voucherService;


    @SneakyThrows
    @Operation(summary = "Save Voucher Details request")
    @PostMapping(value = {"/save-voucher-details"})
    public ResponseEntity<?> saveVoucherDetails(@Valid @RequestBody VoucherDetailsRequest request){
        VoucherDetails voucherDetails = voucherService.saveVoucherDetails(request);
        VoucherDetailsResponse voucherDetailsResponse =
                VoucherDetailsResponse.builder()
                        .VoucherId(voucherDetails.getId())
                        .name(voucherDetails.getName())
                        .build();
        return new ResponseEntity<>(
                Response.builder()
                        .payload(voucherDetailsResponse)
                        .message("Successfully saved")
                        .build(),
                HttpStatus.OK);
    }
}
