/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagementsystem;

/**
 *
 * @author Janidu
 */
public class StudentCollection {
    static Students [] studentsArray = new Students[]{

        new Students("PR24105001","199501012345","Gunawardena Weerasinghe",85,66),
        new Students("PR24105002","199503153872","Senanayake Silva",39,45),
        new Students("PR24106003","199506202198","Silva Kumara",-1,93),
        new Students("PR24106004","199509102983","Kumara Herath",72,58),
    };
    public static double makeGpaValue(Students student) {

        double prfGpa = 0;
        double dbmsGpa = 0;

        int prfMarks = student.getPrfMarks();
        int dbmsMarks = student.getDbmsMarks();

        if (prfMarks == -1 || prfMarks == -2) {
            prfGpa = 0;
        } else if (prfMarks >= 90) {
            prfGpa = 4.25;
        } else if (prfMarks >= 80) {
            prfGpa = 4.00;
        } else if (prfMarks >= 75) {
            prfGpa = 3.70;
        } else if (prfMarks >= 70) {
            prfGpa = 3.30;
        } else if (prfMarks >= 65) {
            prfGpa = 3.00;
        } else if (prfMarks >= 60) {
            prfGpa = 2.70;
        } else if (prfMarks >= 55) {
            prfGpa = 2.30;
        } else if (prfMarks >= 50) {
            prfGpa = 2.00;
        } else if (prfMarks >= 45) {
            prfGpa = 1.70;
        } else if (prfMarks >= 40) {
            prfGpa = 1.30;
        } else if (prfMarks >= 30) {
            prfGpa = 1.00;
        } else if (prfMarks >= 20) {
            prfGpa = 0.70;
        }

        if (dbmsMarks == -1 || dbmsMarks == -2) {
            dbmsGpa = 0;
        } else if (dbmsMarks >= 90) {
            dbmsGpa = 4.25;
        } else if (dbmsMarks >= 80) {
            dbmsGpa = 4.00;
        } else if (dbmsMarks >= 75) {
            dbmsGpa = 3.70;
        } else if (dbmsMarks >= 70) {
            dbmsGpa = 3.30;
        } else if (dbmsMarks >= 65) {
            dbmsGpa = 3.00;
        } else if (dbmsMarks >= 60) {
            dbmsGpa = 2.70;
        } else if (dbmsMarks >= 55) {
            dbmsGpa = 2.30;
        } else if (dbmsMarks >= 50) {
            dbmsGpa = 2.00;
        } else if (dbmsMarks >= 45) {
            dbmsGpa = 1.70;
        } else if (dbmsMarks >= 40) {
            dbmsGpa = 1.30;
        } else if (dbmsMarks >= 30) {
            dbmsGpa = 1.00;
        } else if (dbmsMarks >= 20) {
            dbmsGpa = 0.70;
        }

        return (prfGpa + dbmsGpa) / 2;
    }
    
}
