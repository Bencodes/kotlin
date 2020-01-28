// !DIAGNOSTICS: -UNUSED_VARIABLE
// !WITH_NEW_INFERENCE
// FULL_JDK

import java.util.*

fun bar(): String? = null
val nullableInt: Int? = null

fun hashMapTest() {
    var x: HashMap<String, Int?> = HashMap<String, Int?>()
    x.<!INAPPLICABLE_CANDIDATE!>put<!>(null, null)
    x.put("", null)
    x.<!INAPPLICABLE_CANDIDATE!>put<!>(bar(), 1)
    x.put("", 1)

    <!INAPPLICABLE_CANDIDATE!>x[null] = 1<!>
    <!INAPPLICABLE_CANDIDATE!>x[bar()] = 1<!>
    x[""] = nullableInt
    x[""] = 1

    val b1: MutableMap<String, Int> = x
    val b2: MutableMap<String, Int?> = x
    val b3: Map<String, Int> = x
    val b4: Map<String, Int?> = x
    val b5: Map<String?, Int?> = x

    val b6: Int = x[""]
    val b7: Int = x.get("")

    val b8: Int? = x.get("")
}

fun treeMapTest() {
    var x: TreeMap<String, Int?> = TreeMap<String, Int?>()
    x.<!INAPPLICABLE_CANDIDATE!>put<!>(null, null)
    x.put("", null)
    x.<!INAPPLICABLE_CANDIDATE!>put<!>(bar(), 1)
    x.put("", 1)

    <!INAPPLICABLE_CANDIDATE!>x[null] = 1<!>
    <!INAPPLICABLE_CANDIDATE!>x[bar()] = 1<!>
    x[""] = nullableInt
    x[""] = 1

    val b1: MutableMap<String, Int> = x
    val b2: MutableMap<String, Int?> = x
    val b3: Map<String, Int> = x
    val b4: Map<String, Int?> = x
    val b5: Map<String?, Int?> = x

    val b6: Int = x[""]
    val b7: Int = x.get("")

    val b8: Int? = x.get("")
}
