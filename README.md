# gatorade-de-uva-emulator
EP2 de OCD (2019_01_turma94)

## Instruções

### Documentação
- Fazer um diagrama da UC com a numeração das portas
- Especificar os opcodes das instruções
- Especificar os códigos dos registradores

### OPcodes
- **Devem** conter a instrução
- Podem conter quais registradores serão utilizados
- Utilizar opcodes que facilitam a indicação de abertura de portas
  > Ex.: Entrada do dx: 0111 = porta 7 / Saída do dx: 1111 - porta 11
- Para comandos que utilizam constantes, armazenar na linha seguinte da instrução
  > Isso possibilita o uso de números de 16 bits

### Firmware
- **Deve** ser simulado
- A emulação **vale metade da nota**

### Memória
- Deve ser simulada
- Sugestão do JB: Utilizar lista ligada

### Registradores
| Registrador | I | O | Obs                           |
|-------------|:-:|--:|-------------------------------|
|          AX | S | S | Hexa p/ utilização do usuário |
|          BX | S | S | Hexa p/ utilização do usuário |
|          CX | S | S | Hexa p/ utilização do usuário |
|         MAR | S | S |                               |
|         MBR | S | S |                               |
|          IR | S | N |                               |
|       IR_P1 | S | S |                               |
|       IR_P2 | S | S |                               |
|          PC | S | S |                               |
|         ULA | S | S |                               |
|           X | S | N | (ULA)                         |
|          AC | N | S | (ULA)                         |

### Comandos
  - r: registrador
  - ct: constante
  - \[x\]: acesso à memória
#### Aritméticos
  > Para todos os comandos aritméticos, fazer: r,r e r,ct 
  1. add (+)
  2. sub (-)
  3. mul (*)
  4. div (/)
  5. mod (%)
#### Movimentação
  1. mov r1,r2
  2. mov r1,ct
  3. mov \[r1\],ct
  4. mov \[ct\],ct
  5. mov \[ct\],r1
  6. mov r1,\[ct\]
  7. mov r1,\[r2\]
#### Jumps
  > Todos os jumps serão feitos utilizando endereços
  1. je
  2. jne
  3. jg
  4. jge
  5. jl
  6. jle
