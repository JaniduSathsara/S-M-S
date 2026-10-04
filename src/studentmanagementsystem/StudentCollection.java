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
        new Students("PR24105003","199506202198","Silva Kumara",-1,93),
        new Students("PR24105004","199509102983","Kumara Herath",72,58),
        new Students("PR24105005","199511258739","Rathnayake Herath",44,-1),
        new Students("PR24105006","199512303498","Wijesinghe Bandara",91,37),
        new Students("PR24105007","199502183764","Rajapaksha Herath",60,88),
        new Students("PR24105008","199504223198","Senanayake Karunaratne",38,21),
        new Students("PR24105009","199508153210","Karunaratne Jayasinghe",95,79),
        new Students("PR24105010","199510293417","Gunawardena Silva",49,40),

        new Students("OR24105011","199601102375","Weerasinghe Rajapaksha",-1,76),
        new Students("OR24105012","199604182938","Silva Rathnayake",67,54),
        new Students("OR24105013","199606243879","Fernando Perera",23,-1),
        new Students("OR24105014","199608142178","Kumara Abeysekera",58,69),
        new Students("OR24105015","199610312475","Ekanayake Rathnayake",88,92),
        new Students("PR24105016","199611173452","Herath Gunawardena",81,25),
        new Students("PR24105017","199603293481","Abeysekera Silva",73,84),
        new Students("PR24105018","199605083217","Weerasinghe Silva",29,33),
        new Students("OR24105019","199607232198","Jayasinghe Dias",62,60),
        new Students("OR24105020","199609192375","Bandara Rathnayake",-1,71),
        new Students("PR24105021","199701212483","Silva Perera",79,59),
        new Students("PR24105022","199703132487","De Silva Dias",53,-1),
        new Students("OR24105023","199706253478","Abeysekera Jayasinghe",94,98),
        new Students("OR24105024","199708083298","Rajapaksha Senanayake",47,27),
        new Students("PR24105025","199710243651","Kumara Karunaratne",35,48),

        new Students("PR24106001","199712152983","Silva Abeysekera",93,35),
        new Students("PR24106002","199702182734","Jayasinghe Bandara",15,91),
        new Students("PR24106003","199704293187","Rathnayake Kumara",-1,60),
        new Students("PR24106004","199705142375","Weerasinghe Rajapaksha",82,-1),
        new Students("PR24106005","199709083751","Senanayake Herath",45,72),
        new Students("PR24106006","199801032874","Perera Ekanayake",88,49),
        new Students("PR24106007","199803232871","Herath Jayasinghe",23,26),
        new Students("PR24106008","199806193428","Kumara Gunawardena",79,80),
        new Students("PR24106009","199808013764","Abeysekera Silva",37,14),
        new Students("PR24106010","199810242374","Dias Fernando",-1,89),
        new Students("OR24106011","199812302984","Karunaratne Weerasinghe",68,67),
        new Students("OR24106012","199802152348","Ekanayake Bandara",100,-1),
        new Students("OR24106013","199805213471","Rajapaksha Kumara",59,31),
        new Students("OR24106014","199807172398","Silva De Silva",29,94),
        new Students("OR24106015","199811283472","Gunawardena Rathnayake",92,53),
        new Students("PR24106016","199901122471","Bandara Karunaratne",12,78),
        new Students("PR24106017","199903052984","Fernando Perera",77,5),
        new Students("PR24106018","199906213874","De Silva Silva",38,90),
        new Students("OR24106019","199908093412","Rajapaksha Gunawardena",66,24),
        new Students("OR24106020","199910273894","Herath Weerasinghe",9,86),
        new Students("PR24106021","199912153482","Karunaratne Dias",84,39),
        new Students("PR24106022","199902202394","Jayasinghe Silva",51,-1),
        new Students("OR24106023","199904163874","Senanayake Abeysekera",32,61),
        new Students("OR24106024","199907293481","Silva Jayasinghe",-1,73),
        new Students("PR24106025","199911083479","Rathnayake Kumara",97,100),

        new Students("PR24107001","200001112374","Gunawardena Kumara",95,38),
        new Students("PR24107002","200003143478","Rajapaksha Silva",-1,91),
        new Students("PR24107003","200006293874","Perera Jayasinghe",63,-1),
        new Students("PR24107004","200008103471","Silva Ekanayake",88,74),
        new Students("PR24107005","200010252984","Dias Senanayake",32,55),
        new Students("PR24107006","200012043894","Herath Abeysekera",76,82),
        new Students("PR24107007","200002193874","Rathnayake Fernando",97,66),
        new Students("PR24107008","200004212374","Kumara Herath",54,49),
        new Students("PR24107009","200005183492","Weerasinghe Silva",-1,99),
        new Students("PR24107010","200007153871","Senanayake Karunaratne",23,13),
        new Students("OR24107011","200101232984","Abeysekera Silva",90,80),
        new Students("OR24107012","200103083471","Bandara Gunawardena",35,70),
        new Students("OR24107013","200106273894","Karunaratne Weerasinghe",81,93),
        new Students("OR24107014","200108123984","Perera Herath",61,36),
        new Students("OR24107015","200110043728","Fernando Dias",44,59),
        new Students("PR24107016","200112213874","Weerasinghe Gunawardena",67,85),
        new Students("PR24107017","200102253471","Rathnayake Kumara",100,47),
        new Students("PR24107018","200104103874","Senanayake Fernando",17,90),
        new Students("OR24107019","200105293784","Silva Bandara",85,-1),
        new Students("OR24107020","200107202983","Herath Rajapaksha",29,22),
        new Students("PR24107021","200201013874","Kumara Jayasinghe",70,77),
        new Students("PR24107022","200203253471","Abeysekera Perera",42,34),
        new Students("OR24107023","200206143874","Rathnayake Jayasinghe",-1,63),
        new Students("OR24107024","200208083471","Kumara Weerasinghe",60,100),
        new Students("PR24107025","200210293874","Rajapaksha Ekanayake",86,29),

        new Students("PR24108001","200212183471","Fernando Rajapaksha",86,79),
        new Students("PR24108002","200202103874","Silva Gunawardena",57,62),
        new Students("PR24108003","200204123894","Perera Wijesinghe",91,87),
        new Students("PR24108004","200205283471","Herath Abeysekera",35,-1),
        new Students("PR24108005","200207153874","Rajapaksha Ekanayake",-1,54),
        new Students("PR24108006","200301093874","Karunaratne Silva",76,46),
        new Students("PR24108007","200303283471","Weerasinghe Fernando",48,99),
        new Students("PR24108008","200306153874","Silva Bandara",94,39),
        new Students("PR24108009","200308123471","Abeysekera Weerasinghe",23,70),
        new Students("PR24108010","200310083874","Kumara Karunaratne",69,-1),
        new Students("OR24108011","200312243471","Dias Rajapaksha",-1,75),
        new Students("OR24108012","200302273874","Herath Perera",80,83),
        new Students("OR24108013","200304203471","Rathnayake Gunawardena",55,58),
        new Students("OR24108014","200305123874","Ekanayake Jayasinghe",88,92),
        new Students("OR24108015","200307213471","Gunawardena Silva",32,30),
        new Students("PR24108016","200401153874","Rajapaksha Perera",100,91),
        new Students("PR24108017","200403123471","Karunaratne Jayasinghe",67,40),
        new Students("PR24108018","200406293874","Weerasinghe Abeysekera",43,63),
        new Students("OR24108019","200408083471","Rathnayake Fernando",-1,95),
        new Students("OR24108020","200410213874","Kumara Herath",90,68),
        new Students("PR24108021","200412153471","Silva Weerasinghe",60,-1),
        new Students("PR24108022","200402203874","Herath Karunaratne",77,66),
        new Students("OR24108023","200404273471","Abeysekera Silva",25,21),
        new Students("OR24108024","200405143874","Gunawardena Ekanayake",71,88),
        new Students("PR24108025","200407183471","Weerasinghe Kumara",84,37),

        new Students("PR24109001","200501023874","Weerasinghe Kumara",92,67),
        new Students("PR24109002","200503193471","Rajapaksha Abeysekera",68,91),
        new Students("PR24109003","200506153874","Gunawardena Perera",59,85),
        new Students("PR24109004","200508213471","Karunaratne Silva",85,73),
        new Students("PR24109005","200510083874","Herath Wijesinghe",63,70),
        new Students("PR24109006","200512293471","Rathnayake Ekanayake",76,63),
        new Students("PR24109007","200502123874","Silva Fernando",91,76),
        new Students("PR24109008","200504153471","Abeysekera Rajapaksha",70,88),
        new Students("PR24109009","200505283874","Fernando Bandara",84,55),
        new Students("PR24109010","200507173471","Perera Herath",63,64),
        new Students("OR24109011","200203456782","Weerasinghe Jayasinghe",72,79),
        new Students("OR24109012","200305678901","Silva Karunaratne",89,80),
        new Students("OR24109013","199601234567","Rathnayake Gunawardena",45,59),
        new Students("OR24109014","199511223344","Herath Kumara",81,92),
        new Students("OR24109015","200412345678","Abeysekera Silva",77,68),
        new Students("PR24109016","200512345678","Ekanayake Bandara",68,100),
        new Students("PR24109017","199909876543","Rajapaksha Fernando",63,77),
        new Students("PR24109018","199812346789","Gunawardena Weerasinghe",88,83),
        new Students("OR24109019","200010203040","Kumara Karunaratne",75,45),
        new Students("OR24109020","200608789012","Silva Dias",90,62),
        new Students("PR24109021","200012345678","Perera Weerasinghe",57,66),
        new Students("PR24109022","199812345679","Karunaratne Rajapaksha",79,59),
        new Students("OR24109023","199902345678","Jayasinghe Silva",92,78),
        new Students("OR24109024","199712345670","Rathnayake Perera",62,85),
        new Students("PR24109025","200102345671","Silva Ekanayake",100,56),

        new Students("PR24110001","200203456782","Silva Karunaratne",-2,-2),
        new Students("PR24110002","200305678901","Herath Fernando",-2,-2),
        new Students("PR24110003","199601234567","Kumara Jayasinghe",-2,-2),
        new Students("PR24110004","199511223344","Weerasinghe Perera",-2,-2),
        new Students("PR24110005","200412345678","Abeysekera Rajapaksha",-2,-2),
        new Students("PR24110006","200512345678","Rathnayake Karunaratne",-2,-2),
        new Students("PR24110007","199909876543","Ekanayake Bandara",-2,-2),
        new Students("PR24110008","199812346789","Gunawardena Perera",-2,-2),
        new Students("PR24110009","200010203040","Silva Wijesinghe",-2,-2),
        new Students("PR24110010","200608789012","Rajapaksha Jayasinghe",-2,-2),
        new Students("OR24110011","200012345678","Rathnayake Fernando",-2,-2),
        new Students("OR24110012","199812345679","Karunaratne Kumara",-2,-2),
        new Students("OR24110013","199902345678","Perera Silva",-2,-2),
        new Students("OR24110014","199712345670","Gunawardena Ekanayake",-2,-2),
        new Students("OR24110015","200102345671","Bandara Rajapaksha",-2,-2),
        new Students("PR24110016","200203456782","Silva Herath",-2,-2),
        new Students("PR24110017","200305678901","Rathnayake Weerasinghe",-2,-2),
        new Students("PR24110018","199601234567","Perera Gunawardena",-2,-2),
        new Students("OR24110019","199511223344","Herath Karunaratne",-2,-2),
        new Students("OR24110020","200412345678","Silva Rajapaksha",-2,-2),
        new Students("PR24110021","200203456782","Ekanayake Kumara",-2,-2),
        new Students("PR24110022","200305678901","Bandara Herath",-2,-2),
        new Students("OR24110023","199601234567","Weerasinghe Rajapaksha",-2,-2),
        new Students("OR24110024","199511223344","Karunaratne Abeysekera",-2,-2),
        new Students("PR24110025","200412345678","Perera Dias",-2,-2)
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
