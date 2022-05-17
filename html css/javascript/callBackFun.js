// Arrow Function 
let addition = (x, y) => {
    return x + y;
}

let multiply = (x, y) => {
    return x * y;
}

// function paased as an argument to another function
calculator(addition, multiply, (x, y) => x - y);


function calculator(add, mul, sub) {

    console.log(add(10, 20));
    console.log(mul(100, 30))
    console.log(sub(200, 100))
}