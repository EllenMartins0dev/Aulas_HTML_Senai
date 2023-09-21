const operation = document.getElementById('operation');
const result = document.getElementById('result');

function send(value) {
    switch (value) {
        case 'C':
            operation.textContent = ''
            break;

        case 'D':
            operation.textContent = operation.textContent.slice(0, -1)
            break;

        default:
            operation.textContent = operation.textContent + value;
            result.textContent = eval(operation.textContent);
            break;
    }
}