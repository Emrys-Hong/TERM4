public class PrimeNumberChecker{
	public static int isPrime(int num){
        if (num == 2) {
            return 1;
        }
        else {
            for (int i=2; i<=Math.pow(num, 0.5); i++) {
                if (num%i == 0) {
                    return 0;
                }

            }
        }
        return 1;
	}
}


//yy asw:
public class PrimeNumberChecker{
    //prime only divisible by 1 and itself
    //assusme all input>=3
	public static int isPrime(int num){
        int ans=0;
        for(int i=2;i<num;i++){
            if(num%i==0){
                return ans= 0;
            }
            else{ans=1;} }
        return ans;


	}
}

