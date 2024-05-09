# controle-candidatos

# Projeto: Processo Seletivo
Este projeto consiste em um programa Java para gerenciar um processo seletivo de candidatos. Ele inclui a seleção de candidatos com base em seus salários pretendidos e a análise de candidatos com diferentes salários pretendidos.

## Estrutura do Projeto

O projeto possui os seguintes arquivos:

- `ProcessoSeletivo.java`: O arquivo principal que contém a lógica do processo seletivo.
- `README.md`: Este arquivo que descreve o projeto.

## Funcionalidades

### Seleção de Candidatos

O método `selecaoCandidatos()` seleciona candidatos com base em seus salários pretendidos. Ele mantém uma lista de candidatos e seleciona os cinco primeiros candidatos cujos salários pretendidos sejam menores ou iguais ao salário base.

### Análise de Candidatos

O método `analizarCandidato(double salarioPretendido)` analisa candidatos com base em seus salários pretendidos. Ele compara o salário pretendido de um candidato com o salário base e determina se deve ligar para o candidato, fazer uma contra proposta ou aguardar o resultado dos demais candidatos.

### Outros Métodos

- `main(String[] args)`: O método principal que inicia o processo seletivo e realiza a análise de alguns candidatos.
- `valorPretendido()`: Um método auxiliar que gera aleatoriamente um valor de salário pretendido para os candidatos.

## Como Executar

Para executar o projeto, basta compilar e executar o arquivo `ProcessoSeletivo.java` utilizando um ambiente de desenvolvimento Java, como o Eclipse ou o IntelliJ IDEA.

## Contribuição

Contribuições são bem-vindas! Se você encontrar algum problema ou tiver sugestões para melhorar este projeto, sinta-se à vontade para abrir uma issue ou enviar um pull request.
 main
