public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 25_234;
        int miles = service.calculate(price);
        System.out.println(miles);
    }
    //public static void main(String[] args) {
        //int ticketPrice = 20_000; // стоимость одного билета
        //int milePrice = 20; // стоимость одной мили
       // int numberTicket = 1; // количество билетов
        //int bonusMile = numberTicket * ticketPrice / milePrice;

        //System.out.println("Ваше количество бонусных миль за покупку билета:");
        //System.out.println(bonusMile);

}