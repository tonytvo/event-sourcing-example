# Introduce the indirection layer
- I often run into situations where I couldn't making a single change requires cascading effects of changes, and recently, I have learned a good trick from J.B. Rainberger to introduce indirection layer to help us making small steps incrementally
- X minutes do
  - It seems like OrderLines is a good home (domain concept) for Order.lines field, once you extract Order.lines into OrderLines, we could see a whole bunch of behavior should belong into OrderLines as well
  - [ ] checkout https://github.com/tonytvo/event-sourcing-example repo
  - [ ] checkout introduce-indirection-starting-point
  - [ ] extract all methods that references Order.lines as the following snippets
    - [extract updateItem](./snippets/lines-update-item.gif)
    - [extract asList](./snippets/extract-aslist-lines.gif)
    - [extract isEmpty](./snippets/extract-is-empty.gif)

# References
- https://github.com/codecop/dependency-breaking-katas
- https://tonytvo.github.io/what-simple-way-share-learn-refactor/
- https://github.com/tomphp/event-sourcing-example
