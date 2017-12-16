# app-starter

## Getting started

In Ammonite-REPL:

```scala
(() => {
  print("app name: ")
  val appName = io.StdIn.readLine

  val tmpDir = tmp.dir()

  %wget("https://github.com/ayakovlenko/app-starter/archive/master.zip", "-P", tmpDir)

  %unzip(tmpDir/"master.zip", "-d", tmpDir)

  mv(tmpDir/"app-starter-master", wd/appName)

  rm! tmpDir
})()
```
