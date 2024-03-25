	section .data
    num1 dd 10
    num2 dd 20
 
section .text
    global _start
_start:
    ; Load the first number into eax
    mov eax, [num1]
    
    ; Add the second number to eax
    add eax, [num2]
    
    ; Exit the program with the sum in eax
    mov ebx, eax
    mov eax, 1
    int 0x80