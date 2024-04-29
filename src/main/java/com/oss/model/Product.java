package com.oss.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {
    private Integer id;//unique
    private String categoryId;
    private String name;
    private String url;
    private Long price;
    private Boolean isActive = Boolean.TRUE;
}
