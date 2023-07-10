import java.util.Scanner;

class Guesser
{
    public int guessNum;
    public int guessNumber()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Guesser kindly guess the number");
        guessNum= sc.nextInt();
        return guessNum;
    }
    public void clue()
    {
        System.out.println("clue:");
        switch(guessNum)
        {
            case 1:
                System.out.println("First in importance");            
                break;
            case 2:
                System.out.println("back to the sqaure");
                break;
            case 3:
                System.out.println("second prime number");
                break;  
            case 4:
                System.out.println("sides of square");
                break;
            case 5:
                System.out.println("A star that is eatable");
                break; 
            case 6:
                System.out.println("sense");
                break; 
            case 7:
                System.out.println("wonders in the world");
                break; 
            case 8:
                System.out.println("Spider");
                break;  
            case 9:
                System.out.println("A stitch in time saves nine");
                break;
            case 10:
               System.out.println("criket player");
                break;   
                
        }
        
        
    }
}
class Player
{
   
    String name;
    public String playerName()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("player name:");
        name=sc.nextLine();
        return name;
    }
    int pguessNum;
    public int guessNumber()
    {  
        Scanner sc=new Scanner(System.in);
        System.out.println(name+" kindly guess the number");
        pguessNum=sc.nextInt();
        return pguessNum;
    
         
    }
    
}
class Umpire
{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;
    
    String nameOfplayer1;
    String nameOfplayer2;
    String nameOfplayer3;
    
    public void collectNumFromGuesser()
    {
        Guesser g=new Guesser();
        numFromGuesser=g.guessNumber();
        if(numFromGuesser>0 && numFromGuesser<=10)
        {   
            g.clue();            
        }
        else
        {
            System.out.println("Please enter number in between 1 to 9");
            collectNumFromGuesser();

        }
        
        
    }
    public void collectNumFromPlayer()
    {
        Player p1=new Player();
        Player p2=new Player();
        Player p3=new Player();
        
        nameOfplayer1=p1.playerName();
        numFromPlayer1=p1.guessNumber();
        nameOfplayer2=p2.playerName();
        numFromPlayer2=p2.guessNumber();
        nameOfplayer3=p3.playerName();
        numFromPlayer3=p3.guessNumber();

     }
    

    public void compare()
    {
        if(numFromGuesser==numFromPlayer1)
        {  
            if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
            {
                System.out.println(nameOfplayer1+" and "+nameOfplayer2+ " and "+nameOfplayer3+ " are winners");
            } 
            else if(numFromGuesser==numFromPlayer2)
            {
                System.out.println(nameOfplayer1+" and "+ nameOfplayer2+" won the game");
            
            }
            else if(numFromGuesser==numFromPlayer3)
            {
                System.out.println(nameOfplayer1+" and "+nameOfplayer3+ " won the game");
            } 
            else{           
             System.out.println(nameOfplayer1+ " won the game");
           }
        }
       else if(numFromGuesser==numFromPlayer2)
       {
           if(numFromGuesser==numFromPlayer3)
           {
            System.out.println(nameOfplayer2+" and  " +nameOfplayer3+"  won the game");
           }
           else
           {
            System.out.println(nameOfplayer2+" won the game");
            
           }
        }
       else if(numFromGuesser==numFromPlayer3)
        {
            System.out.println(nameOfplayer3+" won the game");
            
        }
        else
        {
            System.out.println("Lost the Game!");
            collectNumFromPlayer();
            
        }
        
    }
}

public class Game
{
    public static void main(String[]args)
    {
       
        Umpire u=new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayer();
        u.compare();
    }
}
