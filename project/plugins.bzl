"""
Module attaches the format fields to
scala_binary, scala_library and scala_test
to support .scalafmt files
"""
load(
    "@io_bazel_rules_scala//scala:advanced_usage/scala.bzl",
    "make_scala_binary",
    "make_scala_library",
    "make_scala_test",
)

load(
    "@io_bazel_rules_scala//scala/scalafmt:phase_scalafmt_ext.bzl",
    "ext_scalafmt",
)

scala_binary = make_scala_binary(ext_scalafmt)
scala_library = make_scala_library(ext_scalafmt)
scala_test = make_scala_test(ext_scalafmt)
