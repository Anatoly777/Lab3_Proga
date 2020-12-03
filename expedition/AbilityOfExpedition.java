package expedition;

public interface AbilityOfExpedition {
    String getName();
    void changeLocation(geographic.GeoObject GObj);
    void moveTo(geographic.GeoObject GObj);
    geographic.GeoObject getLocation();
    void takeAdvice(Advice[] adv);
}
