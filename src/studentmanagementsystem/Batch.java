/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagementsystem;

/**
 *
 * @author Janidu
 */
public class Batch {
    
    private int batchNum;
    private int batchStatus;
	
    public  Batch(int batchNum,int batchStatus){
            this.batchNum = batchNum;
            this.batchStatus = batchStatus;
    }

    public int getBatchNum(){
            return batchNum;
    }

    public int getBatchStatus(){
            return batchStatus;
    }
}
