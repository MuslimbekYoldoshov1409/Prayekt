package product.Product;

import User.User1;
import common.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product extends BaseEntity<UUID> {
    private UUID restuarntID;
    private String name;
    private double price;
    private boolean isAviable;

    public Product(UUID id, LocalDateTime created, LocalDateTime modified, User1 createdBy, User1 modifiedBy, UUID restuarntID, String name, double price, boolean isAviable) {
        super(id, created, modified, createdBy, modifiedBy);
        this.restuarntID = restuarntID;
        this.name = name;
        this.price = price;
        this.isAviable = isAviable;
    }
}
