# Steps to reproduce:

1) Clone this project
2) Verify that tests run normally:
 ```gradlew test```
3) Uncomment the four clover-related sections in ```build.gradle```, marked #1-4
4) Rerun ```gradlew test```

# Expected Behavior:

Tests pass with or without clover.

# Actual behavior:

Test compile fails with clover enabled:
```> Task :test FAILED
[ant:groovyc] org.codehaus.groovy.control.MultipleCompilationErrorsException: startup failed:
C:\src\github\rmorrise\repro1\grails-app\controllers\repro1\ApplicationController.groovy: 3: unable to resolve class com.mycompany.oldjava.excessive.packagename.length.OldJavaParentClass
 @ line 3, column 1.
   import com.mycompany.oldjava.excessive.packagename.length.OldJavaParentClass
   ^

C:\src\github\rmorrise\repro1\src\main\groovy\com\newthing\NewGroovyInterface.groovy: 3: unable to resolve class com.mycompany.oldjava.excessive.packagename.length.OldJavaChildClass
 @ line 3, column 1.
   import com.mycompany.oldjava.excessive.packagename.length.OldJavaChildClass
   ^

2 errors
```
