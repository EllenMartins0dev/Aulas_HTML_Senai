alert("Segue exemplo de alunos e suas ocupações")

console.log("Segue exemplo de alunos e suas ocupações:")
console.log(" ")

let students = ["Ellen", "Emily", "Henzo", "Nathalia", "Rafaella", "Sarah"]
console.log(students)
let occupations = ["Escrever", "Dançar", "Desenhar", "Estudar", "Sair", "Assistir"]

occupations.forEach((occupations) => console.log(occupations));

// Serve pra recarregar a página cada uma quantidade x de tempo, no exemplo é 10 segundo
setTimeout(function() {
    location.reload();
}, 10000)