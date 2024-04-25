;----------------------------------------------------------------------------
;HelloWorld.asm
;Este é um programa para Windows 32 bits que roda no prompt de comando.
;O objetivo é escrever "Hello, World" em uma linha da tela e sair.
;Ele usa a biblioteca do C para a chamada do printf().
;----------------------------------------------------------------------------

global main
extern printf

section .text

main:
    ; Entrada do programa
    push ebp
    mov ebp, esp
    ; printf("Hello, World\n");
    push message
    call printf
    pop edx
    ; Saída do programa
    mov esp, ebp
    pop ebp
    ret

section .data

; Texto para a messagem "Hello, World\n"
; Toda string deve terminar com um '\0'
message:
    db 'Hello, World', 10, 0