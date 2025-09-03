package jkind;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import jkind.analysis.ErrorCollector;
import jkind.analysis.Level;
import jkind.lustre.Location;
import jkind.util.Util;

public class StdErr {

	private static final Logger log = LoggerFactory.getLogger(StdErr.class);

	private static List<String> locationReference;

	public static void setLocationReference(List<String> reference) {
		locationReference = reference;
	}

	public static void warning(String text) {
		output(Level.WARNING, text);
	}

	public static void warning(Location loc, String text) {
		output(Level.WARNING, loc, text);
	}

	public static void error(String text) {
		output(Level.ERROR, text);
	}

	public static void error(Location loc, String text) {
		output(Level.ERROR, loc, text);
	}

	public static void fatal(int exitCode, String text) {
		error(text);
		throw new RuntimeException("错误:" + exitCode);
	}

	public static void fatal(int exitCode, Location loc, String text) {
		error(loc, text);
		throw new RuntimeException("错误:" + exitCode);
	}

	public static void output(Level level, String text) {
		if (level != Level.IGNORE) {
			println(level, text);
		}
	}

	public static void output(Level level, Location loc, String text) {
		if (level != Level.IGNORE) {
			println(level, level + " at line " + loc + " " + text);
			if (level == Level.ERROR) {
				showLocation(loc);
			}
		}
	}

	public static void showLocation(Location loc) {
		if (locationReference == null) {
			warning( "locationReference 为空");
			warning(Util.spaces(loc.charPositionInLine) + "^");
			return;
		}
		if (1 <= loc.line && loc.line <= locationReference.size()) {
			String line = locationReference.get(loc.line - 1);
			error(line);
			error(Util.spaces(loc.charPositionInLine) + "^");
		}
	}

	public static void println(Level level, String text) {
		if (level == Level.ERROR) {
			log.error(text);
			throw new RuntimeException(text);
		} else if (level == Level.WARNING) {
			log.warn(text);
		}
	}

	public static void printStackTrace(Throwable t) {
		log.error("", t);
	}
}
