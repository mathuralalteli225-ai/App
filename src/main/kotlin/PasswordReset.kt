package auth

/**
 * Simple password reset helpers.
 * Note: these are basic examples — consider adding proper validation,
 * email sending, and secure password handling for production use.
 */
fun requestPasswordReset(email: String): String {
    return if (email.contains("@") && email.contains(".")) {
        "Reset link/OTP sent to $email"
    } else {
        "Please enter a valid email"
    }
}

fun resetPassword(newPassword: String): String {
    return if (newPassword.length >= 8) {
        "Password changed successfully"
    } else {
        "Password must be at least 8 characters"
    }
}
