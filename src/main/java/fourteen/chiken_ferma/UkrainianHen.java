package fourteen.chiken_ferma;

public class UkrainianHen extends Hen{
    int getCountOfEggsPerMonth() {
        return 35;
    }
    @Override
    String getDescription() {
        return super.getDescription() + "Моя страна - " + Country.UKRAINE +getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}
