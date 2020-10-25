package LAB16;

import java.util.*;

public class Game {

    private Queue<Integer> deck1 = new LinkedList<>();
    private Queue<Integer> deck2 = new LinkedList<>();

    Game() {
        System.out.println("Enter decks of two players");
        Scanner in = new Scanner(System.in);
        for(int i = 0; i<5; i++)
            deck1.add(in.nextInt());
        for(int i = 0; i<5; i++)
            deck2.add(in.nextInt());
        Logic();
    }

    private void Logic() {
        int count = 0;
        while (!deck1.isEmpty() && !deck2.isEmpty() && count != 106) {

            int card1 = deck1.remove();
            int card2 = deck2.remove();

            if ((card1 == 0 || card2 == 0) && (card1 == 9 || card2 == 9)) {
                if (card1 < card2) {
                    deck1.add(card1);
                    deck1.add(card2);
                } else {
                    deck2.add(card1);
                    deck2.add(card2);
                }
            } else if(card1 > card2) {
                deck1.add(card1);
                deck1.add(card2);
            } else {
                deck2.add(card1);
                deck2.add(card2);
            }

            count++;
        }

        if(deck1.isEmpty()) {
            System.out.println("second "+count);
        } else if(deck2.isEmpty()) {
            System.out.println("first "+count);
        } else {
            System.out.println("botva");
        }
    }
}
