// 9. Make the function of the preceding exercise a recursive function.
def productOfLetters(inputString: String) : BigInt = {
    inputString.foldLeft(1:BigInt)((accumulator, nextChar) => accumulator * nextChar)
}