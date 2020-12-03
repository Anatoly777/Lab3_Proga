package expedition;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Objects;

public final class Expedition implements AbilityOfExpedition, ResourceOfExpedition{
    private geographic.GeoObject location;
    private final String name_expedition;
    private ExperienceOfPast[] experience;
    private int money;
    private int food;
    private Advice[] advices;

    public Expedition (String name, geographic.GeoObject loc) {
        this.experience = new ExperienceOfPast[0];
        this.advices = new Advice[0];
        this.money = 0;
        this.food = 50;
        this.name_expedition = name;
        this.location = loc;
        System.out.println("Создана экспедиция с именем " + name + " и отправной точкой " + location.getName());
    }

    public ExperienceOfPast[] getExperience(){
        return this.experience;
    }

    public void takeAdvice(Advice @NotNull [] adv){
        Advice[] adv1 = new Advice[advices.length + adv.length];
        int i = 0;
        for (Advice ad : advices){
            adv1[i] = ad;
            i++;
        }
        for (Advice ad : adv){
            adv1[i] = ad;
            i++;
        }
        advices = adv1;
    }

    public void setExperience(ExperienceOfPast[] experience) {
        this.experience = experience;
    }

    public String getName(){
        return name_expedition;
    }

    public void changeLocation(geographic.GeoObject GObj){
        this.location = GObj;
    }

    public void supplyFood(){
        setFood(getFood() + 100);
        System.out.println(getName() + " пополнила запасы продовольствия");
    }

    public void moveTo(geographic.GeoObject GObj){
        changeLocation(GObj);
        System.out.println("Изменили геопозицию на " + GObj.getName());
    }

    public int getMoney(){
        return money;
    }

    public void setMoney(int cash){
        this.money = cash;
    }

    public int getFood(){
        return food;
    }

    public void setFood(int f){
        this.food = f;
    }

    public geographic.GeoObject getLocation(){
        return location;
    }

    public void useAllAdv(){
        for (Advice ad: advices){
            Material material = new MaterialsForExpedition(ad.getPointM());
            material.moveTo(getLocation());
            if (material.getName().equals("Продовольствие")) {
                setFood(getFood() + 400);
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Expedition that = (Expedition) o;
        return getMoney() == that.getMoney() &&
                getFood() == that.getFood() &&
                Objects.equals(getLocation(), that.getLocation()) &&
                Objects.equals(name_expedition, that.name_expedition) &&
                Arrays.equals(getExperience(), that.getExperience()) &&
                Arrays.equals(advices, that.advices);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getLocation(), name_expedition, getMoney(), getFood());
        result = 31 * result + Arrays.hashCode(getExperience());
        result = 31 * result + Arrays.hashCode(advices);
        return result;
    }

    @Override
    public String toString() {
        return "Expedition{" +
                "location=" + location +
                ", name_expedition='" + name_expedition + '\'' +
                ", experience=" + Arrays.toString(experience) +
                ", money=" + money +
                ", food=" + food +
                ", advices=" + Arrays.toString(advices) +
                '}';
    }
}
