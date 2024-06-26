import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import lombok.Builder;
@NoArgsConstructor @AllArgsConstructor @SuperBuilder class ConstructorsWithSuperBuilderDefaults {
  public static abstract @java.lang.SuppressWarnings("all") @lombok.Generated class ConstructorsWithSuperBuilderDefaultsBuilder<C extends ConstructorsWithSuperBuilderDefaults, B extends ConstructorsWithSuperBuilderDefaults.ConstructorsWithSuperBuilderDefaultsBuilder<C, B>> {
    private @java.lang.SuppressWarnings("all") @lombok.Generated int x$value;
    private @java.lang.SuppressWarnings("all") @lombok.Generated boolean x$set;
    private @java.lang.SuppressWarnings("all") @lombok.Generated int y;
    public ConstructorsWithSuperBuilderDefaultsBuilder() {
      super();
    }
    /**
     * @return {@code this}.
     */
    public @java.lang.SuppressWarnings("all") @lombok.Generated B x(final int x) {
      this.x$value = x;
      x$set = true;
      return self();
    }
    /**
     * @return {@code this}.
     */
    public @java.lang.SuppressWarnings("all") @lombok.Generated B y(final int y) {
      this.y = y;
      return self();
    }
    protected abstract @java.lang.SuppressWarnings("all") @lombok.Generated B self();
    public abstract @java.lang.SuppressWarnings("all") @lombok.Generated C build();
    public @java.lang.Override @java.lang.SuppressWarnings("all") @lombok.Generated java.lang.String toString() {
      return (((("ConstructorsWithSuperBuilderDefaults.ConstructorsWithSuperBuilderDefaultsBuilder(x$value=" + this.x$value) + ", y=") + this.y) + ")");
    }
  }
  private static final @java.lang.SuppressWarnings("all") @lombok.Generated class ConstructorsWithSuperBuilderDefaultsBuilderImpl extends ConstructorsWithSuperBuilderDefaults.ConstructorsWithSuperBuilderDefaultsBuilder<ConstructorsWithSuperBuilderDefaults, ConstructorsWithSuperBuilderDefaults.ConstructorsWithSuperBuilderDefaultsBuilderImpl> {
    private ConstructorsWithSuperBuilderDefaultsBuilderImpl() {
      super();
    }
    protected @java.lang.Override @java.lang.SuppressWarnings("all") @lombok.Generated ConstructorsWithSuperBuilderDefaults.ConstructorsWithSuperBuilderDefaultsBuilderImpl self() {
      return this;
    }
    public @java.lang.Override @java.lang.SuppressWarnings("all") @lombok.Generated ConstructorsWithSuperBuilderDefaults build() {
      return new ConstructorsWithSuperBuilderDefaults(this);
    }
  }
  @Builder.Default int x;
  int y;
  private static @java.lang.SuppressWarnings("all") @lombok.Generated int $default$x() {
    return 5;
  }
  protected @java.lang.SuppressWarnings("all") @lombok.Generated ConstructorsWithSuperBuilderDefaults(final ConstructorsWithSuperBuilderDefaults.ConstructorsWithSuperBuilderDefaultsBuilder<?, ?> b) {
    super();
    if (b.x$set)
        this.x = b.x$value;
    else
        this.x = ConstructorsWithSuperBuilderDefaults.$default$x();
    this.y = b.y;
  }
  public static @java.lang.SuppressWarnings("all") @lombok.Generated ConstructorsWithSuperBuilderDefaults.ConstructorsWithSuperBuilderDefaultsBuilder<?, ?> builder() {
    return new ConstructorsWithSuperBuilderDefaults.ConstructorsWithSuperBuilderDefaultsBuilderImpl();
  }
  public @java.lang.SuppressWarnings("all") @lombok.Generated ConstructorsWithSuperBuilderDefaults() {
    super();
    this.x = ConstructorsWithSuperBuilderDefaults.$default$x();
  }
  public @java.lang.SuppressWarnings("all") @lombok.Generated ConstructorsWithSuperBuilderDefaults(final int x, final int y) {
    super();
    this.x = x;
    this.y = y;
  }
}
