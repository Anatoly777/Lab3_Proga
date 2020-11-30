package expedition;

import java.util.Objects;

public final class ExperienceOfPast {
    private final String expAbout;

    public ExperienceOfPast(String about, Expedition exp) {
        this.expAbout = about;
        exp.addExperience(this);
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
