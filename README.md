# HelloApp

Hello App starts with Hello World, progresses to displaying a user name, then names from command-line args and standard input. It then manages names in a collection with list/remove options, refactors into methods and classes, adds persistence across runs, and finally displays names in banner format.

## Getting Started

### Prerequisites

- Java JDK 11 or higher
- Maven

### Installation

1. Clone the repository:
```bash
git clone https://github.com/ayushchoudhary30/HelloApp.git
cd HelloApp
```

2. Install dependencies:
```bash
mvn clean install
```

3. Run the application:
```bash
mvn exec:java -Dexec.mainClass="HelloApp"
```

## Use Cases

| UC | Description |
|----|-------------|
| UC1 | Display "Hello World" in the console |
| UC2 | Display "Hello" with Command-Line Argument |
| UC3 | Display "Hello" with Command-Line Argument or Default Message |
| UC4 | Display "Hello" with Multiple Command-Line Arguments or Default Message |
| UC5 | Display "Hello" with Multiple Command-Line Arguments using Enhanced For Loop |

## Project Structure

```
HelloApp/
├── pom.xml
├── README.md
├── .gitignore
├── src/
│   ├── main/
│   │   └── java/
│   │       └── HelloApp.java
│   └── test/
│       └── java/
```
