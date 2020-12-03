import expedition.AdvicedObject;
import expedition.ExperienceOfPast;
import expedition.MaterialsForExpedition;

import java.util.Arrays;

import static expedition.ListMaterials.*;

public class Main {
    public static void main(String[] args){
        spons.Sponsor sponsor1 = new spons.Sponsor("Фонд Натаниэля Дерби Пикмена", 2000);
        spons.Sponsor sponsor2 = new spons.Sponsor("Еще несколько спонсоров", 1000);
        geographic.City geographicObj1 = new geographic.City("Бостон");
        geographic.Coast geographicObj2 = new geographic.Coast("Североамериканское");
        geographic.Island geographicObj3 = new geographic.Island("Самоа");
        geographic.City geographicObj4 = new geographic.City("Хобарт, административный центр Тасмании");
        geographic.Canal geographicObj5 = new geographic.Canal("Панамский");
        expedition.Expedition EXP = new expedition.Expedition("Наша экспедиция", geographicObj1);
        expedition.Expedition EXP1 = new expedition.Expedition("Прошлые экспедиции", geographicObj1);
        ExperienceOfPast e1 = new ExperienceOfPast("Продовольствие");
        ExperienceOfPast e2 = new ExperienceOfPast("Еда");
        ExperienceOfPast e3 = new ExperienceOfPast("Деньги");
        ExperienceOfPast e4 = new ExperienceOfPast("Транспорт 1");
        ExperienceOfPast e5 = new ExperienceOfPast("Транспорт 2");
        ExperienceOfPast[] ex1 = {e1, e2, e3, e4, e5};
        ExperienceOfPast e6 = new ExperienceOfPast("Снаряжение");
        ExperienceOfPast e7 = new ExperienceOfPast("Веревки");
        ExperienceOfPast e8 = new ExperienceOfPast("Лагерь");
        ExperienceOfPast e9 = new ExperienceOfPast("Транспорт 3");
        ExperienceOfPast[] ex2 = {e6, e7, e8, e9};
        expedition.OldSeaWolf wolf1 = new expedition.OldSeaWolf("Дж. Б. Дуглас", "командует бригом \"Аркхем\" и осуществляет общее руководство кораблями", 5, ex1);
        expedition.OldSeaWolf wolf2 = new expedition.OldSeaWolf("Георг Торфинсен", "возглавляет экипаж барка \"Мискатоник\"",4, ex2);
        expedition.OldSeaWolf.saySelfAbility();
        sponsor1.giveMoney(EXP,500);
        sponsor2.giveMoney(EXP,300);
        System.out.println("Баланс экспедиции " + EXP.getMoney() + " тугриков");
        wolf1.goToExpedition(EXP);
        wolf2.goToExpedition(EXP);
        EXP.takeAdvice(wolf1.addToAdvice(new AdvicedObject("Продовольствие", FOOD)));
        EXP.takeAdvice(wolf1.addToAdvice(new AdvicedObject("Транспорт 1", DOGS)));
        EXP.takeAdvice(wolf1.addToAdvice(new AdvicedObject("Транспорт 2", SLEIGH)));
        EXP.takeAdvice(wolf2.addToAdvice(new AdvicedObject("Транспорт 3", PARTS_OF_PLANE)));
        EXP.takeAdvice(wolf2.addToAdvice(new AdvicedObject("Лагерь", TENTS)));
        EXP.takeAdvice(wolf2.addToAdvice(new AdvicedObject("Снаряжение", EQUIPMENT)));
        EXP.useAllAdv();
        EXP.moveTo(geographicObj1);
        EXP.moveTo(geographicObj2);
        EXP.moveTo(geographicObj5);
        EXP.moveTo(geographicObj3);
        EXP.moveTo(geographicObj4);
        EXP.supplyFood();
        wolf1.getExFromExpedition(EXP);
        wolf2.getExFromExpedition(EXP);
    }
}
