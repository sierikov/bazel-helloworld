# Bazel template

A simple example of a Scala multi-module project configured to *build*, *test*, *format* and *analyse* scala using [Bazel](https://www.bazel.build).

## Build

## Test

## Format

## Analyse

To analyze the dependency graph you can ask Bazel to make a graph with all
dependencies which your app has. 

```bash
bazel query  --nohost_deps --noimplicit_deps 'deps(//:Runner)' --output graph > graph.dot
```

You can convert the output graph to png with the `dot` utility.

```bash
dot graph.dot -Tpng -o graph.png
```

## Reference

<https://github.com/bazelbuild/rules_scala>

## License
This repository is developed under MIT License. See `License.md` for more information.
