# Bazel template

A simple example of a Scala multi-module project configured to *build*, *test*, *format* and *analyse* scala using [Bazel](https://www.bazel.build).

## Structure

The repository represents one service, that has two modules:
*one* and *two*. The module *two* depends on module *one*.
The module *one* has no dependencies inside. This is done to
show the difference in the build behaivour. 

## Build

To build the service (for example `service_one`) run:

```
bazel build service_one
```

Note that if you build `service_one` then bazel will build *only* all for 
`service_one` and nothing for `service_two`. But the `service_two` depends on the 
`service_one`. So if we run `bazel build service_two` bazel will build
`service_one` and then `service_two`.

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
