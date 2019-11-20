/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

/**
 *
 * @author AsmaPC
 */


// Le seul travail de la vue est d'afficher ce que l'utilisateur voit
// La vue n'effectue pas d'opérations 

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CalculatorView extends JFrame{
 private JPanel container = new JPanel();
private JLabel ecran;
private Dimension dim = new Dimension(50, 40);
private Dimension dim2 = new Dimension(50, 31);
private JButton calculateButton = new JButton("=");
private JButton plus = new JButton("+");
private JButton moins = new JButton("-");
private JButton produit = new JButton("*");
private JButton diviser = new JButton("/");
private JButton vider = new JButton("C");
private JButton carre = new JButton("x2");
private JButton racine = new JButton(" √ ");
private JButton log = new JButton("log");
private JButton bin = new JButton("bin");
private JButton exp = new JButton("exp");
private JButton cos = new JButton("cos");
String[] tab_string = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0","."};
  //Un bouton par élément à afficher
  JButton[] tab_button = new JButton[tab_string.length];
                    
	CalculatorView(){
		
    this.setSize(300, 260);
    this.setTitle("Vue standard");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    this.setResizable(false);
    JPanel calcPanel = new JPanel();
    JPanel textPanel = new JPanel();
    JPanel chiPanel = new JPanel();
    JPanel calcPanel2 = new JPanel();
    Font police = new Font("Arial", Font.BOLD, 20);	
    ecran = new JLabel("0");
    ecran.setFont(police);
    //On aligne les informations à droite dans le JLabel
    ecran.setHorizontalAlignment(JLabel.RIGHT);
    ecran.setPreferredSize(new Dimension(220, 20));
          
    calcPanel.setPreferredSize(new Dimension(55, 225));
     calcPanel2.setPreferredSize(new Dimension(55, 225));
   chiPanel.setPreferredSize(new Dimension(165, 225));
textPanel.setPreferredSize(new Dimension(220, 30));

textPanel.add(ecran);
calcPanel.add(plus);

calcPanel.add(moins);
calcPanel.add(produit);
calcPanel.add(diviser);
calcPanel.add(cos);
calcPanel.add(calculateButton);
calcPanel2.add(vider);
calcPanel2.add(carre);
calcPanel2.add(racine);
calcPanel2.add(log);
calcPanel2.add(exp);
calcPanel2.add(bin);

 for(int i = 0; i < tab_string.length; i++){ 
     tab_button[i] = new JButton(tab_string[i]);
      tab_button[i].setPreferredSize(dim);
     chiPanel.add(tab_button[i]);
 }
    textPanel.setBorder(BorderFactory.createLineBorder(Color.black));
    container.add(textPanel, BorderLayout.NORTH);
    container.add(chiPanel, BorderLayout.CENTER);
    container.add(calcPanel, BorderLayout.EAST);
    container.add(calcPanel2, BorderLayout.WEST);
    this.setContentPane(container);
    this.setVisible(true);
}
	
            void addplusListener(ActionListener listenForCalcButton){
		
		plus.addActionListener(listenForCalcButton);
		
	}
            void logListener(ActionListener listenForCalcButton){
		
		log.addActionListener(listenForCalcButton);
		
	}
            void chiffreListener(ActionListener listenForCalcButton){
		
		for(int i = 0; i < tab_string.length; i++){ 
                 tab_button[i].addActionListener(listenForCalcButton);
                }
		
	}
            void addCalculateListener(ActionListener listenForCalcButton){
		
		calculateButton.addActionListener(listenForCalcButton);
		
	}
                 void moinCalculateListener(ActionListener listenForCalcButton){
		
		moins.addActionListener(listenForCalcButton);
		
	}
                 void multiCalculateListener(ActionListener listenForCalcButton){
		
		produit.addActionListener(listenForCalcButton);
		
	}
                 void divCalculateListener(ActionListener listenForCalcButton){
		
		diviser.addActionListener(listenForCalcButton);
		
	}
                 void viderCalculateListener(ActionListener listenForCalcButton){
		
		vider.addActionListener(listenForCalcButton);
		
	}
                 void racineCalculateListener(ActionListener listenForCalcButton){
		
		racine.addActionListener(listenForCalcButton);
		
	}
                 void carreCalculateListener(ActionListener listenForCalcButton){
		
		carre.addActionListener(listenForCalcButton);
		
	}
                 void binCalculateListener(ActionListener listenForCalcButton){
		
		bin.addActionListener(listenForCalcButton);
		
	}
	
                 void expCalculateListener(ActionListener listenForCalcButton){
		
		exp.addActionListener(listenForCalcButton);
		
	}
                 
                 void cosCalculateListener(ActionListener listenForCalcButton){
		
		cos.addActionListener(listenForCalcButton);
		
	}
	
	public JLabel getLabel(){
        return ecran;
        }
	
	void displayErrorMessage(String errorMessage){
		
		JOptionPane.showMessageDialog(this, errorMessage);
		
	}

 
	
}