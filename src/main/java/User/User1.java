package User;

import common.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User1 extends BaseEntity<UUID> {

    private String name;
    private String surname;
    private double balance;
    private String phoneNumber;
    private String password;
    private Role role;
    private LocalDate emloyeDate;
    private double salary;
    private UUID retauranID;
    private LocalDateTime created;

    public User1(UUID id, LocalDateTime created, LocalDateTime modified, User1 createdBy, User1 modifiedBy, String name, String surname, double balance, String phoneNumber, String password, Role role, LocalDate emloyeDate, double salary, UUID retauranID, LocalDateTime created1, LocalDateTime modified1, User1 createdBy1, User1 modifiedBy1) {
        super(id, created, modified, createdBy, modifiedBy);
        this.name = name;
        this.surname = surname;
        this.balance = balance;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.role = role;
        this.emloyeDate = emloyeDate;
        this.salary = salary;
        this.retauranID = retauranID;
        this.created = created1;
        this.modified = modified1;
        this.createdBy = createdBy1;
        this.modifiedBy = modifiedBy1;
    }

    private LocalDateTime modified;
    private User1 createdBy;
    private User1 modifiedBy;
}
