
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Hand implements Comparable<Hand> {

    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public void print() {
        cards.stream().forEach(System.out::println);
    }

    public int getCardsValue() {
        return this.cards.stream().map(c -> c.getValue()).reduce(0, (prev, curr) -> prev + curr);
    }

    public void sortBySuit() {
        Collections.sort(this.cards, new BySuitInValueOrder());
    }

    @Override
    public int compareTo(Hand h) {
        return this.getCardsValue() - h.getCardsValue();

    }

    public void sort() {
        this.cards = this.cards.stream().sorted().collect(Collectors.toList());
    }
}
