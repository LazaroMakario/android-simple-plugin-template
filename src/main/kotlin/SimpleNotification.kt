import com.intellij.notification.Notification
import com.intellij.notification.NotificationType
import com.intellij.notification.Notifications
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

class SimpleNotification : AnAction() {

    override fun actionPerformed(event: AnActionEvent) {
        val notification = Notification(
            "Test Notification",
            "Simple notification",
            "Hello world!",
            NotificationType.INFORMATION
        )
        Notifications.Bus.notify(notification)
    }

}