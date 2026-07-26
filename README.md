# lightweight android app

- let's create lightweight android-app
- version gradle `8.7`

## setup project

- let's download and build dependencies

```sh
./gradlew wrapper --gradle-version 8.7 
```

- compile and install

```sh
./gradlew clean
./gradlew installDebug
```

- additional example

```sh
./gradlew installDebug --continous
./gradlew installDebug -t
```

- mode watch

```sh
./gradlew installDebug --continous
adb shell am start -n com.myapp.hello/.MainActivity
```

- add keystore

```sh
./gradlew assembleRelease
./gradlew bundleRelease
```

## references

- please check out [can you really develop android apps without android studio](https://medium.com/@sdiony/can-you-really-develop-android-apps-without-android-studio-cdd9b951de65)
