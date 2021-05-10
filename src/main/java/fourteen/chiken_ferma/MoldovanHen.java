package fourteen.chiken_ferma;

public class MoldovanHen extends Hen{

    int getCountOfEggsPerMonth() {
        return 20;

    }

    @Override
    String getDescription() {
        return super.getDescription() + "Моя страна - " + Country.MOLDOVA +getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}
