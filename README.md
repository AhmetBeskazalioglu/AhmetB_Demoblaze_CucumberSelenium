

---

# Demoblaze Tak - BDD Framework With Cucumber

### Codes And Test Prepared By :
A B

Test Automation Engineer

ahmetbeskazalioglu@icloud.com

## Getting Started

To get started with this framework, you will need to have the following software on your system:

* Java 8 or later
* Maven 4.7 v. or later
* Chrome, Edge, Safari, IE, or Firefox Web Browser

### Installation

1. Open Terminal or command prompt and navigate to the root directory of the project.
2. Run the following command to download the required dependencies:

```bash
mvn clean install
```

## Running Tests

To execute the tests, use the following command:

```bash
mvn test
```

### Test Configuration

Ensure that your preferred web browser (Chrome, Edge, Safari, IE, or Firefox) is installed and up to date on your machine. You can configure the browser settings in the `config.properties` file.

## Writing Feature Files

Feature files are written in Gherkin syntax and are located in the `src/test/resources/features` directory. You can create new feature files to define test scenarios.

## Test Reports

After running the tests, you can find the test reports in the `target/cucumber-reports` directory. Open the `index.html` file in a web browser to view the detailed test reports.

### My Framework  is Cucumber (BDD)
- I built my framework using the Java Programing Language
- I used Maven as a build management tool.
- I used cucumber-Junit and Cucumber Runner to orchestrate tests.
- Inside the Cucumber Runner, I used glues to connect feature files to step definitions.
- I added the report plugin to Cucumber Cukes Runner to generate JSON and HTML reports.
- I have a utilities package, which contains utility classes such as Configuration Reader, Browser Utils, and Driver.
- I am using Page Object Modelling to enhance test maintenance and reduce code duplication.
- I use Page Object Classes to store and identify the elements that I work on.
- I use the Page Factory class and initElements() method to initialize them.
- I am using Cucumber and Gherkin language for non-technical people to understand what is going on in testing.
- To interact with browsers, I am utilizing Selenium WebDriver.
- I used the Singleton pattern by declaring the constructor of the class as private so that no one instantiates the class outside of it. And declared a static method with return type as an object of the class which should check if the class is already instantiated once.
-  I have created my test cases in the feature files as-is.
- In the Feature folder, I store my feature files separately, and it helps in the usability of the codes.
- I use hook class as pre-and post-test implementations.
- The step Definitions folder is the place where my actual test scripts are.
- I added a screenshot interface; when the scenario fails, it takes a screenshot.
- For assertions/verifications, to compare expected and actual results I utilize Junit assertions.
- I also use tags for tests that I want to run in bulk.
- My framework is easy to maintain since I have elements stored in one centralized place. If any changes happen in the application about the elements, I know where to go and how to fix it to run test scripts correctly.




## Contact Information

For any inquiries or issues, please contact:

A B \
Test Automation Engineer \
Email: ahmetbeskazalioglu@icloud.com

---

## 2024 Jannuary ;

### END
