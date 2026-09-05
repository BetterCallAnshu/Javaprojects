import java.util.Scanner;

 class SoS{
    static int Calculatesum(int n){
        int totalsum=0;


        for(int i=1;i<=n;i++){
            totalsum += i*i;
        }    
    return totalsum;}

    public static void main(String[] args){
    Scanner input= new Scanner(System.in);
    
    System.out.print("Enter a  number: ");
    int n= input.nextInt();
    
    System.out.print(Calculatesum(n));

    input.close();



}
}
