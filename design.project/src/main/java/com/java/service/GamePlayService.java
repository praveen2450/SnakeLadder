package com.java.service;

import com.java.model.*;
import java.util.ArrayList;

public class GamePlayService {
    GamePlay gamePlay;
    Board board;
    ArrayList<Cell>cells;
    public GamePlayService(GamePlay gamePlay, Board board) {
        this.gamePlay = gamePlay;
        this.board = board;
    }

    public void initGame(){
        createCell();
        setSnakeAndLadder();
        if(gamePlay==null){
            System.out.println("NULL POINTER EXCEPTION");
        }
        gamePlay.start(board);
    }

    public void setSnakeAndLadder(){
        SnakeLadderFactory snakeLadderFactory=new SnakeLadderFactory();
        for(int i=0;i<19;i=i+2){
            Cell start=cells.get(i);
            Cell end=cells.get(i+1);
            SnakeLadder snakeLadder=snakeLadderFactory.getSnakeLadder(i+1,start,end);

            if(board==null){
                System.out.println("NULL POINTER EXCEPTION");
            }
            board.setSnakeLadder(snakeLadder);
            System.out.println(start+" "+end);
        }
    }

    public void createCell(){
        cells=new ArrayList<>();
        Cell cell1=new Cell(90,5);
        Cell cell2=new Cell(10,6);
        cells.add(cell1);
        cells.add(cell2);


        Cell cell3=new Cell(8,1);
        Cell cell4=new Cell(6,4);
        cells.add(cell3);
        cells.add(cell4);

        Cell cell5=new Cell(9,2);
        Cell cell6=new Cell(6,2);
        cells.add(cell5);
        cells.add(cell6);

        Cell cell7=new Cell(4,1);
        Cell cell8=new Cell(2,0);
        cells.add(cell7);
        cells.add(cell8);

        Cell cell9=new Cell(4,0);
        Cell cell10=new Cell(1,8);
        cells.add(cell9);
        cells.add(cell10);

        Cell cell11=new Cell(9,0);
        Cell cell12=new Cell(7,4);
        cells.add(cell11);
        cells.add(cell12);

        Cell cell13=new Cell(8,2);
        Cell cell14=new Cell(6,4);
        cells.add(cell13);
        cells.add(cell14);

        Cell cell15=new Cell(7,7);
        Cell cell16=new Cell(1,4);
        cells.add(cell15);
        cells.add(cell16);

        Cell cell17=new Cell(2,9);
        Cell cell18=new Cell(1,0);
        cells.add(cell17);
        cells.add(cell18);

        Cell cell19=new Cell(3,9);
        Cell cell20=new Cell(0,4);
        cells.add(cell19);
        cells.add(cell20);

    }
}
