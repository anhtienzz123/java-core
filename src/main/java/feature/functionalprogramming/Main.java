package feature.functionalprogramming;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleSupplier;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongSupplier;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongBiFunction;
import java.util.function.ToLongFunction;
import java.util.function.UnaryOperator;

public class Main {

	public static void main(String[] args) {
		Function<String, Integer> f;
		UnaryOperator<String> uo;
		
		// Pattenr for matching
		String str = "name";
		if(str instanceof String s1) {
			System.out.println("String s1: " + s1);
		}else {
			System.out.println("Other String");
		}
	}
	
	public static void testPredicate() {
		System.out.println("========== testPredicate ==========");
		Predicate<String> p;
		BiPredicate<String, String> bp;
		LongPredicate lp;
		IntPredicate ip;
		DoublePredicate dp;
	}
	
	public static void testConsumer() {
		System.out.println("========== testConsumer ==========");
		Consumer<String> c;
		BiConsumer<String, String> bc;
		LongConsumer lc;
		IntConsumer ic;
		DoubleConsumer dc;
		ObjLongConsumer<String> olc;
		ObjIntConsumer<String> oic;
		ObjDoubleConsumer<String> odc;
	}
	
	public static void testSupplier() {
		System.out.println("========== testConsumer ==========");
		Supplier<String> s;
		BooleanSupplier bs;
		LongSupplier ls;
		IntSupplier is;
		DoubleSupplier ds;
	}
	
	public static void testFunction() {
		System.out.println("========== testConsumer ==========");
		Function<String, Integer> fn;
		BiFunction<String, Integer, Integer> bfn;
		LongFunction<Long> lf;
		LongToIntFunction ltif;
		LongToDoubleFunction ltdf;
		IntFunction<Integer> iff;
		IntToLongFunction itlf;
		IntToDoubleFunction itdf;
		DoubleFunction<Double> df;
		DoubleToIntFunction dtif;
		DoubleToLongFunction dtlf;
		ToLongFunction<String> tlf;
		ToLongBiFunction<String, String> tlbf;
		ToDoubleFunction<String> tdf;
		ToDoubleBiFunction<String, String> tfbf;
		ToIntFunction<String> tif;
		ToIntBiFunction<String, String> tibf;
	}
	
	public static void testUnaryOperator() {
		System.out.println("========== testConsumer ==========");
		UnaryOperator<String> un;
		BinaryOperator<String> bo;
		LongUnaryOperator luo;
		LongBinaryOperator lbo;
		IntUnaryOperator iuo;
		IntBinaryOperator ibo;
		DoubleUnaryOperator duo;
		DoubleBinaryOperator dbo;
	}
}
