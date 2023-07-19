package restaurant;

import User.User1;
import common.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant extends BaseEntity<UUID> {
    private String location;
    private String name;

    public Restaurant(UUID id, LocalDateTime created, LocalDateTime modified, User1 createdBy, User1 modifiedBy, String location, String name) {
        super(id, created, modified, createdBy, modifiedBy);
        this.location = location;
        this.name = name;
    }
}
