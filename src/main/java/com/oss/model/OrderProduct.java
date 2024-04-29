package com.oss.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderProduct {
    private Integer id;
    private Integer productId;
    private Integer amount;
    private Integer orderId;
}
