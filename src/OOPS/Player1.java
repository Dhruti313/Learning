package OOPS;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;

public class Player1 {
    public static ArrayList<Player> createplayer(){
        Player p1 = new Player("raj" ,  20,0,350,"India",60);
        Player p2 = new Player("shaym" , 40,1,290,"Argentina",80);
        Player p3 = new Player("kiran" ,19,3,378,"Indonesia",100);
        Player p4 = new Player("abhi" ,25,0,367,"Japan",45);
        Player p5 = new Player("rohan" ,30,2,400,"Korea",87);

        ArrayList<Player> al = new ArrayList<>();
        al.add(p1);
        al.add(p2);
        al.add(p3);
        al.add(p4);
        al.add(p5);

//        al.sort(Comparator.comparing(a -> a.playername));


        int max = 0;
        for(Player p: al){
            if(max<p.totalrun){
                max = p.totalrun;
            }
        }
        System.out.println(" maximum score of player is :" +max);


return al;

    }
    public static void display(ArrayList<Player> al){
        for(Player e : al){
            e.display();
        }
    }
    public static void main(String ars[]){
        ArrayList<Player> al = new ArrayList<>();
        createplayer();
        display(al);
    }


}

