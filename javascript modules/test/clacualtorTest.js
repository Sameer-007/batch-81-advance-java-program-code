import { assert } from 'chai';
import { addition, subtraction } from '../src/calculator.js'


describe('My First JavaScript Test Suite', () => {

    it('Addition of Two Numbers with Valid Data', () => {
        let add = addition(10, 20);

        assert.equal(300, add);

    });

    it("Subtraction of Two Numbers with valid data", () => {
        let sub = subtraction(10, 20);
        assert.equal(-10, sub)
    });


});