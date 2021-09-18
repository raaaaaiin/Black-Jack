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
import java.util.Scanner;

public class BlackJack extends MyCasino {

    boolean GameInitialize;
    double Balance;
    boolean Loop = false;
    BlackJackFunction Func = new BlackJackFunction();
    static Players one = new Players();
    static Players two = new Players();
    static Players three = new Players();
    static Players four = new Players();
    static Players Dealer = new Players();
    boolean GameState;

    public void Initialize() {
        Authentication auth = new Authentication();
        
        /*
        fid: Pinfo[0]
        Password: Pinfo[1]
        Username: Pinfo[2]
        Money: Pinfo[3]
        Rounds: Pinfo[4]
        Busted: Pinfo[5]
        Wins: Pinfo[6]
        Lose: Pinfo[7]
        Hits count: Pinfo[7]
        Hold count: Pinfo[8]
        Double count: Pinfo[9]
         */

        //Reg.Welcome();
        if(auth.Informations[0][3].equalsIgnoreCase("New")){
            initialize_reg();
        }else{
            one.awareness = true;
        one.fid = Integer.parseInt(auth.Informations[0][0]);
        one.Password = auth.Informations[0][1];
        one.Username = auth.Informations[0][2];
        one.Money = (int) Double.parseDouble(auth.Informations[0][3]);
        one.Rounds = Integer.parseInt(auth.Informations[0][4]);
        one.Busted = Integer.parseInt(auth.Informations[0][5]);
        one.Wins = Integer.parseInt(auth.Informations[0][6]);
        one.Lose = Integer.parseInt(auth.Informations[0][7]);
        one.HitsCount = Integer.parseInt(auth.Informations[0][8]);
        one.HoldsCount = Integer.parseInt(auth.Informations[0][9]);
        one.DoubleCount = Integer.parseInt(auth.Informations[0][10]);
        
        one.level = 20;
        one.requirement = Integer.parseInt(auth.Informations[0][12]);
        one.exp = Integer.parseInt(auth.Informations[0][13]);
        one.GameSpeed = Integer.parseInt(auth.Informations[0][14]);
        two.Username = auth.Informations[1][0];
        two.Money = (int) Double.parseDouble(auth.Informations[1][1]);
        two.Rounds = Integer.parseInt(auth.Informations[1][2]);
        two.Busted = Integer.parseInt(auth.Informations[1][3]);
        two.Wins = Integer.parseInt(auth.Informations[1][4]);
        two.Lose = Integer.parseInt(auth.Informations[1][5]);
        two.HitsCount = Integer.parseInt(auth.Informations[1][6]);
        two.HoldsCount = Integer.parseInt(auth.Informations[1][7]);
        two.DoubleCount = Integer.parseInt(auth.Informations[1][8]);
        two.level = Integer.parseInt(auth.Informations[1][9]);
        two.requirement = Integer.parseInt(auth.Informations[1][10]);
        two.exp = Integer.parseInt(auth.Informations[1][11]);
        three.Username = auth.Informations[2][0];
        three.Money = (int) Double.parseDouble(auth.Informations[2][1]);
        three.Rounds = Integer.parseInt(auth.Informations[2][2]);
        three.Busted = Integer.parseInt(auth.Informations[2][3]);
        three.Wins = Integer.parseInt(auth.Informations[2][4]);
        three.Lose = Integer.parseInt(auth.Informations[2][5]);
        three.HitsCount = Integer.parseInt(auth.Informations[2][6]);
        three.HoldsCount = Integer.parseInt(auth.Informations[2][7]);
        three.DoubleCount = Integer.parseInt(auth.Informations[2][8]);
        three.level = Integer.parseInt(auth.Informations[2][9]);
        three.requirement = Integer.parseInt(auth.Informations[2][10]);
        three.exp = Integer.parseInt(auth.Informations[2][11]);
        four.Username = auth.Informations[3][0];
        four.Money = (int) Double.parseDouble(auth.Informations[3][1]);
        four.Rounds = Integer.parseInt(auth.Informations[3][2]);
        four.Busted = Integer.parseInt(auth.Informations[3][3]);
        four.Wins = Integer.parseInt(auth.Informations[3][4]);
        four.Lose = Integer.parseInt(auth.Informations[3][5]);
        four.HitsCount = Integer.parseInt(auth.Informations[3][6]);
        four.HoldsCount = Integer.parseInt(auth.Informations[3][7]);
        four.DoubleCount = Integer.parseInt(auth.Informations[3][8]);
       four.level = Integer.parseInt(auth.Informations[3][9]);
        four.requirement = Integer.parseInt(auth.Informations[3][10]);
       four.exp = Integer.parseInt(auth.Informations[3][11]);
        Dealer.Username = auth.Informations[4][0];
        Dealer.Money = (int) Double.parseDouble(auth.Informations[4][1]);
        Dealer.Rounds = Integer.parseInt(auth.Informations[4][2]);
        Dealer.Busted = Integer.parseInt(auth.Informations[4][3]);
        Dealer.Wins = Integer.parseInt(auth.Informations[4][4]);
        Dealer.Lose = Integer.parseInt(auth.Informations[4][5]);
        Dealer.HitsCount = Integer.parseInt(auth.Informations[4][6]);
        Dealer.HoldsCount = Integer.parseInt(auth.Informations[4][7]);
        Dealer.DoubleCount = Integer.parseInt(auth.Informations[4][8]);
        }
        
    }
    public void initialize_reg(){
        Authentication auth = new Authentication();
        one.awareness = true;
        one.fid = Integer.parseInt(auth.Informations[0][0]);
        one.Password = auth.Informations[0][1];
        one.Username = auth.Informations[0][2];
        one.Money = 5000;
        one.Rounds = 0;
        one.Busted =0;
        one.Wins = 0;
        one.Lose = 0;
        one.HitsCount = 0;
        one.HoldsCount = 0;
        one.DoubleCount = 0;
        one.level = 0;
        one.requirement = 100;
        one.exp = 0;
        one.GameSpeed = 1000;
        Dealer.level = 10;
        Dealer.requirement = 5743;
        Dealer.exp = 1;
        two.Username = randomname();
        two.Money = randommoney();
        two.Rounds = 0;
        two.Busted = 0;
        two.Wins = 0;
        two.Lose = 0;
        two.HitsCount = 0;
        two.HoldsCount = 0;
        two.DoubleCount = 0;
        two.level = 0;
        two.requirement = 100;
        two.exp = 0;
        three.Username = randomname();
        three.Money = (int) randommoney();
        three.Rounds = 0;
        three.Busted = 0;
        three.Wins = 0;
        three.Lose = 0;
        three.HitsCount = 0;
        three.HoldsCount = 0;
        three.DoubleCount = 0;
        three.level = 0;
        three.requirement = 100;
        three.exp = 0;
        four.Username = randomname();
        four.Money =randommoney();
        four.Rounds =0;
        four.Wins =0;
        four.Lose =0;
        four.HitsCount =0;
        four.HoldsCount =0;
        four.DoubleCount =0;
        four.level = 0;
        four.requirement = 100;
        four.exp = 0;
        Dealer.Username = "Dealer"; 
        Dealer.Money = 500000;
        Dealer.Rounds = 0;
        Dealer.Busted = 0;
        Dealer.Wins = 0;
        Dealer.Lose = 0;
        Dealer.HitsCount =0;
        Dealer.HoldsCount = 0;
        Dealer.DoubleCount = 0;
        Dealer.level = 10;
        Dealer.requirement = 5743;
        Dealer.exp = 0;
    }
    public String getDraw(Players z, int i) {
        String a = z.ShowDrawCard(i);
        return a;

    }

    public String getImgsrc(Players z, int i) {
        String a = z.ShowImagesrc(i);
        return a;

    }

    public String getValue(Players z, int i) {
        String a = z.ShowValue(i);
        return a;

    }

    public String getSuites(Players z, int i) {
        String a = z.ShowSuites(i);
        return a;
    }

    public void callupindex(Players z) {
        z.addindex();
        z.addx();
        z.imgadd();
    }

    public int getIndex(Players z) {
        int i = z.CardIndex;
        return i;
    }

    public int getSum(Players z) {
        int i = z.sumCard();
        return i;
    }

    public String getStatus(Players z) {
        String stat = z.Status;
        return stat;
    }

    public int getBet(Players z) {
        int B = z.Bet;
        return B;
    }

    public int getrawSum(Players z) {
        z.getSum();
        int a = z.sum;
        return a;
    }

    public int getraw(Players z) {
        int a = z.sum;
        return a;
    }
    public int getDealerSum(Players z){
        int a = z.getDealersum();
        return a;
    }
    
    public String randomname(){
       int randomnumber = (int) (Math.round(Math.random() * 99));
       String randomname = null;
       if (randomnumber < 5){
           randomname = "Yetta";
       }else if (randomnumber < 10){
           randomname = "Sasha";
       }else if (randomnumber < 15){
           randomname = "Assunta";
       }else if (randomnumber < 20){
           randomname = "Kena";
       }else if (randomnumber < 25){
           randomname = "Ileana ";
       }else if (randomnumber < 30){
           randomname = "Hassie";
       }else if (randomnumber < 35){
           randomname = "Scarlet";
       }else if (randomnumber < 40){
           randomname = "Marybelle";
       }else if (randomnumber < 45){
           randomname = "Lillie";
       }else if (randomnumber < 50){
           randomname = "Ilse";
       }else if (randomnumber < 55){
           randomname = "Karole";
       }else if (randomnumber < 60){
           randomname = "Marion";
       }else if (randomnumber < 65){
           randomname = "Deon";
       }else if (randomnumber < 70){
           randomname = "Emilio";
       }else if (randomnumber < 75){
           randomname = "Samuel";
       }else if (randomnumber < 80){
           randomname = "Marcellus";
       }else if (randomnumber < 85){
           randomname = "Graham";
       }else if (randomnumber < 90){
           randomname = "Zeke";
       }else if (randomnumber < 95){
           randomname = "Kielle";
       }else if (randomnumber < 100){
           randomname = "Wilber";
       }
       return randomname;
    }
    public int randommoney(){
       int randomnumber = (int) (Math.round(Math.random() * 99));
       int randommoney = 0;
       if (randomnumber < 25){
           randommoney = 100000;
       }else if (randomnumber < 50){
           randommoney =75000;
       }else if (randomnumber < 75){
           randommoney = 50000;
       }else if (randomnumber < 100){
           randommoney = 125000;
       }
       return randommoney;
    }
}
