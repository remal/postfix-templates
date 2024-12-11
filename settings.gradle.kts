plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

rootProject.name = "postfix-templates"

@Suppress("UnstableApiUsage") // dependencyResolutionManagement is still 'incubating'
dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
}

buildCache {
    local {
        directory = gradle.gradleUserHomeDir.resolve("build-cache")
    }
}
