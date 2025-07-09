//ALLOWS FOR BOOLEAN TYPES
#include <stdbool.h>
//STDLIB FOR MALLOC
#include <stdlib.h>
//STRING FO THE STRLEN FUNCTION
#include <string.h>

bool isValid(char* s) {
    //GET THE LENGTH OF THE STRING
    int len = strlen(s);

    //BUILD A STACK TO HOLD OPEN PARANTHESES
    char* stack = (char*)malloc(len);

    //INITIALIZE THE TOP OF THE STACK
    int top = -1;

    //FOR LOOP TO PARSE THROUGH THE STRING
    for (int i = 0; i < len; i++) {
        //SET CHAR TO FIRST INSTANCE OF TE STRING
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
