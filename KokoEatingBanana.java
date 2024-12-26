public class KokoEatingBanana {

    public static void main(String[] args) {
        int piles[] = {3,6,7,11};
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

        int low = 1;

        int high = max;

        while(low <= high){

            int mid = (low + high)/2;

            int totaltime = totalHours(piles, mid);

            if(totaltime <= h){

                high = mid - 1;

            }else{

                low = mid + 1;
            }
        }

        return low;
    }

    public static int totalHours(int[] piles, int speed){

        int totaltime = 0;

        for(int i = 0; i < piles.length; i++){

            totaltime += Math.ceil((double)piles[i]/speed); 
        }
        return totaltime;
    }
}