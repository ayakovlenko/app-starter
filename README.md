# app-starter

## Getting started

In [Ammonite-REPL](http://ammonite.io/):

```scala
(() => {
  print("app name: ")
  val appName = io.StdIn.readLine

  val tmpDir = tmp.dir()

  %wget("https://github.com/ayakovlenko/app-starter/archive/master.zip", "-P", tmpDir)

  %unzip(tmpDir/"master.zip", "-d", tmpDir)

  mv(tmpDir/"app-starter-master", wd/appName)

  // Delete app-starter's README.md
  rm! wd/"README.md"

  rm! tmpDir
})()
```

Checklist:

- [ ] Change name in root `build.sbt`
- [ ] Declare needed dependencies in `/project/Dependencies.scala`
- [ ] Upgrade libraries (`sbt dependencyUpdates`)
