section .text
global  _start

_start:
    mov edx, len
    mov ecx, msg

section  .data
    msg   db "Hello World!", 0xa        ;declared the message
    len   equ $ -msg