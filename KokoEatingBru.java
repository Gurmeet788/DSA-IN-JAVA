//Brut solution
public class KokoEatingBru {
    public static void main(String[] args) {
        int piles[]= {3,6,7,11};
        int h = 8;
        System.out.println(minEatingSpeed(piles, h));
    }

    public static int minEatingSpeed(int[] piles, int h) {

        int k = 1;

        while(true){

            int sumHo = 0;

             for(int i = 0; i < piles.length; i++){

                int pile = piles[i];

                while(pile > 0){
                    pile = pile - k;
                    sumHo++;
                }

             }

             if(sumHo <= h){

                return k;

            }

             k++;
        }
    }
}
