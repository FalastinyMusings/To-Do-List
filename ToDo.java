import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;

public class ToDo 
{
    public static void main(String[] args)throws IOException
    {
        final int MAX = 10;
        ArrayList<String> list = new ArrayList<String>();
        int choice = 0;
        boolean exit = false;
        Scanner input = new Scanner(System.in);

    do
    {
        System.out.println("\n1. Add Items to List");
        System.out.println("2. Print Items Currently On List");
        System.out.println("3. Exit\n");
        System.out.print("Please select an option: ");
        choice = input.nextInt();

        switch (choice)
        {
            case 1:
            System.out.println("\nPlease enter your list items. Type 'Stop' to return to menu.");
            for (int i=0;i<MAX;i++) 
            {
                String enteredItem = input.nextLine();
                if (enteredItem.toLowerCase().equals("stop")) 
                {
                    break;
                }
                else
                {
                    list.add(enteredItem);
                }
            }
            break;

            case 2:
            System.out.println("\nYour list items are:");
            for (int index = 0;index < list.size(); index++) 
            {
                System.out.println(list.get(index));                    
            }
            break;

            case 3:

            exit = true;
            break;
        }
    }
    while (!exit);
    input.close();
}
}