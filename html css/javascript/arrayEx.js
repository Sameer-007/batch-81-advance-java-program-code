const city = ['Pune', 'Kolkata', 'Jaipur', 'Nellore', 'Vizag']

console.log(city)
city.push('Madikeri')
console.log(city)
console.log(city.pop())
console.log(city)


console.log(city.shift())
console.log(city)

console.log(city.unshift('Chennai'))
console.log(city)

let xCity = city.slice(0, 3)
console.log(xCity)
console.log(city)


let cityLengthGreaterThanFour = city.filter((x) => x.length > 5)
console.log(cityLengthGreaterThanFour)

let cityFind = city.find((y) => {
    return y == 'Chennai'
})

console.log(cityFind)

city.forEach(x => {
    console.log(x)
})