public class BonusMilesService {
    public int calculate(int cost) {
        int milePrice = 20;
        int miles;
        miles = cost / milePrice;
        return miles;
    }


}
