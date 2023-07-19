package restaurant;

import common.BaseRepazitory;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RestaurantRepozitary extends BaseRepazitory<Restaurant, UUID> {
    private static final RestaurantRepozitary repozitary = new RestaurantRepozitary();

    public static RestaurantRepozitary getInstance() {
        return repozitary;
    }
}
