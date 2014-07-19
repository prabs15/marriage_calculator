/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package marriage_calculator;

/**
 *
 * @author Prabesh
 */
public class player {
   
    private String name;
    public int score,calculated_score;
    public boolean winner = false;
    public boolean notShown = false;
    public boolean box = false;
    public player(){
        //do nothing here
    }
    public void setName(String x){
        name=x; 
    }
    public String getName(){
        return name;
    }
    public void setWinner(){
        winner = true;
       
    }
    public void resetWinner(){
        winner = false;
       
    }
    public void setScore(int y){
        score = y;
    }
    public int getScore(){
        return score;
    }
    public void resetNotShown(){
        notShown = false;
    }
    public void setNotShown() {
        notShown = true; 
    }
    public void resetAll(){
        score = 0;
        calculated_score = 0;
        notShown = false;
        winner = false;
        box = false;
    }
    public void setbox(){
        box = true;
    }
    public void resetbox(){
        box = false;
    }
}
