package core.basesyntax.dao;

import core.basesyntax.db.Storage;
import core.basesyntax.model.Fruit;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FruitDaoMapImpl implements FruitDao {

    @Override
    public void save(Fruit fruit) {
        Storage.storage.put(fruit.getName(), fruit);
    }

    @Override
    public Optional<Fruit> get(Fruit fruit) {
        return Optional.ofNullable(Storage.storage.get(fruit.getName()));
    }

    @Override
    public List<Fruit> getAll() {
        return new ArrayList<>(Storage.storage.values());
    }
}
