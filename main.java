import java.lang.Math;

public class main {
    public static void main(String[] args) {

      short chet[] = new short[11];
      short count = 0;
      for(short i = 4; i <= 24; i++) {if( i % 2 == 0 ) {chet[count] = i; count++;}}
      //for(short i = 0; i <= 10; i++) System.out.println(chet[i]);  //tester
      
      final float min = -13, max = 10;
      float rand[] = new float[21];
      for( short i = 0; i < 20; i++ ){ rand[i] = min + (float) (Math.random() * (max - min)); }
      //for( short i = 0; i < 20; i++ ){ System.out.println(rand[i]); }  //tester    
      
      double due[][] = new double[12][21];
      for (int i = 0; i < 11; i++) {
        for (int j = 0; j < 20; j++) {

          float x = rand[j];

          switch ((int)x){

            case 18: due[i][j] = Math.pow(((((Math.asin((x-1.5)/23))/2)-1)/2), Math.cos(Math.pow(2.71, x))); break;
                
            case 4, 8, 12, 20, 24: due[i][j] =  Math.asin(Math.sin(Math.cos(Math.log1p(Math.abs(x))))); break;
                
            default: due[i][j] = Math.pow((2*(3-Math.pow(((Math.log1p(Math.pow(Math.sin(x), 2)))/2),2))),2); break;
          } 
        }
      }
      for (int i = 0; i < 11; i++) {
          for (int j = 0; j < 20; j++) {
              System.out.printf("%.4f\t ", due[i][j]);
          }
          System.out.println();
      }

    }
}

