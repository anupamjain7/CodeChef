import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int j=0;j<t;j++){
            int N = sc.nextInt();
            int K = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            finalPoints(N,K,x,y);
        }
	}
	
	 public static void finalPoints(int N,int K,int x,int y){

        int xStart = x;
        int yStart = y;
        int p = K%4;

        if(p==0){
            p=4;
        }

        int xChange = 1;
        int yChange = 1;

        int bounces = 0;
        while(bounces<p){

            int change = findChange(x,y,N,xStart,yStart);
            x += xChange*change;
            y += yChange*change;

            bounces++;
            if(x==N||x==0){
                xChange*=(-1);
            }else if(y==N||y==0){
                yChange*=(-1);
            }


            if(x==0&&y==0||x==N&&y==N||x==0&&y==N||x==N&&y==0){
                System.out.println(x+" "+y);
                return;
            }

        }
        System.out.println(x+" "+y);

    }

    public static int findChange(int x,int y,int N,int xStart,int yStart){


        if(xStart>=yStart){
            if(x==N){
                return N-y;
            }else if(x==0){
                return y;
            }else if(y==N){
                return x;
            }else if(y==0){
                return N-x;
            }else{
                return Math.min(N-x,N-y);
            }
        }else{
            if(x==N){
                return y;
            }else if(x==0){
                return N-y;
            }else if(y==N){
                return N-x;
            }else if(y==0){
                return x;
            }else{
                return Math.min(N-x,N-y);
            }
        }



    }
}
