void main (){
    printNums (0, 3);
}

static void printNums(int start, int end){
    if (start == end) return; //base-case
    IO.println(start);
    printNums((start+1),end);
}

