# tradingApplication
# Overview
The Trading Application is a service designed to execute trading algorithms (Algos) based on received signals. 
The application is structured to handle a variety of signals, each representing specific trading instructions.

# Solution Considered 

**TASK :**

While the current ‘TradingApplication’ code only has three signals, 
once in production it is expected that up to 50 new signals will be added per month (600 after year one, 1200 after year two etc).

**Solution**

When we get the new signals we cannot add more signals in the switch case and it is hard to understand and will get performance issue.

**To avoid this issue :**

We can use Map or database and also we can use JSON File.
i have added JSON file to keep the new signals and corresponding their actions to get.
And based on their signal we can send a http request and get the response.
We no need to modify the class files and even when we get new signals we can add it to the JSON files.


# Features
Process trading signals and apply appropriate trading algorithms.

Extendable to handle new signals without modifying existing code.

Provides an HTTP endpoint for receiving and processing signals.

Utilizes the Spark Java framework for web functionalities.

Loads signals from a JSON file using Jackson for deserialization.

# Classes Overview
**Application:** Main application class, responsible for handling signals and applying actions.

**SignalAction:** Represents a trading signal and its associated actions.

**SignalLoader:** Responsible for loading signals from a JSON file.

**Algo:** Defines various actions related to trading algorithms.



# Requirements

Java 8 or higher.

Spark Java (embedded web server).

Jackson library for JSON parsing.

# Signal Handling

The application can receive signals through an HTTP endpoint and pass them to the appropriate Algo action.

# Setup
**Prerequisites**
Java 8 or higher
Maven or Gradle (for dependency management)

**Dependencies**
Spark Framework for HTTP handling

# Building the Project

**Using IntelliJ IDEA**

Open the project in IntelliJ IDEA.

Build the project by selecting "Build" > "Build Project" from the menu.

Running the Application

Using IntelliJ IDEA

Right-click the Application class in the Project Explorer.

Select "Run 'Application.main()'" from the context menu.

**Interacting with the Application**

Once the application is running, you can send signals to it via the exposed HTTP endpoint. The application listens on port 4567 by default.

Send a POST request to http://localhost:4567/signal?signal=<SIGNAL_NUMBER> to process a signal.

You can use tools like Postman to send requests to the application.

**Output Results :**

![Response-Postman1](https://github.com/vanitha2601/tradingApplication/assets/103498608/f1dc1ff3-ab11-4f60-a77e-ebbd93aa51e6)

# Extending the Application

To add new signals, you can define them in a JSON file (signals.json) and ensure that the SignalLoader class loads them.

