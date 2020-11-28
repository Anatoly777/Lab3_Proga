package expedition;

public interface ResourceOfExpedition {
    void supply(String about);
    void useAdv(Advice ad);
    int getMoney();
    int getFood();
}
