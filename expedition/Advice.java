package expedition;

import java.util.Objects;

public final class Advice {
    private final ListMaterials point;

    public Advice(ListMaterials about){
        this.point = about;
    }
    public ListMaterials getPoint(){
        return point;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Advice advice = (Advice) o;
        return getPoint() == advice.getPoint();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPoint());
    }

    @Override
    public String toString() {
        return "Advice{" +
                "point=" + point +
                '}';
    }
}
