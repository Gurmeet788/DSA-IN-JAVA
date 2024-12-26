public class MakeBouquts {

    public static void main(String[] args) {
        
        int bloomDay[] = {7,7,7,7,12,7,7};
        int m = 2;
        int k = 3;

        System.out.println(minDays(bloomDay, m, k));
    }

    public static int minDays(int[] bloomDay, int m, int k) {

        int size = bloomDay.length;
        int max = bloomDay[0];
        int min = bloomDay[0];
        
        if((long) m * k  > size){
            
            return -1;
        }

        for(int i = 1; i < size; i++){

            if(bloomDay[i] > max){

                max = bloomDay[i];
            }

            if(bloomDay[i] < min){

                min = bloomDay[i];
            }

        }

        int low = min;
        int high = max;

        while(low <= high){

            int mid = (low + high)/2;

            if(minDayCount(bloomDay, m, k, mid)){

                high = mid - 1;

            }else{

                low = mid + 1;
            }
        }
        
        return low;
    }
    
    public static boolean minDayCount(int[] bloomDay, int m, int k, int day){

        int count = 0;
        int totalBouquets = 0;
        for(int i = 0; i < bloomDay.length; i++ ){

            if(bloomDay[i] <= day){

                count++;
            }else{

                totalBouquets += count/k;

                count = 0;
            }
        }
        totalBouquets += count/k;

        if(totalBouquets >= m){

            return true;

        }else{

            return false;
        }
    }
}