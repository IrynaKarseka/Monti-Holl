public class Main {
    public static void main(String[] args) {

        Player gamer = new Player("Игрок", true);
        int statisticWin = 0;

        for (int step = 0; step < 1000; step++) {
            Game game = new Game(gamer, getDoors());
            if (game.round(0).isPrize()) statisticWin++;
        }
        System.out.println("Из " + step + " игр игрок выиграл " + statisticWin);
    }
    private static List<Door> getDoors() {
        List<Door> doors = new ArrayList<>();
        doors.add(new Door(true));
        doors.add(new Door(false));
        doors.add(new Door(false));
        Collections.shuffle(doors);
        return doors;
    }
}