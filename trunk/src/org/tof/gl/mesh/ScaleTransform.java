/*
 * Taps of Fire
 * Copyright (C) 2009 Dmitry Skiba
 * 
 * This program is free software: you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as 
 * published by the Free Software Foundation, either version 3 of 
 * the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
*/
package org.tof.gl.mesh;

import java.io.IOException;
import javax.microedition.khronos.opengles.GL10;
import android.opengl.Matrix;

class ScaleTransform implements Transform {
	
	public ScaleTransform(String values) throws IOException {
		m_values=Util.parseFloatArray(3,values);
	}
	
	public void apply(GL10 gl) {
		gl.glScalef(m_values[0],m_values[1],m_values[2]);
	}
	
	public void apply(float[] matrix) {
		Matrix.scaleM(matrix,0,m_values[0],m_values[1],m_values[2]);
	}
	
	///////////////////////////////////////////// implementation
	
	private float[] m_values;
}