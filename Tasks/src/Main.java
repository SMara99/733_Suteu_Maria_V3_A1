import java.io.*;
import java.util.Scanner;
import java.util.*;

public class Main {
    Task[] listTasks;
    FileInputStream file;
    {
        try {
            file = new FileInputStream("offerten.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    Scanner sc = new Scanner(file);
    int index = 0;
    while(sc.hasNextLine()){
        String[] objektData = sc.NextLine().split("$");


        Task newTask = new Task(Integer.parseInt(objektData[0]), objektData[1],
                Integer.parseInt(objektData[2]), Integer.parseInt(objektData[3]), objektData[4]);

        listTasks.add(index, newTask);
    }


}
