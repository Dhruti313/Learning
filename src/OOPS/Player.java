package OOPS;

import Package2array.Multiply;

public class Player {
    String playername;
    int totalrun;
    int noofwicket;
    int noofmatches;
    String country;
    int noofcentury;
    public Player(String playername ,int totalrun,int noofwicket,int noofmatches,
                  String country , int noofcentury ){
       this.playername = playername;
        this.totalrun = totalrun;
        this.noofwicket = noofwicket;
        this.noofmatches = noofmatches;
        this.country = country;
        this.noofcentury = noofcentury;
    }
    void display(){
        System.out.println(playername+""+totalrun+" "+ noofwicket+" "+noofmatches+" "+country+" "+noofcentury);




    }
}




