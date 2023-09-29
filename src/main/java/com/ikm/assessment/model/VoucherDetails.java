package com.ikm.assessment.model;

import jakarta.persistence.*;
import lombok.*;



@AllArgsConstructor
@Builder
@Setter
@Getter
@EqualsAndHashCode
@NoArgsConstructor
@Entity
@Table(name = "voucher_details")
public class VoucherDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "voucher_details_id_seq")
    @SequenceGenerator(name = "voucher_details_id_seq", sequenceName = "voucher_details_id_seq", allocationSize = 1)
    private int id;
    private String name;
    private String address;
    private String phone;
    private Long headId;
    private Double amount;
}
