class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
    //     int c=0;
    //     for(int i=0;i<people.length;i++){
    //         for(int j=i+1;j<people.length;j++){
    //             if(people[i]+people[j]<=limit){
    //                 c++;
    //                 people[i]=1000;
    //                 people[j]=1000;
    //                 break;
    //             }else{
    //                 if(people[i]<=limit)
    //                 c++;
    //                 break;
    //             } 
    //         }
    //     }
    //    return c; 

    int i=0,j=people.length-1,c=0;
    while(i<=j){
        if(people[i]+people[j]<=limit){
            i++;
        }
        j--;
        c++;
    }
    return c;
    }
}