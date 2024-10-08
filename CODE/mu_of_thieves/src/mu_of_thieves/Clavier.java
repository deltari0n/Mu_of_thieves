/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mu_of_thieves;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author vruche
 */
public class Clavier implements KeyListener {

    @Override
    //Ca c'est quand vous appuyez (rapidement) sur une touche. Même bail, vous pouvez récupérer des infos à travers l'event, comme :
    public void keyPressed(KeyEvent event) {
        //System.out.println("La touche " + event.getKeyCode() + " a été pressée, le caractère correspondant est " + event.getKeyChar()); 
        //event.getKeyCode() : Le code de la touche sur laquelle vous avez appuyé. (je doute que vous vous serviez de lui mais je montre en cas où...) En vrai c'est commode si vous utilisez les touches pas pour écrire mais juste pour faire des actions ! (Ca évite de gérer des String...)
        //event.getKeyChar() : La valeur de la touche sur lequelle vous avez appuyé. (Les étudiants préfèrent souvent utiliser ça, alors que l'autre marche aussi...)
        System.out.flush();
        
        //Un petit exercice ? :) Essayez d'écrire le code qui, si j'appuie sur "h" dit "hello !" et si j'appuie sur "e" dit "byebye !" !
        if(event.getKeyChar() == 'h'){
            System.out.println("hello");
        }
        if(event.getKeyChar() == 'e'){
            System.out.println("byebye");
        }
    }

    @Override
    public void keyTyped(KeyEvent event) {
        System.out.println("La touche " + event.getKeyCode() + " a été appuyée, le caractère correspondant est " + event.getKeyChar());
        System.out.flush();
    }

    @Override
    public void keyReleased(KeyEvent event) {
        System.out.println("La touche " + event.getKeyCode() + " a été relachée, le caractère correspondant est " + event.getKeyChar());
        System.out.flush();
    }
}
