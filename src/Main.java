public class Main {
    public static void main(String[] args) {
        Fighter marc = new Fighter("kapıcı izzet" , 15 , 100, 90, 10);
        Fighter alex = new Fighter("Şaziyenin Osman" , 10 , 95, 100, 20);
        Match r = new Match(marc,alex , 90 , 100);
        r.run();
    }
}