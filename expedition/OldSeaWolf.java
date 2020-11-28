package expedition;

import java.util.Objects;

public final class OldSeaWolf {
    private final String NameOfWolf;
    private final String Actions;

    public OldSeaWolf(String name, String action, Expedition exp){
        this.Actions = action;
        this.NameOfWolf = name;
        System.out.println("В " + exp.getName() + " добавлен Старый Морской Волк " + NameOfWolf + " который " + Actions);
    }

    static public void saySelfAbility(){
        System.out.println("Они не один год ловили китов в Южных морях");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OldSeaWolf wolf = (OldSeaWolf) o;
        return Objects.equals(NameOfWolf, wolf.NameOfWolf) &&
                Objects.equals(Actions, wolf.Actions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(NameOfWolf, Actions);
    }

    @Override
    public String toString() {
        return "OldSeaWolf{" +
                "NameOfWolf='" + NameOfWolf + '\'' +
                ", Actions='" + Actions + '\'' +
                '}';
    }
}
