# Rock-Paper-Scissors

This Java program implements a Rock-Paper-Scissors game that allows a user to play against the computer. Here's a breakdown of how the program works:

## 1. Core Components:
- Scanner and Random classes:
  - ```Scanner``` is used for user input
  - ```Random``` generates the computer's random choice.

- Game Choices:

  The user and computer can choose:
  - ```0``` ->Rock
  - ```1``` ->Paper
  - ```2``` ->Scissors

## 2. Game Logic:
- The program begins by asking the user to enter their choice.
- The computer randomly selects its choice using ```rand.nextInt(3)```.
- The user's and computer's choices are compared using if-else conditions to determine the result:
  1. **Draw**: Both choices are the same.
  2. **User loses**: Certain combinations (e.g., Rock vs Paper).
  3. **User wins**: Other combinations (e.g., Paper vs Rock).

## 3. User Interface
- After each game:


  - The program displays the user's and computer's choices using descriptive strings like "Rock", "Paper", or "Scissor".

  - The result (Win, Lose, or Draw) is printed.
- The program then asks if the user wants to play again:

  - ```1``` -> Restart the game.
  - ```2``` -> Exit the program

## 4 Input Validation:

- If the user enters an invalid choice (anything other than 0, 1, or 2), the program prompts them to enter a valid choice.

## Key Features:
1. ```Loop for Replay```: The game runs repeatedly until the user chooses to exit.

2. ```Randomized Computer Choice```: Keeps the game unpredictable.

3. ```Clear Display of Results```: Shows the choices and result after each round.

## Example Interactions:

``` java
Enter 0->Rock    1->Paper    2->Scissor
1
Your Choice : Paper    Computer's Choice : Rock
You Win

Do you want to restart ?    1->Yes    2->No
1

Enter 0->Rock    1->Paper    2->Scissor
2
Your Choice : Scissor    Computer's Choice : Paper
You Win

Do you want to restart ?    1->Yes    2->No
2

```