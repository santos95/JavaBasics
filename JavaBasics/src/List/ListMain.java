package List;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListMain {
    public static void main(String[] args) {
        System.out.println("Extract data:");

        List<SoccerGame> games = new ArrayList<>();

        File file = new File("C:\\desarrollo\\CursoJava_Basico\\JavaBasics\\src\\List\\data.txt");
        System.out.println(file.getAbsolutePath());
        Scanner s = null;

        try{

            System.out.println("Read the data ...");
            s = new Scanner(file);

//            Get data from the file
            while (s.hasNext()){

                String line = s.nextLine();
                String [] splitLine = line.split("::");
                SoccerGame game = new SoccerGame();

//            set the object attributes
                game.setLocalTeam(splitLine[0]);
                game.setVisitTeam(splitLine[1]);
                game.setLocalScore(Integer.parseInt(splitLine[2]));
                game.setVisiteScore(Integer.parseInt(splitLine[3]));

//                add to the list
                games.add(game);

            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {

            try{
                if (s != null) {
                    s.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        System.out.println("---------------------------------------------");
        System.out.println("Games Results:");
        System.out.println("---------------------------------------------");

        games.forEach(game -> {
            System.out.println(game.getLocalTeam()
                    .concat(" ")
                    .concat(game.getLocalScore().toString())
                    .concat("-")
                    .concat(game.getVisiteScore().toString())
                    .concat(" ")
                    .concat(game.getVisitTeam())
            );
        });
    }
}
