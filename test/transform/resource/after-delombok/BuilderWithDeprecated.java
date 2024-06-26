import com.google.common.collect.ImmutableList;
public class BuilderWithDeprecated {
	/**
	 * @deprecated since always
	 */
	String dep1;
	@Deprecated
	int dep2;
	@Deprecated
	java.util.List<String> strings;
	@Deprecated
	ImmutableList<Integer> numbers;
	/**
	 * Creates a new {@code BuilderWithDeprecated} instance.
	 *
	 * @param dep1 @deprecated since always
	 * @param dep2 
	 * @param strings 
	 * @param numbers 
	 */
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	BuilderWithDeprecated(final String dep1, final int dep2, final java.util.List<String> strings, final ImmutableList<Integer> numbers) {
		this.dep1 = dep1;
		this.dep2 = dep2;
		this.strings = strings;
		this.numbers = numbers;
	}
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public static class BuilderWithDeprecatedBuilder {
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		private String dep1;
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		private int dep2;
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		private java.util.ArrayList<String> strings;
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		private com.google.common.collect.ImmutableList.Builder<Integer> numbers;
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		BuilderWithDeprecatedBuilder() {
		}
		/**
		 * @deprecated since always
		 * @return {@code this}.
		 */
		@java.lang.Deprecated
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		public BuilderWithDeprecated.BuilderWithDeprecatedBuilder dep1(final String dep1) {
			this.dep1 = dep1;
			return this;
		}
		/**
		 * @return {@code this}.
		 */
		@java.lang.Deprecated
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		public BuilderWithDeprecated.BuilderWithDeprecatedBuilder dep2(final int dep2) {
			this.dep2 = dep2;
			return this;
		}
		@java.lang.Deprecated
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		public BuilderWithDeprecated.BuilderWithDeprecatedBuilder string(final String string) {
			if (this.strings == null) this.strings = new java.util.ArrayList<String>();
			this.strings.add(string);
			return this;
		}
		@java.lang.Deprecated
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		public BuilderWithDeprecated.BuilderWithDeprecatedBuilder strings(final java.util.Collection<? extends String> strings) {
			if (strings == null) {
				throw new java.lang.NullPointerException("strings cannot be null");
			}
			if (this.strings == null) this.strings = new java.util.ArrayList<String>();
			this.strings.addAll(strings);
			return this;
		}
		@java.lang.Deprecated
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		public BuilderWithDeprecated.BuilderWithDeprecatedBuilder clearStrings() {
			if (this.strings != null) this.strings.clear();
			return this;
		}
		@java.lang.Deprecated
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		public BuilderWithDeprecated.BuilderWithDeprecatedBuilder number(final Integer number) {
			if (this.numbers == null) this.numbers = com.google.common.collect.ImmutableList.builder();
			this.numbers.add(number);
			return this;
		}
		@java.lang.Deprecated
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		public BuilderWithDeprecated.BuilderWithDeprecatedBuilder numbers(final java.lang.Iterable<? extends Integer> numbers) {
			if (numbers == null) {
				throw new java.lang.NullPointerException("numbers cannot be null");
			}
			if (this.numbers == null) this.numbers = com.google.common.collect.ImmutableList.builder();
			this.numbers.addAll(numbers);
			return this;
		}
		@java.lang.Deprecated
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		public BuilderWithDeprecated.BuilderWithDeprecatedBuilder clearNumbers() {
			this.numbers = null;
			return this;
		}
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		public BuilderWithDeprecated build() {
			java.util.List<String> strings;
			switch (this.strings == null ? 0 : this.strings.size()) {
			case 0: 
				strings = java.util.Collections.emptyList();
				break;
			case 1: 
				strings = java.util.Collections.singletonList(this.strings.get(0));
				break;
			default: 
				strings = java.util.Collections.unmodifiableList(new java.util.ArrayList<String>(this.strings));
			}
			com.google.common.collect.ImmutableList<Integer> numbers = this.numbers == null ? com.google.common.collect.ImmutableList.<Integer>of() : this.numbers.build();
			return new BuilderWithDeprecated(this.dep1, this.dep2, strings, numbers);
		}
		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		public java.lang.String toString() {
			return "BuilderWithDeprecated.BuilderWithDeprecatedBuilder(dep1=" + this.dep1 + ", dep2=" + this.dep2 + ", strings=" + this.strings + ", numbers=" + this.numbers + ")";
		}
	}
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public static BuilderWithDeprecated.BuilderWithDeprecatedBuilder builder() {
		return new BuilderWithDeprecated.BuilderWithDeprecatedBuilder();
	}
}
