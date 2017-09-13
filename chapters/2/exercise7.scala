// 7. Solve the preceding exercise without writing a loop. (Hint: Look at the StringOps
// Scaladoc.)
def productOfLetters(inputString: String) : BigInt = {
    inputString.foldLeft(1:BigInt)((accumulator, nextChar) => accumulator * nextChar)
}