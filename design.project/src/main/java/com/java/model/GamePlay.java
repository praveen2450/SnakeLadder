package com.java.model;

import java.util.ArrayList;
import java.util.List;
import com.java.model.Player;
public class GamePlay {
    Board board;
    ArrayList<Player> players;
    Dice dice;

    public void start(Board board){
        System.out.println("GamePlay started");
        setDice();
        setPlayers();
        board.init();
    }
    public void setPlayers(){
        players=new ArrayList<>();
        Player player1=new Player("ABC","RED");
        Player player2=new Player("PQR","GREEN");
        Player player3=new Player("XYZ","YELLOW");
        Player player4=new Player("USER","BLUE");
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
        System.out.println("players set");
        initPlayer(players);
    }

    public void initPlayer(ArrayList<Player> players){
        Cell cell=new Cell(0,0);
        System.out.println("Players initialized");

        for(Player player:players){
            if(player==null){
                System.out.println("NULL POINTER EXCEPTION");
            }
            player.setPosition(cell);
            System.out.println(cell);
        }
    }
    public void setDice(){
        dice=Dice.getDice();
    }
}
