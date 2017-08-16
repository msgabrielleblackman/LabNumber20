package com.guenther.spring2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

@Controller
public class HomeController {

    @RequestMapping(value = "getAllItems")
    public ModelAndView getAllItems() {
        System.out.println("Entering getAllItems");
//define data for thr connection
        String dbAddress = "jdbc:mysql://localhost:3306/coffeeshopdb";
        String username = "root";
        String password = "LetMeIn";
        // load driver
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //

            //create the .db connection object
            Connection mysqlConnection;
            mysqlConnection = DriverManager.getConnection(dbAddress, username, password);

            //create db statement

            String readCustomersCommand = "select name , description, quantity, price FROM items";

            //creates the statement

            Statement readCustomers = mysqlConnection.createStatement();// creates the statement

            readCustomers.executeQuery(readCustomersCommand); //Executes the statement

            ResultSet results = readCustomers.executeQuery(readCustomersCommand);//executes the statement

            //arraylist of customers
            ArrayList<items> customerList = new ArrayList<items>();


            //map from the ResultSet to the ArrayList
            while (results.next()) {
                items temp = new items(results.getString(1), results.getString(2),
                        results.getString(3), results.getFloat(4));
                customerList.add(temp);
            }

            return new ModelAndView("customerView", "cList", customerList);



        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null; // todo: create an error page with custom error messages !!!!
    }

    @RequestMapping("/")
    public ModelAndView helloWorld() {
        ModelAndView mv = new
                ModelAndView("welcome");
        mv.addObject("message", "Choose One of Our Delicious Coffee Selections!!!");
        mv.addObject("bob", "Please fill the form to register!");
        mv.addObject("title", "Welcome to Grand Circus Coffee Shop!!!");
        return mv;
    }

    @RequestMapping("/userform")
    public ModelAndView userform() {
        return new ModelAndView("form", "inst",
                "Please enter info: ");
    }

    @RequestMapping("/formhandler")
    public ModelAndView formhandler(
            @RequestParam("firstname") String firstname,
            @RequestParam("lastname") String lastname,
            @RequestParam("email") String email,
            @RequestParam("phonenumber") String phonenumber,
            @RequestParam("password") String password
    ) {

        //here's where the magic happens

        ModelAndView mv = new ModelAndView("formresponse");
        mv.addObject("firstname", firstname);
        mv.addObject("lastname", lastname);
        mv.addObject("email", email);
        mv.addObject("phonenumber", phonenumber);
        mv.addObject("password", password);
        return mv;
    }
}