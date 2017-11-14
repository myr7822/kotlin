// TARGET_BACKEND: JVM
// FILE: text.kt
import p.*

fun box() = J.foo(Derived())

// FILE: p/J.java
package p;

public class J {
    public static String foo(PackagePrivate pp) {
        return "OK";
    }
}

// FILE: p/PackagePrivate.java
package p;

class PackagePrivate {}

// FILE: p/Derived.java
package p;

public class Derived extends PackagePrivate {}

