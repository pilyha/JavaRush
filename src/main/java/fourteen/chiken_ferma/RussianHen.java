package fourteen.chiken_ferma;

public class RussianHen extends Hen{
    int getCountOfEggsPerMonth() {
        return 30;
    }
    @Override
    String getDescription() {
        return super.getDescription() + "Моя страна - " + Country.RUSSIA +getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}
