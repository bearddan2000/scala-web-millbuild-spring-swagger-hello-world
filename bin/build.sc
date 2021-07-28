import mill._, scalalib._

// `HelloWorld` must match the subdirectory name
object Spring extends ScalaModule {
    def scalaVersion = "2.12.9"

    def ivyDeps = Agg(
      ivy"io.springfox:springfox-swagger2:2.9.2",
      ivy"io.springfox:springfox-swagger-ui:2.9.2",
      ivy"org.springframework.boot:spring-boot-starter-web:1.3.2.RELEASE"
    )
}
