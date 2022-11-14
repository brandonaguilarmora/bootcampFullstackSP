import java.util.List;

public class Challenge1 {



    public String numeralA(String tipo){
        String string="";
        tipo= tipo.trim().replace(" ","");
        System.out.println(tipo.trim());
        if(tipo.equalsIgnoreCase("tipoa")){
            string="54";
        }
        if(tipo.equalsIgnoreCase("tipob")){
            string="08";
        }
        for (int i = 0; i <7; i++) {
            int number = (int)(Math.random()*10+1);
            string=string+String.valueOf(number);
        }
        return string;
    }
    public boolean numeralB(String string, List<String> list){
        if(list.indexOf(string)!=-1){
            return false;
        }else{
            return true;
        }
    }

}
