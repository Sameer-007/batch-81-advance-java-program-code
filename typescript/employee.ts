const employee1 = {
    firstName: 'ANC',
    lastName: 'def',
    age: 23,
    salary: 25000,
    company: 'Wipro'
}

let add = (x: number, y: number): number => {
    return x + y
}

console.log(add(100, 200))

let message: string = 'Welcome to TypeScript'
// message = 10;
let h1 = document.createElement("h1");
h1.textContent = message

document.body.appendChild(h1)
let ul = document.createElement('ul');
let li = document.createElement('li');
li.textContent = add(100, 100).toString()
ul.appendChild(li)


document.body.appendChild(ul)

console.log(employee1.firstName)
console.log(employee1.lastName)
console.log(employee1.age)
console.log(employee1.salary)
console.log(employee1.company)
//console.log(employee.comp)