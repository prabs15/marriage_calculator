/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package marriage_calculator;

/**
 *
 * @author Prabesh
 */
public class points_calculator {
    private int total,adjusted_notShown,adjusted_shown;
    
    private int temp_sum = 0;
    
    points_calculator() {
        
        
        
    }
    public int show(){
        return total;
    }
    public int total_points(player[] marriage_player){
        int sum = 0;
        for(int i = 0; i<marriage_player.length; i++){
            sum += marriage_player[i].getScore();
        }
        return sum;
    }
    public void calculate(player[] marriage_player){
        total = total_points(marriage_player);
        adjusted_shown = total + 3;
        adjusted_notShown = total + 10;
        for(int i = 0;i<marriage_player.length;i++){
            if(marriage_player[i].winner == false){
                if(marriage_player[i].notShown == true){
                    marriage_player[i].calculated_score = 0 - adjusted_notShown;
                    temp_sum += marriage_player[i].calculated_score;
                }else{
                    marriage_player[i].calculated_score = (marriage_player.length * marriage_player[i].getScore()) - adjusted_shown;
                    temp_sum += marriage_player[i].calculated_score;
                }
            }
        }
        for(int j = 0; j < marriage_player.length; j++){
            if(marriage_player[j].winner == true){
                marriage_player[j].calculated_score = 0-temp_sum;
            }
        }
    }
}
