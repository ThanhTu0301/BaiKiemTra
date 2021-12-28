/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.baitaplon.helpers;

import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author KimAnh
 */
public class DataValidator {
    public static void validateEmpty(JTextField field, StringBuilder sb, String errorMessage) {
       if (field.getText().equals("")) {
           sb.append(errorMessage).append("\n");
           field.setBackground(Color.red);
           field.requestFocus();
       } 
       else {
           field.setBackground(Color.white);
       }
    }
    public static void validateEmpty(JPasswordField field, StringBuilder sb, String errorMessage) {
        String passsword = new String(field.getPassword());
        if (passsword.equals("")) {
           sb.append(errorMessage).append("\n");
           field.setBackground(Color.red);
           field.requestFocus();
       } 
       else {
           field.setBackground(Color.white);
       }
    }
}
