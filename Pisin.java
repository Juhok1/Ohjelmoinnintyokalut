public class Pisin {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("Ei parametreja");
        }
        else{
            String PisinParametri = args[0];
            for (String s:args){
                if(s.length() > PisinParametri.length()){
                    PisinParametri = s;
                }
            }
        System.out.println("Pisin parametri: "+ PisinParametri);
        }
    }
}
