// 9. Make the function of the preceding exercise a recursive function.
def productOfLetters(inputString: String) : BigInt = {
    if(inputString.length == 0) 1
    else
        inputString.head * productOfLetters(inputString.tail)
}