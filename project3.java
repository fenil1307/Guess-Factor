import java.io.Console;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class project3 {
    public static void main(String[] args) {
        int e;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("--------------------------------------------------Instruction---------------------------------------------");
            System.out.println("IN MULTIPLAYER MODE YOU CAN GUESS THE NUMBER LESS THAN 1000 ONLY");
            System.out.println("IN COMPUTER MODE YOU CAN GUESS THE NUMBER LESS THAN 100 ONLY");
            System.out.println("IN ANY MODE IF USER WILL GUESS THE NUMBER THEN IT WILL NOT VISIBLE ON THE CONSOLE SO PLEASE WRITE THE GUESS NUMBER CAREFULLY");
            System.out.println("\n\nIN WHICH MODE,DO YOU WANT TO PLAY?\n");
            System.out.println("1. VS COMPUTER (FOR PLAYING VS COMPUTER, PRESS 'c')\n");
            System.out.println("2. MULTIPLAYER (FOR PLAYING MULIPLAYER MODE, PRESS 'm')\n");
            char typ = sc.next().charAt(0);
            Random num = new Random();
            int gusnum;
            
            if(typ=='m'){
                Console p = System.console();
                char[] p1 = null;
                char[] p2 = null;
               
                System.out.print("Enter the player 1 name: ");
                String pl1=sc.next();
                System.out.print("Enter the player 2 name: ");
                String pl2=sc.next();
                System.out.println("First it\'s it "+pl1+" turn to guess the number");
                System.out.println(pl1+", please Enter the guessed number ");
                p1 = p.readPassword();
                int n = Integer.parseInt(new String(p1));
                if(n>0 && n<=9){
                    System.out.println(pl1+" has selected one digit number");
                }
                else if(n>=10 && n<100){
                    System.out.println(pl1+" has selected two digit number");
                }
                else if(n>=100 && n<1000){
                    System.out.println(pl1+" has selected three digit number");
                }

                System.out.println("For "+pl2);
                System.out.println("Guess The Number: ");
                int gn1=sc.nextInt();
                int ip=0;
            
                do
                {
                if(gn1<n)
                {
                    System.out.println("Attempt "+(++ip) + ": "+ gn1+"is Less than Selected Number, Try Again.");
                    System.out.print("Guess The Number: ");
                    gn1=sc.nextInt();
                    continue;
                }
                if(gn1>n)
                {
                    System.out.println("Attempt "+(++ip) +":"+gn1+" is Greater than Selected Number, Try Again.\n");
                    System.out.println("Guess The Number: ");
                    gn1=sc.nextInt();
                    continue;
                }
                }
                while(gn1!=n);
                {
                    System.out.println("\nCongratulations!!!You Found the Selected Number in "+(++ip) +"  Attempts...\n\n\n");
                }

                System.out.println("Now It's turn of "+pl2);
                Console pp = System.console();
                System.out.println("For "+pl2);
                System.out.println("Select Your Number:");
                p2 = pp.readPassword();
                int n2 = Integer.parseInt(new String(p2));
                if(n2>0 && n2<=9){
                    System.out.println(pl2+" has selected one digit number");
                }
                else if(n2>=10 && n2<100){
                    System.out.println(pl2+" has selected two digit number");
                }
                else if(n2>=100 && n2<1000){
                    System.out.println(pl2+" has selected three digit number");
                }

                System.out.println("For"+pl1);
                System.out.println("Guess The Number: ");
                int gn2=sc.nextInt();
                int ip2=0;
                do
                {
                if(gn2<n2)
                {
                    System.out.println("Attempt "+(++ip2) + ": "+ gn2+"is Less than Selected Number, Try Again.");
                    System.out.print("Guess The Number: ");
                    gn2=sc.nextInt();
                    continue;
                }
                if(gn2>n2)
                {
                    System.out.println("Attempt "+(++ip2) +":"+gn2+" is Greater than Selected Number, Try Again.\n");
                    System.out.println("Guess The Number: ");
                    gn2=sc.nextInt();
                    continue;
                }
                }
                while(gn2!=n2);
                
                    System.out.println("\nCongratulations!!!You Found the Selected Number in "+(++ip2) +"  Attempts...\n\n\n");
                
                System.out.println("RESULT:");
                if(ip2<ip)
                {
                    System.out.println(pl2+" WON THE GAME...");
                }
                else if(ip2>ip)
                {
                    System.out.println(pl1+" WON THE GAME...");
                }
                else
                {
                    System.out.println("Match Tied...");
                }
                


            }
            int rannum = num.nextInt(100) + 0;
            if (typ == 'c') {
                System.out.print("Enter your name: ");
                String name=sc.next();
                System.out.println(name+" FIrst it's my turn to guess the number");
                int c = 0;
                if(rannum>0 && rannum<10){
                    System.out.println("I had guessed the one digit number");
                }
                else if (rannum>=10 && rannum<100){
                    System.out.println("I had guessed the two digit number");
                }
        
                do {
                    System.out.print("Enter the number: ");
                    gusnum = sc.nextInt();
                    if (gusnum > rannum) {
                        
                        System.out.println("Attempt, " + ++c + " NUmber is greater,try again..!");
                    }
                    else if(gusnum==rannum){
                        c++;
                        break;
                    } else {
                        System.out.println("Attempt, " + ++c + " NUmber is smaller,try again..!");
                    }
                   
                } while (gusnum != rannum);
                System.out.println("\nYeah!!! I Found the Selected Number in Attempts... :" + c);

                int cc = 0;

                System.out.println("now its computer turn to guess the number");
                Console s = System.console();
                System.out.println("Enter a number");
                char[] b = null;
                b = s.readPassword();
                int a, d;
                d = Integer.parseInt(new String(b));
                if(d>=0 && d<10){
                    System.out.println(name+" had guessed the one digit number");
                }
                else if (d>=10 && d<100){
                    System.out.println(name+" had guessed the two digit number");
                }
                if(d>=0 && d<10){
                do {
                    int l=0,u=9;
                    a = num.nextInt(u+1-l)+l;
                    if(d<a){
                        do{
                        u=a-1;
                        System.out.println("Attepent, " + ++cc + " NUmber is smaller,try again..!");
                        a=num.nextInt(u-l+1)+l;
                        }while(d<a);
                        continue;
                    }
                    if (d > a) {
                        do{
                            l=a+1;
                            System.out.println("Attepent, " + ++cc + " NUmber is greater,try again..!");
                            a=num.nextInt(u-l+1)+l;
                        }while(d>a);
                    } 
                    cc++;
                

                } while (d != a);
                }
            else if(d>=10 && d<100){
                do {
                    int l=10,u=99;
                    a = (num.nextInt()%90)+10;
                    if(d<a){
                        do{
                        u=a-1;
                        System.out.println("Attepent, " + ++cc + " NUmber is smaller,try again..!");
                        a=((num.nextInt())%(u-l+1))+l;
                        }while(d<a);
                        continue;
                    }
                    if (d > a) {
                        do{
                            l=a+1;
                            System.out.println("Attepent, " + ++cc + " NUmber is greater,try again..!");
                            a=(num.nextInt()%(u-l+1))+l;
                        }while(d>a);
                        continue;
                    } 
                    cc++;
                

                } while (d != a);
            }
            
                if (c > cc) {
                    System.out.println("computer wins");
                } else if(c==cc){
                    System.out.println("match tied");
                }
                else{
                    System.out.println("Congratulation "+name+" you win");
                }
            }
            System.out.println("Do You Want To Play Again?\n");
            System.out.println("If Yes then press 1.\n");
            System.out.println("If No then press 0.\n");
            e = sc.nextInt();
            if (e == 0) {
                System.out.println("Thank You For Playing This Game!\n\n");
            }

        } while (e == 1);
    }
}
