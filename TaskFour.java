//Naoto Oka
//05/11/21
//TaskFour
public class medalCount{

  
   public static void main(String args[]) {
       String Countries[] = {"Canada","China","Germany","Korea","Japan","Russia","United States"};

       int medals[][] = {{0,3,0},{0,0,1},{0,0,1},{1,0,0},{0,0,1},{3,1,1},{1,1,0}};
      
       int total[] = totalMedals(medals , 7);
       System.out.printf("%13s%10s%10s%10s%10s\n","Country","Gold","Silver","Bronze","Total");
       for(int i=0;i<7;i++) {
           System.out.printf("%13s",Countries[i]);
           for(int j=0;j<3;j++)System.out.printf("%10d",medals[i][j]);
           System.out.printf("%10d\n",total[i]);
       }
   }
   public static int[] totalMedals(int medals[][] , int row){
       int total[] = new int[row];
       for(int i=0;i<row;i++)total[i] = 0;
       for(int i=0;i<row;i++) {
           for(int j=0;j<medals[i].length;j++) {
               total[i]+=medals[i][j];
           }
       }
       return total;
   }
}
	
	


