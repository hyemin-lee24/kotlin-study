package oop

data class UserInfo(val name: String, val age: Int, val email: String? = null)

interface Users {
    val info: UserInfo
    fun login()
    fun logout()
}

class RegularUser(override val info: UserInfo) : Users {
    override fun login() {
        println("${info.name}님이 정규 사용자로 로그인했습니다.")
    }
    override fun logout() {
        println("${info.name}님이 로그아웃했습니다.")
    }
}

class AdminUser(override val info: UserInfo, val adminLevel: Int) : Users {
    override fun login() {
        println("관리자 ${info.name}님 (레벨 $adminLevel)이 로그인했습니다.")
    }
    override fun logout() {
        println("관리자 ${info.name}님이 로그아웃했습니다.")
    }
}

class UserFactory private constructor() {
    companion object {
        fun createRegularUser(name: String, age: Int, email: String? = null): Users {
            val info = UserInfo(name, age, email)
            println("RegularUser 생성: $info")
            return RegularUser(info)
        }

        fun createAdminUser(name: String, age: Int, adminLevel: Int, email: String? = null): Users {
            val info = UserInfo(name, age, email)
            println("AdminUser 생성: $info, 레벨: $adminLevel")
            return AdminUser(info, adminLevel)
        }
    }
}

fun main() {
    val user1 = UserFactory.createRegularUser("Alice", 28, "alice@example.com")
    val user2 = UserFactory.createAdminUser("Bob", 35, 2)

    user1.login()
    user2.login()

    user1.logout()
    user2.logout()
}
