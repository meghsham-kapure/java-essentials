

    void main (){
        printNums (0, 3);
    }

    static void printNums(int start, int end){
        if (start == end) return; //base-case
        printNums((start+1),end);
        IO.println(start);
    }



/*
Why Reverse Order?
 - The magic is in the call stack!
 - Each function call remembers its own start value
 - When printNums(1, 3) calls printNums(2, 3), it pauses and remembers start = 1
 - When printNums(2, 3) calls printNums(3, 3), it pauses and remembers start = 2
 - After base case, the stack unwinds and each function resumes with its remembered start value



*/