/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import model.GiaoVien;
import model.MonHoc;
import model.Student;


public class Information {
    public static void main(String[] args) {
        GiaoVien giaoVien1 = new GiaoVien("25", "Ho Thi Huong", "0329417534", "Nghe An");
        System.out.println(giaoVien1.toString());
        Student student1 = new Student("20", "Truong Tran Cuong", "0387151283", "Hoa Lac", "Nam");
        System.out.println(student1.toString());
        MonHoc monHoc1 = new MonHoc("192", "PRO192");
        System.out.println(monHoc1.toString());
        System.out.println("Sửa Thông Tin Giáo Viên");
        giaoVien1.setNameGV("Truong Thi Linh");
        System.out.println(giaoVien1.toString());
        
    }
    
}
