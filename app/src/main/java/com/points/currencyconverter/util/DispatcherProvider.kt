package com.points.currencyconverter.util

import kotlinx.coroutines.CoroutineDispatcher

//in our test cases we can pass the test dispatcher for all of those
//viewModel choose test dispatcher for all test cases and just normal dispatchers for our real app
//불필요해보일 수 있지만 테스트를 위해 필요한 코드들이다. (큰 프로젝트 대비)
interface DispatcherProvider {
    val main: CoroutineDispatcher
    val io: CoroutineDispatcher
    val default: CoroutineDispatcher
    val unconfined: CoroutineDispatcher
}
