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

// Modo escuro
function mudarEstilo() {
    var body = document.body;
    var meuBotao = document.getElementById('meuBotao');
    var iconeModo = document.getElementById('iconeModo');

    if (body.classList.contains('mudou')) {
        body.classList.remove('mudou');
        meuBotao.classList.remove('mudouBotao');
        iconeModo.innerText = '🌙';
        container.classList.remove('mudou');
        header.classList.remove('mudou');
        input.classList.remove('mudou');
    } else {
        body.classList.add('mudou');
        meuBotao.classList.add('mudouBotao');
        iconeModo.innerText = '☀️';
        container.classList.add('mudou');
        header.classList.add('mudou');
        input.classList.add('mudou');
    }
}