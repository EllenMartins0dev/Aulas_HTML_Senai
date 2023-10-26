let input = document.getElementById("input-principal")
let botao = document.getElementById("botao-adicionar")
let listaCompleta = document.getElementById("tarefas")

let arrayListaDeTarefas = []

function mostrarNaTela() {
    let novaLista = " "

    arrayListaDeTarefas.forEach(tarefa => {
                novaLista = novaLista + `
        <li class="item-tarefa">
        <p>${tarefa}</p>
        </li>
    })
}