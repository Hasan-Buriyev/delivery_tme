package com.oss.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order {
    private Integer id;
    private Long userId;
    private Long deliveryPrice;
    private Integer addressId;
    private String desc;
    private Long date;
}
