//version 8:
import java.util.List;
public class SuperBuilderWithNonNull {
	public static class Parent {
		@lombok.NonNull
		final String nonNullParentField;
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		private static String $default$nonNullParentField() {
			return "default";
		}
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		public static abstract class ParentBuilder<C extends SuperBuilderWithNonNull.Parent, B extends SuperBuilderWithNonNull.Parent.ParentBuilder<C, B>> {
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			private boolean nonNullParentField$set;
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			private String nonNullParentField$value;
			/**
			 * @return {@code this}.
			 */
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			public B nonNullParentField(@lombok.NonNull final String nonNullParentField) {
				if (nonNullParentField == null) {
					throw new java.lang.NullPointerException("nonNullParentField is marked non-null but is null");
				}
				this.nonNullParentField$value = nonNullParentField;
				nonNullParentField$set = true;
				return self();
			}
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			protected abstract B self();
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			public abstract C build();
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			public java.lang.String toString() {
				return "SuperBuilderWithNonNull.Parent.ParentBuilder(nonNullParentField$value=" + this.nonNullParentField$value + ")";
			}
		}
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		private static final class ParentBuilderImpl extends SuperBuilderWithNonNull.Parent.ParentBuilder<SuperBuilderWithNonNull.Parent, SuperBuilderWithNonNull.Parent.ParentBuilderImpl> {
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			private ParentBuilderImpl() {
			}
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			protected SuperBuilderWithNonNull.Parent.ParentBuilderImpl self() {
				return this;
			}
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			public SuperBuilderWithNonNull.Parent build() {
				return new SuperBuilderWithNonNull.Parent(this);
			}
		}
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		protected Parent(final SuperBuilderWithNonNull.Parent.ParentBuilder<?, ?> b) {
			if (b.nonNullParentField$set) this.nonNullParentField = b.nonNullParentField$value;
			 else this.nonNullParentField = SuperBuilderWithNonNull.Parent.$default$nonNullParentField();
			if (nonNullParentField == null) {
				throw new java.lang.NullPointerException("nonNullParentField is marked non-null but is null");
			}
		}
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		public static SuperBuilderWithNonNull.Parent.ParentBuilder<?, ?> builder() {
			return new SuperBuilderWithNonNull.Parent.ParentBuilderImpl();
		}
	}
	public static class Child extends Parent {
		@lombok.NonNull
		String nonNullChildField;
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		public static abstract class ChildBuilder<C extends SuperBuilderWithNonNull.Child, B extends SuperBuilderWithNonNull.Child.ChildBuilder<C, B>> extends Parent.ParentBuilder<C, B> {
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			private String nonNullChildField;
			/**
			 * @return {@code this}.
			 */
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			public B nonNullChildField(@lombok.NonNull final String nonNullChildField) {
				if (nonNullChildField == null) {
					throw new java.lang.NullPointerException("nonNullChildField is marked non-null but is null");
				}
				this.nonNullChildField = nonNullChildField;
				return self();
			}
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			protected abstract B self();
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			public abstract C build();
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			public java.lang.String toString() {
				return "SuperBuilderWithNonNull.Child.ChildBuilder(super=" + super.toString() + ", nonNullChildField=" + this.nonNullChildField + ")";
			}
		}
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		private static final class ChildBuilderImpl extends SuperBuilderWithNonNull.Child.ChildBuilder<SuperBuilderWithNonNull.Child, SuperBuilderWithNonNull.Child.ChildBuilderImpl> {
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			private ChildBuilderImpl() {
			}
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			protected SuperBuilderWithNonNull.Child.ChildBuilderImpl self() {
				return this;
			}
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			public SuperBuilderWithNonNull.Child build() {
				return new SuperBuilderWithNonNull.Child(this);
			}
		}
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		protected Child(final SuperBuilderWithNonNull.Child.ChildBuilder<?, ?> b) {
			super(b);
			this.nonNullChildField = b.nonNullChildField;
			if (nonNullChildField == null) {
				throw new java.lang.NullPointerException("nonNullChildField is marked non-null but is null");
			}
		}
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		public static SuperBuilderWithNonNull.Child.ChildBuilder<?, ?> builder() {
			return new SuperBuilderWithNonNull.Child.ChildBuilderImpl();
		}
	}
	public static void test() {
		Child x = Child.builder().nonNullChildField("child").nonNullParentField("parent").build();
	}
}
