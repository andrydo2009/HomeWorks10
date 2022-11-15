public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Mission 10.1");
        System.out.println(" ");
        String firstName = "Ivanov";
        String middleName = "Ivan";
        //middleName=" "+middleName+" " ;
        String lastName = "Ivanovich";
        String allNameStudent = firstName+ " "+middleName+" "+lastName;
        System.out.println("ФИО сотрудника — " + allNameStudent);

        System.out.println("Mission 10.2");
        System.out.println(" ");

        String fullName = "Ivanov Ivan Ivanovich";
        String upFullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + upFullName);

        System.out.println("Mission 10.3");
        System.out.println(" ");

        fullName="Иванов Семён Семёнович";
        // System.out.println("fullName = " + fullName);
        fullName=fullName.replace("ё","е");
        fullName=fullName.replace("Ё","Е");
        System.out.println("Данные ФИО сотрудника — " + fullName);




    }


}

// the ehd
