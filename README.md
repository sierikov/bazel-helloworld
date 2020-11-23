# Bazel template

A simple example of a Scala multi-module project configured to build
using [Bazel](https://www.bazel.build).

Including:

```text
.
├── BUILD.bazel
├── README.md
├── WORKSPACE.bazel
└── src/main/scala/com/helloworld
    ├── Greeting.scala
    ├── Runner.scala
    └── cmd
        ├── BUILD.bazel
        └── Runner.scala
```

## Build

Top-level build

```bash
bazel build //:Runner
```

Build sub-project

```bash
bazel build //src/main/scala/com/helloworld/cmd:Runner
```

## Review the dependency graph

```bash
bazel query  --nohost_deps --noimplicit_deps 'deps(//:Runner)' --output graph > graph.dot
dot graph.dot -Tpng -o graph.png
```

## Reference

<https://github.com/bazelbuild/rules_scala>
