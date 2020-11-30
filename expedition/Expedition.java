package expedition;

import java.util.Objects;

public final class Expedition implements AbilityOfExpedition, ResourceOfExpedition{
    private float importance = 1.0f;
    private static final float COEFFICIENT = 0.5f;
    private geographic.GeoObject location;
    private final String name_expedition;
    private int money;
    private int food;

    public Expedition (String name, geographic.GeoObject loc) {
        this.money = 0;
        this.food = 50;
        this.name_expedition = name;
        this.location = loc;
        System.out.println("Создана экспедиция с именем " + name + " и отправной точкой " + location.getName());
    }

    public void addExperience(ExperienceOfPast e){
        importance = importance * COEFFICIENT;
        System.out.println("Опыт " + e.toString() + " добавлен в экспедицию " + this.name_expedition);
        System.out.println("Значимость экспедиции для общества понижена...");
        if (importance < 0.02){
            System.out.println("Экспедиция не привлекла особого внимания общественности");
        }
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

    public void useAdv(Advice ad){
        expedition.Material material = new expedition.MaterialsForExpedition(ad.getPoint());
        material.moveTo(getLocation());
        if (material.getName().equals("Продовольствие")){
            setFood(getFood() + 400);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Expedition that = (Expedition) o;
        return Float.compare(that.importance, importance) == 0 &&
                Objects.equals(location, that.location) &&
                Objects.equals(name_expedition, that.name_expedition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(importance, location, name_expedition);
    }

    @Override
    public String toString() {
        return "Expedition{" +
                "importance=" + importance +
                ", Location=" + location +
                ", name_expedition='" + name_expedition + '\'' +
                '}';
    }
}
