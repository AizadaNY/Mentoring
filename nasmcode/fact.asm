section	.text
   global _start


_start_loop:
    ;clear rdx before inserting value
    mov rdx ,[rdi+4] ; go to element one by one
    mov eax, "1"
    mul eax


section .data
    array dd 3,5,7,9

}