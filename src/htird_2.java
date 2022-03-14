
public class htird_2 {

    public static  void main(String[] args) {

        int rub =1354;
        int rubl=rub%10;
        int sumt=rub%100;
        if(((rub==0) || (rubl>=5)) & ((sumt>=11) ||sumt<=19)){
            System.out.println(rub+ " рублей" );
        }else if(rub==1){
            System.out.println(rub+" рубаль");
        }else if((rubl>=2)&&(rubl<=4)){
            System.out.println(rub+" рубля");
        }

        }
            
    }

