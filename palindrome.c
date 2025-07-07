bool isPalindrome(int x) {
    if(x == 0) return true;
    if(x < 0 || x % 10 == 0) return false;

    double i = 0;
    double j = x;

    while(x > 0) {
        int z = x % 10;
        i = i * 10 + z;
        x = x / 10;
    }

    return j == i;
}
