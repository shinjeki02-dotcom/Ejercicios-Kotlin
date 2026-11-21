open class Notificacion {
    open fun enviar() {
        println("Enviando una notificacion general.")
    }
}

class NotificacionCorreo : Notificacion() {
    override fun enviar() {
        println("Enviando notificacion por correo electronico.")
    }
}

class NotificacionSMS : Notificacion() {
    override fun enviar() {
        println("Enviando notificacion por mensaje SMS.")
    }
}

class NotificacionPush : Notificacion() {
    override fun enviar() {
        println("Enviando notificacion push al dispositivo.")
    }
}

fun main() {
    val notificaciones: List<Notificacion> = listOf(
        NotificacionCorreo(),
        NotificacionSMS(),
        NotificacionPush()
    )

    for (notificacion in notificaciones) {
        notificacion.enviar()
    }
}