package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;
//import static java.nio.file.Files.newBufferedReader;

public class App {

    private Dish[] dishList = new Dish[100];
    void parseDishData() throws IOException {
        BufferedReader dishFile = Files.newBufferedReader(Paths.get("C:\\Users\\Harsh\\IdeaProjects\\shardaswiggy1\\src\\data\\dishes.csv"));
        String line;


        for (int i = 0; (line = dishFile.readLine()) != null; i++) {
            String[] dishData = line.split(",");
            dishList[i] = new Dish(Integer.valueOf(dishData[0]), dishData[1], Integer.valueOf(dishData[2]));

        }
        for (Dish dish : dishList) {
            if(dish == null){
                break;
            }
            System.out.println(dish);
        }

    }

    void parseRestroData() throws IOException {
        BufferedReader restroReader = Files.newBufferedReader(Paths.get("C:\\Users\\Harsh\\IdeaProjects\\shardaswiggy1\\src\\data\\restraunts.csv"));
        String line ;
        Restro [] restroList = new Restro[100];

        for (int restrocntr = 0; (line = restroReader.readLine()) != null; restrocntr++){
            String[] restroData = line.split(",");
            restroList[restrocntr]=new Restro(Integer.valueOf(restroData[0]),restroData[1]);

            String [] tempMenu = new String[100];
            tempMenu = dishList.stream().filter(dish->dish.getrestroId.equals(restroData[0])).collect(Collectors.toList());



            }
            for (Restro restro: restroList){
                if(restro==null){
                    break;
                }
                System.out.println(restro);
            }
        }



    public static void main(String [] args) throws IOException {
        App aa = new App();
        aa.parseDishData();
        aa.parseRestroData();

    }

}
