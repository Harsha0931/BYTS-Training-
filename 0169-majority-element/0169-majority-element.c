int majorityElement(int* arr,int n){
    int voter=arr[0];
    int votercount=0;
    for(int i=0;i<n;i++){
        if(arr[i]==voter) 
        {
          ++votercount;
        }
        else 
        {
        --votercount;
        }
        if(votercount==0)
        {
            voter=arr[i];
            votercount=1;
        }
    }
    return voter;
}