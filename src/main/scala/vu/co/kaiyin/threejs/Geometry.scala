package vu.co.kaiyin.threejs

import scala.scalajs.js

/**
  * Created by victor on 17/11/2015.
  */
@js.native
class Geometry {
  /**
    * Unique number for this geometry instance.
    * @return Int
    */
  def id: Int = js.native

  def name: String = js.native

  def vertices: js.Array[Vector3] = js.native
}

/**
  * 3D vector.
  */
class Vector3 extends js.Object {
  def x: Double = js.native

  def y: Double = js.native

  def z: Double = js.native

  def set(x: Double, y: Double, z: Double): this.type = js.native

  def setX(x: Double): this.type = js.native

  def setY(y: Double): this.type = js.native

  def setZ(z: Double): this.type = js.native

  def copy(v: Vector3): this.type = js.native

  def add(v: Vector3): this.type = js.native

  def addVectors(a: Vector3, b: Vector3) = js.native

  /**
    * Adds the multiple of v and s to this vector.
    * @param v Vector3
    * @param s Double
    * @return Vector3
    */
  def addScaledVector(v: Vector3, s: Double) = js.native

  /**
    * Subtract from this vector.
    * @param v Vector3
    * @return this vector
    */
  def sub(v: Vector3): this.type = js.native

  /**
    * Set this vector to a - b
    * @param a
    * @param b
    * @return this vector
    */
  def subVectors(a: Vector3, b: Vector3): this.type = js.native

  def multiplyScalar(s: Double): this.type = js.native

  def divideScalar(s: Double): this.type = js.native

  def negate(): this.type = js.native

  /**
    * Dot product of this vector and v
    * @param v
    * @return Double
    */
  def dot(v: Vector3): Double = js.native

  /**
    * Squared length of this vector: $x^2 + y^2$
    * @return Double
    */
  def lengthSq(): Double = js.native

  def length(): Double = js.native

  /**
    * Computes Manhattan length of this vector. http://en.wikipedia.org/wiki/Taxicab_geometry
    * @return Double
    */
  def lengthManhattan(): Double = js.native

  def normalize(): this.type = js.native

  def distanceTo(v: Vector3): Double = js.native

  def distanceToSquared(v: Vector3): Double = js.native

  /**
    * Normalize then multiply by l
    * @param l
    * @return
    */
  def setLength(l: Double): this.type = js.native

  /**
    * Set this vector to the cross product of this with v
    * @param v
    * @return
    */
  def cross(v: Vector3): this.type = js.native

  /**
    * ???
    * Sets this vector extracting position from matrix transform.
    * @param m
    * @return
    */
  def setFromMatrixPosition(m: Matrix4): this.type = js.native

  def equals(v: Vector3): Boolean = js.native

  override def clone(): this.type = js.native

  /**
    * If this vector's x, y or z value is greater than the max vector's x, y or z value, it is replaced by the corresponding value.
    * If this vector's x, y or z value is less than the min vector's x, y or z value, it is replaced by the corresponding value.
    * @param min
    * @param max
    * @return
    */
  def clamp(min: Vector3, max: Vector3): this.type = js.native

  /**
    * If this vector's x, y or z values are greater than the max value, they are replaced by the max value.
    * If this vector's x, y or z values are less than the min value, they are replaced by the min value.
    * @param min the minimum value the components will be clamped to
    * @param max the maximum value the components will be clamped to
    * @return
    */
  def clampScalar(min: Double, max: Double): this.type = js.native

  /**
    * The components of the vector are rounded downwards (towards negative infinity) to an integer value.
    */
  def floor(): Unit = js.native

  /**
    * The components of the vector are rounded upwards (towards positive infinity) to an integer value.
    */
  def ceil(): Unit = js.native

  /**
    * The components of the vector are rounded towards the nearest integer value.
    */
  def round(): Unit = js.native

  /**
    * The components of the vector are rounded towards zero (up if negative, down if positive) to an integer value.
    */
  def roundToZero(): Unit = js.native

  /**
    * Multiplies this vector by 4 x 3 subset of a Matrix4.
    * @param m
    * @return
    */
  def applyMatrix4(m: Matrix4): this.type = js.native

  /**
    * Multiplies this vector times a 3 x 3 matrix.
    * @param m
    * @return
    */
  def applyMatrix3(m: Matrix3): this.type = js.native


  /**
    * Projects this vector onto another vector.
    * @param v
    * @return
    */
  def projectOnVector(v: Vector3): this.type = js.native

  /**
    * Adds a s to this vector.
    * @param s
    * @return
    */
  def addScalar(s: Double): this.type = js.native


  /**
    * Divides this vector by vector v.
    * @param v
    * @return
    */
  def divide(v: Vector3): this.type = js.native


  /**
    * If this vector's x, y, or z value is greater than vector v's x, y, or z value, that value is replaced by the corresponding vector v value.
    * @param v
    * @return
    */
  def min(v: Vector3): this.type = js.native


  /**
    * If this vector's x, y, or z value is less than vector v's x, y, or z value, that value is replaced by the corresponding vector v value.
    * @param v
    * @return
    */
  def max(v: Vector3): this.type = js.native


  /**
    * If index equals 0 the method sets this vector's x value to value
    * If index equals 1 the method sets this vector's y value to value
    * If index equals 2 the method sets this vector's z value to value
    * @param index 0 1 or 2
    * @param value
    * @return
    */
  def setComponent(index: Int, value: Double): this.type = js.native

  /**
    * Transforms the direction of this vector by a matrix (a 3 x 3 subset of a Matrix4) and then normalizes the result.
    * @param m
    * @return
    */
  def transformDirection(m: Matrix4): this.type = js.native

  /**
    * Sets this vector equal to the result of multiplying vector a by vector b.
    * @param a
    * @param b
    * @return
    */
  def multiplyVectors(a: Vector3, b: Vector3): this.type = js.native


  def getComponent(index: Int): Double = js.native

  /**
    * Applies a rotation specified by an axis and an angle to this vector.
    * @param axis A normalized Vector3
    * @param angle An angle in radians
    * @return
    */
  def applyAxisAngle(axis: Vector3, angle: Double): this.type = js.native


  /**
    * Linear Interpolation between this vector and vector v, where alpha is the percent along the line.
    * @param v
    * @param alpha Double between 0 and 1
    * @return this
    */
  def lerp(v: Vector3, alpha: Double): this.type = js.native


  /**
    * Sets this vector to be the vector linearly interpolated between v1 and v2 with alpha factor.
    * @param v1
    * @param v2
    * @param alpha Double between 0 and 1
    * @return
    */
  def lerpVectors(v1: Vector3, v2: Vector3, alpha: Double): this.type = js.native


  def angleTo(v: Vector3): Double = js.native

  /**
    * Sets this vector's x, y, and z equal to the column of the matrix specified by the index.
    * @param index 0, 1, 2, or 3
    * @param matrix Matrix4
    * @return
    */
  def setFromMatrixColumn(index: Int, matrix: Matrix4): this.type = js.native


  /**
    * Reflect incident vector off of plane orthogonal to normal. normal is assumed to have unit length.
    * @param normal Vector3 the normal to the reflecting plane
    * @return
    */
  def reflect(normal: Vector3): this.type = js.native

  /**
    * Sets the vector's components based on an array formatted like [x, y, z]
    * @param array
    * @return
    */
  def fromArray(array: js.Array[Double]): this.type = js.native

  /**
    * ???
    * Multipies this vector by vector v.
    * @param v
    * @return
    */
  def multiply(v: Vector3): this.type = js.native


  /**
    * Multiplies this vector and m, and divides by perspective.
    * @param m
    * @return
    */
  def applyProjection(m: Matrix4): this.type = js.native


  /**
    * Assigns this vector's x value to array[0].
    * Assigns this vector's y value to array[1].
    * Assigns this vector's z value to array[2].
    * @param array Optional array to store the vector.
    * @return The created array.
    */
  def toArray(array: js.Array[Double]): js.Array[Double] = js.native

  //  def applyEuler(euler: ) this
  //
  //  euler -- Euler
  //  Applies euler transform to this vector by converting the Euler obect to a Quaternion and applying.
  //  #.applyQuaternion(quaternion) this
  //
  //  quaternion -- Quaternion
  //  Applies a Quaternion transform to this vector.
  //  #.project(camera)
  //
  //  camera — camera to use in the projection.
  //  Projects the vector with the camera.
  //  #.unproject(camera)
  //
  //  camera — camera to use in the projection.
  //  Unprojects the vector with the camera.
}

@js.native
class Matrix3 extends js.Object {

  def transpose(): Unit = js.native

  /**
    * Transposes this matrix into the supplied array, and returns itself unchanged.
    * @param array
    * @return
    */
  def transposeIntoArray(array: js.Array[Double]): this.type = js.native

  /**
    * Computes and returns the determinant of this matrix.
    * @return
    */
  def determinant(): Double = js.native


  def elements: js.Array[Double] = js.native

  /**
    * Sets the 3x3 matrix values to the given row-major sequence of values.
    * @param n11
    * @param n12
    * @param n13
    * @param n21
    * @param n22
    * @param n23
    * @param n31
    * @param n32
    * @param n33
    * @return
    */
  def set(n11: Double, n12: Double, n13: Double, n21: Double, n22: Double, n23: Double, n31: Double, n32: Double, n33: Double): this.type = js.native


  /**
    * Multiplies every component of the matrix by the scalar value s.
    * @param s
    * @return
    */
  def multiplyScalar(s: Double): this.type = js.native


  /**
    * Multiplies (applies) this matrix to every vector3 in the array.
    * @param array An array in the form [vector1x, vector1y, vector1z, vector2x, vector2y, vector2z, ...]
    */
  def applyToVector3Array(array: js.Array[Double]): Unit = js.native

  /**
    * Sets this matrix equal to the normal matrix (upper left 3x3)of the passed matrix4. The normal matrix is the inverse transpose of the matrix m.
    * @param m
    */
  def getNormalMatrix(m: Matrix4): this.type = js.native

  /**
    * Set this matrix to the inverse of the passed matrix.
    * @param m
    * @param throwOnInvertible Boolean If true, throw an error if the matrix is invertible.
    * @return
    */
  def getInverse(m: Matrix4, throwOnInvertible: Boolean): this.type = js.native


  /**
    * Copies the values of matrix m into this matrix.
    * @param m
    */
  def copy(m: Matrix4): this.type = js.native


  override def clone(): this.type = js.native

  /**
    * Resets this matrix to identity.
    * @return
    */
  def identity(): this.type = js.native

}

@js.native
class Matrix4 extends js.Object {
  override def clone(): this.type = js.native

  /**
    * Resets this matrix to identity.
    * @return
    */
  def identity(): this.type = js.native

  def elements: js.Array[Double] = js.native

  /**
    * Sets the 4x4 matrix values to the given row-major sequence of values.
    * @return
    */
  def set(n11: Double, n12: Double, n13: Double, n14: Double,
          n21: Double, n22: Double, n23: Double, n24: Double,
          n31: Double, n32: Double, n33: Double, n34: Double,
          n41: Double, n42: Double, n43: Double, n44: Double
         ): this.type = js.native

  /**
    * Copies the values of matrix m into this matrix.
    * @param m
    * @return
    */
  def copy(m: Matrix4): this.type = js.native


  /**
    * Copies the translation component of the supplied matrix m into this matrix translation component, for example, [t1, t2, t3] in the following matrix:
    * {{{
    * 1 0 0 t1
    * 0 1 0 t2
    * 0 0 1 t3
    * 0 0 0 1
    * }}}
    * @param m
    * @return
    */
  def copyPosition(m: Matrix4): this.type = js.native

  /**
    * Set the basis matrix consisting of the three provided axis vectors. Returns the current matrix.
    * x1 y1 z1 i
    * x2 y2 z2 i
    * x3 y3 z3 i
    * i  i  i  i
    * @param xAxis
    * @param yAxis
    * @param zAxis
    * @return
    */
  def makeBasis(xAxis: Vector3, yAxis: Vector3, zAxis: Vector3): this.type = js.native

  /**
    * Extracts basis of into the three axis vectors provided. Returns the current matrix.
    * x1 y1 z1 i
    * x2 y2 z2 i
    * x3 y3 z3 i
    * i  i  i  i
    * @param xAxis
    * @param yAxis Vector3
    * @param zAxis
    * @return
    */
  def extractBasis(xAxis: Vector3, yAxis: Vector3, zAxis: Vector3): this.type = js.native

  /**
    * Extracts the rotation of the supplied matrix m into this matrix rotation component.
    * @param m
    * @return
    */
  def extractRotation(m: Matrix4): this.type = js.native

  /**
    * Constructs a rotation matrix, looking from eye towards center with defined up vector.
    * @param eye
    * @param center
    * @param up
    * @return
    */
  def lookAt(eye: Vector3, center: Vector3, up: Vector3): this.type = js.native


  /**
    * Multiplies this matrix by m.
    * @param m
    * @return this matrix
    */
  def multiply(m: Matrix4): this.type = js.native

  /**
    * Sets this matrix to a x b.
    * @param a
    * @param b
    * @return
    */
  def multiplyMatrices(a: Matrix4, b: Matrix4): this.type = js.native

  /**
    * Sets this matrix to a x b and stores the result into the flat array r. r can be either a regular Array or a TypedArray.
    * @param a
    * @param b
    * @param r
    */
  def multiplyToArray(a, b, r)

  this

  def multiplyScalar(s: Double): this.type = js.native

  def determinant(): Double = js.native

  def transpose(): this.type = js.native

  /**
    * Flattens this matrix into supplied flat array starting from offset position in the array.
    * @param flat
    * @param offset
    */
  def flattenToArrayOffset(flat: js.Array[Double], offset: Int): Unit = js.native

  /**
    * Sets the position component for this matrix from vector v.
    * i i i v.x
    * i i i v.y
    * i i i v.z
    * i i i i
    * @param v
    * @return
    */
  def setPosition(v: Vector3): this.type = js.native

  /**
    * Sets this matrix to the inverse of matrix m.
    * @param m
    * @return
    */
  def getInverse(m: Matrix4): this.type = js.native

  //    Based on http://www.euclideanspace.com/maths/algebra/matrix/functions/inverse/fourD/index.htm.
  //  # .makeRotationFromEuler ( euler ) this
  //
  //  euler — Rotation vector followed by order of rotations, e.g., "XYZ".
  //    Sets the rotation submatrix of this matrix to the rotation specified by Euler angles, the rest of the matrix is identity.
  //    Default order is "XYZ".

  //def makeRotationFromQuaternion ( q:  ) this
  //
  //  Sets the rotation submatrix of this matrix to the rotation specified by q. The rest of the matrix is identity.
  /**
    * Multiplies the columns of this matrix by vector v. js source:
    * {{{
    *    	scale: function ( v ) {
    *
    * 		var te = this.elements;
    * 		var x = v.x, y = v.y, z = v.z;
    *
    * 		te[ 0 ] *= x; te[ 4 ] *= y; te[ 8 ] *= z;
    * 		te[ 1 ] *= x; te[ 5 ] *= y; te[ 9 ] *= z;
    * 		te[ 2 ] *= x; te[ 6 ] *= y; te[ 10 ] *= z;
    * 		te[ 3 ] *= x; te[ 7 ] *= y; te[ 11 ] *= z;
    *
    * 		return this;
    *
    * 	}
    * }}}
    * @param v
    * @return
    */
  def scale(v: Vector3): this.type = js.native

  //
  //
  //  # .compose ( translation, quaternion, scale ) this
  //
  //  Sets this matrix to the transformation composed of translation, quaternion and scale.
  //  # .decompose ( translation, quaternion, scale )
  //
  //  Decomposes this matrix into the translation, quaternion and scale components.

  /**
    * Set the translation components to x, y, z. js source:
    * {{{
    *   	makeTranslation: function ( x, y, z ) {
    *
    * 		this.set(
    *
    * 			1, 0, 0, x,
    * 			0, 1, 0, y,
    * 			0, 0, 1, z,
    * 			0, 0, 0, 1
    *
    * 		);
    *
    * 		return this;
    *
    * 	}
    * }}}
    * @param x
    * @param y
    * @param z
    * @return
    */
  def makeTranslation(x: Double, y: Double, z: Double): this.type = js.native


  /**
    * Rotation around x-axis. js source:
    * {{{
    * makeRotationX: function ( theta ) {
    * var c = Math.cos( theta ), s = Math.sin( theta );
    * this.set(
    * 1, 0,  0, 0,
    * 0, c, - s, 0,
    * 0, s,  c, 0,
    * 0, 0,  0, 1
    * );
    * return this;
    * }
    * }}}
    * @param theta
    */
  def makeRotationX(theta: Double): this.type = js.native

  def makeRotationY(theta: Double): this.type = js.native

  def makeRotationZ(theta: Double): this.type = js.native

  /**
    * Sets this matrix as rotation transform around axis by angle radians.
    * Based on http://www.gamedev.net/reference/articles/article1199.asp.
    * @param axis
    * @param theta
    * @return
    */
  def makeRotationAxis(axis: Vector3, theta: Double): this.type = js.native

  /**
    * Sets this x, y, z as scale transform. source:
    * {{{
    *    makeScale: function ( x, y, z ) {
    *
    * 		this.set(
    *
    * 			x, 0, 0, 0,
    * 			0, y, 0, 0,
    * 			0, 0, z, 0,
    * 			0, 0, 0, 1
    *
    * 		);
    *
    * 		return this;
    *
    * 	}
    * }}}
    * @param x
    * @param y
    * @param z
    * @return
    */
  def makeScale(x: Double, y: Double, z: Double): this.type = js.native

  /**
    * Creates a frustum matrix.
    * @param left
    * @param right
    * @param bottom
    * @param top
    * @param near
    * @param far
    */
  def makeFrustum(left: Double, right: Double, bottom: Double, top: Double, near: Double, far: Double): this.type = js.native

  def makePerspective ( fov: Double, aspect: Double, near: Double, far: Double ):  this.type  = js.native

def makeOrthographic ( left: Double, right: Double, top: Double, bottom: Double, near: Double, far: Double ):  this.type = js.native
  //
  //  Creates an orthographic projection matrix.
  //  # .clone ()
  //
  //  Creates a copy of this matrix.
  //  # .applyToVector3Array (a)
  //
  //  array -- An array in the form [vector1x, vector1y, vector1z, vector2x, vector2y, vector2z, ...]
  //  Multiplies (applies) this matrix to every vector3 in the array.
  //  # .getMaxScaleOnAxis ()
  //
  //  Gets the maximum scale value of the 3 axes.

}

//object Matrix3 extends js.Object {
//  @js.native
//  def apply(): Matrix3 = js.native
//}
