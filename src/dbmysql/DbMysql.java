/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dbmysql;

import com.DatabaseCon.DB;
import com.form.LogIn;
import com.form.StudentForm;

/**
 *
 * @author kk
 */
public class DbMysql {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StudentForm stdForm = new StudentForm();
        stdForm.show();
        DB.loadConnection();    
    }
    
}
