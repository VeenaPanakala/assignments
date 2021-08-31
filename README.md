Microsoft Windows [Version 10.0.19042.1165]
(c) Microsoft Corporation. All rights reserved.

C:\Users\Admin>cd C:\Veena\Fruit_Bowl

C:\Veena\Fruit_Bowl> mvn clean
[INFO] Scanning for projects...
[INFO]
[INFO] -----------------------< Assignment:Fruit_Bowl >------------------------
[INFO] Building Fruit_Bowl 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ Fruit_Bowl ---
[INFO] Deleting C:\Veena\Fruit_Bowl\target
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.528 s
[INFO] Finished at: 2021-08-31T16:48:42+05:30
[INFO] ------------------------------------------------------------------------

C:\Veena\Fruit_Bowl>mvn compile
[INFO] Scanning for projects...
[INFO]
[INFO] -----------------------< Assignment:Fruit_Bowl >------------------------
[INFO] Building Fruit_Bowl 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ Fruit_Bowl ---
[WARNING] Using platform encoding (Cp1252 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 0 resource
[INFO]
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ Fruit_Bowl ---
[INFO] Nothing to compile - all classes are up to date
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.712 s
[INFO] Finished at: 2021-08-31T16:48:54+05:30
[INFO] ------------------------------------------------------------------------

C:\Veena\Fruit_Bowl>mvn test
[INFO] Scanning for projects...
[INFO]
[INFO] -----------------------< Assignment:Fruit_Bowl >------------------------
[INFO] Building Fruit_Bowl 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ Fruit_Bowl ---
[WARNING] Using platform encoding (Cp1252 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 0 resource
[INFO]
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ Fruit_Bowl ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ Fruit_Bowl ---
[WARNING] Using platform encoding (Cp1252 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 0 resource
[INFO]
[INFO] --- maven-compiler-plugin:3.8.1:testCompile (default-testCompile) @ Fruit_Bowl ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding Cp1252, i.e. build is platform dependent!
[INFO] Compiling 5 source files to C:\Veena\Fruit_Bowl\target\test-classes
[INFO]
[INFO] --- maven-surefire-plugin:3.0.0-M5:test (default-test) @ Fruit_Bowl ---
[INFO]
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running TestSuite
Mixed bowl contains Apples, Oranges and Bananas
Bowl 1 contains Oranges
Bowl 2 contains Apples
Bowl 3 contains Bananas
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.849 s - in TestSuite
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  5.665 s
[INFO] Finished at: 2021-08-31T16:49:15+05:30
[INFO] ------------------------------------------------------------------------

C:\Veena\Fruit_Bowl>
