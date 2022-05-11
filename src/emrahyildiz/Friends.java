/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emrahyildiz;

/**
 *
 * @author emrah
 */
public class Friends  {

 private String Name;

 private Friends next;
 
 private Friends next1;
 
 

 
    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the next
     */
    public Friends getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Friends next) {
        this.next = next;
    }

    /**
     * @return the next1
     */
    public Friends getNext1() {
        return next1;
    }

    /**
     * @param next1 the next1 to set
     */
    public void setNext1(Friends next1) {
        this.next1 = next1;
    }

   }