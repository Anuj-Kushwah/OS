public class RR {
     public static void main(String[] args) {

        int[] P ={0,1,2,3};

      	int[] At ={2,4,3,1};

	int[] Bt ={4,5,2,3};

	int[] Ct ={0,0,0,0};

	int[] Tat ={0,0,0,0};

	int[] Wt = {0,0,0,0};

        int[] Rem ={0,0,0,0};

       
       
	float AvgWt=0, AvgTat=0;
        int TS=2, Rt=0,CuT=0;

        for(int i=0;i<At.length;i++){

            Rem[i]=Bt[i];

            Rt = Rt + Bt[i];
            
        }

        
        

        for(int k=1;k<At.length;k++){

        for(int i=1;i<At.length;i++){

        if(At[i-1]>At[i]){

            int temp = At[i-1];

            At[i-1] = At[i];

            At[i] = temp;

            temp = P[i-1];

            P[i-1] = P[i];

            P[i] = temp;

            temp = Rem[i-1];

            Rem[i-1] = Rem[i];

            Rem[i] = temp;
            temp = Bt[i-1];

            Bt[i-1] = Bt[i];

            Bt[i] = temp;
                    

       }

        }

        }
       
        int i=0;
        while(Rt>0){
                
                if(At[i]<=CuT){
                    
                    if(Rem[i]>0){   
                        
                        if(Rem[i]>TS){
                                Rem[i] = Rem[i] - TS;
                                CuT = CuT + TS ;
                                Rt =Rt-TS;

                        }else{
                            
                            CuT = CuT + Rem[i] ;
                            Rt = Rt-Rem[i];
                            Rem[i] = 0;
                            Ct[i] = Ct[i] + CuT;

                        }
                    }
                        
                       i++;     
                       if((i==P.length)){
                             i = 0; 
                       }
                       if((At[i] > CuT)){
                             i = i-1; 
                       }
                       if(i<At.length-1){
			       if(Rem[i]==0 && At[i+1]>CuT){
				    CuT = CuT+1;

			       }
                       }
                       
                        
                }else{
                    
                        if((At[i]!=CuT)){
                            CuT = CuT+1;
                            
                        }
                   
                    
                }
            }
        
         
    
       for(int k=1;k<At.length;k++){

        for(i=1;i<At.length;i++){

        if(P[i-1]>P[i]){

            int temp = At[i-1];

            At[i-1] = At[i];

            At[i] = temp;

            temp = P[i-1];

            P[i-1] = P[i];

            P[i] = temp;

            temp = Ct[i-1];

            Ct[i-1] = Ct[i];

            Ct[i] = temp;
            
            temp = Bt[i-1];

            Bt[i-1] = Bt[i];

            Bt[i] = temp;
            

       }

        }

        }
        
       for(int j=0;j<P.length;j++){

            Tat[j] = Ct[j] - At[j];

            Wt[j] = Tat[j] - Bt[j];

            AvgTat = AvgTat + Tat[j];

            AvgWt = AvgWt + Wt[j];

       }

        AvgTat = AvgTat/(P.length );

        AvgWt = AvgWt/(P.length );
        System.out.println();
        System.out.println("PID.\tAT.\tBT.\tCT.\tTAT.\tWT.");

      for(int j=0;j<At.length;j++){

            System.out.println(P[j]+"\t"+At[j]+"\t"+Bt[j]+"\t"+Ct[j]+"\t"+Tat[j]+"\t"+Wt[j]);

            

       }

        System.out.println();

       System.out.println("Average TAT \t"+AvgTat);

       System.out.println("Average WT \t"+AvgWt);

}
}
