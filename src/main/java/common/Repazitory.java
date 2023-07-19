package common;

import java.util.List;
import java.util.Optional;

public interface Repazitory<Entity, ID> {
    Optional<Entity> findByID(ID id);

    List<Entity> findAll();

    boolean add(Entity entity);

    boolean delet(ID id);
}
