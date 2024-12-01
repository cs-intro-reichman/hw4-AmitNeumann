public class Primes {
    public static void main(String[] args) {
    int num=Integer.parseInt(args[0]),percent=0;
    double countP=0.0;
    boolean[] primes=new boolean[num+1];
    primes[0]=false;
    primes[1]=false;
    for(int i=2;i<=num;i++){
        primes[i]=true;
    }
    int p=2;
    while (p*p<=num){ 
        for(int j=p*p;j<=num;j+=p){ //  runs on the array and taling off dividors of p
            if(primes[j]==true) { // checking only relevant cubes
                if (j%p==0) {
                    primes[j]=false;
                }
            }
        }
        p++;
    }
    System.out.println("Prime numbers up to "+num+":");
    for(int i=0;i<=num;i++){
        if(primes[i]==true){
            System.out.println(i);
            countP++;
        }
    }
    percent=(int)((countP/num)*100);
    System.out.println("There are "+(int)(countP)+" primes between 2 and "+num+" ("+percent+"% are primes)");




    }
}