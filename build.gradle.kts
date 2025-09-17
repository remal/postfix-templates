plugins {
    java
    idea
    eclipse
}

/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

dependencies {
    implementation("com.google.guava:guava:33.5.0-jre")
}

/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

idea {
    module {
        isDownloadJavadoc = true
        isDownloadSources = true
    }
}

eclipse {
    classpath {
        isDownloadJavadoc = true
        isDownloadSources = true
    }
}
