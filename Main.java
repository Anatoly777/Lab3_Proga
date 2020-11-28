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
        expedition.OldSeaWolf wolf1 = new expedition.OldSeaWolf("Дж. Б. Дуглас", "командует бригом \"Аркхем\" и осуществляет общее руководство кораблями", EXP);
        expedition.OldSeaWolf wolf2 = new expedition.OldSeaWolf("Георг Торфинсен", "возглавляет экипаж барка \"Мискатоник\"", EXP);
        expedition.OldSeaWolf.saySelfAbility();
        sponsor1.giveMoney(EXP,500);
        sponsor2.giveMoney(EXP,300);
        System.out.println("Баланс экспедиции " + EXP.getMoney() + " тугриков");
        expedition.ExperienceOfPast exp1 = new expedition.ExperienceOfPast("'О продовольствии'", EXP);
        exp1.addToAdvice();
        expedition.ExperienceOfPast exp2 = new expedition.ExperienceOfPast("'О транспорте 1'", EXP);
        exp2.addToAdvice();
        expedition.ExperienceOfPast exp3 = new expedition.ExperienceOfPast("'О транспорте 2'", EXP);
        exp3.addToAdvice();
        expedition.ExperienceOfPast exp4 = new expedition.ExperienceOfPast("'О транспорте 3'", EXP);
        exp4.addToAdvice();
        expedition.ExperienceOfPast exp5 = new expedition.ExperienceOfPast("'О разбивке лагеря'", EXP);
        exp5.addToAdvice();
        expedition.ExperienceOfPast exp6 = new expedition.ExperienceOfPast("'О режиме работы'", EXP);
        exp6.addToAdvice();
        EXP.useAdv(exp1.addToAdvice());
        EXP.useAdv(exp2.addToAdvice());
        EXP.useAdv(exp3.addToAdvice());
        EXP.useAdv(exp4.addToAdvice());
        EXP.moveTo(geographicObj1);
        EXP.moveTo(geographicObj2);
        EXP.moveTo(geographicObj5);
        EXP.moveTo(geographicObj3);
        EXP.moveTo(geographicObj4);
        EXP.supply("запасы продовольствия");
    }
}
