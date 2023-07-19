package card;

import User.User1;
import common.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card extends BaseEntity<UUID> {
    private UUID userId;
    private UUID restaurandID;
    private List<UUID> product;
    private LocalDate expiritatorDate;

    public Card(UUID id, LocalDateTime created, LocalDateTime modified, User1 createdBy, User1 modifiedBy, UUID userId, UUID restaurandID, List<UUID> product, LocalDate expiritatorDate) {
        super(id, created, modified, createdBy, modifiedBy);
        this.userId = userId;
        this.restaurandID = restaurandID;
        this.product = product;
        this.expiritatorDate = expiritatorDate;
    }
}
