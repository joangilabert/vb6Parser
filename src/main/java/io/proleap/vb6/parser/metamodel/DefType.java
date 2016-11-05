/*
 * Copyright (C) 2016, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package io.proleap.vb6.parser.metamodel;

import java.util.List;

import io.proleap.vb6.parser.metamodel.oop.BaseType;

public interface DefType {

	public interface LetterRange {
		String getLower();

		String getUpper();
	}

	void addLetterRange(String lower, String upper);

	BaseType getBaseType();

	List<LetterRange> getLetterRanges();
}