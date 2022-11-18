
        public class Main {
            public static void main(String[] args) {

// Задание №1
                System.out.println("Задание №1");
                String firstName = "Ivan ";
                String middleName = "Ivanovich ";
                String lastName = "Ivanov ";
                String fullName = lastName + firstName + middleName;
                System.out.println("ФИО сотрудника - " + fullName);

                // Задание №2
                System.out.println("\nЗадание №2");
                String upFullName = fullName.toUpperCase();
                System.out.println(upFullName);

                // Задание №3
                System.out.println("\nЗадание №3");
                String fullName1 = "Иванов Семён Семёнович";
                if (fullName1.contains("ё")) {
                    fullName1 = fullName1.replace('ё', 'е');
                }
                System.out.println(fullName1);
            }
            }