package card;

import common.BaseRepazitory;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Cardrepozitary extends BaseRepazitory<Card, UUID> {
    private static final Cardrepozitary car = new Cardrepozitary();

    public static Cardrepozitary getInstance() {
        return car;
    }
}
