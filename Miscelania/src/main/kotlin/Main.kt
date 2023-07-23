import kotlin.math.PI

fun main(args: Array<String>) {
    var options = ""
    print("Ingrese donde quiere acceder: \n 1.Operadores \n2.Condicionales \n3. Ciclos\n")
    options = readLine().toString()
    when (options) {
        "1" -> {
            println("Operadores: \n Ingrese el ejercicio que desea realizar:\n1.Ejercicio 1 \n 2.Ejercicio 2 \n 3.Ejercicio 3 \n 4.Ejercicio 4 \n 5.Ejercicio 5 \n 6.Ejercicio 6 \n 7.Ejercicio 7")
            val operator = readLine()?.toIntOrNull()
            when (operator) {
                1 -> triangleArea()
                2 -> sumNumbers()
                3 -> numberSquare()
                4 -> convertDolar()
                5 -> operationSquare()
                6 -> calculateAreaVolume()
                7 -> computeCircumference()
                else -> println("Opción inválida")
            }
        }
        "2" -> {
            println("Condicionales: \n Ingrese el ejercicio que desea realizar:\n1.Ejercicio 1 \n 2.Ejercicio 2 \n 3.Ejercicio 3 \n 4.Ejercicio 4 \n 5.Ejercicio 5 \n 6.Ejercicio 6 \n 7.Ejercicio 7")
            val operator = readLine()?.toIntOrNull()
            when (operator) {
                1 -> PositiveNegative()
                2 -> MajorMinor()
                3 -> determineMayorMinor()
                4 -> AB()
                5 -> calculateQuotient()
                6 -> twoNumbersMultiply()
                7 -> Bisiesto()
                else -> println("Opción inválida")
            }
        }
        "3" -> {
            println("Ciclos: \n Ingrese el ejercicio que desea realizar:\n1.Ejercicio 1 \n 2.Ejercicio 2 \n 3.Ejercicio 3 \n 4.Ejercicio 4 \n 5.Ejercicio 5 \n 6.Ejercicio 6 \n 7.Ejercicio 7")
            val operator = readLine()?.toIntOrNull()
            when (operator) {
                1 -> multiples()
                2 -> impars()
                3 -> pars()
                4 -> cuadreNumbers()
                5 -> sumCuadres()
                6 -> KeyboradNumbers()
                7 -> sumNumberZero()
                else -> println("Opción inválida")
            }
        }
        else -> println("Opción inválida")
    }
}


//Operadores

//Calcular el área de un triángulo.
fun triangleArea(){
    println("Ingrese la base del triangulo")
    val triangleBase = readln().toInt()
    println("Ingrese la altura del triangulo")
    val triangleHeight = readln().toInt()
    val triangleArea = (triangleBase*triangleHeight)/2

    println("$triangleArea")

}

//Ingresar dos números por teclado y sumarlos.
fun sumNumbers(): Double {
        println("Ingresa el primer número:")
        val num1 = readLine()!!.toDouble()
        println("Ingresa el segundo número:")
        val num2 = readLine()!!.toDouble()
        return num1 + num2
}

//Ingresar un número y visualizar el número elevado al cuadrado.
fun numberSquare(): Double {
    println("Ingresa un numero")
    val number = readLine()!!.toDouble()
    return number * number
}

//Ingresar un número y visualizar el número elevado al cuadrado.
fun convertDolar() {
    println("Ingrese la cantidad de euros: ")
    val euros = readLine()?.toDoubleOrNull() ?: 0.0
    println("Ingrese el valor del dolar")
    val dolar = readLine()?.toDoubleOrNull() ?: 0.0
    val wheel = euros / dolar
    println("euro: $euros \nel precio del Dolar es: $dolar \nla conversión es $wheel")
}

//Escribir un algoritmo que pida el lado de un cuadrado y muestre el valor del área y del
//perímetro
fun operationSquare(){
    println("Por favor ingrese el lado del cuadrado")
    val lade = readln().toInt()
    val area=lade*lade
    val perimeter=lade*4
    println("El area del cuadrado es: $area \n El perimetro del cuadrado es: $perimeter")
}

//Escribir un algoritmo que determine el área y el volúmen de un cilindro.

fun main() {
    val (area, volume) = calculateAreaVolume()
    println("Área del cilindro: $area")
    println("Volumen del cilindro: $volume")
}

fun calculateAreaVolume(): Pair<Double, Double> {
    println("Ingresa el radio del cilindro:")
    val radio = readLine()?.toDouble() ?: 0.0
    println("Ingresa la altura del cilindro:")
    val altura = readLine()?.toDouble() ?: 0.0

    val area = 2 * PI * radio * (radio + altura)
    val volume = PI * radio * radio * altura

    return area to volume
}

//Realizar un algoritmo que lea el radio de una circunferencia y escriba la longitud de la misma y
//el área (pi*r)^2 del círculo inscrito.

fun computeCircumference() {
    println("Ingresa el radio de la circunferencia:")
    val radio = readLine()?.toDouble() ?: 0.0

    val circunferencia = 2 * PI * radio
    val areaCirculoInscrito = PI * radio * radio

    println("Longitud de la circunferencia: $circunferencia")
    println("Área del círculo inscrito: $areaCirculoInscrito")
}

//Calcular el promedio de tres (3) números ingresados por teclado
fun calculateAverage(): Double {
    println("Ingresa el primer número:")
    val num1 = readLine()!!.toDouble()
    println("Ingresa el segundo número:")
    val num2 = readLine()!!.toDouble()
    println("Ingresa el tercer número:")
    val num3 = readLine()!!.toDouble()

    return (num1 + num2 + num3) / 3
}



//condicionales

//Escribir un algoritmo para saber si el número ingresado por teclado es positivo o negativo.

fun PositiveNegative() {
    print("Enter a number: ")
    val num = readLine()?.toDouble()

    if (num ?: 0.0 > 0) {
        println("The number is positive")
    } else if (num ?: 0.0 < 0) {
        println("The number is negative")
    } else {
        println("The number is neutral")
    }
}

fun MajorMinor() {
    print("ingrese el primer numeror: ")
    val number1 = readLine()?.toDouble()

    print("ingrese el segundo numero: ")
    val number2 = readLine()?.toDouble()

    if (number1 ?: 0.0 > number2 ?: 0.0) {
        println("el numero mas grande es: ${number1 ?: 0.0}")
        println("el numero mas pequeños es: ${number2 ?: 0.0}")
    } else if (number1 ?: 0.0 < number2 ?: 0.0) {
        println("el numero mas grande es: ${number2 ?: 0.0}")
        println("el numero mas pequeños es: ${number1 ?: 0.0}")
    } else {
        println("los dos numeros son iguales")
    }
}

fun determineMayorMinor() {
    print("ingrese el primar numero: ")
    val num1 = readLine()?.toDouble()

    print("ingrese el segundo numero: ")
    val num2 = readLine()?.toDouble()

    print("ingrese el tercer numero ")
    val num3 = readLine()?.toDouble()

    val major = if (num1 ?: 0.0 > num2 ?: 0.0 && num1 ?: 0.0 > num3 ?: 0.0) {
        num1 ?: 0.0
    } else if (num2 ?: 0.0 > num1 ?: 0.0 && num2 ?: 0.0 > num3 ?: 0.0) {
        num2 ?: 0.0
    } else {
        num3 ?: 0.0
    }

    val minor = if (num1 ?: 0.0 < num2 ?: 0.0 && num1 ?: 0.0 < num3 ?: 0.0) {
        num1 ?: 0.0
    } else if (num2 ?: 0.0 < num1 ?: 0.0 && num2 ?: 0.0 < num3 ?: 0.0) {
        num2 ?: 0.0
    } else {
        num3 ?: 0.0
    }

    println("el numero mas grande es: $major")
    println("el numero mas pequeño es: $minor")
}

//Dados dos números A y B, sumarlos si A es menor que B o sino restarlos.

fun AB(){
    println("Ingrese el numero A")
    var numberA = readln().toInt()
    println("Ingrese el numero B")
    var numberB = readln().toInt()
    if (numberA<numberB){
        print("El numero menor es A")
        var   resulted=numberA+numberB
        println("El resultado es $resulted")
    }else if (numberA>numberB){
        print("El numero menor es B")
        var   resulted=numberA-numberB
        println("El resultado es $resulted")
    }
}

//Dados dos números A y B encontrar el cociente entre A y B. Recordar que la división por cero
fun calculateQuotient() {
    println("Ingrese el valor de A:")
    val numA = readLine()?.toDoubleOrNull()

    println("Ingrese el valor de B:")
    val numB = readLine()?.toDoubleOrNull()

    if (numA == null || numB == null) {
        println("Error: Ingrese valores numéricos válidos para A y B.")
    } else if (numB == 0.0) {
        println("Error: La división por cero no es posible.")
    } else {
        val cociente = numA / numB
        println("El cociente entre $numA y $numB es: $cociente")
    }
}

//Dados dos números A y B, sumarlos si al menos uno de ellos es negativo, en caso contrario
//multiplicarlos.

fun twoNumbersMultiply() {
    println("Ingrese el valor de A:")
    val numA = readLine()?.toDoubleOrNull()

    println("Ingrese el valor de B:")
    val numB = readLine()?.toDoubleOrNull()

    if (numA == null || numB == null) {
        println("Error: Ingrese valores numéricos válidos para A y B.")
    } else {
        val result = if (numA < 0 || numB < 0) {
            numA + numB
        } else {
            numA * numB
        }
        println("El resultado es: $result")
    }
}

//Escribir un algoritmo que determine si un año es bisiesto o no.
fun esBisiesto(year: Int): Boolean {
    return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)
}

fun Bisiesto() {
    println("Ingrese un año:")
    val year = readLine()?.toIntOrNull()

    if (year == null) {
        println(" Ingrese un año válido.")
    } else {
        if (esBisiesto(year)) {
            println("$year es un año bisiesto.")
        } else {
            println("$year no es un año bisiesto.")
        }
    }
}



//Ciclos

//Imprimir todos los múltiplos de 3 que hay entre 1 y 100.
fun multiples() {
    println("Múltiplos de 3 entre 1 y 100:")
    for (num in 1..100) {
        if (num % 3 == 0) {
            println(num)
        }
    }
}

// Imprimir los números impares entre 0 y 100.
fun impars() {
    println("Números impares entre 0 y 100:")
    for (num in 1..100 step 2) {
        println(num)
    }
}

//Imprimir los números pares del 1 al 100:
fun pars() {
    println("Números pares entre 1 y 100:")
    for (num in 2..100 step 2) {
        println(num)
    }
}

//Imprimir los cuadrados de los números del 1 al 30:
fun cuadreNumbers() {
    println("Cuadrados de los números del 1 al 30:")
    for (num in 1..30) {
        val square = num * num
        println("$num al cuadrado es: $square")
    }
}

//Escribir un programa que sume los cuadrados de los cien primeros números naturales,
//mostrando el resultado en pantalla.
fun sumCuadres() {
    var sumSquare = 0

    for (num in 1..100) {
        sumSquare += num * num
    }

    println("La suma de los cuadrados de los cien primeros números naturales es: $sumSquare")
}

//Generar y mostrar todos los números comprendidos entre dos números naturales en secuencia ascendente
fun KeyboradNumbers() {
    println("Ingrese el primer número (menor):")
    val numberMinor = readLine()?.toIntOrNull()

    println("Ingrese el segundo número (mayor):")
    val numberMajor = readLine()?.toIntOrNull()

    if (numberMinor == null || numberMajor == null || numberMinor >= numberMajor) {
        println("Error: Ingrese dos números naturales en el orden correcto.")
    } else {
        println("Números comprendidos entre $numberMinor y $numberMajor:")
        for (num in numberMinor..numberMajor) {
            println(num)
        }
    }
}

//Sumar todos los números ingresados por teclado mientras no sea cero
fun sumNumberZero() {
    var addition = 0

    do {
        println("Ingrese un número (ingrese 0 para terminar):")
        val number = readLine()?.toIntOrNull() ?: 0

        addition += number
    } while (number != 0)

    println("La suma total es: $addition")
}



























