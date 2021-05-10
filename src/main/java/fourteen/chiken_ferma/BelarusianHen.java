package fourteen.chiken_ferma;

public class BelarusianHen extends Hen{

    int getCountOfEggsPerMonth() {
        return 40;
    }
    @Override
    String getDescription() {
        return super.getDescription() + "Моя страна - " + Country.BELARUS +getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}
