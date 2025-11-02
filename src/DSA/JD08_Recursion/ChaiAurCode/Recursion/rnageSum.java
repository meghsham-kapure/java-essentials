

void main () {
    IO.println(rangeSum(1,5,0));
}

int rangeSum (int start , int end, int currentSum){
    if (start > end) {
        return currentSum;
    }
    else {
        currentSum += (start++);
        start++;
        return rangeSum(start, end, currentSum);
    }
}