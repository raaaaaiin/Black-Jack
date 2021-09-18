/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Casino;

/**
 *
 * @author Filmosh
 */
public class Players extends MyCasino{
    //Use Buffer Reader
    int fid;
    String Username;
    String Password;
    int Money;
    int Rounds;
    int Busted;
    int Wins;
    int Lose;
    int HitsCount;
    int HoldsCount;
    int DoubleCount;
    int SurrenderCount;
    int level;
    int exp;
    int requirement;
    int GameSpeed;
    boolean awareness = false;
    //Temporary data
    int sum = 0;
    String[] Logs = new String[10];
    String DrawCard = "";
    String Imagesrc = "";
    String Value = "";
    String Suites = "";
    //List
    String[][] Card = new String[20][4];
    //Unnecessary
    int loger = 9;
    int CardIndex = 0;
    String Status = "Ready";
    int Bet;
    int x = 0;
    int img = 0;
    int Dealersum;
    String Result = null;
    public void addindex(){
        CardIndex +=1;
    }
    public int getDealersum(){
        int a = 0;
        String value = Card[0][1];
        a += Integer.parseInt(value);
        Dealersum = a;
        return Dealersum;
    }
    public int sumCard(){
        int a = 0;
        for (int i = 0; i <= CardIndex; i++ ){
            String value = Card[i][1];
            
            
            a += Integer.parseInt(value);
        }
        sum = a;
        return sum;
    }
    public int getSum(){
        sumCard();
        return sum;
    }
    public String ShowDrawCard(int i){
        
            DrawCard = Card[i][0];
        
        return DrawCard;
    }
    public String ShowImagesrc(int i){
        
            Imagesrc = Card[i][3];
        
        return Imagesrc;
    }
    public String ShowSuites(int i){
     
            Suites = Card[i][2];
        
        return Suites;
    }
    public String ShowValue(int i){
        
            Value = Card[i][1];
            
        
        return Value;
    }
   
    public int getfid(){
        return fid;
    }
    public String getUsername(){
        return Username;
    }
    public String getPassword(){
        return Password;
    }
    public double getMoney(){
      return Money;  
    }
    
    public int getRounds(){
      return Rounds;  
    }
    public int getBusted(){
      return Busted;  
    }
    public int getWins(){
      return Wins;  
    }
    public int getLose(){
      return Lose;  
    }
    public int getHitsCount(){
      return HitsCount;  
    }
    public int getHoldsCount(){
      return HoldsCount;  
    }
    public int getDoubleCount(){
      return DoubleCount;  
    }
    public int getExp(){
      return exp;  
    }
    public int getRequirement(){
        return requirement;
    }
    public int getLevel(){
        return level;
    }
    public void varReset(){
    CardIndex = 0;
    Status = "Ready";
    img = 0;
    sum = 0;
    x = 0;
    }
    public void addx(){
        x += 15;
    }
    public void imgadd(){
        img += 1;
    }
    public String getCard(){
        String cardpath;
        cardpath = Card[img][3];
        return cardpath;
    }
    public void addexp(int expgained){
        exp += expgained  ;
        if (exp >= requirement){
            Money += level * 1000;
            exp -= requirement;
            if (exp == 0){
                exp += 1;
            }
            levelup();
            
        }
    }
    public void levelup(){
        Authentication auth = new Authentication();
        level++;
        requirement = requirement + (int) (requirement * 0.5);
        if(Username.equalsIgnoreCase(auth.Informations[0][2])){
            Dialog levelup = new Dialog();
            levelup.setVisible(true);
        }
        
    }
    
    public void notbj(){
        char a = Card[0][0].charAt(0);
        char b = Card[1][0].charAt(0);
        String x = Character.toString(a);
        String z = Character.toString(b);
        if (z.equalsIgnoreCase("A")){
            Card[0][1] = "1";
        }
    }
    public void logerup(){
        loger--;
        if (loger == 0){
            loger = 9;
        }
        
    }
  
    
}
