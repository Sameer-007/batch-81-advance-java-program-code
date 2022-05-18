alert("Welcome to DOM Manipulation");

const product = document.getElementById('add-product')
const button = document.querySelector('button')
const ul = document.querySelector('ul')
ul.className = "list-group"
button.addEventListener('click', () => {
    //alert("Add Button Clicked")
    //alert(product.value)

    const productName = product.value
    let li = document.createElement('li');
    let p = document.createElement('p');
    let deleteButton = document.createElement('button');
    deleteButton.textContent = 'Delete'

    p.textContent = productName;
    li.className = "list-group-item"
    deleteButton.style.marginLeft = "20px"
    deleteButton.className = "btn btn-danger"
    li.appendChild(p);
    p.appendChild(deleteButton)

    deleteButton.addEventListener('click', () => {
        ul.removeChild(li)
    });

    ul.appendChild(li)
        // create form and connect @11.00pm
});