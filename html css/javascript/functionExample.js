// functon decalaration
function getMessage() {
    return "Welcome to JavaScript Node Js"
}

function addition(x, y) {
    return x + y;
}
var msg = getMessage()
console.log(msg)
console.log(`Addtion  ${addition(10,29)}`)


// function Expression = used to store the function
let sub = function(x, y) {
    return x - y;
}

let y = sub(100, 200);
console.log(`Subtraction ${y}`)

// ES6 Arrow Function
let mul = (x, y) => {
    return x * y;
}
console.log(`Multiplication ${mul(1.2,3.4)}`)