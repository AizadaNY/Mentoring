section	.text
   global _start


_start_loop:
    ;clear rdx before inserting value
    mov rdx ,[rdi+4] ; go to element one by one
    add eax, "1"
    mov [sum],eax


section .data
    array dd 3,5,7,9
