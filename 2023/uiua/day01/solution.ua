Sample ← &fras "sample.txt"
Input ← &fras "input.txt"

Prep ← ⊜(/+⊜parse≠,@\n)¬↥↻¯1.⌕"\n\n".
PⅠ ← /↥ Prep
PⅡ ← /+↙3⊏⍖ .Prep

⧻ [1 2 3]

&p $"sample: _" PⅠ Sample
&p $"part 1: _" PⅠ Input
&p "-------"
&p $"sample: _" PⅡ Sample
&p $"part 2: _" PⅡ Input
