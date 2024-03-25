import kotlin.math.PI

fun main() {
myStrings("Barnie bakes brown bagels and burns")
    println(calculations(arrayOf(12,10,5)))
    isPalindrome("Student" )
    volume(4)

}
fun myStrings(words:String){
    println(words)



}
fun calculations(values:Array<Int>):Int{
    return values.sum()
    values.average()
    values.count()
}
fun volume(radius:Int){
    var area = radius*3 * PI * 4/3
    println(area)
}
fun isPalindrome(word:String):Boolean{
    if  ('$word is palindrome"
      return false
    else return  true')
}