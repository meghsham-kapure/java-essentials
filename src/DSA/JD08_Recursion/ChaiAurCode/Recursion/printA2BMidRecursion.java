
void main (){
    printNums (0, 3);
}

static void printNums(int start, int end){
    if (start == end) return; //base-case
    IO.println("Going Down => "+start);
    printNums((start+1),end);
    IO.println("Going Up => "+start);
}

