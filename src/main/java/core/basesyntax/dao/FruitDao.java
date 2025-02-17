package core.basesyntax.dao;

import core.basesyntax.model.Fruit;
import java.util.List;
import java.util.Optional;

public interface FruitDao {
    void add(Fruit fruit);

    Optional<Fruit> get(Fruit fruit);

    List<Fruit> getAll();
}
