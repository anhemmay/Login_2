/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;
public class UserDB {

    public static long insert(User user, String path) throws IOException, FileNotFoundException{
        String res = user.getUsername()+ "|" + user.getPassword();
        File f = new File(path);
        FileWriter filewriter = new FileWriter(f, true);
        try(BufferedWriter bw = new BufferedWriter(filewriter)){
            bw.write(res);
            bw.write("\n");
        }
        return 0;
    }
    public boolean userExisted(String username,String password,String path){
        File f = new File(path);
        try{
            BufferedReader br = new BufferedReader(new FileReader(f));
            String line = "";
            while((line = br.readLine()) != null){
                String[] tmp = line.trim().split("\\|");
                if(tmp[0].equalsIgnoreCase(username) && tmp[1].equalsIgnoreCase(password)){
                    return true;
                }
            }
            br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
