let contador;
let segundos = 0;


function atualizarTempo() {
    document.getElementById("tempo").textContent = segundos;
    segundos++;
}

document.getElementById("iniciar").addEventListener("click", function () {
    contador = setInterval(atualizarTempo, 1000);
    this.disabled = true; // Desativa o botão "Iniciar Contador" durante a contagem.
    document.getElementById("parar").disabled = false; // Ativa o botão "Parar Contador".
    document.getElementById("zerar").disabled = false; // Ativa o botão "Zerar Contador".
});

document.getElementById("parar").addEventListener("click", function () {
    clearInterval(contador);
    document.getElementById("iniciar").disabled = false; // Ativa o botão "Iniciar Contador".
    this.disabled = true; // Desativa o botão "Parar Contador" durante a pausa.
    document.getElementById("zerar").disabled = false; // Ativa o botão "Zerar Contador".
});

document.getElementById("zerar").addEventListener("click", function () {
    clearInterval(contador);
    segundos = 0;
    document.getElementById("tempo").textContent = segundos;
    document.getElementById("iniciar").disabled = false; // Ativa o botão "Iniciar Contador".
    document.getElementById("parar").disabled = true; // Desativa o botão "Parar Contador".
    this.disabled = true; // Desativa o botão "Zerar Contador" após a reinicialização.
});
