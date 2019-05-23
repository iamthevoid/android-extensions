package iam.thevoid.rxe

import io.reactivex.Maybe

fun <T> Maybe<T>.toFlowableLatest() = toObservable().toFlowableLatest()
fun <T> Maybe<T>.toFlowableBuffer() = toObservable().toFlowableBuffer()
fun <T> Maybe<T>.toFlowableDrop() = toObservable().toFlowableDrop()
fun <T> Maybe<T>.toFlowableError() = toObservable().toFlowableError()
fun <T> Maybe<T>.toFlowableMissing() = toObservable().toFlowableMissing()