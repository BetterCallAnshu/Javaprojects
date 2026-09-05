import java.util.Scanner;

 class naturalno{
    static int findsum(int n){
        int sum=0;

        for(int i=1;i<=n;i++){
            sum = sum+i;
        }    
    return sum;}

    public static void main(String[] args){
    Scanner input= new Scanner(System.in);
    
    System.out.print("Enter a natural number");
    int n= input.nextInt();
    
    System.out.print(findsum(n));

    input.close();



}
}
