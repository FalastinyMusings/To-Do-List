import java.util.*;
import java.io.*;
import javax.swing.*;
import com.sun.scenario.effect.Effect;
import java.awt.*;

public class ToDo 
{

    public void showDisplay()
    {
        JFrame frame = new JFrame();
        frame.setTitle("A Basic To-Do List");
        frame.setLayout(new BorderLayout());
        frame.add(mainPanel, BorderLayout.CENTER);
        frame.setSize(new Dimension(800,650));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizeable();
        frame.setVisible(true);
    }

    public static void main(String[] args)throws IOException
    {
        final int MAX = 10;
        ArrayList<String> list = new ArrayList<String>();
        int choice = 0;
        boolean exit = false;
        Scanner input = new Scanner(System.in);

    showDisplay();

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