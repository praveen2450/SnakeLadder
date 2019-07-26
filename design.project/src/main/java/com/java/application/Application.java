package com.java.application;

import com.java.model.Board;
import com.java.model.GamePlay;
import com.java.service.GamePlayService;

public class Application {
    public static void main(String[] args){
        GamePlay gamePlay=new GamePlay();
        Board board=new Board();
        GamePlayService gamePlayService=new GamePlayService(gamePlay,board);

        if(gamePlayService==null){
            System.out.println("NULL POINTER EXCEPTION");
        }
        gamePlayService.initGame();


    }
}
