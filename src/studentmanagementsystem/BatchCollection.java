/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagementsystem;

/**
 *
 * @author Janidu
 */
public class BatchCollection {
    static Batch [] batchArray = new Batch[]{
        new Batch(106, 0),
        new Batch(107, 0),
        new Batch(108, 0),
        new Batch(109, 1),
        new Batch(110, 1)
    };
    
    public static void extendBatchArray() {
        Batch [] tempBatchArray = new Batch[BatchCollection.batchArray.length+1];
        for (int i = 0; i < BatchCollection.batchArray.length; i++) {
            tempBatchArray[i] = BatchCollection.batchArray[i];
        }
        BatchCollection.batchArray = tempBatchArray;
    }  
}
