class Product {
    id: number;
    name: string;
    price: number;
    quantity: number;
    color?: string;

    constructor(id: number, name: string, price: number, quantity: number) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity
    }

    getProductDetails() {
        return `${this.id}-${this.name}-${this.price}-${this.quantity}`
    }
}


let laptop = new Product(101, 'Dell Latitude', 35000.50, 12);

console.log(laptop.getProductDetails())