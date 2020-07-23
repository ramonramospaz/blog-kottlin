package com.example.blogkottlin

import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class BlogConfiguration {

    @Bean
    fun databaseInitializer(userRepository: UserRepository,
                            articleRepository: ArticleRepository) = ApplicationRunner {

        val smaldini = userRepository.save(User("ramonramos", "Ramon", "Ramos"))
        articleRepository.save(Article(
                title = "The Last of the Moon Girls",
                headline = "A novel of secrets, memory, family, and forgiveness by the bestselling author of When Never Comes.",
                content = "Lizzy Moon never wanted Moon Girl Farm. Eight years ago, she left the land that nine generations of gifted healers had tended, determined to distance herself from the whispers about her family’s strange legacy. But when her beloved grandmother Althea dies, Lizzy must return and face the tragedy still hanging over the farm’s withered lavender fields: the unsolved murders of two young girls, and the cruel accusations that followed Althea to her grave.\n" +
                        "Lizzy wants nothing more than to sell the farm and return to her life in New York, until she discovers a journal Althea left for her—a Book of Remembrances meant to help Lizzy embrace her own special gifts. When she reconnects with Andrew Greyson, one of the few in town who believed in Althea’s innocence, she resolves to clear her grandmother’s name.\n" +
                        "But to do so, she’ll have to decide if she can accept her legacy and whether to follow in the footsteps of all the Moon women who came before her.",
                author = smaldini
        ))
        articleRepository.save(Article(
                title = "Opium and Absinthe: A Novel",
                headline = "From the bestselling author of A Beautiful Poison comes another spellbinding historical novel full of intrigue, occult mystery, and unexpected twists.",
                content = "New York City, 1899. Tillie Pembroke’s sister lies dead, her body drained of blood and with two puncture wounds on her neck. Bram Stoker’s new novel, Dracula, has just been published, and Tillie’s imagination leaps to the impossible: the murderer is a vampire. But it can’t be—can it?\n" +
                        "A ravenous reader and researcher, Tillie has something of an addiction to truth, and she won’t rest until she unravels the mystery of her sister’s death. Unfortunately, Tillie’s addicted to more than just truth; to ease the pain from a recent injury, she’s taking more and more laudanum…and some in her immediate circle are happy to keep her well supplied.\n" +
                        "Tillie can’t bring herself to believe vampires exist. But with the hysteria surrounding her sister’s death, the continued vampiric slayings, and the opium swirling through her body, it’s becoming increasingly difficult for a girl who relies on facts and figures to know what’s real—or whether she can trust those closest to her.",
                author = smaldini
        ))
        articleRepository.save(Article(
                title = "The Little Prince",
                headline = "From the bestselling author of A Beautiful Poison comes another spellbinding historical novel full of intrigue, occult mystery, and unexpected twists.",
                content = "Few stories are as widely read and as universally cherished by children and adults alike as The Little Prince. Richard Howard's new translation of the beloved classic--published to commemorate the 100th anniversary of Antoine de Saint-Exupéry's birth--beautifully reflects Saint-Exupéry's unique and gifted style. Howard has excelled in bringing the English text as close as possible to the French, in language, style, and most important, spirit. The artwork in this new edition has been restored to match in detail and in color Saint-Exupéry's original artwork. Harcourt is proud to introduce the definitive English-language edition of The Little Prince. It will capture the hearts of readers of all ages.\n" +
                        "This title has been selected as a Common Core Text Exemplar (Grades 4-5, Stories)\n" +
                        "Note: So that ebook readers can experience this highly illustrated book in its original layout, this ebook is provided in a fixed format (text is not resizable or reflowable).",
                author = smaldini
        ))
    }
}