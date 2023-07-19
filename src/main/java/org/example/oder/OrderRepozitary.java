package org.example.oder;

import common.BaseRepazitory;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class OrderRepozitary extends BaseRepazitory<Order, UUID> {
    private static final OrderRepozitary order = new OrderRepozitary();

    public static OrderRepozitary getInstance() {
        return order;
    }
}
