import java.util.*;

//press sheet for attendence list
//press today to enter attendence
//press absent to know who are late/absent
//A DIFFERENT CLASS NAMED DIRECTORY WILL CONTAIN ALL THE STUDENT NAMES AND ROLL NUMBERS

class attendance
{
    static int absentee=0;  //counts the number of absent students

  /* creating a static array so that,
  I save the index of all the students who have a null named entry and
  call these indexes again to
  print the names and roll number of the absentees through the directry*/

    static int absentindex[]=new int[50];
//saves the index of those students who are late or absent

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your command");
        String command=sc.nextLine();
      /*  if(command.equalsIgnoreCase("sheet"))  call function sheet
       if(command.equalsIgnoreCase("today"))   call funtion today
       if(command.equalsIgnoreCase("absent"))  call function absent
     */
    }

    public void sheet(String command)                    //SHEET function that displays the directory class and shows the sorted names
    {
        //call class comtaining the student info here. CLASS HAS A FUNTION NAMED DIRECTORY
    }

    public void today(String command)                    //TODAY function that takes the name of the incoming students as input
    {
        Scanner sc=new Scanner(System.in);
        int roll[]=new int[50];
        String name[]=new String[50];
        for(int i=0;i<50;i++){
            System.out.println("enter your name and toll number in diffrent lines");
            name[i]=sc.nextLine();
            roll[i]=sc.nextInt();

            if(name[i]==null && roll[i]==0){
                absentee++;
                absentindex[i]=i;
            }
        }
    }


    public void absent(String command)                     //ABSENT function that will display the name of the absentees and the number of absent students
    {
        System.out.println("there are "+absentee+" number of students absent today");
        System.out.println();
        System.out.println("the details of the students absent are given as :");
        for(int j=0;j<50;j++)
        {
            if(absentindex[j]!=0)
                System.out.println("absentee: ");//call the names and roll numbers of the students through the directory class/function)
        }
    }

}


// works left to do:

/*
 * 1. make a function directory and save random-ass 50 names or make it 10 to make the program easier
 * 2. make it in such a way that the function can be called in the method-dependent functions
 * 3. make it so that the array/space to save the number of students is not pre-determined
 *
 */