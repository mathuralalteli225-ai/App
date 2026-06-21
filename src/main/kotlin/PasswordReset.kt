package auth

/**
 * See My Password — Simple password reset helpers.
 *
 * Note: These are minimal examples — add proper validation, secure OTP/reset links,
 * password hashing and secure storage before using in production.
 */

private val EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$".toRegex()

fun requestPasswordReset(email: String): String {
    return if (EMAIL_REGEX.matches(email)) {
        // TODO: generate OTP/reset link and send via email
        "Reset link/OTP sent to $email"
    } else {
        "Please enter a valid email"
    }
}

fun resetPassword(newPassword: String, confirmPassword: String = newPassword): String {
    if (newPassword != confirmPassword) {
        return "Passwords do not match"
    }
    if (newPassword.length < 8) {
        return "Password must be at least 8 characters"
    }
    // TODO: hash the password and persist securely
    return "Password changed successfully"
}
