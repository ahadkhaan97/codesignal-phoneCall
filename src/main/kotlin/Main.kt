fun main() {
    print(solution(3, 1, 2, 20))
}

fun solution(min1: Int, min2_10: Int, min11: Int, s: Int): Int {
    var amountLeft = s
    var minutes = 0

    if (amountLeft - min1 >= 0) {
        amountLeft -= min1
        minutes++
    } else {
        return minutes
    }

    for (i in 0 until 9) {
        if (amountLeft - min2_10 >= 0) {
            amountLeft -= min2_10
            minutes++
        } else {
            return minutes
        }
    }

    while (amountLeft - min11 >= 0) {
        amountLeft -= min11
        minutes++
    }

    return minutes
}
