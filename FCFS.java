public class FCFS {
    public static void main(String[] args) {
        // TODO code application logic here
        int[] P ={1,2,3,4};
      	int[] At ={0,5,3,4};
	int[] Bt ={2,1,4,3};
	int[] Ct ={0,0,0,0};
	int[] Tat ={0,0,0,0};
	int[] Wt = {0,0,0,0};        
	float AvgWt=0, AvgTat=0;
        for(int k=1;k<At.length;k++){
        for(int i=1;i<At.length;i++){
        if(At[i-1]>At[i]){
            int temp = At[i-1];
            At[i-1] = At[i];
            At[i] = temp;
            temp = P[i-1];
            P[i-1] = P[i];
            P[i] = temp;
            temp = Bt[i-1];
            Bt[i-1] = Bt[i];
            Bt[i] = temp;
       }
        }
        }       
      for(int i=0;i<At.length;i++){
              
                if(i == 0){
			Ct[i] =At[i]+ Bt[i];
		}
                else if(Ct[i-1]<At[i]){
                       Ct[i]=(Bt[i]+ Ct[i-1])+(At[i]-Ct[i-1]);
                }
                else{
                    	Ct[i]= Bt[i]+ Ct[i-1];
		}
	}
        System.out.println();
       for(int k=1;k<At.length;k++){
      for(int i=1;i<At.length;i++){
        if(P[i]<P[i-1]){
            int temp = At[i-1];
            At[i-1] = At[i];
            At[i] = temp;
            temp = P[i-1];
            P[i-1] = P[i];
            P[i] = temp;
            temp = Bt[i-1];
            Bt[i-1] = Bt[i];
            Bt[i] = temp;
            temp = Ct[i-1];
            Ct[i-1] = Ct[i];
            Ct[i] = temp;
        }
      }
        }
      System.out.println();
      
        for(int j=0;j<P.length;j++){
            Tat[j] = Ct[j] - At[j];
            Wt[j] = Tat[j] - Bt[j];
            AvgTat = AvgTat + Tat[j];
            AvgWt = AvgWt + Wt[j];
       }
        AvgTat = AvgTat/(P.length );
        AvgWt = AvgWt/(P.length );       
        System.out.println("P\tA\tB\tC\tT\tW");
      for(int j=0;j<At.length;j++){
            System.out.println(P[j]+"\t"+At[j]+"\t"+Bt[j]+"\t"+Ct[j]+"\t"+Tat[j]+"\t"+Wt[j]);
            
       }
        System.out.println();
       System.out.println("Average TAT \t"+AvgTat);
       System.out.println("Average WT \t"+AvgWt);
    }
}
