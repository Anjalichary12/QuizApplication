import java.util.Scanner;

public class QuestionService 
{
    Question questions[]=new Question[5]; // reference only
    String selection[]=new  String[5];


    public QuestionService()
    {
        questions[0]= new Question(1,"Who invented the JAVA?","Guido van Rossum",
        "James Gosling","Dennis Ritchie","Bjarne Stroustrup","James Gosling");
        
        questions[1]=new Question(2,"What is the extension of java class files?",".c",
        ".class",".js",".java",".class");
        
        questions[2]=new Question(3,"Which of the following is not an OOPS concept in Java?","Abstraction",
        "Encapsulation","Compilation","Polymorphism","Compilation");
        
        questions[3]=new Question(4,"Which exception is thrown when java is out of memory?","MemoryError",
        "OutOfMemoryError","MemoryOutOfBoundsException", "MemoryFullException","OutOfMemoryError");
        
        questions[4]=new Question(5,"Which of the following is a superclass of every class in Java?",
        "ArrayList","Abstract class","Object class" ,"String","Object class");
        

    }     
    public void playQuiz()
    {  
        int i=0;
        for (Question q: questions)
        {
            System.out.println("Question No:"+q.getId());

            System.out.println(q.getQuestion());

            String[] options = {q.getOption_1(), q.getOption_2(), q.getOption_3(), q.getOption_4()};
        
            // Use a for loop to print each option
            for (int j = 0; j < options.length; j++) 
            {
                System.out.println((j + 1) + ". " + options[j]);
            }
            // System.out.println(q.getQuestion());
            // System.out.println(q.getQuestion());
            // System.out.println(q.getOption_1());
            // System.out.println(q.getOption_2());
            // System.out.println(q.getOption_3());
            // System.out.println(q.getOption_4());


            System.out.println("Enter your choice (1/2/3/4):");
            Scanner sc=new Scanner(System.in);
            int choice =sc.nextInt();

            switch(choice)
            {
            case 1:
                    selection[i]=q.getOption_1();
                    break;
            case 2:
                    selection[i]=q.getOption_2();
                    break;
            case 3:
                    selection[i]=q.getOption_3();
                    break;
            case 4:
                    selection[i]=q.getOption_4();
                    break;
            default:
                    System.out.println("Invalid choice,skipping this question");
                    break;
                
            }       
            // selection[i]=sc.nextLine();
            i++;
        }


        for(String s: selection)
        {
          System.out.println(s);
        }
        
    }

    public void printScore()
    {
        int score=0;
        
        for(int i=0;i<questions.length;i++)
        {
            Question  queu =questions[i];
            String actualAnswer=queu.getAnswer();
            String userAnswer=selection[i];

            if(actualAnswer.equals(userAnswer))
            {
                score++;
            }
            
        }  
        System.out.println(score);
     
    
    }
}