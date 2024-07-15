# Quiz Service Documentation

## Overview
This package (`quiz.service`) provides functionality for managing activities and their locations. It includes operations such as adding, updating, deleting activities, retrieving all activities, and searching for activities by name.

## Usage

### Classes and Objects

- `act`: Represents an instance of `activity` from `quiz.model`.
- `lis`: Represents an instance of `MyList` from `quiz.model`, containing activities.

### Functions

#### `menu()`
Displays a menu with options to perform various operations:
- **1. add**: Adds a new activity.
- **2. update**: Updates an existing activity.
- **3. delete**: Deletes an activity.
- **4. get all**: Retrieves all activities.
- **5. get by name**: Retrieves an activity by its name.

#### `addActivity()`
Prompts the user to enter an activity and its location. Adds the activity to `lis.activities` if both inputs are provided.

#### `getAllActivities()`
Prints all activities currently stored in `lis.activities`.

#### `update()`
Allows the user to update an existing activity by entering its name, new activity name, and new location. Updates `lis.activities` with the new information if the activity exists.

#### `delete()`
Prompts the user to enter the name of an activity to delete from `lis.activities`. Removes the activity if found.

#### `getByName()`
Prompts the user to enter the name of an activity. Prints the activity and its location if found in `lis.activities`.

#### `doAgain()`
Prompts the user if they want to perform another operation. Exits the program if the answer is "no", returns to the main menu if "yes", and displays an error message for invalid input.
