const festa = {
    nome: "Festa Junina",
    numeroDeConvidados:100,
    endereco: "Av Mal. Castelo Branco, 1000 - Jardim Primavera, Piracicaba - SP, 13412-010", 
    valorDaEntrada: 10.00
}

document.body.innerHTML += `<h1>Conheça a ${festa.nome}</h1>`
document.body.innerHTML += `<h2>Uma festa incrível para você e sua família, estamos esperando cerca de ${festa.numeroDeConvidados} convidados</h2>`
document.body.innerHTML += `<h3>Acontecerá no  dia 07/10, na ${festa.endereco}</h3>`
document.body.innerHTML += `<p>O valor da entrada é R$${festa.valorDaEntrada}</p>`
