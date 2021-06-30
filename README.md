# Stone

<img src="https://github.com/okuzawats/kotlin-stone/actions/workflows/test.yaml/badge.svg?branch=main"> <img src="https://github.com/okuzawats/kotlin-stone/actions/workflows/lint.yaml/badge.svg?branch=main">

A minimal library for Android / Kotlin that offers Option and Either.

## activate
Add the maven repository to root build.gradle.

```groovy
allprojects {
  repositories {
    maven {
      url 'http://okuzawats.github.io/kotlin-stone/'
    }
  }
}
```

Add the dependency to module's build.gradle.

```groovy
dependencies {
  implementation "com.okuzawats:stone:x.y.z"
}
```
