# Connect Four

-> You can run it game on terminal

-> Require: Java 8 and above

-> Have to run Main.java

-> Enjoy and have a fun

__Description__

1. The vertical board is composed of seven columns and six rows. Initially, all positions are empty.
2. Players introduce discs at the top of the columns. The disc falls to the bottom of the column if the column is empty. Future discs introduced to the same column will stack over previous ones.
3. It is a two-person game. Player 1 uses red ('R') and Player 2 uses green ('G'). Players take alternate turns, inserting one disc each time.
4. When no more discs can be inserted, the game finishes, and it is considered a draw.
5. If a player inserts a disc and connects more than three discs of his color in a straight vertical, horizontal or diagonal line, then that player wins.

__Sample Run__

````text
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |

Player 1 [RED] - choose column (1-7): 4
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | |R| | | |

Player 2 [GREEN] - choose column (1-7): 4
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | |G| | | |
| | | |R| | | |

Player 1 [RED] - choose column (1-7): 5
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | |G| | | |
| | | |R|R| | |

Player 2 [GREEN] - choose column (1-7): 5
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | |G|G| | |
| | | |R|R| | |

Player 1 [RED] - choose column (1-7): 3
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | |G|G| | |
| | |R|R|R| | |

Player 2 [GREEN] - choose column (1-7): 2
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | |G|G| | |
| |G|R|R|R| | |

Player 1 [RED] - choose column (1-7): 6
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | |G|G| | |
| |G|R|R|R|R| |

Player 1 [RED] wins!
````
