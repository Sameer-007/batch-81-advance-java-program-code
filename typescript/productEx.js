var Product = /** @class */ (function () {
    function Product(id, name, price, quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    Product.prototype.getProductDetails = function () {
        return "".concat(this.id, "-").concat(this.name, "-").concat(this.price, "-").concat(this.quantity);
    };
    return Product;
}());
var laptop = new Product(101, 'Dell Latitude', 35000.50, 12);
console.log(laptop.getProductDetails());
