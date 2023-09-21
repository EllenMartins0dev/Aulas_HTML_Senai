feather.replace();
const buttons = document.querySelectorAll('c-button');
const buttonActive = button =>{
    let buttonState = classList.contains('c-button')
let buttonType = button.dataset.button
buttons ?
button.classList.remove('u-text--${buttonType}'):
button.classList.add('u-text--${buttonType}')
button.classList.toggle('c-button--active')
}
buttons.forEach(button =>{
    button.addEventListener('click', () =>{
        buttonActive(button)
    } )
})