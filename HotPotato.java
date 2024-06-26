package day1;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
public class HotPotato {

	public static void main(String[] args) {
		// Create a queue to represent the circle of players
        Queue<String> players = new LinkedList<>();

        // Enqueue player names
        players.add("Alice");
        players.add("Bob");
        players.add("Charlie");
        players.add("David");
        players.add("Eve");

        // Simulate the game
        String winner = simulateHotPotato(players);
        System.out.println("The winner is: " + winner);
    }

    public static String simulateHotPotato(Queue<String> players) {
        Random random = new Random();

        while (players.size() > 1) {
            // Generate a random number of passes
            int passes = random.nextInt(players.size()) + 1;
            System.out.println("Number of passes: " + passes);

            // Dequeue and enqueue players to simulate passing the potato
            for (int i = 0; i < passes; i++) {
                String player = players.poll();
                players.add(player);
            }

            // The player holding the potato when the music stops is eliminated
            String eliminatedPlayer = players.poll();
            System.out.println("Eliminated player: " + eliminatedPlayer);
        }

        // The last remaining player is the winner
        return players.peek();	

	}

}
