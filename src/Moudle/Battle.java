package Moudle;

import Controller.ControllBox;

import java.util.ArrayList;
public class Battle {
	private Ground ground;
	private int currentTurn;
	private Player player1;
	private Player player2;
	private Player playerInTurn;
	private Card selectedCard;
	private Item selectedItem;
	private int battleType;
	private ArrayList<Item> flags;
	private int numberOfFlags;
	private Item mainFlag;
	private Fighter heroP1;
	private Fighter heroP2;
	public void checkWinner(){}
	public void setMana ( ){}
	public int input( ControllBox controllBox ){
		return 1;
	}
	public Battle ( Player player1, Player player2, int battleType){

	}
	public void nextTurn(){
		currentTurn++;
		setMana ();
		setPlayerInTurn ();


	}
	private void setPlayerInTurn (){
		if ( playerInTurn.equals ( player1 ) )
			playerInTurn = player2;
		playerInTurn = player1;
	}
}
