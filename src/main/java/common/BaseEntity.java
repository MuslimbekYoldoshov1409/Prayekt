package common;

import User.User1;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode()
public class BaseEntity<ID> {
    private UUID id;
    private LocalDateTime created;
    private LocalDateTime modified;
    private User1 createdBy;
    private User1 modifiedBy;
}
