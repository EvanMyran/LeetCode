#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>

bool isValid(char* s) {
    
    int len = strlen(s);

    // Stack to hold open brackets
    char* stack = (char*)malloc(len);
    int top = -1;

    for (int i = 0; i < len; i++) {
        char c = s[i];

        if (c == '(' || c == '{' || c == '[') {
            stack[++top] = c;  // Push to stack
        } else {
            if (top == -1) {   // Stack is empty
                free(stack);
                return false;
            }

            char topChar = stack[top--];  // Pop from stack

            // Match current closing bracket with top of stack
            if ((c == ')' && topChar != '(') ||
                (c == '}' && topChar != '{') ||
                (c == ']' && topChar != '[')) {
                free(stack);
                return false;
            }
        }
    }

    bool valid = (top == -1);  // Stack should be empty at the end
    free(stack);
    return valid;
}
