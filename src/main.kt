import com.brianmj.math.*
import java.nio.Buffer
import java.nio.ByteBuffer
import java.nio.ByteOrder



// Testing Vector4 stuff
fun main(args: Array<String>){
    val v1 = Vector4(1f, 0f, 0f, 2f)
    val v2 = Vector4(3f, 0f, 4f, 4f)

    v2.set(9f, 8f, 6f, 7f)


    println(v1)
    println(v2)
    println(v1.length)
    println(v2.length)
    println(v1.lengthSqr)
    println(v2.lengthSqr)
    println(v1.normalized)
    println(v2.normalized)

    val v3 = Vector4(1f, 0f, 0f, 0f)
    val v4 = Vector4(0f, 1f, 0f, 0f)
    val v5 = Vector4(-1f, 0f, 0f, 0f)

    val v6 = Vector4(5f, -2f, 1f, 6f)
    val v7 = Vector4(1f, 0f, 1f, 2f)

    println(v3.dot(v5))
    println(v5.cross(v4))

    println(v3 + v4)
    println(v6 + v7)
    println(v6 - v7)
    println(-v6)

    val bb = ByteBuffer.allocateDirect(4 * 8).order(ByteOrder.nativeOrder())
    val fb = bb.asFloatBuffer()
    val fa = v6.toList

    println(fa)
    val cin = mutableListOf(v6, v7)


    val cout = cin.flatMap { it.toList }.toFloatArray()


    println("Size of cout is ${cout.size}")
    for (fl in cout) {
        println(fl)
    }

    fb.put(cout).flip()
    println(fb)
    println(v6 * 2f)



    println("----End of Vector4 test")

    arrayListOf(Vector3(), Vector3())


    val b = cin.makeBufferVector4()
    println(b.hasArray())

}

/*Testing Vector3 stuff
fun main(args: Array<String>){
    val a = Vector3(1.0f, 1.0f, 0.0f)
    val b = Vector3(1.0f, 2.0f, 4.0f)
    val c = a + b
    val d = a - b
    println("Length of a is ${a.length}")
    println("Length square of a is ${a.lengthSqr}")
    println("a normalized is ${a.normalized}")
    println(c)
    println(d)
    println(-b)
    println(5f * b)
    println(b * -5f)
    println(b / 2f)
    println(24f / b)
    val e = Vector3(1f, 0f, 0f)
    val f = Vector3(0f, 1f, 0f)
    val g = Vector3(1f, 0f, 0f)
    println(e.dot(f))
    println(e.dot(g))
    println(e.cross(f))
}*/

/* Testing Vector2 stuff
fun main(args: Array<String>){
    val p = Point(0f, -1f)
    val i = Point(1f, 1f)
    val c = Point(2f, -1f)
    val cp = p - c
    val ip = p - i
    val cPLengthSqr = cp.lengthSqr
    val ipLengthSqr = ip.lengthSqr
    println("Length squared of cp $cPLengthSqr")
    println("Length squared of ip $ipLengthSqr")
    /*val p1 = Point(1.0f, 0.0f)
    val v = Vector2(2.0f, 3.0f)
    val p2 = p1.addVector(v)
    /*println(p2)
    println(p2 - p1)
    println(p2 + p1)
    println((p2 + p1).length)
    println((p2 + p1) * 0.5f)
    println((p2 + p1) / 3.0f)*/

    /*val p3 = Point(3.0f, 4.0f)
    val p4 = Point(1.0f, 2f)
    val v2 = p3 - p4
    val normalized = v2.normalized
    println(normalized.xDir)
    println(normalized.yDir)
    println(normalized.length)*/

    /*val v1 = Vector2(4f, 0f)
    val v2 = Vector2(0f, -5f)
    val r = v1 - v2
    println(r)
} */