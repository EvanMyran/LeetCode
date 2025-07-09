int value(char c) {
    switch(c){
        case 'I': return 1;
        case 'V': return 5;
        case 'X': return 10;
        case 'L': return 50;
        case 'C': return 100;
        case 'D': return 500;
        case 'M': return 1000;
        default: return 0;
    }
}

int romanToInt(char* s) {
    int total = 0;
    int i = 0;

    while(s[i] != '\0') {
        int cur = value(s[i]);
        int next = value(s[i + 1]);

        if (next > cur) {
            total += (next - cur);
            i += 2; 
        } else {
            total += cur;
            i++;
        }
    }
    return total;
}
