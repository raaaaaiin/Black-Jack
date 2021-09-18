/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casino;

import static Casino.Authentication.Informations;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Filmosh
 */
public class BlackJackFunction extends MyCasino {
int ze;
    static int index = 0;
    static String[][] DoC = new String[52][5];
    static String[][] SDoC = new String[52][5];
    Card[] a = new Card[50];
    int loger;

    public void reset(Players z) {
        for (int i = 0; i <= z.Card.length - 1; i++) {
            for (int k = 0; k <= z.Card[0].length - 1; k++) {
                z.Card[i][k] = null;
            }
        }
        z.varReset();
    }

    public void Phase1(Players z, javax.swing.JLabel a, javax.swing.JLabel b, javax.swing.JPanel c, String imgpath,String difficulty/*, javax.swing.JPanel e*/) {
        
        if (difficulty.equalsIgnoreCase("Easy")){
            ze = 18;
        }else if (difficulty.equalsIgnoreCase("Normal")){
            ze = 17;
        } else if (difficulty.equalsIgnoreCase("Hard")){
            ze = 15;
        }
        BlackJack func = new BlackJack();
        int bet = func.getBet(z);
        int Cardsum = func.getraw(z);
        CheckBust(z, Cardsum);
        z.addexp(10);
        b.setText(z.Status);
        String Status = func.getStatus(z);
        if (Status.equalsIgnoreCase("Ready")) {
            if (z.awareness == true) {
                if (Status.equalsIgnoreCase("Busted")) {
                    z.awareness = false;
                } else if (Status.equalsIgnoreCase("BlackJack")) {
                } else if (Status.equalsIgnoreCase("Hold")) {
                } else if (Status.equalsIgnoreCase("Ready")) {
                    Hits(z);
                    Card asd = new Card(c);
                    asd.DrawImage(z.x, 0, z.getCard());
                    Cardsum = func.getraw(z);
                    CheckBust(z, Cardsum);
                    z.addexp(10);
                    a.setText(String.valueOf(func.getrawSum(z)));
                    b.setText(z.Status);
                    if (func.getrawSum(z) > 21) {
                        z.awareness = false;
                    }
                    func.callupindex(z);
                }
            } else if (z.awareness == false) {

                if (Status.equalsIgnoreCase("Busted")) {
                    a.setText(String.valueOf(func.getrawSum(z)));
                    b.setText(z.Status);
                    b.setText("Busted!");
                } else if (Status.equalsIgnoreCase("BlackJack")) {
                    a.setText(String.valueOf(func.getrawSum(z)));
                    b.setText(z.Status);
                } else if (Status.equalsIgnoreCase("Hold")) {

                    b.setText(z.Status);
                } else if (Status.equalsIgnoreCase("Ready")) {
                    if (Cardsum >= ze) {
                        z.Status = "Hold";

                        b.setText(z.Status);
                    } else {
                        if (z.Username.equalsIgnoreCase("Dealer")) {
                            Hits(z);
                            Card asd = new Card(c);
                            asd.DrawImage(z.x, 0, "back.jpg");
                            CheckBust(z, Cardsum);
                            z.addexp(10);
                            a.setText(String.valueOf(func.getrawSum(z)));
                            b.setText(z.Status);
                            func.callupindex(z);
                        } else {
                            Hits(z);
                            Card asd = new Card(c);
                            asd.DrawImage(z.x, 0, z.getCard());
                            CheckBust(z, Cardsum);
                            z.addexp(10);
                            a.setText(String.valueOf(func.getrawSum(z)));
                            b.setText(z.Status);
                            func.callupindex(z);
                        }

                    }
                }
            }

        }
        Cardsum = func.getraw(z);
        CheckBust(z, Cardsum);
        b.setText(z.Status);

    }

    public void CheckBust(Players z, int Cardval) {

        if (Cardval > 21) {
            z.Status = "Busted";
            z.Busted += 1;
            System.out.println(z.Username + "is Busted!");

        }

    }

    public void Hits(Players z) {
        char b = SDoC[index][0].charAt(0);
        String x = Character.toString(b);
        if (index == 51) {
            shuffle();
            index = 0;
        } else {

        }
        if (z.Status.equalsIgnoreCase("Ready")) {
            if (x.equalsIgnoreCase("A")) {
                SDoC[index][1] = "1";
            } else {

            }

        } else {

        }
        if (z.Status.equalsIgnoreCase("BlackJack")) {

        }
        z.HitsCount += 1;
        z.Card[z.CardIndex][0] = SDoC[index][0];//whole card
        z.Card[z.CardIndex][1] = SDoC[index][1];//value
        z.Card[z.CardIndex][2] = SDoC[index][2];//suites
        z.Card[z.CardIndex][3] = SDoC[index][3];//image src  
        //Card[] a = new Card[5] a.Card(f) a.z.position,imgsrc,50,50 = y,x arra
        index++;

    }

    public void read_deck_from_txt() {
        Authentication auth = new Authentication();
        try {
            FileReader in = new FileReader(auth.Directory.toString() + "\\Deck of Cards.txt");
            BufferedReader br = new BufferedReader(in);
            String s = "";
            int i = 0;
            while ((s = br.readLine()) != null) {
                DoC[i][0] = s;
                //Check Value
                char a = DoC[i][0].charAt(0);
                char b = DoC[i][0].charAt(1);
                String x = Character.toString(a);
                String y = Character.toString(b);
                if (x.equalsIgnoreCase("K") || x.equalsIgnoreCase("J") || x.equalsIgnoreCase("Q") || y.equalsIgnoreCase("0")) {
                    DoC[i][1] = "10";
                } else if (x.equalsIgnoreCase("A")) {
                    DoC[i][1] = "11";
                } else {
                    DoC[i][1] = x;
                }
                //get the suits
                DoC[i][2] = DoC[i][0].substring(DoC[i][0].lastIndexOf("of") + 3);
                //get img source
                DoC[i][3] = "image_" + i + ".jpg";
                DoC[i][4] = "0";
                i++;

            }
            in.close();
        } catch (Exception ex) {

        }

    }

    public void shuffle() {

        if (SDoC[0][0] == (null)) {
            read_deck_from_txt();
            index = 0;
            int counter = 0;
            String stopper = "Go";
            while (stopper.equalsIgnoreCase("Go")) {
                int randomnumber = (int) (Math.round(Math.random() * 51));
                try {
                    if (DoC[randomnumber][4].equalsIgnoreCase("0")) {
                        SDoC[counter][0] = DoC[randomnumber][0];
                        SDoC[counter][1] = DoC[randomnumber][1];
                        SDoC[counter][2] = DoC[randomnumber][2];
                        SDoC[counter][3] = DoC[randomnumber][3];
                        DoC[randomnumber][4] = "0";
                        counter++;

                    } else {
                    }

                } catch (Exception Ex) {
                    System.out.println("Rotation of : " + counter);
                    System.out.println("Caused by : " + Ex.toString());
                    stopper = "Stop";
                }

            }

        }

    }

    public void Winner(Players a, Players e) {

        if (e.Status.equalsIgnoreCase("Busted")) {
            if (a.Status.equalsIgnoreCase("Busted")) {
                a.Money -= a.Bet;
                e.Money += a.Bet;
                a.Status = "LOSER";
                a.Logs[a.loger] = "Lose : " + String.valueOf(a.sum) + "/" + String.valueOf(e.sum) + "(" + a.Username + " is busted!)";
                a.Lose++;
                a.logerup();
                a.addexp(15);
            } else {
                a.Money += a.Bet;
                e.Money -= a.Bet;
                a.Status = "WINNER";
                a.Logs[a.loger] = "Win : " + String.valueOf(a.sum) + "/" + String.valueOf(e.sum) + "(Dealer is busted!)";
                a.logerup();
                a.Wins++;
                a.addexp(30);
            }
        } else {
            if (a.Status.equalsIgnoreCase("Hold")) {
                if (a.sum > e.sum) {
                    a.Money += a.Bet;
                    e.Money -= a.Bet;
                    a.Status = "WINNER";
                    a.Logs[a.loger] = "Win : " + String.valueOf(a.sum) + "/" + String.valueOf(e.sum) + "(" + a.Username + " VS " + "Dealer)";
                    a.logerup();
                    a.Wins++;
                    a.addexp(35);
                } else if (a.sum < e.sum) {
                    a.Money -= a.Bet;
                    e.Money += a.Bet;
                    a.Status = "LOSER";
                    a.Logs[a.loger] = "Lose : " + String.valueOf(a.sum) + "/" + String.valueOf(e.sum) + "(" + a.Username + " VS " + "Dealer)";
                            //String.valueOf(a.sum) + "Has lose with Dealer card : " + String.valueOf(e.sum);
                    a.logerup();
                    a.Lose++;
                    a.addexp(15);
                } else if (a.sum == e.sum) {
                    a.Money = a.Money;
                    a.Status = "DRAW";
                    a.Logs[a.loger] = String.valueOf(a.sum) + "Has Draw with Dealer card : " + String.valueOf(e.sum);
                    a.logerup();
                    a.addexp(10);

                }

            } else if (a.Status.equalsIgnoreCase("Busted")) {
                a.Money -= a.Bet;
                e.Money += a.Bet;
                a.Status = "LOSER";
                a.Logs[a.loger] = "Lose : " + String.valueOf(a.sum) + "/" + String.valueOf(e.sum) + "(" + a.Username + " is busted!)";
                a.logerup();        
                a.addexp(5);
            }
        }

    }

    public void Hold(Players z) {
        z.Status = "Hold";

    }

    public int AiBetEasy() {
        int Randombet = 0;
        int chance = (int) (Math.round(Math.random() * 100));;

        if (chance < 25) {
            Randombet = 100;
        } else if (chance < 50) {
            Randombet = 500;
        } else if (chance < 75) {
            Randombet = 750;
        } else if (chance < 100) {
            Randombet = 1500;
        }
        return Randombet;
    }

    public int AiBetNormal() {
        int Randombet = 0;
        int chance = (int) (Math.round(Math.random() * 100));;

        if (chance < 25) {
            Randombet = 1000;
        } else if (chance < 50) {
            Randombet = 1500;
        } else if (chance < 75) {
            Randombet = 5000;
        } else if (chance < 100) {
            Randombet = 10000;
        }
        return Randombet;
    }

    public int AiBetHard() {
        int Randombet = 0;
        int chance = (int) (Math.round(Math.random() * 100));;

        if (chance < 25) {
            Randombet = 12500;
        } else if (chance < 50) {
            Randombet = 15000;
        } else if (chance < 75) {
            Randombet = 20000;
        } else if (chance < 100) {
            Randombet = 40000;
        }
        return Randombet;
    }

    public String CheckBlackJack(Players z) {
        BlackJack func = new BlackJack();
        if (z.sum == 21) {
            z.Status = "Winner";
        }
        return (z.Username);
    }

    public void setSum(javax.swing.JLabel a){
        int x,y;
        BlackJack func = new BlackJack();
        x = a.getLocation().x;
        y = a.getLocation().y;
        a.setLocation(x + 50,y);
       
    }
}
