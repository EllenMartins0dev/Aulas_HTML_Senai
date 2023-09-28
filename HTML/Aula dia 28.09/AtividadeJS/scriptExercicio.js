let aluno = {
    nome : "Ellen",
    idade: 16,
    curso: "Desenvolvimento de Sistemas",
    professores: ["Moisés", "Flávia"],
    media: -1,
    sala: 3
}

console.log("Aluno com alterações")
aluno.sala = 2
aluno.professores = ["Moisés", "Flávia", "Clayton"]
console.log(aluno)

console.log(" ")

console.log("Disciplina com alterações")
let disciplina = {
    nome: "HTML",
    curso: "Desenvolvimento de Sistemas",
    escola: "Senai Mário Henrique Simonsen",
    professores_curso: "Flávia", 
    media_minima: 50,
    media_maxima: 100,
}

disciplina.nome = "Java"
disciplina.professores_curso = "Moisés"
console.log(disciplina)

console.log(" ")

console.log("Festa com alterações")
let festa = {
    nome: "Festa Neon",
    data: "07/10",
    local: "Senai Mário Henrique Simonsen",
    preco: 15,
    tema: "Luzes e cor neon",
    limite_convidados: 100
}
festa.nome = "Festa do Havaí"
festa.tema = "Havaí e natureza"

console.log(festa)

let mensage = "Olá aluno(a) " + aluno.nome + " do curso de " + disciplina.curso + 
". Você foi convidado(a) pra " + festa.nome + " no dia " + festa.data + 
". A entrada custa " + festa.preco + " reais. Converse com o(s) seu(s) professor(es) para mais informações \n Professor: " + disciplina.professores_curso 

alert(mensage)

// Teste
if (aluno.media < disciplina.media_minima && aluno.media > 0) {
    console.log(aluno.nome + ", você irá repetir de ano. \n Média: " + aluno.media)
} else if (aluno.media > disciplina.media_minima && aluno.media < disciplina.media_maxima ) {
    console.log(aluno.nome + ", você está indo muito bem, mas pode melhorar. \n Média: " + aluno.media)
} else if (aluno.media === disciplina.media_maxima) {
    console.log( aluno.nome + ", você está de parabéns! Nota máxima! \n Média: " + aluno.media)
} else {
    console.log("Nota não reconhecida")
}