class CoinChangeCoinRespect{

    public static void main(String[] args){

        coinChangeCoinRespect(new int[]{2,3,5,6}, 10, "", 0);
    }

    static void coinChangeCoinRespect(int[] denom, int amount, String ans, int vidx){

        if(amount == 0){
            System.out.println(ans);
            return;
        }

        if(vidx == denom.length || amount < 0){
            return;
        }

        coinChangeCoinRespect(denom, amount-denom[vidx], ans+denom[vidx], vidx);

        coinChangeCoinRespect(denom, amount, ans, vidx+1);
    }
}