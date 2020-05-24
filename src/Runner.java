import by.gsu.pms.Flowers;

import java.util.ArrayList;

public class Runner {
    public static void main (String[] args) {
        class Bouguet {
            private ArrayList<Flowers> flowers = new ArrayList<>();
            public double price;

            void Bouquet(int roses, int lilacs, int poppies, double price) {
                this.price = price;
                for (int i = 0; i < roses; i++) {
                    flowers.add(new Flowers.Poppy());
                }
                for (int i = 0; i < poppies; i++) {
                    flowers.add(new Flowers.Lilac());
                }

                for (int i = 0; i < roses; i++) {
                    flowers.add(new Flowers.Rose());
                }
            }

            @Override
            public String toString() {
                String result = "My bouquet: \n";
                for (int i = 0; i < flowers.size(); i++) {
                    result += flowers.get(i);
                }

            }

            public ArrayList getFlowers() {
                return flowers;
            }

            public void getPrice() {
                int result = 0;
                for (int i = 0; i < flowers.size(); i++) {
                    result += flowers.get(i).getPrice();
                }

            }

            public ArrayList sortFlowers() {
                for (int j = flowers.size() - 1; j >= 0; j--) {
                    for (int i = 0; i < j; i++) {
                        if (flowers.get(i).getFreshness() > flowers.get(i + 1).getFreshness()) {
                            Flowers temp = flowers.get(i);
                            flowers.set(i, flowers.get(i + 1));
                            flowers.set(i + 1, temp);
                        }
                    }
                }
                return flowers;
            }


            public String findStemLength(int minLength, int maxLength) {
                String result = "Stem Length: " + minLength + "-" + maxLength + " cm. \n";
                for (int i = 0; i < flowers.size(); i++) {
                    if (flowers.get(i).getStemLength() >= minLength && flowers.get(i).getStemLength() <= maxLength) {
                        result += flowers.get(i);
                    }
                }
                return result;
            }
        }

    }
}
