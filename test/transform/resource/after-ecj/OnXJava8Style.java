public class OnXJava8Style {
  @interface Foo {
    String value() default "";
  }
  @interface Bar {
    String stuff() default "";
  }
  @interface Array {
    String[] value() default {};
  }
  @lombok.Getter() String a;
  @lombok.Setter() String b;
  @lombok.Setter() String c;
  @lombok.Setter() String d;
  @lombok.Getter() String e;
  @lombok.Getter() String f;
  @lombok.Getter() String g;
  @lombok.Getter() String h;
  @lombok.Getter() String i;
  public OnXJava8Style() {
    super();
  }
  public @Foo @java.lang.SuppressWarnings("all") @lombok.Generated String getA() {
    return this.a;
  }
  public @Foo() @java.lang.SuppressWarnings("all") @lombok.Generated void setB(final String b) {
    this.b = b;
  }
  public @java.lang.SuppressWarnings("all") @lombok.Generated void setC(final @Foo("a") String c) {
    this.c = c;
  }
  public @java.lang.SuppressWarnings("all") @lombok.Generated void setD(final @Bar(stuff = "b") String d) {
    this.d = d;
  }
  public @Foo(value = "c") @Bar(stuff = "d") @java.lang.SuppressWarnings("all") @lombok.Generated String getE() {
    return this.e;
  }
  public @Array @java.lang.SuppressWarnings("all") @lombok.Generated String getF() {
    return this.f;
  }
  public @Array() @java.lang.SuppressWarnings("all") @lombok.Generated String getG() {
    return this.g;
  }
  public @Array({}) @java.lang.SuppressWarnings("all") @lombok.Generated String getH() {
    return this.h;
  }
  public @Array({"a", "b"}) @java.lang.SuppressWarnings("all") @lombok.Generated String getI() {
    return this.i;
  }
}
