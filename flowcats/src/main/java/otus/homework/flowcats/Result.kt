package otus.homework.flowcats

import java.lang.Exception

sealed class Result<out T: Any> {
    data class Success<out T: Any>(val data: T):Result<T>()
    data class Error(val exception: String):Result<Nothing>()
}