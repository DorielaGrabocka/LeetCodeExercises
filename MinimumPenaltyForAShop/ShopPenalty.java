package MinimumPenaltyForAShop;

public class ShopPenalty {
    public static void main(String[] args) {
        String customers = "YYYY"; //NNYNYNYYYNYNYN
        System.out.println(bestClosingTime(customers));
    }

    public static int bestClosingTime(String customers){
        int noOfHours = customers.length();
        int[] ys = new int[noOfHours];
        int[] ns = new int[noOfHours];
        int[] totalPenalty = new int[noOfHours+1];


        if(customers.charAt(noOfHours-1)=='Y'){
            ys[noOfHours-1] = 1;
        }
        else{
            ys[noOfHours-1] = 0;
        }

        ns[0]=0;

        for (int i = 1; i < noOfHours; i++) {
            int right_ptr = noOfHours -1 - i;
            int left_ptr = i;


            if(customers.charAt(right_ptr)=='Y'){
                ys[right_ptr] = ys[right_ptr + 1] + 1; //reduce 1
            }
            else{
                ys[right_ptr] = ys[right_ptr + 1] ; //change nothing
            }

            if(customers.charAt(left_ptr-1)=='N'){
                ns[left_ptr] = ns[left_ptr-1]+1;
            }
            else{
                ns[left_ptr] = ns[left_ptr-1];
            }


        }

        totalPenalty[0] = ys[0];
        totalPenalty[noOfHours] = ns[noOfHours-1];

        int min = totalPenalty[0];
        int bestClosingTime = 0;
        System.out.println(totalPenalty[0]);

        for (int i = 1; i < noOfHours; i++) {
            totalPenalty[i] = ys[i] + ns[i];
            System.out.println(totalPenalty[i]+"="+ys[i]+"+"+ns[i]);
            if(totalPenalty[i] < min){
                min = totalPenalty[i];
                bestClosingTime = i;
            }
        }

        System.out.println(totalPenalty[noOfHours]);
        bestClosingTime = min > totalPenalty[noOfHours] ? noOfHours: bestClosingTime;




        return bestClosingTime;
    }
}
