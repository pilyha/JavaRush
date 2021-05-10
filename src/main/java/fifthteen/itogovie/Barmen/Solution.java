package fifthteen.itogovie.Barmen;

public class Solution {
    public static void main(String[] args) {
        DrinkMaker latteMaker = new LatteMaker();
        DrinkMaker teaMaker = new TeaMaker();
        latteMaker.makeDrink();
        teaMaker.makeDrink();
    }
}
