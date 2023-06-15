package org.example;
import org.example.Dish;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Paths;
import static java.nio.file.Files.newBufferedReader;

public class App {



    void parseRestroData() throws IOException {
        BufferedReader restroReader = newBufferedReader(Paths.get("C:\\Users\\Harsh\\IdeaProjects\\shardaswiggy1\\src\\data\\restraunts.csv"));
        String line ;
        Restro [] restroList = new Restro[100];

        for (int restrocntr = 0; (line = restroReader.readLine()) != null; restrocntr++){
            String[] restroData = line.split(",");
            restroList[restrocntr]=new Restro(Integer.valueOf(restroData[0]),restroData[1]);

            String [] tempMenu = new String[100];


            }
            for (Restro restro: restroList){
                if(restro==null){
                    break;
                }
                System.out.println(restro);
            }
        }

        void parseDishData() throws IOException {
            BufferedReader dishFile = newBufferedReader(Paths.get("C:\\Users\\Harsh\\IdeaProjects\\shardaswiggy1\\src\\data\\dishes.csv"));
            String line;
            Dish[] dishList = new Dish[100];

        for (int i = 0; (line = dishFile.readLine()) != null; i++) {
            String[] dishData = line.split(",");
            dishList[i] = new Dish(Integer.valueOf(dishData[0]), Integer.valueOf(dishData[1]), dishData[2]);

        }
        for (Dish dish : dishList){
            if(dish == null){
                break;
            }
            System.out.println(dish);
        }

    }

    public static void main(String [] args) throws IOException {
        App aa = new App();
        aa.parseDishData();
        aa.parseRestroData();
//
    }

    }

