package product.Product;

import common.BaseRepazitory;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ProductRepozitary extends BaseRepazitory<Product, UUID> {
    private static final ProductRepozitary repozitaryproduct = new ProductRepozitary();

    public static ProductRepozitary getInstance() {
        return repozitaryproduct;
    }
}
