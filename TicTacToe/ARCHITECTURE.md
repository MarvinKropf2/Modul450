# Architektur

Die Architektur folgt einem einfachen Schichtenmodell, wobei die **Domain Logic** (Board, Game) strikt von der **User Interface** Logik (Main, Scanner) getrennt ist. Interfaces wie `Player` ermöglichen eine leichte Erweiterbarkeit (z.B. AI Gegner) und vereinfachen das Testing durch Mocks.

## Klassendiagramm

```mermaid
classDiagram
    class App {
        +main(args)
    }
    
    class Game {
        -Board board
        -Player playerX
        -Player playerO
        +play()
        -switchPlayer()
    }
    
    class Board {
        -char[][] cells
        +placeMark(row, col, mark)
        +checkWin(mark)
        +isFull()
        +isCellEmpty(row, col)
        +print()
    }
    
    class Player {
        <<interface>>
        +makeMove(Board) int[]
        +getMark() char
    }
    
    class HumanPlayer {
        -Scanner scanner
        +makeMove(Board) int[]
    }
    
    class ComputerPlayer {
        +makeMove(Board) int[]
    }

    App --> Game : creates
    Game --> Board : manages
    Game --> Player : uses
    HumanPlayer ..|> Player
    ComputerPlayer ..|> Player : (Future Feature)
```

## Komponenten
- **App**: Einstiegspunkt. Injeziert Abhängigkeiten (Players, Board) in das Game.
- **Game**: Steuert den Spielablauf (Game Loop, Auswertung von Sieg/Niederlage).
- **Board**: Hält den State des Spielfelds und validiert Logik (Siegbedingungen).
- **Player**: Abstraktion für Spielerzüge.
