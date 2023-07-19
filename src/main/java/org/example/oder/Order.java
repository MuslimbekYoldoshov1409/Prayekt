package org.example.oder;

import User.User1;
import common.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import product.Product.Product;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class Order extends BaseEntity<UUID> {
    private UUID userID;
    private UUID restauranID;
    private UUID cookID;
    private UUID couriertID;
    private List<Product> products;
    private Status status;

    public Order(UUID id, LocalDateTime created, LocalDateTime modified, User1 createdBy, User1 modifiedBy, UUID userID, UUID restauranID, UUID cookID, UUID couriertID, List<Product> products, Status status) {
        super(id, created, modified, createdBy, modifiedBy);
        this.userID = userID;
        this.restauranID = restauranID;
        this.cookID = cookID;
        this.couriertID = couriertID;
        this.products = products;
        this.status = status;
    }
}
