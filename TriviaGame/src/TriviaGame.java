import java.util.*;
class Game{
    int op;
    int num1;
    int num2;
    int answer;
    int response = 0;
    Set<Integer> store = new TreeSet<>();
    
    public int validate()
    {
        boolean valid = false;
        String input;
        int num = 0;
        Scanner sc = new Scanner(System.in);
        while(valid== false)
        {
            input =sc.next();
            try
            {
                num = Integer.parseInt(input);
                valid = true;
            }
            catch(Exception e){System.out.print(e);}
        }
        return num;
    }
    
    public void game()
    {
        System.out.println("Welcome to Edureka Trivia Game."+"\n"+"Have fun!");
        Random values = new Random();
         while(response != 999)
         {
             op = values.nextInt(4)+1;
             num1 = values.nextInt(10)+1;
             num2 = 1+values.nextInt(10);
             
            switch(op)
            {
                case 1:
                    answer = num1+num2;
                    System.out.println("What is "+num1+" + "+num2+"?");
                    response = validate();
                    break;
                case 2:
                    answer = num1 - num2;
                    System.out.println("What is "+num1+" - "+num2+"?");
                    response = validate();
                    break;
                case 3:
                    answer = num1 * num2;
                    System.out.println("What is "+num1+" * "+num2+"?");
                    response = validate();
                    break;
                case 4:
                    answer = num1 / num2;
                    System.out.println("What is "+num1+" / "+num2+"?");
                    response = validate();
                    break;
                default:
                    System.out.println("Unknown operator");
            }
            stores();
         }
         System.out.println("You got these correct");
         System.out.println(store+"\n"+"Thank you for playing with us!");
    }
    public void stores()
    {
        if(response == answer)
        {
            store.add(answer);
        }
    }
    
}
public class TriviaGame
{
	public static void main(String args[])
	{
            Game object = new Game();
            object.game();
            
	}
}
