SampleOne ← &fras "sample1.txt"
SampleTwo ← &fras "sample2.txt"
Input ← &fras "input.txt"

① ← ↥⌕"1":⌕"one".⊂ "   "
② ← ×2↥⌕"2":⌕"two".⊂ "   "
③ ← ×3↥⌕"3":⌕"three".⊂ "   "
④ ← ×4↥⌕"4":⌕"four".⊂ "   "
⑤ ← ×5↥⌕"5":⌕"five".⊂ "   "
⑥ ← ×6↥⌕"6":⌕"six".⊂ "   "
⑦ ← ×7↥⌕"7":⌕"seven".⊂ "   "
⑧ ← ×8↥⌕"8":⌕"eight".⊂ "   "
⑨ ← ×9↥⌕"9":⌕"nine".⊂ "   "

Prep ← ⊜□≠,@\n
SolOne ← |1 /+[/parse]≡⊂∵⊃⊢(⊢⇌){/(∵⊢regex "\\d" ⊔) Prep}
SolTwo ← /+∵(+⊃(⊢×10)(⊢⇌)▽≠0./+[⊃①⊃②⊃③⊃④⊃⑤⊃⑥⊃⑦⊃⑧⑨]⊔) Prep

&p $"sample: _" SolOne SampleOne
&p $"part 1: _" SolOne Input
&p "-------"
&p $"sample: _" SolTwo SampleTwo
&p $"part 2: _" SolTwo Input
