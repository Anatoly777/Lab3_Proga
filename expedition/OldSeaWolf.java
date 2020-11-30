package expedition;

import java.util.Objects;

public final class OldSeaWolf {
    private final String nameOfWolf;
    private final String actions;
    private final int skill;

    public OldSeaWolf(String name, String action, Expedition exp, int skills){
        this.actions = action;
        this.nameOfWolf = name;
        this.skill = skills;
        System.out.println("В " + exp.getName() + " добавлен Старый Морской Волк " + nameOfWolf + " который " + actions);
        System.out.println("Уровень профессионализма: " + this.skill);
    }

    static public void saySelfAbility(){
        System.out.println("Они не один год ловили китов в Южных морях");
    }

    public Advice addToAdvice(ExperienceOfPast e){
        if (skill == 5) {
            switch (e.toString()) {
                case "'О продовольствии'":
                    return new Advice(ListMaterials.FOOD);
                case "'О транспорте 1'":
                    return new Advice(ListMaterials.DOGS);
                case "'О транспорте 2'":
                    return new Advice(ListMaterials.SLEIGH);
                case "'О режиме работы'":
                    return new Advice(ListMaterials.EQUIPMENT);
                default:
                    return new Advice(ListMaterials.NONE);
            }
        }else if (skill == 4) {
            switch (e.toString()) {
                case "'О транспорте 3'":
                    return new Advice(ListMaterials.PARTS_OF_PLANE);
                case "'О разбивке лагеря'":
                    return new Advice(ListMaterials.TENTS);
                case "'О режиме работы'":
                    return new Advice(ListMaterials.EQUIPMENT);
                default:
                    return new Advice(ListMaterials.NONE);
            }
        }else{
            return new Advice(ListMaterials.NONE);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OldSeaWolf wolf = (OldSeaWolf) o;
        return Objects.equals(nameOfWolf, wolf.nameOfWolf) &&
                Objects.equals(actions, wolf.actions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfWolf, actions);
    }

    @Override
    public String toString() {
        return "OldSeaWolf{" +
                "NameOfWolf='" + nameOfWolf + '\'' +
                ", Actions='" + actions + '\'' +
                '}';
    }
}
