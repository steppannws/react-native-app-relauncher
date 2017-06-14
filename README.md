
# react-native-app-relauncher

## Getting started

`$ npm install react-native-app-relauncher --save`

### Mostly automatic installation

`$ react-native link react-native-app-relauncher`

### Manual installation


#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import io.stepan.RNAppRelauncherPackage;` to the imports at the top of the file
  - Add `new RNAppRelauncherPackage(MainActivity.activity)` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-app-relauncher'
  	project(':react-native-app-relauncher').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-app-relauncher/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-app-relauncher')
  	```


## Usage
```javascript
import RNAppRelauncher from 'react-native-app-relauncher';

RNAppRelauncher.relaunch();
```
  