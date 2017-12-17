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

  rm! tmpDir
})()
```

Checklist:

- [ ] Change name in root `build.sbt`
- [ ] Delete app-starter's README.md
- [ ] Declare needed dependencies in `/project/Dependencies.scala`
- [ ] Upgrade libraries (`sbt dependencyUpdates`)
