# tradingApplication
Overview
The Trading Application is a service designed to execute trading algorithms (Algos) based on received signals. The application is structured to handle a variety of signals, each representing specific trading instructions.

**Architecture**
Main Components
SignalHandler Interface: Part of the Trading Algo library, this interface defines the contract for handling signals.
Algo Class: Part of the Trading Algo library, this class contains various trading algorithm methods. It cannot be modified.
TradingApplication Class: Implements the SignalHandler interface to process signals and invoke appropriate actions in the Algo class.
Signal Handling
The application can receive signals through an HTTP endpoint and pass them to the appropriate Algo action.

**Setup**
Prerequisites
Java 8 or higher
Maven or Gradle (for dependency management)
Dependencies
Spark Framework for HTTP handling
Building
Clone the repository or download the source code.
Navigate to the project directory.
Run mvn clean install or the equivalent Gradle command to build the project.
Running the Service
Navigate to the project directory.
Execute the main method in the TradingApplication class using your preferred IDE or the command line.
The service will be available at http://localhost:4567/signal.
Usage
Sending a Signal
Make a POST request to http://localhost:4567/signal?signal=YOUR_SIGNAL_HERE with the desired signal value as a query parameter.

**Response**
Successful processing: "Signal processed successfully."
Error: A message with details about the error and a 400 status code.
Testing
Overview
The application should be thoroughly tested to ensure robust signal handling and ease of maintenance.
