/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Bill;
import Model.Customer;
import Model.Staff;
import java.util.ArrayList;
import lib.XFile;

/**
 *
 * @author Hp
 */
public class Controller {

    public ArrayList<Staff> staffList;
    public ArrayList<String> calendarList;
    public ArrayList<Customer> customersList;
    public ArrayList<Bill> billList;
    
    public String filePath = "";
    public String fileCanlendar = "";
    public String fileCustomers = "";
    public String fileBill = "";
    
    public boolean file;
    public boolean isCalendar;
    public boolean isCustomers;
    public boolean isBill;

    public Controller() {
        staffList = new ArrayList<>();
        calendarList = new ArrayList<>();
        customersList = new ArrayList<>();
        billList = new ArrayList<>();
        filePath = "./src/Data/staff.dat";
        fileCanlendar = "./src/Data/calendar.dat";
        fileCustomers = "./src/Data/customers.dat";
        fileBill = "./src/Data/bill.dat";
        file = loadFile();
        isCalendar = loadCalendar();
        isCustomers = loadCustomer();
        isBill = loadBill();
    }
    
    private boolean loadBill() {
        if (XFile.readObject(fileBill) == null) {
            return false;
        }
        billList = (ArrayList<Bill>) XFile.readObject(fileBill);
        return true;
    }
    
     public void SaveBill(){
        XFile.writeObject(fileBill, billList);
    }
    
    private boolean loadCustomer() {
        if (XFile.readObject(fileCustomers) == null) {
            return false;
        }
        customersList = (ArrayList<Customer>) XFile.readObject(fileCustomers);
        return true;
    }
    
    public void SaveCustomer(){
        XFile.writeObject(fileCustomers, customersList);
    }

    private boolean loadCalendar() {
        if (XFile.readObject(fileCanlendar) == null) {
            return false;
        }
        calendarList = (ArrayList<String>) XFile.readObject(fileCanlendar);
        return true;
    }

    public void saveCalendar() {
        XFile.writeObject(fileCanlendar, calendarList);
    }

    private boolean loadFile() {
        if (XFile.readObject(filePath) == null) {
            return false;
        }
        staffList = (ArrayList<Staff>) XFile.readObject(filePath);
        return true;
    }

    public void saveFile() {
        XFile.writeObject(filePath, staffList);
    }
}
