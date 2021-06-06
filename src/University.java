


public class University {


    public static void main(String[] args) {


        Human[] student = new Human[4];

        student[0] = new Human("Appolon", "Hitrozadov",2000, 1, "Zoofac");
        student[1] = new Human("Traktorina", "Chumazova", 2000, 1, "Mehfac");
        student[2] = new Human("Algebrina", "Botanova", 2000,1,"Zauckasfac");
        student[3] = new Human("Vladimir", "Ulyanov", 1870,13, "Revolucionno_predatelskiy");


        //System.out.println(student[0].birthday.toString());
        System.out.println(student[0].getFaculty() );
    }
}



        /*for (int i = 0; i < student.length; i++  ) {
            if (student[i].id > 1235)
                System.out.println(student[i].name);
        }

        //System.out.println(student[0].name);
    }


    }
*/