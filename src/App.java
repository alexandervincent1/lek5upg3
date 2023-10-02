import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner tangentbord = new Scanner(System.in)){
            String enter = "Enter";
            String[] rum = {"text1", "text2", "text3","text4","text5" };
            rum[0]= "Du är i hallen och hör något i köket.";
            rum[1]= "Välkommen till köket du ser hur en lampa hänger för att fixa den gå till nästa rum.";
            rum[2]= "Du gick till vinden för att fixa lampan men nu hör du något från nedervåningen igen";
            rum[3]= "Du tog dig ner för trappan och hör hur något bankar i källaren";
            rum[4]= "Du dog i källaren";
            int steg = 0;
            System.out.println("Du är i rum "+steg);
            System.out.println(rum[steg]+" Tryck ENTER för att komma in i nästan rum");
            enter = tangentbord.nextLine();
            steg = steg + 1;
            System.out.println("Du är i rum "+steg);
            System.out.println(rum[steg]+" Tryck ENTER för att komma in i nästan rum");
            enter = tangentbord.nextLine();
            steg = steg + 1;
            System.out.println("Du är i rum "+steg);
            System.out.println(rum[steg]+" Tryck ENTER för att komma in i nästan rum");
            enter = tangentbord.nextLine();
            steg = steg + 1;
            System.out.println("Du är i rum "+steg);
            System.out.println(rum[steg]+" tryck ENTER för att komma in i nästan rum");
            enter = tangentbord.nextLine();
            steg = steg + 1;
            System.out.println("Du är i rum "+steg);
            System.out.println(rum[steg]);
            enter = tangentbord.nextLine();
            steg = steg + 1;




        }


        }
    }

