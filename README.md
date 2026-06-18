# 26B-10142 — Unit Testing Assignment (HW2)

JUnit 5 unit tests for the utility functions in `app/src/main/java/org/example/App.java`, built with Gradle.

## Team Members

- Ariel Yitzhaki
- Mohammad Abbas

## Project Structure

```
.
├── app
│   └── src
│       ├── main/java/org/example/App.java       # functions under test
│       └── test/java/org/example/AppTest.java   # the unit tests
├── chats/chats.txt                              # raw LLM conversation logs
├── logs
│   ├── LEARNING.md                              # documentation of Part 2 (learning)
│   └── COPILOT.md                               # documentation of Part 3 (writing tests)
├── gradlew / gradlew.bat                        # Gradle wrapper
└── settings.gradle.kts
```

`App.java` contains 11 functions: `add`, `isPrime`, `reverse`, `factorial`, `isPalindrome`, `fibonacciUpTo`, `charFrequency`, `isAnagram`, `average`, `filterEvens`, and `mostCommonWord`. `AppTest.java` contains 40 tests covering them, using the JUnit 5 assertions `assertEquals`, `assertTrue`, `assertFalse`, `assertThrows`, and `assertNotNull`.

## Requirements

- **JDK 21** (the build declares a Java 21 toolchain). A working JDK must be reachable via `JAVA_HOME` or on your `PATH`.
- No separate Gradle install needed — the wrapper (`gradlew` / `gradlew.bat`) downloads the correct Gradle version (8.14) on first run.

## How to Run the Tests

### 1. Clone the repository

```bash
git clone https://github.com/Afeka-DevTools/26b-10142-unittesting-ariel_abbas.git
cd 26b-10142-unittesting-ariel_abbas
```

### 2. Make sure a JDK is available

Check with:

```bash
java -version
```

If Java is not found, set `JAVA_HOME` to a JDK 21 installation before running. For example, if you only have the JDK bundled with IntelliJ IDEA:

**Windows — Command Prompt:**
```cmd
set JAVA_HOME=C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1.1\jbr
set PATH=%JAVA_HOME%\bin;%PATH%
```

**Windows — PowerShell:**
```powershell
$env:JAVA_HOME = "C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1.1\jbr"
$env:PATH = "$env:JAVA_HOME\bin;$env:PATH"
```

**macOS / Linux:**
```bash
export JAVA_HOME=/path/to/jdk-21
export PATH="$JAVA_HOME/bin:$PATH"
```

### 3. Run all tests

From the **project root** (not inside `app/`):

**macOS / Linux:**
```bash
./gradlew test
```

**Windows — Command Prompt:**
```cmd
gradlew.bat test
```

**Windows — PowerShell:**
```powershell
.\gradlew.bat test
```

A successful run ends with:

```
BUILD SUCCESSFUL
```

The first run takes longer (~30–50s) because Gradle downloads itself; later runs are faster.

### 4. View the detailed report

After running, open the HTML test report:

```
app/build/reports/tests/test/index.html
```

It lists every test, grouped by function, with pass/fail status.

## Notes

- All LLM conversations used during this assignment are documented in `chats/`, with summaries split into `logs/LEARNING.md` (Part 2) and `logs/COPILOT.md` (Part 3).
