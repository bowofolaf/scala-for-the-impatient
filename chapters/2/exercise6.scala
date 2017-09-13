// 6. Write a for loop for computing the product of the Unicode codes of all letters
// in a string. For example, the product of the characters in "Hello" is 9415087488.
def productOfLetters(inputString: String) : BigInt = {
    var product:BigInt = 1
    for(letter <- inputString) product *= letter
    product
}