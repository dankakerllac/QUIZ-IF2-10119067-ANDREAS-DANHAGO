/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if2.pkg10119067.andreasdanhago;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *Nama  : Andreas Danhago P.I
 *Kelas : PBO2
 *NIM   : 10119067
 *Deskripsi Program : Quiz
 */
class Customer  extends ServicePrice implements CustomerInvoice{
    private String name;
    private String email;
    private boolean member;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    @Override
    public String currentTime() {
        String[]arrDays = {"Sabtu","Minggu","Senin","Selasa","Rabu","Kamis","Jumat"};

        Calendar calendar = Calendar.getInstance();
        int daysOfWeeks = calendar.get(Calendar.DAY_OF_WEEK); 

        DateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy HH:mm:ss");
        Date date = new Date();
        return arrDays[daysOfWeeks]+", "+dateFormat.format(date);
    }

    void setName(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}