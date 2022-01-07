import java.util.Random;

public class Logic_Verification {

        public String buildCode(){
            Random random = new Random();
            StringBuilder otp = new StringBuilder();
            for (int i = 1; i<7; i++){
                int upperBound = 10;  // 10-1 = 9, where lowerBound is 0 as default
                int randomNum = random.nextInt(upperBound);
                otp.append(randomNum);  // ---> otp = otp + randomNum;
            }
            return otp.toString();
        }

}
