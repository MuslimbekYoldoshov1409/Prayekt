package User;

import common.BaseRepazitory;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserRepazitory extends BaseRepazitory<User1, UUID> {
    private final List<User1> users = new ArrayList<>();
    private static final UserRepazitory repazitory = new UserRepazitory();

    public static UserRepazitory getInstance() {
        return repazitory;
    }
}
