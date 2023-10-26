let festa = {
    nome: "Festa do Havaí",
    dia: "07/10",
    horario: "16h - 21h",
    ingresso: 10,
    local: "Av. Mal. Castelo Branco, 1000 - Jardim Primavera, Piracicaba - SP",
    atracoes: "comidas, musica e barracas muito legais!"
}

let barracas_brincadeiras = {
    bar_1: "Escaperoom havaiana",
    bar_2: "Xavequinho",
    bar_3: "Boca do palhaço",
    bar_4: "Argola",
    bar_5: "Chute ao gol",
    bar_6: "Truco",
    bar_6: "Cama elástica"
}

let barracas_comidas = {
    com_1: "Cachorro-quente",
    com_2: "Sorvete",
    com_3: "Pastéis",
    com_4: "Bebidas alcoólicas e não alcoólicas",
    com_5: "Açaí",
    com_6: "Espetinho",
    com_7: "Porções de batata, peixe, e outras iguarias"
}

// Botão
document.getElementById("mudarCorBotao").addEventListener("click", function() {
    const cores = ["#ff5733", "#33ff57", "#3366ff", "#ff33cc", "#ffff33", "#fffff", "#f0f0f0", "#808080"];
    const corEscolhida = cores[Math.floor(Math.random() * cores.length)];
    document.body.style.backgroundColor = corEscolhida;
});


// Imprimir objetos
function imprimirTextoFesta() {
    const divFesta = document.getElementById("informacoes");
    const botaoFesta = document.getElementById("botaoFesta");
    const paragrafoFesta = document.createElement("p");
    paragrafoFesta.innerText = "Nome: Festa do Havaí\n Dia: 07/10\n Horário: 16h - 21h \n Valor do ingresso: 10 reais\n Local: Av. Mal. Castelo Branco, 1000 - Jardim Primavera, Piracicaba - SP\n Atrações: Porções de batata, peixe, e outras iguarias";
    divFesta.appendChild(paragrafoFesta);

    botaoFesta.style.display = "none";

}



function imprimirTextoBrincadeiras() {
    const divBrincadeiras = document.getElementById("brincadeiras");
    const botaoBrincadeiras = document.getElementById("botaoBrincadeiras");
    const paragrafoBrincadeiras = document.createElement("p");
    paragrafoBrincadeiras.innerText = "Escaperoom (Escapar da sala) havaiana;\nXavequinho;\nBoca do Palhaço;\nArgola\nChute ao gol\nTruco\nCama elástica";
    divBrincadeiras.appendChild(paragrafoBrincadeiras);
    botaoBrincadeiras.style.display = "none";
}

function imprimirTextoComidas() {
    const divComidas = document.getElementById("comidas");
    const botaoComidas = document.getElementById("botaoComidas");
    const paragrafoComidas = document.createElement("p");
    paragrafoComidas.innerText = "Cachorro-quente;\nSorvete;\nPastéis;\nBebidas alcocólicas e não alcoólicas;\nAçaí;\nEspetinho;\nPorões de batata, peixe e outras iguarias";
    divComidas.appendChild(paragrafoComidas);
    botaoComidas.style.display = "none";
}