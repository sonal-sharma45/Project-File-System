public class AdapterDemo {
    public static void main(String[] args) {
        fileLoader fl = new fileLoader();

        fl.load("excel", "beyond_the_horizon.xls");
        fl.load("txt", "alone.txt");
        fl.load("excel", "far_far_away.xls");
        fl.load("txt", "mind_me.txt");
    }
}