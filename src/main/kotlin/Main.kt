fun main() {
    var names = arrayOf("bellah","shaturah","jane","rayan")
    var ages = arrayOf(21,24,20,19)
    var phoneNumber= arrayOf(1778150769,701357713,2106621604,1057210412)
    val weight= arrayOf(45,56,60,61)
    var citizenship = true

    var student1=  arrayOf(names[0],ages[0],phoneNumber[0],weight[0], citizenship)
    println(student1.contentDeepToString())
    var student2=  arrayOf(names[1],ages[1],phoneNumber[1],weight[1],!citizenship,)
    println(student2.contentDeepToString())
    var student3=  arrayOf(names[2],ages[2],phoneNumber[2],weight[2],!citizenship,)
    println(student3.contentDeepToString())
    var student4=  arrayOf(names[3],ages[3],phoneNumber[3],weight[3],citizenship,)
    println(student4.contentDeepToString())

}