class isPalindrome {
    public boolean isPalindrome(int x) {

    if(x<0)return false;
    int temp=x;
    int sum=0;
    while(x!=0){
    sum=(sum*10)+(x%10);
    x=x/10;
    }
    return (temp==sum);
    }
}