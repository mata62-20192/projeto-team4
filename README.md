# projeto-team4
projeto-team4 created by GitHub Classroom


Projeto: sistema acadêmico (2019.2)
Equipes de até 6 pessoas.

O projeto consiste em um sistema desktop para gerenciamento de uma universidade, e deve ser desenvolvido por equipes contendo entre 3 e 6 pessoas. O sistema será desenvolvido incrementalmente, com entregas parciais ao longo do semestre. As entregas serão realizadas no GitHub, através do endereço https://classroom.github.com/g/spmbcgWX

Entrega 0: apresentação no dia 17/09
Para a entrega 0, sua equipe precisará criar um projeto Java contendo as classes do domínio acadêmico (com seus respectivos atributos, construtores, getters e setters, considerando a visibilidade apropriada para cada membro), além de um diagrama de classes representando as classes do projeto. No diagrama de classes, omita os getters e setters para melhorar a legibilidade. Use boas práticas de codificação e de modelagem.

O projeto deve estar no repositório do GitHub antes da apresentação. O diagrama de classes deve estar em um arquivo chamado classes.png ou classes.pdf, no diretório raiz do projeto.

Na sua modelagem, considere que uma universidade possui um nome, uma sigla, um conjunto de cursos e um conjunto de disciplinas. Um curso possui um conjunto de disciplinas de natureza obrigatória (que são organizadas em semestres sugeridos - ex.: disciplinas do 2º semestre) e um conjunto de disciplinas de natureza optativa, dentre as disciplinas da universidade. Uma disciplina possui um código alfanumérico, um nome, uma carga horária semestral (em horas), e zero ou mais pré-requisitos. Note que os pré-requisitos de uma disciplina podem variar de um curso para outro.

Para testar (parcialmente) se sua modelagem está correta, verifique se é possível instanciar três cursos, CC, SI e LC, e uma disciplina, Engenharia de Software II (MATA63), de 68 h, de tal forma que essa disciplina seja obrigatória de 6º semestre em CC, obrigatória de 5º semestre em SI e optativa em LC.

Na aula do dia 17/09, sua equipe deve apresentar e explicar o diagrama de classes para a turma, esclarecendo quaisquer dúvidas que possam surgir.

Entrega 1: entrega e apresentação no dia 22/10
Nesta entrega, você adicionará as seguintes funcionalidades:

Leitura de dados do sistema a partir de arquivo texto fornecido pelo professor. Ver código de exemplo
Criação de alunos da universidade, com nome, número de matrícula (é um identificador único) e senha. Cada aluno pertence a apenas um curso.
Criação de histórico de um aluno: lista de componentes curriculares cursados por semestre, indicando código, nome, carga horária, natureza, nota e conceito (aprovado, reprovado por nota, reprovado por falta, dispensa, trancamento). Só existe nota quando o conceito é aprovado ou reprovado por nota.
Impressão do histórico, com cálculo da carga horária total (optativa e obrigatória) e CR (nota média) do aluno. Considere que o CR é calculado através da média simples das notas.
A impressão dos histórico deve poder ser feita em dois formatos diferentes: TXT e HTML
Impressão do currículo do curso, que lista disciplinas obrigatórias, por semestre, e optativas, informando, para cada disciplina, o código, o nome, e a carga horária.
Neste momento não é necessário criar nenhuma interface com o usuário. No entanto, você deve seguir princípios de projeto orientado a objetos. Alguns aspectos a observar (note que a lista não é completa):

Certas classes devem ser imutáveis
Defina o critério de igualidade das classes quando isso for relevante
Use conjuntos ou listas de acordo com a situação


Entrega 2
A definir.

Entrega 3
A definir.
