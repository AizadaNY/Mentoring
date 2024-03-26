section .data
    num1    dd 3           ; First number
    num2    dd 5           ; Second number
    sum     dd 0            ; Variable to store the sum

section .text
    global _start

_start:
    ; Load the first number into EAX
    mov eax, [num1]
    
    ; Add the second number to EAX
    add eax, [num2]
    
    ; Store the result in the sum variable
    mov [sum], eax
    
    ; Exit the program
    mov eax, 1            ; syscall number for exit
    xor ebx, ebx          ; exit code 0
    int 80h               ; invoke syscall