let input = document.getElementById("input-principal");
let botao = document.getElementById("botao-adicionar");
let listaCompleta = document.getElementById("tarefas");

let arrayListaDeTarefas = [];

function mostrarNaTela() {
    let novaLista = "";

    arrayListaDeTarefas.forEach(tarefa => {
        novaLista = novaLista + `
        <li class="item-tarefa">
        <p>${tarefa}</p>
        </li>`;
    });
    listaCompleta.innerHTML = novaLista; // Corrigido aqui
}

function cliqueNoBotao() {
    arrayListaDeTarefas.push(input.value);
    mostrarNaTela();
    input.value = "";
}

botao.addEventListener("click", cliqueNoBotao);