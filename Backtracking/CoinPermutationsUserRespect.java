public class CoinPermutationsUserRespect{
    static int count = 0;
    public static void main(String[] args){
        coinPermutationsUserRespect(new int[]{2,3,5,6}, 10, "");
    }

    static void coinPermutationsUserRespect(int[] denom, int amount, String ans){

        if(amount == 0){
            System.out.println(++count+"."+ans);
            return;
        }

        for(int i=0; i<denom.length; i++){
            if(amount-denom[i] >= 0){
                coinPermutationsUserRespect(denom, amount-denom[i], ans+denom[i]);
            }
        }
    }
}