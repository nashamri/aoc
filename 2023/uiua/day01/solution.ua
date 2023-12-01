SampleOne ← &fras "sample1.txt"
SampleTwo ← &fras "sample2.txt"
Input ← &fras "input.txt"

One ← ↥⌕"1":⌕"one".
Two ← ×2↥⌕"2":⌕"two".
Three ← ×3↥⌕"3":⌕"three".
Four ← ×4↥⌕"4":⌕"four".
Five ← ×5↥⌕"5":⌕"five".
Six ← ×6↥⌕"6":⌕"six".
Seven ← ×7↥⌕"7":⌕"seven".
Eight ← ×8↥⌕"8":⌕"eight".
Nine ← ×9↥⌕"9":⌕"nine".

Prep ← ⊜□≠,@\n
SolOne ← |1 /+[/parse]≡⊂∵⊃⊢(⊢⇌){/(∵⊢regex "\\d" ⊔) Prep}
SolTwo ← /+∵(+⊃(⊢×10)(⊢⇌)▽≠0./+[⊃One (⊃Two (⊃Three (⊃Four (⊃Five (⊃Six (⊃Seven (⊃Eight Nine)))))))]⊔) Prep

&p $"sample: _" SolOne SampleOne
&p $"part 1: _" SolOne Input
&p "-------"
&p $"sample: _" SolTwo SampleTwo
&p $"part 2: _" SolTwo Input
