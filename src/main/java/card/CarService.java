package card;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class CarService<Entity extends Card, ID> implements Service<Entity, ID> {
    List<Entity> list = new ArrayList<>();

    @Override
    public Optional<Entity> findByID(ID id) {
        return list.stream().filter(entity -> entity.getId().equals(id)).findFirst();
    }

    @Override
    public List<Entity> findAll() {
        return list;
    }

    @Override
    public boolean add(Entity entity) {
        list.add(entity);
        return true;
    }

    @Override
    public boolean delet(ID id) {
        list.removeIf(entity -> entity.getId().equals(id));
        return true;
    }
}
