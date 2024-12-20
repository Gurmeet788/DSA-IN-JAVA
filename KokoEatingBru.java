//Brut solution
public class KokoEatingBru {
    public static void main(String[] args) {
        int piles[]= {3,6,7,11};
        int h = 8;
        System.out.println(minEatingSpeed(piles, h));
    }
    public static int minEatingSpeed(int[] piles, int h) {

        int max = piles[0];

        for(int i = 1; i < piles.length; i++){

            if(piles[i] > max){

                max = piles[i];
            }
        }

        for(int i = 1; i <= max; i++){

            int totaltime = totalHours(piles, i);

            if(totaltime <= h){
                
                return i;
            }
        }
        return -1;
    }

    public static int totalHours(int[] piles, int speed){

        int totaltime = 0;

        for(int i = 0; i < piles.length; i++){

            totaltime += Math.ceil((double)piles[i]/speed); // ceil function round of number in bigger number like 3.1 into 4 this function work on double
        }
        return totaltime;
    }
}
