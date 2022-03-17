
public class third_6 {
    public static void main(String[] args) {
        int daynumber = 2;
        System.out.println(schedule());

            switch (daynumber) {
                case 1:
                    System.out.println("Учить Java");
                    break;
                case 2:
                    System.out.println("Английский у детей");
                    break;
                case 3:
                    System.out.println("Английский ");
                    break;
                case 4:
                    System.out.println("Учить Java");
                    break;
                case 5:
                    System.out.println("Английский ");
                    break;
                case 6:
                    System.out.println("Логика ");
                    break;
                case 7:
                    System.out.println("Воскресенье выходной (но нужно учть JAVA)");
                default:
                    System.out.println("Такого дня не существует ");


            }
        }

        private static String schedule () {
            System.out.println("Понедельник. Учить Java");
            System.out.println("Вторник. Английский у детей");
            System.out.println("Среда. Английский ");
            System.out.println("Четверг. Учить Java");
            System.out.println("Пятница. Английский ");
            System.out.println("Суббота. Логика");
            System.out.println("Воскресенье");

            return " ";
        }
    }

