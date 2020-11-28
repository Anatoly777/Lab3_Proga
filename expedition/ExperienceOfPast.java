package expedition;

import java.util.Objects;

public final class ExperienceOfPast {
    private final String expAbout;

    public ExperienceOfPast(String about, Expedition exp) {
        this.expAbout = about;
        exp.addExperience(toString());
    }

    public Advice addToAdvice(){
        switch (expAbout) {
            case "'О продовольствии'":
                return new Advice(ListMaterials.FOOD);
            case "'О транспорте 1'":
                return new Advice(ListMaterials.DOGS);
            case "'О транспорте 2'":
                return new Advice(ListMaterials.SLEIGH);
            case "'О транспорте 3'":
                return new Advice(ListMaterials.PARTS_OF_PLANE);
            case "'О разбивке лагеря'":
                return new Advice(ListMaterials.TENTS);
            default:
                return new Advice(ListMaterials.EQUIPMENT);
        }
    }

    @Override
    public String toString() {
        return expAbout;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExperienceOfPast that = (ExperienceOfPast) o;
        return Objects.equals(expAbout, that.expAbout);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expAbout);
    }
}
