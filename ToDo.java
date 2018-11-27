import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;

public class ToDo
{

    public static void showDisplay()
    {
        JFrame mainFrame = new JFrame();
        JPanel frame = new JPanel();
        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        frame.setSize(300, 300);
        BorderLayout layout = new BorderLayout();
        layout.setHgap(10);
        layout.setVgap(5);
        frame.setLayout(layout);
        mainFrame.setTitle("A Basic To-Do List");
        frame.setLayout(new BorderLayout());
        mainFrame.setSize(new Dimension(800,650));
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setAlwaysOnTop(true);
        JMenuBar menu = new JMenuBar();
        JMenu menuFile = new JMenu("File");
        JMenuItem menuExit = new JMenuItem("Exit");
        JLabel textBox = new JLabel("Please Select from the following options:");
        menuFile.add(menuExit);
        menu.add(menuFile);
        mainFrame.setJMenuBar(menu);
        JButton choiceOne = new JButton("Choice 1");
        //choiceOne.setBounds(100, 100, 140, 40);
        JButton choiceTwo = new JButton("Choice 2");
        //choiceTwo.setBounds(200, 200, 140, 40);
        JButton choiceThree = new JButton("Choice 3");
        //choiceThree.setBounds(300, 300, 140, 40);
        mainFrame.add(controlPanel);
        frame.add(choiceOne, BorderLayout.LINE_START);
        frame.add(choiceTwo, BorderLayout.CENTER);
        frame.add(choiceThree, BorderLayout.LINE_END);
        frame.add(textBox, BorderLayout.PAGE_START);
        controlPanel.add(frame);
        mainFrame.setVisible(true);
        frame.setVisible(true);
        controlPanel.setVisible(true);
    }
    

    public static void main(String[] args)throws IOException
    {
        final int MAX = 10;
        ArrayList<String> list = new ArrayList<String>();
        int choice = 0;
        boolean exit = false;
        Scanner input = new Scanner(System.in);
        System.setProperty("apple.laf.useScreenMenuBar", "true");
       

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
            showDisplay();
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