# Interpreter

## Concept
Given a language, define a representation for its grammar along with an interpreter that uses the representation to interpret sentences in the language.

## Steps
1. Define an abstract expression interface declaring an interpret operation.
2. Implement terminal and nonterminal expression classes for grammar rules.
3. Build an abstract syntax tree representing the specific sentence.
4. Client invokes interpret on the tree to evaluate the sentence.
