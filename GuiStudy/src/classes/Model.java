package classes;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ComponentListener;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class Model {
	//INSTANCE VARIABLES==============================
	private GUI gui;
	private Deck deck;
	
	
	//CONSTRUCTOR=====================================
	public Model(){
		this.deck = new Deck();
		//showCardsInPanel(deck.getDeck(), gui.panelUpper);
		//gui.showCardsInPanel(deck.getDeck(), gui.panelLower);

	}
	
	
	//CLASS METHODS=========================================
	public static int countCards(Card[] cards){
		int count = 0;
		
		for(Card c : cards){
			if(c != null){
				++count;
			}
		}
		System.out.println(count);
		return count;
	}
	
	//INSTANCE METHODS=====================================
	
}
