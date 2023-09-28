let index = 0;

function changeColors() {
    const colors = ["yellow", "orange", "red", "purple", "blue", "cyan", "green", "brown", "grey", "black"];

    // Define a transição de 2 segundos
    document.getElementsByTagName("body")[0].style.transition = "background 2s";
    document.getElementsByTagName("body")[0].style.background = colors[index++];

    if (index > colors.length - 1)
        index = 0;

    // Chame a função a cada intervalo de tempo
    setInterval(changeColors, 2000);
}