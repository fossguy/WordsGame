/*
 * Copyright 2019 fossguy
 * 956A272C42EEE8A44FC6BCE932B687627C15D82E53B336C51E4E6D805889610A
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

class WordGame {

    private val typedWords = hashSetOf<String>()

    fun playGame() {
        println("Welcome!")
        println("Type all the words you know! Duplicates not allowed!")
        println("Press 'q' to exit...Have fun!")
        println("++".repeat(25))

        do {
            print("> ")
            val word: String = readLine()!!.toLowerCase()
            if (!typedWords.add(word))
                println("You already typed '$word'! Type another word...")
        } while (word != "q")
    }
}

fun main() {
    WordGame().playGame()
}
