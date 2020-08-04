class CoinCombinationUserRespect{
    public static void main(String[] args){

        coinCombinationUserRespect(new int[]{1,2,3}, 4, -1, "");
    }

    static void coinCombinationUserRespect(int[] denom, int amount, int denomIdx, String ans){

        if(amount == 0){
            System.out.println(ans);
            return;
        }

        for(int i=denomIdx+1; i<denom.length; i++){
            if(amount >= denom[i]){
                coinCombinationUserRespect(denom, amount-denom[i], denomIdx ,ans+denom[i]);
            }
            
        }
    }
}