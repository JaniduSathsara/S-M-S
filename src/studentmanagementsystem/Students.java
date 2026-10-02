/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagementsystem;

/**
 *
 * @author Janidu
 */
public class Students {
    String studentId;
    private String stuNic;
    private String StuName;
    private int dbmsMarks;
    private int prfMarks;

    public Students(String studentId,String stuNic,String StuName,int dbmsMarks,int prfMarks){
        this.studentId = studentId;
        this.stuNic = stuNic;
        this.StuName = StuName;
        this.dbmsMarks = dbmsMarks;
        this.prfMarks = prfMarks;
    }

    Students(String id, String name) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public String getStudentId() {
        return studentId;
    }
    public String getStuNic(){
		return stuNic;
	}
    public String getStuName() {
        return StuName;
    }
    public int getDbmsMarks() {
        return dbmsMarks;
    }
    public int getPrfMarks() {
        return prfMarks;
    } 

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public void setStuNic(String stuNic){
        this.stuNic = stuNic;
    }
    public void setStuName(String StuName) {
        this.StuName = StuName;
    }
    public void setDbmsMarks(int dbmsMarks) {
        this.dbmsMarks = dbmsMarks;
    }
    public void setPrfMarks(int prfMarks) {
        this.prfMarks = prfMarks;
    }
    
}