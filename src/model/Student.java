/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class Student {
    String idS;
    String nameS;
    String phoneNumberS;
    String addressS;
    String gioiTinhS;

    public Student(String idS, String nameS, String phoneNumberS, String addressS, String gioiTinhS) {
        this.idS = idS;
        this.nameS = nameS;
        this.phoneNumberS = phoneNumberS;
        this.addressS = addressS;
        this.gioiTinhS = gioiTinhS;
    }

    public String getIdS() {
        return idS;
    }

    public void setIdS(String idS) {
        this.idS = idS;
    }

    public String getNameS() {
        return nameS;
    }

    public void setNameS(String nameS) {
        this.nameS = nameS;
    }

    public String getPhoneNumberS() {
        return phoneNumberS;
    }

    public void setPhoneNumberS(String phoneNumberS) {
        this.phoneNumberS = phoneNumberS;
    }

    public String getAddressS() {
        return addressS;
    }

    public void setAddressS(String addressS) {
        this.addressS = addressS;
    }

    public String getGioiTinhS() {
        return gioiTinhS;
    }

    public void setGioiTinhS(String gioiTinhS) {
        this.gioiTinhS = gioiTinhS;
    }
    public String toString(){
        return "Student[id: "+idS+"/ Họ và tên: "+nameS+"/ Số Điện Thoại: "+phoneNumberS+"/ Địa Chỉ: "+addressS+"/ Giới Tính: "+gioiTinhS+"]";
    }

 
    
}
