/**
 * Jexer - Java Text User Interface
 *
 * Version: $Id$
 *
 * Author: Kevin Lamonte, <a href="mailto:kevin.lamonte@gmail.com">kevin.lamonte@gmail.com</a>
 *
 * License: LGPLv3 or later
 *
 * Copyright: This module is licensed under the GNU Lesser General
 * Public License Version 3.  Please see the file "COPYING" in this
 * directory for more information about the GNU Lesser General Public
 * License Version 3.
 *
 *     Copyright (C) 2015  Kevin Lamonte
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation; either version 3 of
 * the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, see
 * http://www.gnu.org/licenses/, or write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA
 */
package jexer.event;

import jexer.TKeypress;

/**
 * This class encapsulates a keyboard input event.
 */
public class TKeypressEvent extends TInputEvent {

    /**
     * Keystroke received
     */
    public TKeypress key;

    /**
     * Public contructor
     */
    public TKeypressEvent() {
	key = new TKeypress(false, 0, ' ', false, false, false);
    }

    /**
     * Public contructor
     *
     * @param key the TKeypress received
     */
    public TKeypressEvent(TKeypress key) {
	this.key = key;
    }

    /**
     * Make human-readable description of this event
     */
    @Override
    public String toString() {
	return String.format("Keypress: %s", key.toString());
    }
}
