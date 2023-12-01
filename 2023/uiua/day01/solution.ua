Sample ← &fras "sample.txt"
Input ← &fras "input.txt"

PⅠ ← |1 /+[/parse]≡⊂∵⊃⊢(⊢⇌){/(∵⊢regex "\\d" ⊔) ⊜□≠ , @\n}
# PⅡ ← ""

&p $"sample: _" PⅠ Sample
&p $"part 1: _" PⅠ Input
&p "-------"
# &p $"sample: _" PⅡ Sample
# &p $"part 2: _" PⅡ Input
