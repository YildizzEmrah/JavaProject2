/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emrahyildiz;

/**
 *
 * @author emrah
 */
public class Person extends Friends{
 private String Name;
 private Integer HitCount;
 public  Friends FriendList;

 public Person(String n){
 Name = n;
 HitCount = 0;
 FriendList = null;
 HitCount++;
 }

  
 public void ContentOut(){
 System.out.println("Name :" + Name);
 System.out.println("Hitcount " + HitCount);
 }
 public void SetName(String nName){
 Name = nName;
 }
 public void IncreaseHit(){
 HitCount++;
 }
 public String GetName(){
 return Name;
 }
 public Integer GetHitCount(){
 return HitCount;
 }

    public void setHitCount(Integer HitCount) {
        this.HitCount = HitCount;
    }
} 