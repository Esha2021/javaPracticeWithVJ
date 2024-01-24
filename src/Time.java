public class Time {

        public static void main (String args[]){
            int time=12;

            if (time<12)
            {
                System.out.println("GM");
            }else if(time>=12 && time<16)
            {
                System.out.println("GA");
            }else if(time>=16 && time<18)
            {
                System.out.println("GE");
            }
            else if(time>=18 && time<24)
            {
                System.out.println("GN");
            }

        }
    }

