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
