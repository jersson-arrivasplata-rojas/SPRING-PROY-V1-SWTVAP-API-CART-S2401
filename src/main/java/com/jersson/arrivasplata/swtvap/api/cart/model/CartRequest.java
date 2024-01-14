package com.jersson.arrivasplata.swtvap.api.cart.model;

import lombok.Data;

@Data
public class CartRequest {
    private Long cartId;
    private Long code;
    private String cartDate;
}
