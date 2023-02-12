package pro.sky.java.course1.additional.task5;

public class Program {
    public static void main(String[] args) {

        /////////// Task 5 //////////
        System.out.println("Task 5:");

        String fullName = "Ivanov Ivan Ivanovich";
        String firstName = fullName.substring(fullName.indexOf(" ") + 1, fullName.lastIndexOf(" "));
        System.out.println("Имя сотрудника — " + firstName);
        String lastName = fullName.substring(0, fullName.indexOf(" "));
        System.out.println("Фамилия сотрудника — " + lastName);
        String middleName = fullName.substring(fullName.lastIndexOf(" ") + 1);
        System.out.println("Отчество сотрудника — " + middleName);


        /////////// Task 6 //////////
        System.out.println("\nTask 6:");

        fullName = "ivanov ivan ivanovich";

        char[] fullNameArray = fullName.toCharArray();
        StringBuilder sb1 = new StringBuilder();

        for (int i = 0; i < fullNameArray.length; i++) {
            if (i == 0) {
                fullNameArray[0] = Character.toUpperCase(fullNameArray[0]);
            }
            if (fullNameArray[i] == ' ') {
                fullNameArray[i + 1] = Character.toUpperCase(fullNameArray[i + 1]);
            }
            sb1.append(fullNameArray[i]);
        }

        fullName = sb1.toString();
        System.out.println("Верное написание Ф.И.О. сотрудника — " + fullName);


        /////////// Task 7 //////////
        System.out.println("\nTask 7:");

        String firstString = "135";
        String secondString = "246";
        String unitedStrings;

        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < firstString.length(); i++) {
            sb2.append(firstString.charAt(i)).append(secondString.charAt(i));
        }

        unitedStrings = sb2.toString();
        System.out.println("Данные строки — " + unitedStrings);


        /////////// Task 8 //////////
        System.out.println("\nTask 8:");

        String sortSymbols = "aabccddefgghiijjkk";
        String sortDublicatedSymbols;

        char[] symbolsArray = sortSymbols.toCharArray();
        StringBuilder sb3 = new StringBuilder();

        char dublicated = ' ';
        for (char c : symbolsArray) {
            if (c == dublicated) {
                sb3.append(c);
            }
            dublicated = c;
        }

        sortDublicatedSymbols = sb3.toString();
        System.out.println(sortDublicatedSymbols);
    }
}
