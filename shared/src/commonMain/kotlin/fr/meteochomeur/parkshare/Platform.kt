package fr.meteochomeur.parkshare

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform