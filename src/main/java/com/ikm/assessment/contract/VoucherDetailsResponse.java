package com.ikm.assessment.contract;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VoucherDetailsResponse {

    private int VoucherId;
    private String name;

}
