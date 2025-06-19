package functional

data class Customer(var name: String, var age: Int)

fun main() {
    val customer = Customer("user1", 30)

    // let: 결과를 반환하고, it으로 참조 (주로 null-safe 처리에 사용)
    val greeting = customer.let {
        println("Name : ${it.name}")
        "test customer ${it.name}"
    }
    println(greeting)

    // run: 객체를 this로 참조하고, 결과 반환 (초기화 + 계산)
    val customerInfo = customer.run {
        println("Running for ${name}")
        "Age : $age"
    }
    println(customerInfo)

    // also : it으로 참조, 객체 자체를 반환 (로깅/디버깅에 적합)
    val updated = customer.also {
        println("Before update : $it")
        it.age -= 1
    }
    println("After update: $updated")

    //apply : this로 참조, 객체 자체를 반환(빌더 패턴처럼)
    val configuredCustomer = Customer("temp", 0).apply {
        name = "user2"
        age = 20
    }
    println("Configured : $configuredCustomer")

    //with: 파라미터를 this 로 참조, 결과 반환(객체를 전달하는 함수형 방식)
    val description = with(customer) {
        "Customer name : $name, age: $age"
    }
    println(description)
}