package cleancode.domain.costumers;

/**
 * Created by jensde on 23/02/2017.
 */
public class Costumer {
    private final String name;
    private final String id;

    public Costumer(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Costumer costumer = (Costumer) o;

        if (name != null ? !name.equals(costumer.name) : costumer.name != null) return false;
        return id != null ? id.equals(costumer.id) : costumer.id == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        return result;
    }
}
