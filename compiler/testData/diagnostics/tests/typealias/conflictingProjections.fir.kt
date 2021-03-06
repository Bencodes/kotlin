// !DIAGNOSTICS: -UNUSED_VARIABLE -UNUSED_PARAMETER

interface In<in T>
interface Out<out T>

typealias InAlias<T> = In<T>
typealias OutAlias<T> = Out<T>

typealias TestOutForIn<T> = In<out T>
typealias TestInForOut<T> = Out<in T>

typealias TestOutForInWithinAlias<T> = InAlias<out T>
typealias TestInForOutWithinAlias<T> = OutAlias<in T>

fun <T> testOutForInWithinResolvedType(x: InAlias<out T>) {}
fun <T> testInForOutWithinResolvedType(x: OutAlias<in T>) {}
