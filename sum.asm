section .text
global  _start

_start:
     mov	eax,'3'
       sub     eax, '0'

       mov 	ebx, '5'
       sub     ebx, '0'
       add 	eax, ebx
       add	eax, '0'

       mov 	[sum], eax
       mov	ecx,msg
       mov	edx, len
       mov	ebx,1	         ;file descriptor (stdout)
       mov	eax,4	         ;system call number (sys_write)
       int	0x80	         ;call kernel

       mov	ecx,sum
       mov	edx, 1
       mov	ebx,1	         ;file descriptor (stdout)
       mov	eax,4	         ;system call number (sys_write)
       int	0x80	         ;call kernel

       mov	eax,1	         ;system call number (sys_exit)
       int	0x80	         ;call kernel

section  .data
    msg db "The sum is:", 0xA,0xD
    len equ $ - msg
    segment .bss
    sum resb 1


