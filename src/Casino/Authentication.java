/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casino;

/**
 *
 * @author Reyn
 */
import java.util.Scanner;
import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
import static java.nio.file.AccessMode.*;
import java.math.*;
import java.nio.charset.*;
import javax.swing.JOptionPane;
import javax.xml.bind.DatatypeConverter;

public class Authentication extends MyCasino {

    static String Informations[][] = new String[5][50];

    static boolean passwordauth = false;
    static boolean fidauth = false;
    static public Path Directory;
    //convert to hexadecimal

    public static String toHexadecimal(String text) throws UnsupportedEncodingException {
        byte[] myBytes = text.getBytes("UTF-8");

        return DatatypeConverter.printHexBinary(myBytes);
    }

    public static String hexToAscii(String hexStr) {
        StringBuilder output = new StringBuilder("");

        for (int i = 0; i < hexStr.length(); i += 2) {
            String str = hexStr.substring(i, i + 2);
            output.append((char) Integer.parseInt(str, 16));
        }

        return output.toString();
    }

    //verifies if passwordauth and fidauth is success if succes then login success
    public boolean auth() {
        boolean access = false;
        if (fidauth == true && passwordauth == true) {
            access = true;
        } else {

            access = false;
        }
        return access;
    }

    //this get the current data of user (must be execute once) 
    //reads the data from notepad to array
    public void getData(String fid) {
        try {
            FileReader in = new FileReader(Directory.toString() + "\\" + fid + ".txt");
            BufferedReader br = new BufferedReader(in);
            JOptionPane.showMessageDialog(null,in.toString());
            int i = 0;
            int player = 0;
            String s = "";
            String ans = "";
            while ((s = br.readLine()) != null) {
                String a = (hexToAscii(s));
                ans = a.substring(a.lastIndexOf(":") + 2);
                if (ans.equalsIgnoreCase("next")) {
                    i = 0;
                    player++;

                } else {
                    Informations[player][i] = ans;
                    System.out.println(ans);
                    i++;
                }

            }
            in.close();
        } catch (Exception ex) {
            System.out.println("Card Shuffled");

        }

    }

    // update done this updates the current info of the player 
    //should be execute every round (in every action to be specific)
    public void update(Players z, Players a, Players b, Players c, Players d) {

        try {
            String nl = System.getProperty("line.separator");
            Path file = Paths.get(Directory.toString() + "\\" + z.getfid() + ".txt");
            String s
                    = toHexadecimal("fid: " + z.getfid()) + nl + toHexadecimal("Password: " + z.getPassword()) + nl
                    + toHexadecimal("Username: " + z.getUsername()) + nl + toHexadecimal("Money: " + z.getMoney()) + nl
                    + toHexadecimal("Rounds: " + z.getRounds()) + nl
                    + toHexadecimal("Busted: " + z.getBusted()) + nl + toHexadecimal("Wins: " + z.getWins()) + nl
                    + toHexadecimal("Lose: " + z.getLose()) + nl + toHexadecimal("HitsCount: " + z.getHitsCount()) + nl
                    + toHexadecimal("HoldsCount: " + z.getHitsCount()) + nl + toHexadecimal("DoubleCount: " + z.getDoubleCount()) + nl
                    + toHexadecimal("Level: " + z.getLevel()) + nl
                    + toHexadecimal("Requirement: " + z.getRequirement()) + nl + toHexadecimal("Exp: " + z.getExp()) + nl
                    + toHexadecimal("Game Speed: " + z.GameSpeed) + nl + toHexadecimal(": " + "next") + nl
                    //Bot 0
                    + toHexadecimal("Username: " + a.getUsername()) + nl + toHexadecimal("Money: " + a.getMoney()) + nl
                    + toHexadecimal("Rounds: " + a.getRounds()) + nl
                    + toHexadecimal("Busted: " + a.getBusted()) + nl + toHexadecimal("Wins: " + a.getWins()) + nl
                    + toHexadecimal("Lose: " + a.getLose()) + nl + toHexadecimal("HitsCount: " + a.getHitsCount()) + nl
                    + toHexadecimal("HoldsCount: " + a.getHitsCount()) + nl + toHexadecimal("DoubleCount: " + a.getDoubleCount()) + nl
                    + toHexadecimal("Level: " + a.getLevel()) + nl
                    + toHexadecimal("Requirement: " + a.getRequirement()) + nl + toHexadecimal("Exp: " + a.getExp()) + nl
                    + toHexadecimal(": " + "next") + nl
                    + //Bot 1
                    toHexadecimal("Username: " + b.getUsername()) + nl + toHexadecimal("Money: " + b.getMoney()) + nl
                    + toHexadecimal("Rounds: " + b.getRounds()) + nl
                    + toHexadecimal("Busted: " + b.getBusted()) + nl + toHexadecimal("Wins: " + b.getWins()) + nl
                    + toHexadecimal("Lose: " + b.getLose()) + nl + toHexadecimal("HitsCount: " + b.getHitsCount()) + nl
                    + toHexadecimal("HoldsCount: " + b.getHitsCount()) + nl + toHexadecimal("DoubleCount: " + b.getDoubleCount()) + nl
                    + toHexadecimal("Level: " + b.getLevel()) + nl
                    + toHexadecimal("Requirement: " + b.getRequirement()) + nl + toHexadecimal("Exp: " + b.getExp()) + nl
                    + toHexadecimal(": " + "next") + nl
                    + //Bot 2
                    toHexadecimal("Username: " + c.getUsername()) + nl + toHexadecimal("Money: " + c.getMoney()) + nl
                    + toHexadecimal("Rounds: " + c.getRounds()) + nl
                    + toHexadecimal("Busted: " + c.getBusted()) + nl + toHexadecimal("Wins: " + c.getWins()) + nl
                    + toHexadecimal("Lose: " + c.getLose()) + nl + toHexadecimal("HitsCount: " + c.getHitsCount()) + nl
                    + toHexadecimal("HoldsCount: " + z.getHitsCount()) + nl + toHexadecimal("DoubleCount: " + c.getDoubleCount()) + nl
                    + toHexadecimal("Level: " + c.getLevel()) + nl
                    + toHexadecimal("Requirement: " + c.getRequirement()) + nl + toHexadecimal("Exp: " + c.getExp()) + nl
                    + toHexadecimal(": " + "next") + nl
                    + //Bot 3
                    toHexadecimal("Username: " + d.getUsername()) + nl + toHexadecimal("Money: " + d.getMoney()) + nl
                    + toHexadecimal("Rounds: " + d.getRounds()) + nl
                    + toHexadecimal("Busted: " + d.getBusted()) + nl + toHexadecimal("Wins: " + d.getWins()) + nl
                    + toHexadecimal("Lose: " + d.getLose()) + nl + toHexadecimal("HitsCount: " + d.getHitsCount()) + nl
                    + toHexadecimal("HoldsCount: " + d.getHitsCount()) + nl + toHexadecimal("DoubleCount: " + d.getDoubleCount());

            byte[] data = s.getBytes(StandardCharsets.UTF_8);
            OutputStream output = null;
            try {
                output = new BufferedOutputStream(Files.newOutputStream(file, TRUNCATE_EXISTING));
                output.write(data);
                output.flush();
                output.close();
            } catch (Exception e) {
                System.out.println("Alert: " + e.toString());
            }
        } catch (Exception ex) {

        }

    }

    //It checks an existing files to avoid overlapping files
    //check if textfile already exist
    public Boolean checkexisting(String fid) {
        Boolean com = false;
        try {
            Path filePath = Paths.get(Directory.toString() + "\\" + fid + ".txt");
            try {
                //exist
                filePath.getFileSystem().provider().checkAccess(filePath, EXECUTE);

                fidauth = true;
                com = true;
            } catch (Exception ex) {
                com = false;
                fidauth = false;

            }

        } catch (Exception ex) {
            com = false;
            fidauth = false;

        }
        return com;

    }

    //register the record of file name, file content(fid and password)
    public boolean register(int fid, String Password, String Username) {
        boolean reg;
        try {
            Informations[0][0] = Integer.toString(fid);
            Informations[0][1] = " " + Password;
            Informations[0][2] = " " + Username;
            CreateReg(Informations[0][0], Informations[0][1], Informations[0][2]);
            reg = true;

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex.toString());
            reg = false;
        }
        return reg;

    }

    // creates a new file for new player
    //creates a new text file
    public void CreateReg(String fid, String Password, String Username) {
        try {
            JOptionPane.showMessageDialog(null,"e?");
            String nl = System.getProperty("line.separator");
            Path file = Paths.get(Directory.toString() + "\\" + fid + ".txt");
            JOptionPane.showMessageDialog(null,file.toString());
            String s
                    = toHexadecimal("fid: " + fid) + nl + toHexadecimal("Password:" + Password) + nl + toHexadecimal("Username:" + Username) + nl + toHexadecimal("Type: New");
            byte[] data = s.getBytes(StandardCharsets.UTF_8);
            OutputStream output = null;
            try {
                output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
                output.write(data);
                output.flush();
                output.close();
                System.out.println("Created successfuly");
            } catch (Exception e) {
               JOptionPane.showMessageDialog(null,e.toString());
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex.toString());
        }

    }

    //verifies the password 
    public boolean login(String fid, String Password) {
        getData(fid);
        
        if (Informations[0][1].equals(Password)) {
            passwordauth = true;
        }
        return passwordauth;
    }

    public void showData() {
        for (int i = 0; i < 12; i++) {
            System.out.println("First: " + Informations[0][i]);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Dealer: " + Informations[1][i]);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("one: " + Informations[2][i]);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("two: " + Informations[3][i]);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("three: " + Informations[4][i]);
        }
    }

    //set ups the directory
    

    public void Createfile() {
        try {
            String fileName;
            fileName = "MyCasino.jar";
            Path inputPath = Paths.get(fileName);
            Path fullPath = inputPath.toAbsolutePath();
            JOptionPane.showMessageDialog(null, fullPath.toString());
            Path CreatePath = Paths.get(fullPath.toString().substring(0,fullPath.toString().lastIndexOf( '\\' )));
            JOptionPane.showMessageDialog(null,CreatePath.toString());
            new File(CreatePath.toString()+ "\\Dir").mkdir();
            Directory = Paths.get(CreatePath.toString()+ "\\Dir");
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"EXIST");
        }

    }
}
