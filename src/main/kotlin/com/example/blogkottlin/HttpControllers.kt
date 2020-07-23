package com.example.blogkottlin

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import org.springframework.web.server.ResponseStatusException
import kotlin.math.log

@RestController
@RequestMapping("/api/article")
class ArticleController(private val repository: ArticleRepository,private val userRepository: UserRepository) {

    @GetMapping("/")
    fun findAll() = repository.findAllByOrderByAddedAtDesc()

    @GetMapping("/{slug}")
    fun findOne(@PathVariable slug: String) =
            repository.findBySlug(slug) ?: ResponseStatusException(HttpStatus.NOT_FOUND, "This article does not exist")

    @PostMapping("/{login}")
    fun createArticleByUser(@PathVariable login: String,@RequestBody article: InputArticle):String {
        var user = userRepository.findByLogin(login) ?: ResponseStatusException(HttpStatus.NOT_FOUND, "This user does not exist")
        repository.save(Article(
                title = article.title,
                headline = article.headline,
                content = article.content,
                author = user as User
        ))
        return "Article added"
    }

}

@RestController
@RequestMapping("/api/user")
class UserController(private val repository: UserRepository) {

    @GetMapping("/")
    fun findAll() = repository.findAll()

    @GetMapping("/{login}")
    fun findOne(@PathVariable login: String) =
            repository.findByLogin(login) ?: ResponseStatusException(HttpStatus.NOT_FOUND, "This user does not exist")

    @PostMapping("/")
    fun createUser(@RequestBody user: User): String {
        repository.save(user)
        return "User saved"
    }
}