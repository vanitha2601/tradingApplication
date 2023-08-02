# tradingApplication
# Overview
The Trading Application is a service designed to execute trading algorithms (Algos) based on received signals. 
The application is structured to handle a variety of signals, each representing specific trading instructions.

# Requirements
Core Functionality

**Signal Handling: **The application must be able to process signals (simple integers) and execute the corresponding trading algorithms.
The SignalHandler and Algo classes are provided by the Trading Algo library and cannot be modified.

**Extensibility:** Initially supporting three signals, the application must be designed to support the addition of up to 50 new signals per month, 
scaling to hundreds over time.

**Integration:** The application should be a running service with a single HTTP endpoint for receiving the 'signal'.

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

