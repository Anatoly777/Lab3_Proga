package expedition;

public interface AbilityOfExpedition {
    void addExperience(String e);
    String getName();
    void supply(String about);
    void changeLocation(geographic.GeoObject GObj);
    void moveTo(geographic.GeoObject GObj);
    geographic.GeoObject getLocation();
    void useAdv(Advice ad);
    int getMoney();
    void setMoney(int cash);
    int getFood();
    void setFood(int f);


}
