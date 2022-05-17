const list = [10, 21, 30, 41, 50, 30, 71, 80, 91, 100]


let even = list.filter((x) => x % 2 == 0);
console.log(even)

let index = list.find(x => {
    console.log(x)
    if (x == 30) {
        return list.indexOf(x)
    }
})
console.log(index)

let y = list.map((x) => {
    return x + 10
})

console.log(y)