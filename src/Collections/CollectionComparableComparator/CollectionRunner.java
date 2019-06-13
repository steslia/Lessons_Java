package Collections.CollectionComparableComparator;

import java.util.*;

public class CollectionRunner {
    public static void main(String[] args) {

        List<Card> deckOfCard = new ArrayList<>();

        //Через цикл заполняем нашу колекцию, точнее заполняем нашу колоду карт, картами
        //.values() метод достает значение с enum
        for (Card.Face face : Card.Face.values()){
            for (Card.Suit suit : Card.Suit.values()){
                deckOfCard.add(new Card(face, suit));
            }
        }

        Collections.shuffle(deckOfCard);

        // Для сортировки используем наш компаратор,
        // хотя можно и без него ведь мы имплеменьтировали Comparable и его метод compareTo
        Collections.sort(deckOfCard, new CardComparator());

        //Делаем вывод карт через printf и тернарный оператор
        for (int i = 0; i < deckOfCard.size(); i++){
            System.out.printf("%-20s %s", deckOfCard.get(i), (i + 1)%4 == 0 ? "\n" : "  ");
        }
    }

    private static class Card implements Comparable<Card> {

        //enum масти и веса карты
        private enum Suit {
            DIAMONDS, HEARTS, SPADES, CLUBS
        }

        private enum Face {TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACKET, LADY, KING, ACE}

        private final Suit suit;
        private final Face face;

        public Card(Face face, Suit suit) {
            this.face = face;
            this.suit = suit;
        }

        // Переопределяем метод для сортировки нашего класса к примеру для типа String, Integer ... он переопределен
        //Метод возвращает int значение
        @Override
        public int compareTo(Card card) {
            //Значения enum заносим в массив, после массив приобразуем в список
            Face[] values = Face.values();
            List<Face> faces = Arrays.asList(values);

            if (faces.indexOf(this.face) < faces.indexOf(card.getFace())){
                return -1;
            } else if (faces.indexOf(this.face) > faces.indexOf(card.getFace())){
                return +1;
            } else if (faces.indexOf(this.face) == faces.indexOf(card.getFace())){
                return String.valueOf(suit).compareTo(String.valueOf(card.getSuit()));
            }
            return 0;
        }


        @Override
        public String toString() {
            return face + " of " + suit;
        }

        public Suit getSuit() {
            return suit;
        }

        public Face getFace() {
            return face;
        }
    }

    private static class CardComparator implements Comparator<Card> {

        List<Card.Face> faces = Arrays.asList(Card.Face.values());

        @Override
        public int compare(Card card1, Card card2) {
            if (faces.indexOf(card1.getFace()) < faces.indexOf(card2.getFace())){
                return 1;
            } else if (faces.indexOf(card1.getFace()) > faces.indexOf(card2.getFace())){
                return -1;
            } else if (faces.indexOf(card1.getFace()) == faces.indexOf(card2.getFace())){
                return String.valueOf(card1.getSuit()).compareTo(String.valueOf(card2.getSuit()));
            }
            return 0;
        }
    }
}
