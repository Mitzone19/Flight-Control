# Flight Control Application

## Description
This Flight Control application is a Java program that allows users to manage airplanes and their flight routes. The application provides functionalities to add airplanes, create flights using these airplanes, and query flight information.

## Features
- Add details of airplanes including their identifier and capacity.
- Add flight information consisting of the airplane, departure airport ID, and destination airport ID.
- Print details of all airplanes.
- Print details of all flights.
- Print details of a specific airplane.

## How to Run

1. Ensure you have a Java Runtime Environment installed.
2. Compile the Java files into bytecode. Example:

"javac FlightControl/.java FlightControl/ui/.java FlightControl/domain/.java FlightControl/logic/.java"

3. Run the compiled bytecode using the Java command. Example:

"java FlightControl.Main"

## Usage
The program operates in two main parts:
1. **Airport Asset Control**: Input details of airplanes and flights.
2. **Flight Control**: Access the flight information services.

### Commands
- `[1] Add an airplane`: Adds a new airplane with an ID and capacity.
- `[2] Add a flight`: Adds a flight for an existing airplane.
- `[3] Print airplane details`: Prints the details of a specific airplane.
- `[x] Quit`: Exits the current control module.

When prompted, follow the on-screen instructions to enter the required information or command.

## Authors
- Mitzone - *Initial work*

## License
This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.

## Acknowledgments
- Hat tip to anyone whose code was used
- Inspiration
- etc
