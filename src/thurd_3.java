public class thurd_3 {
    public static void main(String[] args) {
        int d = 29;
        int m = 142;
        int y = 1600;
        //Если в месяце 31 день
        if (((d == 31) && (m == 1)) || (m == 3) || (m == 5) || (m == 7) || ((m == 8)) || (m == 10) || (m == 12)) {
            //Если месяц декабрь
            if (m == 12) {
                m = 1;
                y = y + 1;
                d = 1;
                System.out.println(d + " день " + m + "месяц " + y + " год");
            }
            // Если в месяце 30 дней
        } else if (((d == 30) && (m == 4)) || (m == 6) || (m == 9) || (m == 11)) {
            d = 1;
            m = m + 1;
            System.out.println(d + " день " + m + " месяц " + y + " год");
            // Если високосный год
        } else {
            if ((d == 28) && (m == 2) && ((y % 4 == 0) || (y % 400 == 0))) {
                d = d + 1;
                System.out.println(d + " день " + m + " месяц " + y + " год " + " Этот год високосный!!!");
            } else if((d == 29) && (m == 2) && ((y % 4 == 0) || (y % 400 == 0))) {
                d=1;
                m=1+m;
                System.out.println(d + " день " + m + " месяц " + y + " год ");
            }else if ((d == 28) && (m == 2)) {
                d = 1;
                m = m + 1;
                System.out.println(d + " день " + m + " месяц " + y + " год");
            } else if ((d < 31)&&(m<=12)&&(m>=1)) {
                d = d + 1;
                System.out.println(d + " день " + m + " месяц " + y + " год");
            }else {
                System.out.println("Такой даты не существует");
            }
        }
    }
}

