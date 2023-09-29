package com.ikm.assessment.contract;

import jakarta.validation.constraints.*;
import lombok.*;


@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class VoucherDetailsRequest {

    @NotBlank(message = "name cannot be empty")
    private String name;

    @NotNull(message = "address cannot be empty")
    private String address;

    private String phone;

    @NotNull(message = "headid cannot be empty")
    private Long headId;

    @NotNull(message = "amount cannot be empty")
    private Double amount;
}
