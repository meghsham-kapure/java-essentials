
void main(){
    IO.println(isPowerOfTwo(4));
}
static int p = 0 ;
public boolean isPowerOfTwo(int n) {
    if (Math.pow(2,p) ==  n)
        return true;
    else if ( Math.pow(2,p) > n )
        return false;
    else{
        p++;
        return isPowerOfTwo(n);
    }

}
