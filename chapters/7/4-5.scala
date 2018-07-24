// 4. why do u think scala language designers provided the package object syntax

// ans: To control scope

// 5. Whats the meaning of 
// private[com] def giveRaise(rate: Double)
// ans: it limits the scope of giveRaise to the com package

// Is it very useful?
// ans: No. Most packages are children of "com" and therefore this function wont be 
// very private at all and can be accessed by a lot of unrelated code