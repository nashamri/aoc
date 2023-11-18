Sample ← &fras "sample.txt"
Input ← &fras "input.txt"

Parse ← ◿4+1∵(-@A_@X ⊏ 0_2 ⊔) regex "[\\w \\w]+"
Draw ← ↥↥≡/×≡(=3_3)∶≡/×≡(=2_2).∶≡/×≡(=1_1).
Winn ← ↥↥≡/×≡(=3_1)∶≡/×≡(=2_3).∶≡/×≡(=1_2).
Lose ← ↥↥≡/×≡(=3_2)∶≡/×≡(=2_1).∶≡/×≡(=1_3).
Result ← ⊡1/+⍥+3⊃(×6Winn)⊃(×0Lose)(×3Draw)
PⅠ ← Result . Parse

&p $"sample: _" PⅠ Sample
&p $"part 1: _" PⅠ Input
&p "-------"
# &p $"sample: _" PⅡ Sample
# &p $"part 2: _" PⅡ Input

# 1 A X Rock
# 2 B Y Paper
# 3 C Z Scissors
# Draw Parse "A X" # Draw 1 1
# Winn Parse "A Y" # Win  1 2
# Lose Parse "A Z" # Lose 1 3

# Lose Parse "B X" # Lose 2 1
# Draw Parse "B Y" # Draw 2 2
# Winn Parse "B Z" # Win  2 3

# Winn Parse "C X" # Win  3 1
# Lose Parse "C Y" # Lose 3 2
# Draw Parse "C Z" # Draw 3 3
